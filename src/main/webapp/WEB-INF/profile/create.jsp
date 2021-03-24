<%--
  Created by IntelliJ IDEA.
  User: artemis
  Date: 3/17/21
  Time: 11:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="about" value="Create User Profile" />
    </jsp:include>
</head>
<body>
    <jsp:include page="/WEB-INF/partials/navbar.jsp" />
    <h1>Create Your Profile ${sessionScope.user.username}!</h1>
    <div class="container">
        <form action="/profile/create" method="post">
<%--            <div class="form-group">--%>
<%--                <label for="first_name">First Name</label>--%>
<%--                <input id="first_name" name="first_name" class="form-control" type="text">--%>
<%--            </div>--%>
<%--            <div class="form-group">--%>
<%--                <label for="last_name">Last Name</label>--%>
<%--                <input id="last_name" name="last_name" class="form-control" type="text">--%>
<%--            </div>--%>
            <div class="form-group">
                <label for="about">About You</label>
                <textarea id="about" name="about"  rows="5" cols="155" placeholder="Enter information here"></textarea>
            </div>
            <div> <span class="text-uppercase name">Profile Picture</span>
                <div class="d-flex flex-row align-items-center mt-2"> <img src="https://i.imgur.com/aCwpF7V.jpg" width="100" class="rounded">
                    <div class="ml-3"> <button class="btn btn-outline-primary">Upload new picture</button> <button class="btn btn-outline-danger">Remove</button> </div>
                </div>
            </div>
            <button class="btn btn-primary">Create profile</button>
        </form>
    </div>
</body>
</html>
