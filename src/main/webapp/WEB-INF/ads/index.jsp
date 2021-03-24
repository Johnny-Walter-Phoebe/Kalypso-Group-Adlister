<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Viewing All The Ads" />
    </jsp:include>
    <style>
        .card {
            box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);
            transition: 0.3s;
        }
        .card:hover {
            box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2);
        }
        .container {
            padding: 2px 16px;
        }
    </style>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />


<div class="container">
    <h1>Ads here!</h1>

    <c:forEach var="ad" items="${ads}">

        <div class="card col-md-4">
            <img src="img_avatar.png" alt="Ad_Image" style="width:100%;height:300px ">
            <div class="container col-md-6">
               <h4><b>${ad.title}</b></h4>
                <p>${ad.description}</p>
                <a href="/ads/create">Edit</a>
            </div>
        </div>
<%--        <div class="col-md-6">--%>
<%--            <a><h3>${ad.title}</h3></a>--%>
<%--            <p>${ad.description}</p>--%>
<%--        </div>--%>
    </c:forEach>
</div>

</body>
</html>

