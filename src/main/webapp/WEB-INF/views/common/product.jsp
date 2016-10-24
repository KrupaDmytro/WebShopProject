
<link rel="stylesheet" href="resources/css/not-marked-li-and-ul.css">

<script src="resources/js/product.js"></script>

<body>
<div class="container">
    <div class="row">
        <div class="col-lg-3">
            <img src="resources/css/nobread.png" alt="">
        </div>
        <div class="col-lg-offset-1 col-lg-8">
            <p class="h2">${product.name}</p>
            <p class="h4">${product.description}</p>
            <div class="h3"><span class="text-info" id="price">${product.price}</span>$ per kilo</div>
            <br>
            <input type="number" id="number-of-product" value="1" min="1">
            <button type="button" id='buy-product' class="btn btn-success">Buy</button>
        </div>
    </div>
</div>
</body>
</html>