package escola.dominio;

import escola.dominio.aluno.Aluno;
import escola.dominio.aluno.CPF;

import java.util.List;

public interface RepositorioDeAlunos {

    void matricular(Aluno aluno);
    Aluno procurarAlunoPorCPF(CPF cpf);
    List<Aluno> alunosMatriculados();
}
