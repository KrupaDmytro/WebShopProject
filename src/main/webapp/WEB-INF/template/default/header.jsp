<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib prefix="sec"
           uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<nav class="navbar" role="navigation">
    <div>
        <a class="navbar-brand" href="/home/all-products">Home</a>
    </div>
    <sec:authorize access="hasAuthority('USER')">
        <div>
            <a class="navbar-brand" href="/home/cart">Cart</a>
        </div>
    </sec:authorize>
    <sec:authorize access="hasAuthority('MANAGER')">
        <div>
            <a class="navbar-brand" href="/home/modify-product">Modify Product</a>
        </div>
    </sec:authorize>
    <a class="navbar-brand" href="<c:url value="/logout" />" role="button">Exit</a>


</nav>
