package byteBank;

public class TestaMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta contaDoVini = new Conta();
		
		Conta contaDaThais = new Conta();
		
		contaDaThais.saldo = 3000;
		contaDoVini.saldo = 200;
		contaDoVini.deposita(250);
		
		if(contaDoVini.saca(150)) {
			System.out.println("Tudo certo... Sacado!");
		}
		else {
			System.out.println("Sem dinheiro.");
		}
		
		
		if(contaDaThais.transfere(500, contaDoVini))
			System.out.println("Deu certo a transferência");
		else 
			System.out.println("Deu ruim");
		
		
		System.out.println(contaDaThais.saldo + "\n" + contaDoVini.saldo);
	}
	

}
