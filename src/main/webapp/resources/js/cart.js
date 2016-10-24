$(function () {
    $('.delete-button').click(function () {
        var deletingId = this.id.split('-')[2];

        $(('#order-details-' + deletingId)).remove();
        $.ajax({
            url: 'delete-from-cart?deletingId=' + deletingId,
            type: 'post',
            error: function(){
            }
        });
    });
});