package JavaCursoPt1;


public class TestaCondicional {

    public static void main(String[] args) {

        System.out.println("Testando condicionais");

        int idade = 16;
        int quantidadePessoas = 3;

        if (idade > 18) {
            System.out.println("Você pode entrar, pois tem a idade certa!");
        } else {
            if(quantidadePessoas >=2){
                System.out.println("VOcê não tem a idade certa, mas pode entrar pois" +
                        " está acompanhado!");
            } else{

                System.out.println("Você não pode entrar pois é de menor!");
            }

        }

    }
}
