var array = new Array(15);
for(var x = 0; x < array.length; x++) {
	array[x] = Math.floor(Math.random()*10);
}

for(var y = 0; y < array.length; y++) {
	document.writeln(array[y]);
}

document.writeln('<br/>');

array.sort();

document.writeln("-----------------------------------------");
document.writeln('<br/>');

for(var z = 0; z < array.length; z++) {
	document.writeln(array[z]);
}