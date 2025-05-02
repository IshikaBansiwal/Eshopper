<%@page import="com.univ.bean.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registered Customers</title>
</head>
<body>
<%@ include file="header.jsp" %>

<div class="content-wrapper">
    <div class="container">
        <div class="panel panel-primary">
            <div class="panel-heading">Registered Customers</div>
            <div class="panel-body">
                <table class="table table-bordered table-striped">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Name</th>
                            <th>Address</th>
                            <th>Email</th>
                            <th>Username</th>
                            <th>Mobile</th>
                        </tr>
                    </thead>
                   
                        <tbody>
<%
    if (request.getAttribute("clist") != null) {
        java.util.List<?> clist = (java.util.List<?>) request.getAttribute("clist");
        for (Object obj : clist) {
            Customer c = (Customer) obj; // replace com.yourpackage.Customer with your actual model class package
%>
            <tr>
                <td><%= c.getId() %></td>
                <td><%= c.getCname() %></td>
                <td><%= c.getCadd() %></td>
                <td><%= c.getEmail() %></td>
                <td><%= c.getUnm() %></td>
                <td><%= c.getMob() %></td>
            </tr>
<%
        }
    }
%>

                        
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>

<%@ include file="footer.jsp" %>

</body>
</html>
