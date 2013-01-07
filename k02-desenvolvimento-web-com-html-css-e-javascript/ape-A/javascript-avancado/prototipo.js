var formacao = {sigla: "K20", nome: "Formação Desenvolvedor Java Avançado"};

var nova_formacao = Object.create(curso);

nova_formacao.sigla = "K30";
nova_formacao.nome = "Formação Desenvolvedor .NET";

console.log(formacao.sigla);
console.log(formacao.nome);