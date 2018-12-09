public class TesteContas {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(100.0);

        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.deposita(100.0);

        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());

        cp.transfere(10, cc);
        cc.transfere(25, cp);

        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());

        cp.saca(50);
        cc.saca(50);

        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());

    }
}
