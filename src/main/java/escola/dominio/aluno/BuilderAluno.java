package escola.dominio.aluno;

public class BuilderAluno {

    private Aluno aluno;

    public BuilderAluno comNomeCPFEmail(String nome, String cpf, String email){
        this.aluno = new Aluno(nome, new CPF(cpf), new Email(email));
        return this;
    }

    public BuilderAluno comTelefone(String ddd, String numero){
        this.aluno.adicionarTelefone(ddd, numero);
        return this;
    }

    public Aluno criar(){
        return this.aluno;
    }
}
