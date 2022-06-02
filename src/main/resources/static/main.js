alert("js테스트");

// ajax 사용하려면 jquery cdn 필요
$.ajax({
    url : "getdata",
    success : function(re){
        alert("통신확인"+re);
        $("#divbox").html(re);
    }
});