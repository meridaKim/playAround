(function ($) {

    // 검색 결과 vue object
    var search_result = new Vue({
        el: '#search-result',
        data: {
            search_result : {}
        },
        method: {
            addPlaceButton: function (event) {
                console.log("add");
            }
        }
    });

    // 카테고리 목록 vue object
    var place_list = new Vue({
        el: '#place-list',
        data: {
            place_list : {}
        },
        methods: {
            addVisit: function (index) {
                $.ajax({
                    type: "POST" ,
                    async: true ,
                    url: `/api/playaroundlocal/${index}`,
                    timeout: 3000
                });

                getKakaoSearchList();
            },
            deletePlace: function (index) {
                $.ajax({
                    type: "DELETE" ,
                    async: true ,
                    url: `/api/playaroundlocal${index}`,
                    timeout: 3000
                });
                getKakaoSearchList();
            }
        }
    });

    // search
    $("#searchButton").click(function () {
        const category_group_name= $("#searchBox").val();
        $.get(`/api/playaroundlocal/search?category_group_name=${category_group_name}`, function (response) {
            search_result.search_result = response;
            $('#search-result').attr('style','visible');
        });
    });

    // Enter
    $("#searchBox").keydown(function(key) {
        if (key.keyCode === 13) {
            const category_group_name = $("#searchBox").val();
            $.get(`/api/playaroundlocal/search?category_group_name=${category_group_name}`, function (response) {
                search_result.search_result = response;
                $('#search-result').attr('style','visible');
            });
        }
    });

    $("#addPlaceButton").click(function () {
        $.ajax({
            type: "POST" ,
            async: true ,
            url: "/api/playaroundlocal",
            timeout: 3000,
            data: JSON.stringify(search_result.search_result),
            contentType: "application/json",
            error: function (request, status, error) {

            },
            success: function (response, status, request) {
                getKakaoSearchList();
            }
        });
    });

    function getKakaoSearchList(){
        $.get(`/api/playaroundlocal/all`, function (response) {
            place_list.place_list = response;
        });
    }

    $(document).ready(function () {
        console.log("init")
    });

})(jQuery);