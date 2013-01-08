var letras = ["a", "b", "c", "d", "e"];

letras.reverse();

for(var x = 0; x < letras.length; x++) {
	console.log(letras[x]);
}

var letras = letras.shift();

console.log("Elemento removido: " + letras);

for(var x = 0; x < letras.length; x++) {
	console.log(letras[x]);
}