<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="container-fluid">
    <div class="container">
        <nav class="navbar navbar-expand-lg navbar-light ">

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <c:forEach var="t" items="${listT}">
                        <li class="nav-item">
                            <a class="nav-link" href="#">${t.name}</a>
                        </li>
                    </c:forEach>
                </ul>

            </div>

        </nav>
    </div>
</div>
