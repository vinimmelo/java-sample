package JavaCursoPt1;

public class TestaFatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int somaFatorial;
		for(int contador = 1; contador <= 10; contador++) {
			somaFatorial = 1;
			for(int fatorial = contador; fatorial > 1; fatorial--) {
				somaFatorial *= fatorial;
			}
			System.out.println(somaFatorial);
		}
			
	}

}
