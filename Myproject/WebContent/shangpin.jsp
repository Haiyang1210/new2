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
    body{
        background-image:linear-gradient(180deg,rgb(243, 137, 137),rgb(110, 93, 93));
        /* background-image: linear-gradient(180deg, red, yellow); */
    }
    table{
        width: 800px;
        background: rgba(56, 89, 109,.4);
        margin: 50px auto;
        border: 1px solid slategrey;
    }
    img{
        width: 400px;
        border: 1px solid steelblue;
    }
    tr:nth-child(odd)>td{
        text-align: center;
    }
    tr:nth-child(even)>td{
        text-align: center;
        padding: 5px;
        color: #f3d3d3;
        font-size: 1.2rem;
        font-weight: bold;
        cursor: pointer;
    }
</style>
<body>
    <table>
        <tr>
            <td width='200'><img src="images/4.jpg" alt=""></td>
            <td><img src="images/3.jpg" alt=""></td>
        </tr>
        <tr>
            <td>本田</td>
            <td>路虎</td>
        </tr>
        <tr>
            <td><img src="images/5.jpg" alt=""></td>
            <td><img src="images/6.jpg" alt=""></td>
        </tr>
        <tr>
            <td>哈佛</td>
            <td>长安</td>
        </tr>
        <tr>
            <td><img src="images/7.jpg" alt=""></td>
            <td><img src="images/8.jpg" alt=""></td>
        </tr>
        <tr>
            <td>比亚迪</td>
            <td>宝马</td>
        </tr>
        <tr>
            <td><img src="images/9.jpg" alt=""></td>
            <td><img src="images/10.jpg" alt=""></td>
        </tr>
        <tr>
            <td>丰田</td>
            <td>奔驰</td>
        </tr>
        <tr>
            <td><img src="images/4.jpg" alt=""></td>
            <td><img src="images/3.jpg" alt=""></td>
        </tr>
        <tr>
            <td>兰博基尼</td>
            <td>路虎</td>
        </tr>

        <tr>
            <td><img src="images/11.jpg" alt=""></td>
            <td><img src="images/12.jpg" alt=""></td>
        </tr>
        <tr>
            <td>宝马</td>
            <td>奥迪</td>
        </tr>
        <tr>
            <td><img src="images/13.jpg" alt=""></td>
            <td><img src="images/14.jpg" alt=""></td>
        </tr>
        <tr>
            <td>本田雅阁</td>
            <td>奔驰c级</td>
        </tr>
        <tr>
            <td><img src="images/15.jpg" alt=""></td>
            <td><img src="images/16.jpg" alt=""></td>
        </tr>
        <tr>
            <td>大众迈腾</td>
            <td>丰田凯美瑞</td>
        </tr>
    </table>
</body>
</html>