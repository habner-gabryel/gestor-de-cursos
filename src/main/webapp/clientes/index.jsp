<jsp:include page="../util/topo.jsp"/>
<html>
	<head>
	    <meta charset="utf-8">
	    <meta name="viewport" content="width=device-width, initial-scale=1">
	    <script type="text/javascript" src="../lib/js/jquery.min.js"></script>
	    <script type="text/javascript" src="../lib/js/bootstrap.min.js"></script>
	    <link href="../lib/css/font-awesome.min.css" rel="stylesheet" type="text/css">
	    <link href="../lib/css/bootstrap.css" rel="stylesheet" type="text/css">
	    <link href="../lib/css/padrao.css" rel="stylesheet" type="text/css">
		<link href="../lib/css/test.css" rel="stylesheet" type="text/css">
	</head>
	<title>Clientes</title>
<body>
    <div class="header_div text-justify">
      <div class="container">
        <div class="row text-center">
          <div class="col-md-12 text-center">
            <h1 class="text-center">Gestor de Cursos</h1>
          </div>
        </div>
      </div>
    </div>
    
    <div class="section">
      <div class="container">
        <div class="row">
          <div class="col-md-12 text-center">
            <h3 class="menu_tag">&gt;&gt; CLIENTES &lt;&lt;</h3>
            <div class="col-md-12  btn-group btn-group-lg btn-group-vertical">
              <a href="view.jsp" class="btn btn-default">Consultar Todos os Clientes</a>
              <a href="consulta.jsp" class="btn btn-default">Consultar um Cliente Específico</a>
              <a href="cadastro.jsp" class="btn btn-default">Cadastrar um Novo Cliente</a>
              <a href="alteracao.jsp" class="btn btn-default">Alterar um Cliente</a>
              <a href="exclusao.jsp" class="btn btn-default">Excluir um Cliente</a>
            </div>
          </div>
        </div>
      </div>
    </div>
    
    <div class="section">
      <div class="container">
        <div class="row">
          <div class="col-md-12 text-center corrigir">
            <a class="btn btn-default" href="javascript:window.history.go(-1)">Voltar</a>
          </div>
        </div>
      </div>
    </div>
    
    <footer>
      <div class="navbar navbar-fixed-bottom footer_div">
        <div class="container">
          <div class="row footer_content">
            <div class="col-sm-12 text-center">Desenvolvedor Jr.</div>
          </div>
        </div>
      </div>
    </footer>
</body>
</html>