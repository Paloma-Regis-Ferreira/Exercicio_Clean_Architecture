package escola.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private String nome;
    private CPF cpf;//nao coloca id pois nao temos q pensar na infra no clean architecture
    private Email email;
    private String senha;

    private List<Telefone> telefones = new ArrayList<>();

    public Aluno( String nome, CPF cpf, Email email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public void adicionarTelefone(String ddd, String numero){
        this.telefones.add(new Telefone(ddd, numero));
    }

    public String getCpf() {
        return cpf.getCpf();
    }

    public void setCpf(CPF cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email.getEmail();
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }
}
