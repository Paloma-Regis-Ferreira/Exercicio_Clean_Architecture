package escola.dominio.aluno;

public class AlunoNaoEncontradoPorCpf extends RuntimeException{

    public AlunoNaoEncontradoPorCpf(CPF cpf){
        super("Aluno com cpf " + cpf + " não encontrado");
    }
}
