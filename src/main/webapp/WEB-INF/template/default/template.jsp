
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
<%@ page contentType="text/html; charset=UTF-8" %>

<title><tiles:insertAttribute name="title" ignore="true" /></title>

<!--Bootstrap and jQuery -->

<script src="https://code.jquery.com/jquery-2.2.4.min.js"
integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44=" crossorigin="anonymous"></script>

<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"
integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>

<link rel="stylesheet" href="http://getbootstrap.com/2.3.2/assets/css/bootstrap-responsive.css">
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet"
integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

<script src="//ajax.googleapis.com/ajax/libs/angularjs/1.5.5/angular.min.js"></script>



<!-- Material design -->

<link rel="stylesheet"
href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-material-design/0.3.0/css/material-fullpalette.min.css">
<script type="text/javascript"
src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-material-design/4.0.1/bootstrap-material-design.iife.js"></script>

</head>


<body>
<div class="wrapper">
  <div class="header"><tiles:insertAttribute name="header" /></div>

  <div class="content"><tiles:insertAttribute name="body" /></div>

  <div class="footer"><tiles:insertAttribute name="footer" /></div>
</div>

</body>
</html>
