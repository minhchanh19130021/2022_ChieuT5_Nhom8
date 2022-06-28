<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="container-fluid header">
    <div class="container">
        <div class="row">
            <div class="col-lg-6">
                <a href="/Home">
                    <img src="data:image/webp;base64,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"
                         alt="">
                </a>
            </div>
            <div class="col-lg-6 d-flex justify-content-between">
                <div class="">
                    <a class="header-login" href="">Đăng Nhập</a>
                    <a class="header-register" href="../sign_up.jsp">Đăng Ký</a>
                </div>
                <div class=" ">
                    <form id="formSearch" method="post" action="/Search">
                        <input type="search" name="txtTitle" placeholder="Search">
                        <button class="btn-search" type="submit">
                            <i class="fa-solid fa-magnifying-glass"></i>
                        </button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>