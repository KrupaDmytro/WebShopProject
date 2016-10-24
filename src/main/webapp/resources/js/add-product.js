/**
 * Created by dima- on 17.10.2016.
 */
$(function () {
    $('#send-new-product').click(function () {
        $.ajax({
            url: 'add-product',
            type: 'post',
            dataType: 'text',
            contentType: 'application/json',
            data: JSON.stringify({
                name: $('#name').val(),
                price: $('#price').val(),
                description: $('#description').val()
            }),
            success: function(result) {
                $('#name').val("");
                $('#price').val("");
                $('#description').val("");

                $('#successful-adding').show();
            },
            error: function(){
                alert('There is some problem. Try again )^:');
            }
        });
    });
});