<jsp:include page="../util/topo.jsp"/>
<html><head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script type="text/javascript" src="../lib/js/jquery.min.js"></script>
    <script type="text/javascript" src="../lib/js/bootstrap.min.js"></script>
    <link href="../lib/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="../lib/css/bootstrap.css" rel="stylesheet" type="text/css">
    <link href="../lib/css/padrao.css" rel="stylesheet" type="text/css">
	<link href="../lib/css/test.css" rel="stylesheet" type="text/css">
  </head><body>
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
            <h3 class="menu_tag">&gt;&gt; CLIENTES - CADASTRAR UM NOVO CLIENTE &lt;&lt;</h3>
          </div>
        </div>
        <div class="row">
          <div class="col-md-12">
            <form class="form-horizontal" role="form" action="http://localhost/LojaVirtuall/Controller" method="post">
              <div class="form-group">
                <div class="col-sm-2">
                  <label for="inputEmail3" class="control-label">Informar o CPF:</label>
                </div>
                <div class="col-sm-10">
                  <input type="text" name="cpf" class="form-control" placeholder="cpf" pattern="\d{3}\.\d{3}\.\d{3}-\d{2}" title="Digite um CPF no formato: xxx.xxx.xxx-xx" required>
                </div>
              </div>
              <div class="form-group">
                <div class="col-sm-2">
                  <label for="inputNome" class="control-label">Informar o NOME:</label>
                </div>
                <div class="col-sm-10">
                  <input type="text" name="nome" class="form-control" id="inputNome" placeholder="Nome" required>
                </div>
              </div>
              <div class="form-group">
                <div class="col-sm-2">
                  <label for="inputEMAIL" class="control-label">Informar o EMAIL:</label>
                </div>
                <div class="col-sm-10">
                  <input type="email" name="email" class="form-control" id="inputEMAIL" placeholder="E-mail" required>
                </div>
              </div>
              <input type="hidden" name="id_formulario" value="1">
              <input type="hidden" name="tipo_formulario" value="13">
              <button type="submit" class="btn btn-danger">Cadastrar</button>
            </form>
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
  

</body></html>