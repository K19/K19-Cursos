var conta = {
	saldo: 0,
	saque: function(valor) {
		if (conta.saldo < 600){
			throw {
				message: "Saldo insuficiente."
			}
		} else if (valor <= 0) {
			throw {
				message: "Valores menores ou iguais a 0 não podem ser sacados."
			}
		} else {		
			this.saldo -= valor;	
		}
		try {
			conta.saque(0);
		} catch(e) {
			console.log(e.name);
			console.log(e.message);
		}
	}
}

conta.saque(600)
console.log (conta.saque);