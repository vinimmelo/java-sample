package JavaCursoPt1;

public class TesteIR {
	public static void main(String[] args) {

		double salario = 3300.0;

		if (salario < 1900.0) {
			System.out.println("N�o paga imposto de renda!");
		} else if (salario >= 1900.00 && salario <= 2800.00) {
			System.out.println("Sua aliquota � de 7.5%\n" + "Pode deduzir at� R$142,00");
		} else if (salario > 2800.00 && salario <= 3751.00) {
			System.out.println("Sua aliquota � de 15%\n" + "Pode deduzir at� R$350,00");
		} else if (salario > 3751.00 && salario <= 4664) {
			System.out.println("Sua aliquota � de 22,5%\n" + "Pode deduzir at� R$636");
		}

	}
}
