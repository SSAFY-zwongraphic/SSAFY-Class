const mapContainer = document.getElementById("map"), // 지도를 표시할 div
  mapOption = {
    center: new kakao.maps.LatLng(33.450701, 126.570667), // 지도의 중심좌표
    level: 3, // 지도의 확대 레벨
  };
const map = new kakao.maps.Map(mapContainer, mapOption);
const geocoder = new kakao.maps.services.Geocoder();

// marker 목록
const markers = [];

const updateMap = async (infos) => {
  markers.map((m) => m.setMap(null)).length = 0; // 마커와 경계 초기화
  const bounds = new kakao.maps.LatLngBounds(); // 지도 경계 초기화
  const promises = []; // 좌표를 비동기로 처리하기 위한 Promise 배열
  try {
    for (let info of infos) {
      if (!info.x || !info.y) {
        // TODO: 04. 좌표가 없는 경우 geocoder를 통해 좌표를 갱신해주자.
        //  여러 Promise를 모아서 한번에 처리하기 위해 promises 배열에 추가한다.

        // END
      }
    }
    await Promise.all(promises);

    for (let info of infos) {
      // 잘못된 좌표가 들어오는 경우는 filtering
      if (124.5 <= info.x && info.x <= 132 && 33.0 <= info.y && info.y <= 38.6) {
        setOverlay(info, bounds);
      } else {
        console.warn("좌표가 유효하지 않습니다:", info);
      }
    }
    // 지도 경계 설정
    map.setBounds(bounds);
  } catch (e) {
    console.log(e);
  }
};

const setOverlay = (info, bounds) => {
  const coords = new kakao.maps.LatLng(info.y, info.x);
  bounds.extend(coords);
  const marker = new kakao.maps.Marker({ map: map, position: coords });
  markers.push(marker);

  // https://apis.map.kakao.com/web/sample/addMarkerMouseEvent/
  // 마커에 커서가 오버됐을 때 마커 위에 표시할 인포윈도우를 생성합니다
  const iwContent = `<div style="padding:5px;">${info.label}</div>`;

  // 인포윈도우를 생성합니다
  const infowindow = new kakao.maps.InfoWindow({
    content: iwContent,
  });

  // 마커에 마우스오버 이벤트를 등록합니다
  kakao.maps.event.addListener(marker, "mouseover", function () {
    // 마커에 마우스오버 이벤트가 발생하면 인포윈도우를 마커위에 표시합니다
    infowindow.open(map, marker);
  });

  // 마커에 마우스아웃 이벤트를 등록합니다
  kakao.maps.event.addListener(marker, "mouseout", function () {
    // 마커에 마우스아웃 이벤트가 발생하면 인포윈도우를 제거합니다
    infowindow.close();
  });
};
