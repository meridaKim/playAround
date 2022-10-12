<%@ page language="java" contentType="text/html; charset=EUC-KR"
         pageEncoding="EUC-KR"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="EUC-KR">
    <title>Insert title here</title>
</head>
<body>
<c:choose>
    <c:when test="${not empty loginUser }">
        <script>
            (function location(){
                navigator.geolocation.getCurrentPosition(
                    function(position) {
                        var positionLat = position.coords.latitude;
                        var positionLon = position.coords.longitude;

                        $.ajax({
                            url : "location.lo",
                            data : {
                                locationLatitude : positionLat,
                                locationLongitude : positionLon,
                                userNo : ${loginUser.userNo}
                            },
                            success : function(result){

                            },
                            error : function(){
                                console.log("통신실패");
                            }
                        })
                    },
                );
            })();
        </script>
    </c:when>
</c:choose>
</body>
</html>