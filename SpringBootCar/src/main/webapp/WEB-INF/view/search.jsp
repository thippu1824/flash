<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@include file="header.jsp" %>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body style="background-color: F5DEB3;">
    <div class="row">
        <div class="col-sm-3"></div>
        <div class="col-sm-6">
            <h4>Search cars based on the following names</h4>
            <div class="form-group">
               <form:form action="searchColor" modelAttribute="car">
            
            <form:label path="color">Enter color</form:label>
            <form:input path="color" class="form-control" name="color"/>
            <form:button type="submit" class="btn btn-info">Search</form:button> <br> 
            
            </form:form>
            
            <form:form action="searchDop" modelAttribute="car">
            
           <form:label path="dateofpurchase">Enter Date Of Purchase</form:label>
            <form:input path="dateofpurchase" class="form-control" name="dateofpurchase"/>
            <form:button type="submit" class="btn btn-info">Search</form:button> <br> 
            
            </form:form>
            
             <form:form action="searchModel" modelAttribute="car">
             
            <form:label path="color">Enter Model</form:label>
            <form:input path="model" class="form-control" />
            <form:button type="submit" class="btn btn-info">Search</form:button> <br>
            
            </form:form>
            
             <form:form action="searchPrice" modelAttribute="car">
            <form:label path="price">Enter Price-Range</form:label>
            <form:input path="price" class="form-control" name="price"/>
            <form:button type="submit" class="btn btn-info">Search</form:button> 
             </form:form>

            
            </div>
        </div>
        <div class="col-sm-3"></div>
    </div>
</body>
</html>