var multiplicacao = function() {
	var multiplicacao = 0;

	for(var x = 0; x < arguments.length; x++) {
		multiplicacao *= arguments[x];
	}

	return multiplicacao;
}

var resultado = multiplicacao(3, 6, 2, 8);

console.log(resultado);