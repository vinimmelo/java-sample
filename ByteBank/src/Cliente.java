public class Cliente {

    private String nome;
    private String cpf;
    private String profissao;


    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }
    public String getProfissao() {
        return profissao;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

}
