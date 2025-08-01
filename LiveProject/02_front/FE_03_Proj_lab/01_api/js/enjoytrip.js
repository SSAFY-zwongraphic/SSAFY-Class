const area = document.querySelector("#areaCode");
const sigungu = document.querySelector("#sigunguCode");
const contentType = document.querySelector("#contentType");

/**
 * EnjoyTrip을 위해 시군구 또는 지역 목록을 조회하고 select를 업데이트 하는 함수
 * html에서 직접 호출 시는 areaCode가 없어 지역 목록을 반환
 * @param {string} areaCode - 지역 코드로 없다면 지역 목록 반환. 있다면 그것을 기반으로 시군구 목록 반환
 */
const areaCode1 = async (areaCode) => {
  const queryObj = {
    serviceKey: key_data,
    numOfRows: 120,
    pageNo: 1,
    MobileOS: "ETC",
    MobileApp: "Test",
    _type: "json",
  };
  if (areaCode) {
    queryObj.areaCode = areaCode;
  }
  try {
    const json = await getFetch("https://apis.data.go.kr/B551011/KorService1/areaCode1", queryObj);
    let info = json.response.body.items.item;
    info.forEach((item) => {
      item.key = item.code;
      item.label = item.name;
    });
    if (areaCode) {
      updateSelect(sigungu, "시군구", info);
    } else {
      updateSelect(area, "지역", info);
    }
  } catch (e) {
    console.log(e);
  }
};

/**
 * 지역(area) 변경 시 지역 코드를 기반으로 시군구 select 업데이트
 */
area.addEventListener("change", async () => {
  await areaCode1(area.value);
});

/**
 * 여행지 검색
 *  - 기본 쿼리에 검색 지역(시도), 시군구, 타입을 추가로 설정할 수 있음
 *  - open api가 제공하는 좌표계는 WG384이며 SGIS의 map은 UTM-K 좌표계 사용 이에 따른 변환 필요
 */
document.querySelector("#btn_trip_search").addEventListener("click", async () => {
  const queryObj = {
    serviceKey: key_data,
    numOfRows: 20,
    pageNo: 1,
    MobileOS: "ETC",
    MobileApp: "Test",
    _type: "json",
  };
  // 추가로 설정할 조건이 있다면 추가하기
  if (area.value) {
    queryObj.areaCode = area.value;
  }
  if (sigungu.value) {
    queryObj.sigunguCode = sigungu.value;
  }
  if (contentType.value) {
    queryObj.contentTypeId = contentType.value;
  }

  try {
    const json = await getFetch("https://apis.data.go.kr/B551011/KorService1/areaBasedList1", queryObj);

    const spots = json.response.body.items.item;
    spots.forEach((element) => {
      element.x = element.mapx;
      element.y = element.mapy;
      element.address = element.addr1;
      element.label = element.title;
    });
    updateMap(spots);
  } catch (e) {
    console.log(e);
  }
});
