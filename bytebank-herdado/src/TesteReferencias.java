public class TesteReferencias {

    public static void main(String[] args) {

        Funcionario d = new Designer();
        Funcionario ev = new EditorVideo();
        Funcionario g = new Gerente();

        g.setSalario(5000);
        ev.setSalario(2500);
        d.setSalario(2000);

        ((Gerente) g).setSenha(2222);
        System.out.println(((Gerente) g).autentica(2222));

        ControleBonificacao controle = new ControleBonificacao();

        controle.registra(d);
        controle.registra(ev);
        controle.registra(g);

        System.out.println(controle.getSoma());
    }
}
