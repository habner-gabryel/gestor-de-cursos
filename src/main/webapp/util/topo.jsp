<%
	if(session.getAttribute("login") != "true"){
		session.setAttribute("message", "Acesso negado, necess�ria autentica��o.");
%>
<jsp:forward page="/login.jsp"></jsp:forward>
<%	} %>