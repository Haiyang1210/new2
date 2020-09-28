<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>注册</title>
</head>
<style>
    * {
        padding: 0;
        margin: 0;
        box-sizing: border-box;
    }

    body {
        background-image: url(images/4.jpg);
        background-size: 100%;
    }

    form {
        margin: 100px auto;
        width: 350px;
        height: 500px;
        background: rgb(144, 142, 142);
        display: flex;
        flex-direction: column;
        justify-content: space-evenly;
        align-items: center;
    }

    div {
        margin-top: 70px;
        display: flex;
        justify-content: center;
        align-items: center;
        flex-direction: column;
        position: relative;
    }

    div>input {
        width: 200px;
        height: 50px;
    }

    div>input:first-of-type {
        margin-bottom: 40px;
    }

    div>input:focus {
        outline: none;
    }

    div>label {
        
        font-size: 1.3rem;
        font-weight: 500;
         align-self: flex-start;
    }

    input[type=submit] {
        width: 200px;
        height: 50px;
        font-size: 1.3rem;
    }

    
</style>

<body>
    <form action="Registry" method="POST">
        <h2>欢迎您注册！！！</h2>
        <div>
            <label for="user">账号</label><input id="user" type="text" name="username">
            <label for="pass">密码</label><input id="pass" type="text" name="password">
        </div>
        <input type='submit' value = '提交'>
    </form>
    
</body>

</html>