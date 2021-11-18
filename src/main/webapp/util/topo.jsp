<%
	if(session.getAttribute("login") != "true"){
		session.setAttribute("message", "Acesso negado, necessária autenticação.");
%>
<jsp:forward page="/login.jsp"></jsp:forward>
<%	} %>