<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="resources/js/add-product.js"></script>

<body>

<form role="form" method="post" action="add-product">
    <div class="form-group">
        <label for="name">Enter product name</label>
        <input type="text" class="form-control" id="name" name="name" placeholder="type product name here">
    </div>
    <div class="form-group">
        <label for="price">Enter product price</label>
        <input type="text" class="form-control" id="price" name="price" placeholder="type product price here">
    </div>
    <div class="form-group">
        <label for="description">Enter product description</label>
        <input type="text" class="form-control" id="description" name="description"
               placeholder="type product description here">
    </div>
    <button type="button" id="send-new-product">Send</button>
    <div id="successful-adding" hidden>
        Successfully added
    </div>
</form>

<hr>

</body>
