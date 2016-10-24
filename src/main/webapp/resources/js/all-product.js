/**
 * Created by dima- on 20.10.2016.
 */
$(function () {
    $('.my-page').click(function () {
        var splitterId = this.id.split('-');
        var page = splitterId[1];

        getProductByPage(page, 9);
    });

    getProductByPage(1, 9);
});

function setProductOnPage(products) {
    $('.my-li').remove();
    products.forEach(function (item) {
        var li = '<li class="col-lg-3 my-li" id="product-' + item.id + '" >' +
            '<div class="thumbnail">' +
            '<a href="/home/product?id=' + item.id + '"><img src="resources/css/me.jpg" alt=""></a>' +
            '<div class="caption">' +
            '<h4>' + item.name + '</h4>' +
            '<p>' + item.price + '$' + '</p>' +
            '<a class="btn btn-primary" href="/home/product?id=' + item.id + '">View</a>' +
            '<button class="myadderbutton btn btn-success glyphicon glyphicon-shopping-cart" id="productButton-' + item.id + '"></button>' +
            '</div>' +
            '</div>' +
            '</li>';

        $('.product-list').append(li);
    });

    $('.btn').click(function () {
        var productId = this.id.split('-')[1];
        $.ajax({
            url: 'add-to-cart?productId=' + productId +'&numberOfProducts=1',
            type: 'post',
            success: function(result) {
                if(result === 'login') location.href = '/home/' + result;
            }
        });
    });
}

function getProductByPage(page, numberOfElement) {
    var url = 'get-product/' + page + "/" + numberOfElement;
    $.ajax({
        url: url,
        type: 'post',
        dataType: 'json',
        contentType: 'application/json',
        success: function (result) {
            setProductOnPage(result);
        },
        error: function () {
            alert('There is some problem. Try again )^:');
        }
    });
}
