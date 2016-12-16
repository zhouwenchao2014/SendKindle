$(function(){
    $('#doc-form-file').on('change', function() {
        var fileNames = '';
        $.each(this.files, function() {
            fileNames += '<span class="am-badge">' + this.name + '</span> ';
        });
        $('#file-list').html(fileNames);
    });
    $(".am-btn").on("click",function(){
        var bookName=$("#bookName").val();
        var kindleEmail=$("#kindleEmail").val();
        $.ajax({
            url : "sendBook",
            data:{
                bookName:bookName,
                kindleEmail:kindleEmail
            },
            success: function(data){
                alert(data)
            }
        });
    });

});