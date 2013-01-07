for (var x = 1; x <= 80; x++) {
	var resto = x[*\%*]4;
	var resto2 = x[*\%*]7;

	if (resto == 0) {
		document.writeln("*");
	} else if (resto2 == 0) {
		document.writeln("*");
	} else {
		document.writeln(x);
	}
	document.writeln('<br/>');
}