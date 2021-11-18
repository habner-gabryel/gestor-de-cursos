<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="text/javascript" src="http://localhost/LojaVirtuall/lib/js/jquery.min.js"></script>
<script type="text/javascript" src="http://localhost/LojaVirtuall/lib/js/bootstrap.min.js"></script>
<link href="http://localhost/LojaVirtuall/lib/css/font-awesome.min.css" rel="stylesheet" type="text/css">
<link href="http://localhost/LojaVirtuall/lib/css/bootstrap.css" rel="stylesheet" type="text/css">
<link href="http://localhost/LojaVirtuall/lib/css/padrao.css" rel="stylesheet" type="text/css">
<link href="http://localhost/LojaVirtuall/lib/css/test.css" rel="stylesheet" type="text/css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

<style>
input:invalid {
	border: 2px solid red;
}

input:invalid:focus {
	background-color: RGB(195, 90, 90);
	border: 2px solid red;
}
</style>

</head>
<title>Login</title>
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
					<h3 class="menu_tag">&gt;&gt; AUTENTICAÇÃO &lt;&lt;</h3>
					<br>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<form class="form-horizontal" role="form" action="util/auth.jsp" method="post">
						<div class="form-group">
							<div class="col-sm-2">
								<label class="control-label">Informar o CPF:</label>
							</div>
							<div class="col-sm-10">
								<input type="text" name="cpf" class="form-control"
									placeholder="cpf" pattern="\d{3}\.\d{3}\.\d{3}-\d{2}"
									title="Digite um CPF no formato: xxx.xxx.xxx-xx" required>
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-2">
								<label for="inputSenha" class="control-label">Informar a
									SENHA:</label>
							</div>
							<div class="col-sm-10">
								<input type="password" name="senha" class="form-control"
									id="inputSenha" required>
							</div>
						</div>
						<button type="submit" class="btn btn-danger">Login</button>
					</form>
				</div>
			</div>
		</div>
	</div>
		<div class="row d-flex justify-content-center" style="color: white; font-size: 18px; boder:1px solid red; border-radius 5%;">
			<span class="bagde bg-danger col-5 text-center"> 
				${message}
			</span> 
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