import java.util.Scanner;

public class TestaScanner {

    public static void main(String[] args) {

        Scanner input = new Scanner( System.in );

        int num1, num2, sum;

        System.out.print("Digite o primeiro número: ");
        num1 = input.nextInt();

        System.out.print("Digite o se  gundo número: ");
        num2 = input.nextInt();

        sum = num1 + num2;
        System.out.println("A soma dos dois números é: " + sum);
    }
}
