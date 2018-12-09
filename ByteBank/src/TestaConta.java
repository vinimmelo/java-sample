public class TestaConta {
    public static void main(String[] args) {

        Conta contaDoPaulo = new Conta(1337, 1235879);

        contaDoPaulo.deposita(100);
        contaDoPaulo.setTitular(new Cliente());
        contaDoPaulo.getTitular().setCpf("122-277-118-76");
        contaDoPaulo.getTitular().setNome("Vini Melo");

        System.out.println(contaDoPaulo.getSaldo() + "\n" + contaDoPaulo.getTitular().getCpf());
        System.out.println(contaDoPaulo.getTitular().getNome());

        Conta contaDoVini = new Conta(1337, 987123);
        contaDoVini.setTitular(new Cliente());

        System.out.println("Contas criadas: " + Conta.getTotal());
    }
}
