<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<script src="resources/js/cart.js"></script>


<div class="container">
    <div class="row">

        <table class="table table-hover table-bordered table-condensed">
            <tr>
                <th>Product name</th>
                <th>Price</th>
                <th>Number</th>
                <th>Unit of measurement</th>
                <th>Delete</th>
            </tr>
            <c:forEach items="${productInCart}" var="item">
                <tr id="order-details-${item.id}">
                    <td>${item.product.name}</td>
                    <td>${item.product.price}</td>
                    <td>${item.numberOfProducts}</td>
                    <td>${item.product.unitOfMeasurement}</td>
                    <td><button class="btn btn-warning glyphicon glyphicon-remove delete-button" id="delte-button-${item.id}"></button></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>

<form role="form" class="col-lg-offset-1 col-lg-3">
    <div class="form-group">
        <label for="email">Enter shipping address</label>
        <input type="text" class="form-control" id="email" placeholder="Shipping address">
        <p class="help-block">Lviv, Tyha, 4/52</p>
    </div>
    <div class="check-box">
        <label><input type="checkbox">Should courier smile?</label>
    </div>

    <a type="submit" class="btn btn-success" href="buy-product">Buy</a>
    <div class="help-block">
        You will pay after getting your order
    </div>
</form>