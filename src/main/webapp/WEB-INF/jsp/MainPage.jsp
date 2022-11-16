<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script type="text/javascript" src="/ajax_product/bootstrap/js/jquery-1.11.3.js"></script>
    <script type="text/javascript" src="/ajax_product/bootstrap/js/bootstrap.js"></script>
</head>
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<body>
mainpage


    <script type="text/javascript">
            (function location(){
                navigator.geolocation.getCurrentPosition(
                    function(position) {
                        var positionLat = position.coords.latitude;
                        var positionLon = position.coords.longitude;
                        console.log(positionLat);
                        console.log(positionLon);
                        $.ajax({
                            url : "selectList.do",
                            data : {
                                locationLatitude : positionLat,
                                locationLongitude : positionLon

                            },
                            success : function(result){
                                console.log("success");
                            },
                            error : function(){
                                console.log("failed");
                            }
                        })
                    },
                );
            })();

        </script>

        <a href="LocationMarkerCluster.do">show markers</a>

</body>

</html>