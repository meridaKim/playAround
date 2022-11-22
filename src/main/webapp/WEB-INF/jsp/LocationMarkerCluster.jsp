<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
<br><br><br><br>
<div id="map" style="width:100%;height:350px;"></div>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<!-- API Key 입력 필요 -->
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=3df00acbc8d0180df86d322835eaee2c&libraries=clusterer"></script>
<script>

    $.ajax({
        // url은 본인의 환경에 따라 작성 합니다.
        url : "locationMapList.lo",
        data: {},
        success : function(result){
            var mapContainer = document.getElementById('map'), mapOption={ // 지도를 표시할 div
                center : new kakao.maps.LatLng(37.3012,127.035
                    ), // 지도의 중심좌표
                level : 2 // 지도의 확대 레벨
            };


            var map = new kakao.maps.Map(mapContainer, mapOption);

            // var roundPosition = [
            //     new kakao.maps.LatLng(37.54699, 127.09598),
            //     new kakao.maps.LatLng(37.54670, 127.09600)
            // ];
            //
            // var playGroundPositions = [
            //     new kakao.maps.LatLng(37.499590490909185, 127.0263723554437),
            //     new kakao.maps.LatLng(37.499427948430814, 127.02794423197847),
            //     new kakao.maps.LatLng(37.498553760499505, 127.02882598822454),
            //     new kakao.maps.LatLng(37.497625593121384, 127.02935713582038),
            //     new kakao.maps.LatLng(37.49646391248451, 127.02675574250912),
            //     new kakao.maps.LatLng(37.49629291770947, 127.02587362608637),
            //     new kakao.maps.LatLng(37.49754540521486, 127.02546694890695)
            // ];

            var imageSrc = "https://ifh.cc/g/CFnBGx.png", // 마커이미지의 주소입니다
                imageSize = new kakao.maps.Size(34, 39), // 마커이미지의 크기입니다
                imageOption = {offset: new kakao.maps.Point(7, 49)}; // 마커이미지의 옵션입니다. 마커의 좌표와 일치시킬 이미지 안에서의 좌표를 설정합니다.
            var markerImageSrc = "https://ifh.cc/g/CFnBGx.png";  // 마커이미지의 주소입니다. 스프라이트 이미지 입니다
            // playGroundMarkers=[];//
            //
            // createplayGroundMarkers();

            // function createMarkerImage(src, size, options) {
            //     var markerImage = new kakao.maps.MarkerImage(src, size, options);
            //     return markerImage;
            // }
            // function createMarker(position, image) {
            //     var marker = new kakao.maps.Marker({
            //         position: position,
            //         image: image
            //     });
            //
            //     return marker;
            // }
            // function createplayGroundMarkers() {
            //
            //     for (var i = 0; i < playGroundPositions.length; i++) {
            //
            //         var imageSize = new kakao.maps.Size(22, 26),
            //             imageOptions = {
            //                 spriteOrigin: new kakao.maps.Point(10, 0),
            //                 spriteSize: new kakao.maps.Size(36, 98)
            //             };
            //
            //         // 마커이미지와 마커를 생성합니다
            //         var markerImage = createMarkerImage(markerImageSrc, imageSize, imageOptions),
            //             marker = createMarker(playGroundPositions[i], markerImage);
            //
            //         // 생성된 마커를 커피숍 마커 배열에 추가합니다
            //         playGroundMarkers.push(marker);
            //     }
            // }
            //
            // function setCoffeeMarkers(map) {
            //     for (var i = 0; i < coffeeMarkers.length; i++) {
            //         playGroundMarkers[i].setMap(map);
            //     }
            // }
//마커의 이미지정보를 가지고 있는 마커이미지를 생성합니다
            var markerImage = new kakao.maps.MarkerImage(imageSrc, imageSize, imageOption);

            var roundPosition = new kakao.maps.LatLng(37.301,127.0355);
            var markerPosition = new kakao.maps.LatLng(37.3015,127.0360);// 마커가 표시될 위치입니다
            var markerPosition1 = new kakao.maps.LatLng(37.3005,127.0358);
            var markerPosition2 = new kakao.maps.LatLng(37.2095,127.0359);
            var markerPosition3 = new kakao.maps.LatLng(37.3007,127.0340);
            var markerPosition4 = new kakao.maps.LatLng(37.3017,127.0345);


            var marker = new kakao.maps.Marker({
                position: roundPosition,
                clickable: true,
                image : markerImage
            });
            var marker1 = new kakao.maps.Marker({
                position: markerPosition,
                clickable: true,
                image: markerImage
            });
            var marker2 = new kakao.maps.Marker({
                position: markerPosition1,
                clickable: true,
                image: markerImage
            });
            var marker3 = new kakao.maps.Marker({
                position: markerPosition2,
                clickable: true,
                image: markerImage
            });
            var marker4 = new kakao.maps.Marker({
                position: markerPosition3,
                clickable: true,
                image: markerImage
            });
            var marker5 = new kakao.maps.Marker({
                position: markerPosition4,
                clickable: true,
                image: markerImage
            });
            marker.setMap(map);
            marker1.setMap(map);
            marker2.setMap(map);
            marker3.setMap(map);
            marker4.setMap(map);
            marker5.setMap(map);

            var iwContent = '<div style="padding:5px;">Hello World!</div>', // 인포윈도우에 표출될 내용으로 HTML 문자열이나 document element가 가능합니다
                iwRemoveable = true; // removeable 속성을 ture 로 설정하면 인포윈도우를 닫을 수 있는 x버튼이 표시됩니다

// 인포윈도우를 생성합니다
            var infowindow = new kakao.maps.InfoWindow({
                content : iwContent,
                removable : iwRemoveable
            });

// 마커에 클릭이벤트를 등록합니다
            kakao.maps.event.addListener(marker, 'click', function() {
                // 마커 위에 인포윈도우를 표시합니다
                infowindow.open(map, marker);
            });

            // 마커 클러스터러를 생성합니다
            var clusterer = new kakao.maps.MarkerClusterer({
                map: map, // 마커들을 클러스터로 관리하고 표시할 지도 객체
                averageCenter: true, // 클러스터에 포함된 마커들의 평균 위치를 클러스터 마커 위치로 설정
                minLevel: 10 // 클러스터 할 최소 지도 레벨
            });

            // 데이터를 가져오기 위해 jQuery를 사용합니다
            // 데이터를 가져와 마커를 생성하고 클러스터러 객체에 넘겨줍니다
            $.get("kakaoMap.json", function(data) {
                // 데이터에서 좌표 값을 가지고 마커를 표시합니다
                // 마커 클러스터러로 관리할 마커 객체는 생성할 때 지도 객체를 설정하지 않습니다
                var markers = $(data.positions).map(function(i, position) {
                    return new kakao.maps.Marker({
                        position : new kakao.maps.LatLng(position.lat, position.lng)
                    });
                });
                // 클러스터러에 마커들을 추가합니다
                clusterer.addMarkers(markers);
            });
        },
        error : function(){
            console.log("통신실패");
        }
    })
</script>
</body>
</html>