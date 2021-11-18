<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<jsp:directive.page import="java.sql.*"/>
<jsp:declaration>
static String url = "jdbc:mysql://localhost:3306/javaweb?autoReconnect=true&useSSL=false";
static String user = "root";
static String password = "SWAsis123*";
static Connection conexao;

public void init() throws ServletException {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conexao = DriverManager.getConnection(url, user, password);
		conexao.setAutoCommit(false);
	} catch (SQLException | ClassNotFoundException e) {
		e.printStackTrace();
	}
}
</jsp:declaration>

<jsp:scriptlet>
String cpfmask = request.getParameter("cpf");
cpfmask = cpfmask.replaceAll("[.-]", "");
long cpf = Long.parseLong(cpfmask);
String senha = request.getParameter("senha");

response.setContentType("text/html");
session = request.getSession();

try {
	String consulta = "SELECT * FROM users WHERE cpf = '" + cpf + "' AND senha = '" + senha + "';";
	Statement statement;
	statement = conexao.createStatement();
	ResultSet rs = statement.executeQuery(consulta);
	
	if(rs.next()) { //User Autenticado
		
		session.setAttribute("login", "true");
		response.sendRedirect("../index.jsp");
	}else {
		
		session.setAttribute("message", "Credenciais não encontradas.");
		session.setAttribute("login", "false");
		response.sendRedirect("../login.jsp");
	}
} catch (SQLException e) {
	e.printStackTrace();
}
</jsp:scriptlet>