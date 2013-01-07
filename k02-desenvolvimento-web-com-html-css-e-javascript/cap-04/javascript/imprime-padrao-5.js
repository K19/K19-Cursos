var penultimo = 0;
var ultimo = 1;

document.writeln(penultimo);
document.writeln('<br />');
document.writeln(ultimo);
document.writeln('<br />');

for(var contador = 0; contador < 28; contador++) {
	var proximo = penultimo + ultimo;
	document.writeln(proximo);
	document.writeln('<br />');

	penultimo = ultimo;
	ultimo = proximo;
}