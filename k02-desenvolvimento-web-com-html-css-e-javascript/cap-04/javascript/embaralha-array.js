var array = new Array(10);
for (var x = 0; x < array.length; x++) {
	array[x] = x;
}

for (var y = 0; y < array.length; y++) {
	document.writeln(array[y]);
	document.writeln('<br/>');
}

for(var z = 0; z < 15; z++) {
	var posicao1 = Math.floor(Math.random()*10);
	var posicao2 = Math.floor(Math.random()*10);
	var auxiliar = array[posicao1];
	
	array[posicao1] = array[posicao2];
	array[posicao2] = auxiliar;
}

document.writeln("------------------");
document.writeln('<br/>');

for(var w = 0; w < array.length; w++) {
	document.writeln(array[w]);
	document.writeln('<br/>');
}