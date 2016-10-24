<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link rel="stylesheet" href="resources/css/not-marked-li-and-ul.css">
    <script src="resources/js/all-product.js"></script>

</head>
<body>

<div class="container">
    <div class="row">
        <div class="col-lg-12">
            <ul class="thumbnails product-list"></ul>
        </div>
    </div>

    <div class="container" id="paging">
        <ul class="pagination">
            <li class="disabled"><span>Prev</span></li>
            <li class="my-page" id="page-1"><span>1</span></li>
            <li class="my-page" id="page-2"><a>2</a></li>
            <li class="my-page" id="page-3"><a>3</a></li>
            <li class="my-page" id="page-4"><a>4</a></li>
            <li class="my-page" id="page-5"><a>5</a></li>
            <li><a href="#">Next</a></li>
        </ul>
    </div>
</div>
</body>
</html>