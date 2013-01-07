var formacoes = ["K00", "K10", "K20", "K30", "K40"];

var formacoes = formacoes.pop();
console.log(formacoes);

formacoes.push("K40");

for(var x = 0; formacoes.length; x++) {  //highlights !!
	console.log(formacoes[x]);
}