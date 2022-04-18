package escola.infraestrutura.aluno;

import escola.dominio.RepositorioDeAlunos;
import escola.dominio.aluno.Aluno;
import escola.dominio.aluno.AlunoNaoEncontradoPorCpf;
import escola.dominio.aluno.CPF;

import java.util.ArrayList;
import java.util.List;

public class RepositorioAlunosEmMemoria implements RepositorioDeAlunos {

    List<Aluno> alunos = new ArrayList<>();

    @Override
    public void matricular(Aluno aluno) {
        alunos.add(aluno);
    }

    @Override
    public Aluno procurarAlunoPorCPF(CPF cpf) {
        return this.alunosMatriculados().stream()
                .filter(aluno -> aluno.getCpf().equals(cpf.getCpf()))
                .findFirst()
                .orElseThrow(() -> new AlunoNaoEncontradoPorCpf(cpf));
    }

    @Override
    public List<Aluno> alunosMatriculados() {
        return alunos;
    }
}
