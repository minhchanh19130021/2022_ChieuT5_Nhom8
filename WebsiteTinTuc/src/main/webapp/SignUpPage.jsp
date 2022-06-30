<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SignUp</title>
    <link rel="stylesheet" href="assets/scss/signup.css">
</head>
<body>
<div class="main-w3layouts wrapper">
    <h1>Đăng ký tài khoản</h1>
    <div class="main-agileinfo">
        <div class="agileits-top">
            <form action="SignUp" method="post">
                <p class="text-danger">${mess}</p>
                <input class="text" type="text" name="user_name" placeholder="Tài khoản" required="">
                <input class="text w3lpass" type="password" name="pass" placeholder="Mật khẩu" required="">
                <input class="text " type="password" name="repass" placeholder="Xác nhận mật khẩu" required="">
                <input class="text first_name" type="text" name="first_name" placeholder="Họ" required="">
                <input class="text last_name" type="text" name="last_name" placeholder="Tên" required="">
                <input class="text tel" type="tel" name="phone" placeholder="Số điện thoại" required="">
                <input class="text email" type="email" name="email" placeholder="Email" required="">
                <input class="signup" type="submit" value="ĐĂNG KÝ">
            </form>
            <p>Bạn đã có tài khoản ? <a href="#"> Đăng nhập tại đây!</a></p>
        </div>
    </div>
</div>
</body>
</html>
