$(document).ready(function(){

	$("h1").text("Formulario");
})

function enviar(){
		var x = window.location.search.substring(1);
			alert("Enviara los archivos");
			$.ajax({
			type:"post",
			url: x,
			data: $("#formulario").serialize(),
			success:function(data){
				alert("Se han enviado los datos correctamente");
			},
			error:function(data){
				alert("Ocurrio un error");
			}
		});
		return false;			
	};
	