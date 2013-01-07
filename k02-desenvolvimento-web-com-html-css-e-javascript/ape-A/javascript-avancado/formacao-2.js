var formacao = {sigla: "K00", nome: "Formação Básica"};
console.log(formacao.sigla);
console.log(formacao.curso);

var x = formacao;

x.sigla = "K00";
x.nome = "Formação Básica";

console.log(formacao.sigla);
console.log(formacao.nome);