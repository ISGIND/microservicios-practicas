<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Clientes Ajax</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">

	$(document).ready(function(){
		$.ajax({
			  url: "http://localhost:8080/3-jee/clientes",
			  success: function(respuesta){
				  	var clientes = JSON.parse(respuesta);
				    $.each(clientes, function(i){
							console.log(clientes[i].nombre);
							$('#comboClientes').append('<option value="'+clientes[i].idCliente+'">'+clientes[i].nombre+'</option>')
				    });//each
				}//success
		});//ajax

		$('#btnguardar').click(function(){
			var cliente = {
				nombre : $('#txtnombre').val(),
				apaterno: $('#txtapaterno').val(),	
				amaterno: $('#txtamaterno').val(),
				idCliente:$('#txtidcliente').val(),
				rfc:$('#txtrfc').val()
			}//cliente

			var json = JSON.stringify(cliente); // convierto el objeto js a cadena JSON

			$.ajax({
				url: "http://localhost:8080/3-jee/clientes",
				type: "post",
				dataType:"json",
				contentType:"application/json",
				data: json,
				success: function(respuesta){
						alert(respuesta);
				}//succes
			}); // ajax
		});//btnguardar

		$('#btneliminar').click(function(){
			var idCliente = $('#comboClientes').val();

			$.ajax({
				url: "http://localhost:8080/3-jee/clientes?idEliminar="+idCliente,
				type: "post",
				success: function(respuesta){
						alert(respuesta);
				}//succes
			});
			});
	
		
	});//ready
</script>
</head>
<body>
	<select id="comboClientes">
			<option value="0">Selecciona un cliente</option>
	</select>
		<br/>
		<input type="number" id="txtidcliente" value="0" placeholder="ID cliente..." required/>
		<br/>
		<input type="text" id="txtnombre" value="" placeholder="Nombre del cliente..." required/>
		<br/>
		<input type="text" id="txtapaterno" value="" placeholder="Apellido Paterno..." required/>
		<br/>
		<input type="text" id="txtamaterno" value=""placeholder="Apellido Materno..." required/>
		<br/>
		<input type="text" id="txtrfc" value="" placeholder="RFC..."/>
		<br/>
		<input type="button" value="Guardar" id="btnguardar"/>
		<input type="button" value="Eliminar" id="btneliminar"/>
</body>
</html>