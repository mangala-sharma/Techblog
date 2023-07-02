<%-- 
    Document   : error_page
    Created on : May 19, 2023, 9:22:18 PM
    Author     : Mangala sharma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sorry! something went wrong</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="css/mycss.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style>
             .banner-background{
                clip-path: polygon(30% 0%, 70% 0%, 100% 0, 100% 86%, 63% 100%, 39% 85%, 0 100%, 0 0);
            }
        </style>
    </head>
    <body>
        <div class="container text-center">
            <img src="images/computer.png" class="img-fluid">
            <h1 class="display-3">Sorry! Something went wrong .....</h1>
            <%= exception %>
            <a href="index.jsp" class=" btn primary-background text-white btn-lg mt-3">Go to home page</a>
        </div>
    </body>
</html>
