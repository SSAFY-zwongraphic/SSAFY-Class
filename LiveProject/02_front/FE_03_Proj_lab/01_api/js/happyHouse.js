const sido = document.querySelector("#sido");
const gugun = document.querySelector("#gugun");
const dong = document.querySelector("#dong");

/**
 * 시도 정보를 조회해서 select를 구성하기 위한 함수로 최초 화면 요청 시 즉시 호출
 */
const updateSido = async () => {
  try {
    const json = await getFetch("https://api.vworld.kr/ned/data/admCodeList", {
      format: "json",
      numOfRows: 100,
      key: key_vworld,
      domain: "localhost",
    });

    const infos = json.admVOList.admVOList;
    updateSelect(
      sido,
      "시도",
      infos.map((item) => ({ key: item.admCode, label: item.lowestAdmCodeNm }))
    );
    updateSelect(gugun, "구군");
    updateSelect(dong, "읍면동");
  } catch (error) {
    console.log(error);
  }
};

/**
 * sido select에서 change event 발생 시 gugun 이하의 select 업데이트 처리
 */
sido.addEventListener("change", async () => {
  try {
    const json = await getFetch("https://api.vworld.kr/ned/data/admSiList", {
      admCode: sido.value,
      format: "json",
      numOfRows: 100,
      key: key_vworld,
      domain: "localhost",
    });

    const infos = json.admVOList.admVOList;
    updateSelect(
      gugun,
      "구군",
      infos.map((item) => ({ key: item.admCode, label: item.lowestAdmCodeNm }))
    );
    updateSelect(dong, "읍면동");
  } catch (error) {
    console.log(error);
  }
});

/**
 * gugun에서 change 발생 시 dong select 업데이트 처리
 */
gugun.addEventListener("change", async () => {
  try {
    const json = await getFetch("https://api.vworld.kr/ned/data/admDongList", {
      admCode: gugun.value,
      format: "json",
      numOfRows: 100,
      key: key_vworld,
      domain: "localhost",
    });

    const infos = json.admVOList.admVOList;
    updateSelect(
      dong,
      "읍면동",
      infos.map((item) => ({ key: item.admCode, label: item.lowestAdmCodeNm }))
    );
  } catch (error) {
    console.log(error);
  }
});

/**
 * dong에서 change 발생 시 주소를 획득하고 updateMap을 통해 map에 반영
 */
dong.addEventListener("change", async () => {
  const address = `${getLabel(sido)} ${getLabel(gugun)} ${getLabel(dong)}`;
  updateMap([{ address: address, label: getLabel(dong) }]);
});

// TODO : 06. 지역 기반 아파트 조회 처리를 분석해보세요.
// - api는 법정동에서 시도 + 구군의 5자리만(LAWD_CD) 사용. 즉 동 기준으로는 처리하지 않음
// - xml 형태의 데이터를 반환하므로 DOMParser를 활용해서 처리 필요
document.querySelector("#btn_apt_search").addEventListener("click", async () => {
  const LAWD_CD = gugun.value; // 현재의 API는 5자리만 사용 - 결국 동 기준으로는 처리할 수 없음
  const DEAL_YMD = document.querySelector("#dealYmd").value;

  const data = await getFetch(
    "https://apis.data.go.kr/1613000/RTMSDataSvcAptTrade/getRTMSDataSvcAptTrade",
    {
      LAWD_CD: LAWD_CD,
      //LAWD_CD: 11110,
      DEAL_YMD: DEAL_YMD.replace("-", ""),
      serviceKey: key_data, // 일반 인증키
    },
    true // xml 기반
  );
  const xml = new DOMParser().parseFromString(data, "text/xml");

  const items = xml.getElementsByTagName("item");

  const infos = [];
  for (let item of items) {
    const dong = item.getElementsByTagName("umdNm")[0].textContent;
    const jibun = item.getElementsByTagName("jibun")[0].textContent;
    const aptNm = item.getElementsByTagName("aptNm")[0].textContent;
    const address = `${getLabel(sido)} ${getLabel(gugun)} ${dong} ${jibun} ${aptNm}`;
    //const address = `서울특별시 종로구 ${dong} ${jibun} ${aptNm}`;
    infos.push({ address: address, label: aptNm });
  }
  updateMap(infos);
});
