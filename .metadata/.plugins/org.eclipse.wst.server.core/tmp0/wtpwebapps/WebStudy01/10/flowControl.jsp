<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>10/flowControl.jsp</title>
</head>
<body>
<h4>Flow control(페이지 이동 방식, A->B)</h4>
<pre>
	Http : ConnectLess, StateLess
	1.  Request Dispatch : 원본 요청을 그대로 유지한 채 분기하는 방식.
		- forward
		- include
		<%
			String path = "/05/standardDesc.jsp";
// 			RequestDispatcher rd = request.getRequestDispatcher(path);
// 			rd.forward(request, response);
// 			rd.include(request, response);
			String location = request.getContextPath() + path;
			response.sendRedirect(location);
		%>
	2.  Redirect : response body가 없는 응답이 전송되면서, 원본 요청이 제거되고, 완전히 새로운 요청이 발생하는 방식.
</pre>
</body>
</html>