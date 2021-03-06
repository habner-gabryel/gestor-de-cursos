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
            <h3 class="menu_tag">&gt;&gt; PAGAMENTOS - ALTERAR UM PAGAMENTO &lt;&lt;</h3>
          </div>
        </div>
        <div class="row">
          <div class="col-md-12">
            <form class="form-horizontal" role="form" action="http://localhost/LojaVirtuall/Controller" method="post">
              <div class="form-group">
                <div class="col-sm-3">
                  <label for="inputCPF" class="control-label">Informar o CPF:</label>
                </div>
                <div class="col-sm-9">
                  <input type="text" class="form-control" name="cpf" id="inputCPF" placeholder="CPF" pattern="\d{3}\.\d{3}\.\d{3}-\d{2}" title="Digite um CPF no formato: xxx.xxx.xxx-xx" required>
                </div>
              </div>
              <div class="form-group">
                <div class="col-sm-3">
                  <label for="inputCURSO" class="control-label">Informar o CURSO:</label>
                </div>
                <div class="col-sm-9">
                  <input type="number" class="form-control" name="curso" id="inputCURSO" placeholder="CURSO" required>
                </div>
              </div>
              <div class="form-group">
                <div class="col-sm-3">
                  <label for="inputDATA" class="control-label">Informar a NOVA DATA DE INSCRI????O:</label>
                </div>
                <div class="col-sm-9">
                  <input type="date" class="form-control" name="data" id="inputDATA" title="Preencha o campo com a data" required>
                </div>
              </div>
              <input type="hidden" name="id_formulario" value="3">
              <input type="hidden" name="tipo_formulario" value="34">
              <button type="submit" class="btn btn-danger">Alterar</button>
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