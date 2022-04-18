package escola.aplicacao.matricular;

import escola.dominio.RepositorioDeAlunos;
import escola.dominio.aluno.Aluno;

public class MatricularAluno {

    private final RepositorioDeAlunos repositorio;

    public MatricularAluno(RepositorioDeAlunos repositorio) {
        this.repositorio = repositorio;
    }

    //COMMAND
    public void executarMatricula(MatricularAlunoDTO dados){
        Aluno novo = dados.criarAluno();
        repositorio.matricular(novo);
    }
}
