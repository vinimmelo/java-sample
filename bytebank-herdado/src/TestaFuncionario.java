public class TestaFuncionario {

    public static void main(String[] args) {

        Funcionario vini = new Funcionario();
        vini.setCpf("42486458824");
        vini.setNome("Vinícius Melo");
        vini.setSalario(1700);

        System.out.println(vini.getBonificacao());
        System.out.println(vini.getCpf());
        System.out.println(vini.getNome());
        System.out.println(vini.getSalario());


        Gerente wendell = new Gerente();

        wendell.setSenha(2222);
        wendell.setCpf("12227716283");
        wendell.setNome("Wendell Menezes");
        wendell.setSalario(5000);

        System.out.println(wendell.getCpf());
        System.out.println(wendell.getNome());
        System.out.println(wendell.getSalario());
        System.out.println(wendell.autentica(2222));
        System.out.println(wendell.getBonificacao());
    }

}
