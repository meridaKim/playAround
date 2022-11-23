<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <style>
        html, body {
            width: 100%;
            height: 100%;
            background: #EFEFEF;

        }
        #line_first_row{
            position: absolute;
            width: 950px;
            height: 0px;
            left: 342px;
            top: 200px;

            border: 1.30114px solid #474747;
        }
        #rightline{
            position: absolute;
            width: 1078px;
            height: 0px;
            left: 1180px;

            top: 540px;
            border: 1.30114px solid #474747;
            transform: rotate(-90deg);
        }
        #finalline{
            position: absolute;
            width: 1078px;
            height: 0px;
            left: -197px;

            top: 540px;
            border: 1.30114px solid #474747;
            transform: rotate(-90deg);
        }


        #leftline{
            position: absolute;
            width: 1078px;
            height: 0px;
            left: 756px;
            top: 540px;
            border: 1.30114px
            solid #474747;
            transform: rotate(-90deg);
        }
        #line_row{
            position: absolute;
            width: 420px;
            height: 0px;
            left: 1296px;
            top: 746px;

            border: 1.30114px solid #474747;
        }

        #player_img{
            position: absolute;
            width: 400px;
            height: 280px;
            left: 1300px;
            top: 160px;

        }
        #now_playing{
            position: absolute;
            width: 200px;
            height: 30px;
            left: 1320px;
            top: 40px;
        }
        #play_button{
            position: absolute;
            width: 70.84px;
            height: 70.84px;
            left: 1470px;
            top: 600px;

        }
        #before_button{
            position: absolute;
            width: 70.84px;
            height: 70.84px;
            left: 1370px;
            top: 600px;
        }
        #next_button{
            position: absolute;
            width: 70.84px;
            height: 70.84px;
            left: 1570px;
            top: 600px;
        }

        #map {
            width: 80%;
            height: 80%;
            border: solid black 1px;
        }
        .mapSection{
            position : center;
            margin: auto !important;
        }
        /*.list {*/
        /*    display: flex;*/
        /*    justify-content: space-around;*/
        /*    align-items: center;*/
        /*    vertical-align: text-bottom;*/
        /*}*/
        /*button {*/
        /*    width : 400px;*/
        /*    font-size: 1em;*/
        /*    vertical-align: text-bottom;*/
        /*}*/
        .playlistSection{
             display: table; margin-left: auto; margin-right: auto;
        }
        .button-add {
            width : 300px;
            background-size: 50px 50px;
            background-image: url("https://ifh.cc/g/mWBBwa.png"); /* 16px x 16px */
            background-color: #EFEFEF; /* make the button transparent */
            background-repeat: no-repeat;  /* make the background image appear only once */
            background-position: 10px 15px;  /* equivalent to 'top left' */
            border: none;           /* assuming we don't want any borders */
            cursor: pointer;        /* make the cursor like hovering over an <a> element */
            height: 80px;           /* make this the size of your image */
            padding-left: 70px;     /* make text start to the right of the image */
            vertical-align: middle;
            /* align the text vertically centered */

        }

        .button-add2 {
            width : 300px;
            background-size: 50px 50px;
            background-image: url("https://ifh.cc/g/fbhd89.png"); /* 16px x 16px */
            background-color: #EFEFEF; /* make the button transparent */
            background-repeat: no-repeat;  /* make the background image appear only once */
            background-position: 10px 15px;  /* equivalent to 'top left' */
            border: none;           /* assuming we don't want any borders */
            cursor: pointer;        /* make the cursor like hovering over an <a> element */
            height: 80px;           /* make this the size of your image */
            padding-left: 70px;     /* make text start to the right of the image */
            vertical-align: middle; /* align the text vertically centered */
   /* align the text vertically centered */


        }

        .button-add3 {
            width : 300px;
            background-size: 50px 50px;
            background-image: url("https://ifh.cc/g/8WdaxN.png"); /* 16px x 16px */
            background-color: #EFEFEF; /* make the button transparent */
            background-repeat: no-repeat;  /* make the background image appear only once */
            background-position: 10px 15px;  /* equivalent to 'top left' */
            border: none;           /* assuming we don't want any borders */
            cursor: pointer;        /* make the cursor like hovering over an <a> element */
            height: 80px;           /* make this the size of your image */
            padding-left: 70px;     /* make text start to the right of the image */
            vertical-align: middle; /* align the text vertically centered */
     /* align the text vertically centered */


        }
        .button-add4 {
            width : 300px;
            background-size: 50px 50px;
            background-image: url("https://ifh.cc/g/v0fkTo.png"); /* 16px x 16px */
            background-color: #EFEFEF; /* make the button transparent */
            background-repeat: no-repeat;  /* make the background image appear only once */
            background-position: 10px 15px;  /* equivalent to 'top left' */
            border: none;           /* assuming we don't want any borders */
            cursor: pointer;        /* make the cursor like hovering over an <a> element */
            height: 80px;           /* make this the size of your image */
            padding-left: 70px;     /* make text start to the right of the image */
            vertical-align: middle; /* align the text vertically centered */
            /* align the text vertically centered */


        }
        .button-add5 {
            width : 300px;
            background-size: 50px 50px;
            background-image: url("https://ifh.cc/g/BXAVBz.png"); /* 16px x 16px */
            background-color: #EFEFEF; /* make the button transparent */
            background-repeat: no-repeat;  /* make the background image appear only once */
            background-position: 10px 15px;  /* equivalent to 'top left' */
            border: none;           /* assuming we don't want any borders */
            cursor: pointer;        /* make the cursor like hovering over an <a> element */
            height: 80px;           /* make this the size of your image */
            padding-left: 70px;     /* make text start to the right of the image */
            vertical-align: middle; /* align the text vertically centered */
            /* align the text vertically centered */


        }
        .button-add6 {
            width : 300px;
            background-size: 50px 50px;
            background-image: url("https://ifh.cc/g/fZlJXh.png"); /* 16px x 16px */
            background-color: #EFEFEF; /* make the button transparent */
            background-repeat: no-repeat;  /* make the background image appear only once */
            background-position: 10px 15px;  /* equivalent to 'top left' */
            border: none;           /* assuming we don't want any borders */
            cursor: pointer;        /* make the cursor like hovering over an <a> element */
            height: 80px;           /* make this the size of your image */
            padding-left: 70px;     /* make text start to the right of the image */
            vertical-align: middle; /* align the text vertically centered */
            /* align the text vertically centered */


        }
        .button-add7 {
            width : 300px;
            background-size: 50px 50px;
            background-image: url("https://ifh.cc/g/v0fkTo.png"); /* 16px x 16px */
            background-color: #EFEFEF; /* make the button transparent */
            background-repeat: no-repeat;  /* make the background image appear only once */
            background-position: 10px 15px;  /* equivalent to 'top left' */
            border: none;           /* assuming we don't want any borders */
            cursor: pointer;        /* make the cursor like hovering over an <a> element */
            height: 80px;           /* make this the size of your image */
            padding-left: 70px;     /* make text start to the right of the image */
            vertical-align: middle; /* align the text vertically centered */
            /* align the text vertically centered */

        }
        .button-add8 {
            width : 300px;
            background-size: 50px 50px;
            background-image: url("https://ifh.cc/g/cQ3nqS.png"); /* 16px x 16px */
             /* make the button transparent */
            background-color: #EFEFEF;
            background-repeat: no-repeat;  /* make the background image appear only once */
            background-position: 10px 15px;  /* equivalent to 'top left' */
            border: none;           /* assuming we don't want any borders */
            cursor: pointer;        /* make the cursor like hovering over an <a> element */
            height: 80px;           /* make this the size of your image */
            padding-left: 70px;     /* make text start to the right of the image */
            vertical-align: middle; /* align the text vertically centered */
            /* align the text vertically centered */

        }
        .button-add9 {
            width : 300px;
            background-size: 50px 50px;
            background-image: url("https://ifh.cc/g/5QwtgS.png"); /* 16px x 16px */
            background-color: #EFEFEF; /* make the button transparent */
            background-repeat: no-repeat;  /* make the background image appear only once */
            background-position: 10px 15px;  /* equivalent to 'top left' */
            border: none;           /* assuming we don't want any borders */
            cursor: pointer;        /* make the cursor like hovering over an <a> element */
            height: 80px;           /* make this the size of your image */
            padding-left: 70px;     /* make text start to the right of the image */
            vertical-align: middle; /* align the text vertically centered */
            /* align the text vertically centered */

        }

        .menulist {

            list-style-type: none;
            margin-left : 250px;
            margin-top:60px;
            /*padding :10px 10px;*/
            overflow: hidden;
        }

        #logoMList{
            margin-left : 50px;
            display: grid;
            /*grid-template-columns: 600px 1fr;*/
            text-align: center;
        }

        #list li{
            float: left;
            font-size: 15px;
            padding :10px 10px;
            vertical-align: text-bottom;
        }

        #list a{
            float: right;
            margin-right : 1000px;
            display: block;
            color:black;
            text-align: center;
            padding : 0px 20px;
            text-decoration: none;
            font-size: 25px;
        }
        #round_list{
            position: absolute;
            width: 1000px;
            height: 80px;
            left: 450px;
            top: 700px;


        }
        #search{
            position: absolute;
            width: 200px;
            height: 23px;
            left: 400px;
            top: 195px;

            font-family: 'Inter';
            font-style: normal;
            font-weight: 600;
            font-size: 25px;
            line-height: 23px;
            /* identical to box height */


            color: #474747;
        }

        #search_img{
            position: absolute;
            width: 30px;
            height: 23px;
            left: 350px;
            top: 220px;

        }
        #playlisttext{
            position: absolute;
            width: 200px;
            height: 23px;
            left: 1330px;
            top: 740px;

            font-family: 'Inter';
            font-style: normal;
            font-weight: 600;
            font-size: 25px;
            line-height: 23px;
            /* identical to box height */


            color: #474747;
        }
        #savelist{
            position: absolute;
            width: 200px;
            height: 23px;
            left: 1440px;
            top: 740px;

            font-family: 'Inter';
            font-style: normal;
            font-weight: 600;
            font-size: 25px;
            line-height: 23px;
            color: gray;


        }
#repeat{
    position: absolute;
    width: 70.84px;
    height: 70.84px;
    left: 1670px;
    top: 620px;
}
#random{
    position: absolute;
    width: 70.84px;
    height: 70.84px;
    left: 1320px;
    top: 620px;
}
        .box-radio-input input[type="radio"]{
            display:none;
        }

        .box-radio-input input[type="radio"] + span{
            display:inline-block;
            background:none;
            border:1px solid #dfdfdf;
            padding:0px 10px;
            text-align:center;
            height:35px;
            line-height:33px;
            font-weight:500;
            cursor:pointer;
        }

        .box-radio-input input[type="radio"]:checked + span{
            border:1px solid #23a3a7;
            background:#02457A;
            color:#fff;
        }
    </style>
</head>
<body>
<div id="logoMList">

    <div>
        <ul class="menulist">
            <div id="list">
                <li><div><img src="https://ifh.cc/g/dPw8wb.png" height="30px"></div></li>
                <li></li>
                <li><div><img src="https://ifh.cc/g/nTFWDF.png" height="25px"></div></li>
                <a href="#">로그인</a>
            </div>

        </ul>
    </div>
</div>
<div id="finalline"></div>
<div id="rightline"></div>
<div id="line_first_row"></div>
<div id="player">
    <img id="player_img" src="https://ifh.cc/g/A4dMO7.png" width="300px" height="300px">
</div>
<div >
    <img id="now_playing" src="https://ifh.cc/g/2Gw0AO.png" >
</div>
<div id="play_button">
    <img id="player_button" src="https://ifh.cc/g/COOJwH.png">
</div>
<div id="before_button">
    <img id="beforemusic_button" src="https://ifh.cc/g/osLmdz.png">
</div>
<div id="next_button">
    <img id="nextmusic_button" src="https://ifh.cc/g/znnoCy.png">
</div>
<div id="leftline"></div>
<div id="line_row"></div>
<div id="random">
    <img id="random_button" src="https://ifh.cc/g/5nRd1y.png">
</div>
<div id="repeat">
    <img id="repeat_button" src="https://ifh.cc/g/XlHk3w.png">
</div>
<br>
<div id="map" style="width:100%;height:350px;"></div>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<!-- API Key 입력 필요 -->
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=3df00acbc8d0180df86d322835eaee2c&libraries=clusterer"></script>
<div style="margin:0 auto; text-align:center">
<script>

    $.ajax({
        // url은 본인의 환경에 따라 작성 합니다.
        url : "locationMapList.lo",
        data: {},
        success : function(result){
            var mapContainer = document.getElementById('map'), mapOption={ // 지도를 표시할 div
                center : new kakao.maps.LatLng(37.2999573,127.0367769
                    ), // 지도의 중심좌표
                level : 2 // 지도의 확대 레벨
            };
            mapContainer.style.width = '950px';
            mapContainer.style.height = '400px';
            mapContainer.style.marginTop = '127px';
            mapContainer.style.marginLeft = '337px';

            var map = new kakao.maps.Map(mapContainer, mapOption);

            var imageSrc = "https://ifh.cc/g/CFnBGx.png", // 마커이미지의 주소입니다
                imageSize = new kakao.maps.Size(34, 39), // 마커이미지의 크기입니다
                imageOption = {offset: new kakao.maps.Point(7, 49)}; // 마커이미지의 옵션입니다. 마커의 좌표와 일치시킬 이미지 안에서의 좌표를 설정합니다.
            var markerImageSrc = "https://ifh.cc/g/CFnBGx.png";  // 마커이미지의 주소입니다. 스프라이트 이미지 입니다

//마커의 이미지정보를 가지고 있는 마커이미지를 생성합니다
            var markerImage = new kakao.maps.MarkerImage(imageSrc, imageSize, imageOption);

            var roundPosition = new kakao.maps.LatLng(37.3006794,127.0365546); // 예지관
            var markerPosition = new kakao.maps.LatLng(37.2993962,127.0364962);// 테니스장
            var markerPosition1 = new kakao.maps.LatLng(37.3005,127.0358);//운동장
            var markerPosition2 = new kakao.maps.LatLng(37.3002864,127.0380335); // 포레스트);
            var markerPosition3 = new kakao.maps.LatLng(37.3002657,127.0348072); //축구장
            var markerPosition4 = new kakao.maps.LatLng(37.3002864,127.0380335);

            var marker = new kakao.maps.Marker({
                position: roundPosition,
                clickable: true,
                image: markerImage
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

            var iwContent = '<div style="padding:5px;">예지관 Round</div>', // 인포윈도우에 표출될 내용으로 HTML 문자열이나 document element가 가능합니다
                iwRemoveable = true; // removeable 속성을 ture 로 설정하면 인포윈도우를 닫을 수 있는 x버튼이 표시됩니다
            //marker1
            var iwContent2 = '<div style="padding:5px;">테니스장 Round</div>', // 인포윈도우에 표출될 내용으로 HTML 문자열이나 document element가 가능합니다
                iwRemoveable2 = true;
            //marker2
            var iwContent3 = '<div style="padding:5px;">운동장 Round</div>', // 인포윈도우에 표출될 내용으로 HTML 문자열이나 document element가 가능합니다
                iwRemoveable3 = true;
            var iwContent4 = '<div style="padding:5px;">축구장 Round</div>', // 인포윈도우에 표출될 내용으로 HTML 문자열이나 document element가 가능합니다
                iwRemoveable4 = true;
            var iwContent5 = '<div style="padding:5px;">포레스트 Round</div>', // 인포윈도우에 표출될 내용으로 HTML 문자열이나 document element가 가능합니다
                iwRemoveable5 = true;

// 인포윈도우를 생성합니다
            var infowindow = new kakao.maps.InfoWindow({
                content : iwContent,
                removable : iwRemoveable
            });

            var infowindow2 = new kakao.maps.InfoWindow({
                content : iwContent2,
                removable : iwRemoveable2
            });

            var infowindow3 = new kakao.maps.InfoWindow({
                content : iwContent3,
                removable : iwRemoveable3
            });

            var infowindow4 = new kakao.maps.InfoWindow({
                content : iwContent4,
                removable : iwRemoveable4
            });

            var infowindow5 = new kakao.maps.InfoWindow({
                content : iwContent5,
                removable : iwRemoveable5
            });

// 마커에 클릭이벤트를 등록합니다
            kakao.maps.event.addListener(marker, 'click', function() {
                // 마커 위에 인포윈도우를 표시합니다
                infowindow.open(map, marker);
            });

            kakao.maps.event.addListener(marker1, 'click', function() {
                // 마커 위에 인포윈도우를 표시합니다
                infowindow2.open(map, marker1);
            });

            kakao.maps.event.addListener(marker2, 'click', function() {
                // 마커 위에 인포윈도우를 표시합니다
                infowindow3.open(map, marker2);
            });
            kakao.maps.event.addListener(marker4, 'click', function() {
                // 마커 위에 인포윈도우를 표시합니다
                infowindow4.open(map, marker4);
            });
            kakao.maps.event.addListener(marker5, 'click', function() {
                // 마커 위에 인포윈도우를 표시합니다
                infowindow5.open(map, marker5);
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
<script type="text/javascript">
    function dispList(selectList) {
        var obj1 = document.getElementById("sc1_list"); // 상품1 리스트
        var obj2 = document.getElementById("sc2_list"); // 상품2 리스트
        var obj3 = document.getElementById("sc3_list"); // 상품2 리스트
        var obj4 = document.getElementById("sc4_list"); // 상품2 리스트
        var obj5 = document.getElementById("sc5_list"); // 상품2 리스트

        if( selectList == "0" ) { // 상품1 리스트
            obj1.style.display = "block";
            obj2.style.display = "none";
            obj3.style.display = "none";
            obj4.style.display = "none";
            obj5.style.display = "none";
            alert(	obj.style.display ) ;
        } else if (selectList == "1") { // 상품2 리스트
            obj1.style.display = "none";
            obj2.style.display = "block";
            obj3.style.display = "none";
            obj4.style.display = "none";
            obj5.style.display = "none";
        }else if (selectList == "2") { // 상품2 리스트
            obj1.style.display = "none";
            obj2.style.display = "none";
            obj3.style.display = "block";
            obj4.style.display = "none";
            obj5.style.display = "none";
        }else if (selectList == "3") { // 상품2 리스트
        obj1.style.display = "none";
        obj2.style.display = "none";
        obj3.style.display = "none";
        obj4.style.display = "block";
        obj5.style.display = "none";
        }else if (selectList == "4") { // 상품2 리스트
            obj1.style.display = "none";
            obj2.style.display = "none";
            obj3.style.display = "none";
            obj4.style.display = "none";
            obj5.style.display = "block";
        }
    }
</script>
</div>
<br/>
<br/>
<h4 id="search">위치 검색하기</h4>
<h4 id="playlisttext">재생목록</h4>
<h4 id="savelist">저장목록</h4>
<div id="search_img">
    <img id="search_logo_img" src="https://ifh.cc/g/dMohwC.png">
</div>
<section class="playlistSection">
    <div id="round_list">
        <label class="box-radio-input"><input type="radio" name="choose" id="sc1" onclick="dispList('0');" value="옵션1"><span>축구장 Round</span></label>
        <label class="box-radio-input"><input type="radio" name="choose" id="sc2" onclick="dispList('1');" value="옵션2"><span>운동장 Round</span></label>
        <label class="box-radio-input"><input type="radio" name="choose" id="sc3" onclick="dispList('2');" value="옵션3"><span>예지관 Round</span></label>
        <label class="box-radio-input"><input type="radio" name="choose" id="sc4" onclick="dispList('3');" value="옵션4"><span>포레스트 Round</span></label>
        <label class="box-radio-input"><input type="radio" name="choose" id="sc5" onclick="dispList('4');" value="옵션5"><span>테니스장 Round</span></label>

        <p>
<div class="list" id="sc1_list" style="display:none">
    <button type="button" class="button-add">
<%--        <img src="https://ifh.cc/g/mWBBwa.png" alt=""  height ="80" width="80">--%>
       <b> 야작하면서 듣다 죽어도 모르는 음악들 </b><br>
            19/20명 참여중
    </button>
    <br/><p></p>
    <button type="button" class="button-add2">
        <%--        <img src="https://ifh.cc/g/mWBBwa.png" alt=""  height ="80" width="80">--%>
            <b>화가날 땐 이 음악들을 들어봐요 </b><br>
        20/20명 참여중
    </button>
    <br/><p></p>
    <button type="button" class="button-add3">
        <%--        <img src="https://ifh.cc/g/mWBBwa.png" alt=""  height ="80" width="80">--%>
            <b>집에 가고 싶을 때 듣는 플레이리스트</b> <br>
        10/15명 참여중
    </button>
    <br/>
</div>

<div id="sc2_list" style="display:none">
    <button type="button" class="button-add4">
        <%--        <img src="https://ifh.cc/g/mWBBwa.png" alt=""  height ="80" width="80">--%>
            <b>교수님이 미울 때 듣는 음악</b> <br>
        19/20명 참여중
    </button>
    <br/><p></p>
    <button type="button" class="button-add5">
        <%--        <img src="https://ifh.cc/g/mWBBwa.png" alt=""  height ="80" width="80">--%>
            <b>미사모 : 미노이 사랑해 모음집</b> <br>
            20/20명 참여중
    </button>
    <br/><p></p>
    <button type="button" class="button-add6">
        <%--        <img src="https://ifh.cc/g/mWBBwa.png" alt=""  height ="80" width="80">--%>
           <b> 노동요 모음집</b> <br>
            4/20명 참여중
    </button>
    <br/>
</div>
<div id="sc3_list" style="display:none">
    <button type="button" class="button-add7">
        <%--        <img src="https://ifh.cc/g/mWBBwa.png" alt=""  height ="80" width="80">--%>
            <b>교수님이 미울 때 듣는 음악2</b> <br>
            10/15명 참여중
    </button>
    <br/><p></p>
    <button type="button" class="button-add8">
        <%--        <img src="https://ifh.cc/g/mWBBwa.png" alt=""  height ="80" width="80">--%>
            <b>교수님 죄송합니다</b> <br>
        19/20명 참여중
    </button>
    <br/><p></p>
    <button type="button" class="button-add">
        <%--        <img src="https://ifh.cc/g/mWBBwa.png" alt=""  height ="80" width="80">--%>
        <b>야작하면서 듣다 죽어도 모르는 음악들 </b><br>
        19/20명 참여중
    </button>
    <br/>
</div>
<div id="sc4_list" style="display:none">
    <button type="button" class="button-add9">
        <%--        <img src="https://ifh.cc/g/mWBBwa.png" alt=""  height ="80" width="80">--%>
        <b>야작하면서 듣다 죽어도 모르는 음악들</b> <br>
        19/20명 참여중
    </button>
    <br/><p></p>
    <button type="button" class="button-add3">
        <%--        <img src="https://ifh.cc/g/mWBBwa.png" alt=""  height ="80" width="80">--%>
        <b>집에 가고 싶을 때 듣는 플레이리스트</b> <br>
        10/15명 참여중
    </button>
    <br/><p></p>
    <button type="button" class="button-add4">
        <%--        <img src="https://ifh.cc/g/mWBBwa.png" alt=""  height ="80" width="80">--%>
        <b>교수님이 미울 때 듣는 음악</b> <br>
        19/20명 참여중
    </button>
    <br/>
</div>
<div id="sc5_list" style="display:none">
    <button type="button" class="button-add2">
        <%--        <img src="https://ifh.cc/g/mWBBwa.png" alt=""  height ="80" width="80">--%>
        <b>내적댄스 유발하는 플레이리스트<b></b> <br>
        </b> <br>
        20/20명 참여중
    </button>
    <br/><p></p>
    <button type="button" class="button-add6">
        <%--        <img src="https://ifh.cc/g/mWBBwa.png" alt=""  height ="80" width="80">--%>
        <b>노동요 모음집</b> <br>
        4/20명 참여중
    </button>
    <br/><p></p>
    <button type="button" class="button-add8">
        <%--        <img src="https://ifh.cc/g/mWBBwa.png" alt=""  height ="80" width="80">--%>
        <b>교수님 죄송합니다 </b><br>
        19/20명 참여중
    </button>
    <br/>
</div>
    </div>
</section>
<br>

</body>
</html>