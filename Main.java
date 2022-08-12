
public class Main {

	public static void main(String[] args) {

		Cliente Joana = new Cliente();
		Joana.setNome("Joana");
		
		Conta cc = new ContaCorrente(Joana);
		Conta poupanca = new ContaPoupanca(Joana);

		cc.depositar(500);
		cc.transferir(150, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
