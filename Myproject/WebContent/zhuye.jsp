<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<%
	String username = (String)session.getAttribute("username");
	if(username == null){
		response.sendRedirect("index.html");
	}
%>
<style>
    header{
        width: 100%;
    }
    header>div{
        font-size: 35px;
        font-weight: bold;
        animation: ss 13s infinite ease-in;
        display: inline-block;
        transform-style: preserve-3d;
    }

    @keyframes ss {
        0% {
            transform: translateX(0px);
            color: black;
        }


        25% {
            transform: translateX(600px) translateY(660px) rotateY(45deg);
            color: tan;
        }
        
        75% {
            transform: translateX(1200px) translateY(0) rotateY(90deg);
            color: rgb(72, 32, 148);
        }
        100% {
            transform: translateX(0px);
            color: black;
        }
    }

    table {

        margin: 150px auto;
    }

    td:nth-child(odd) {
        width: 250px;
        height: 250px;
        background: rgb(192, 116, 116);
        border-radius: 50%;
        margin-right: 50px;
        font-size: 35px;
        border: 2px solid slategray;
        box-shadow: 3px 7px 16px 1px rgb(51, 54, 56);
        cursor: pointer;
    }
    td:nth-child(odd)>a{
        text-decoration: none;
        color: rgb(58, 54, 54);
    }
    td:last-child {
        background: rgb(211, 211, 105);
    }

    td:nth-child(2) {
        width: 100px;
    }

    tr {
        text-align: center;
    }
</style>

<body>
    <header>
        <div>欢迎进入汽车之家！！</div>
    </header>

    <section>
        <table>
            <tr>
                <td><a href="shangpin.jsp"><span>参观<br />商品</span></a></td>
                <td></td>
                <td><a href="wenzi.jsp"><span>阅读<br />文章</span></a></td>
            </tr>
        </table>
    </section>
</body>

</html>