package byteBank;

public class CriaConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Conta primeiraConta = new Conta();
		 primeiraConta.saldo = 200.00;
		 
		 System.out.println(primeiraConta.saldo);
		 
		 primeiraConta.saldo += 100.00;
		 
		 System.out.println(primeiraConta.saldo);
		 
		 Conta segundaConta = new Conta();
		 
		 segundaConta.saldo = 50.00;
		 
		 System.out.println(segundaConta.saldo);
		 
		 System.out.println(primeiraConta);
		 System.out.println(segundaConta);
	}

}
