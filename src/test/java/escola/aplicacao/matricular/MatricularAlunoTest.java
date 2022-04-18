package escola.aplicacao.matricular;

import escola.dominio.aluno.Aluno;
import escola.dominio.aluno.CPF;
import escola.infraestrutura.aluno.RepositorioAlunosEmMemoria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatricularAlunoTest {

    @Test
    void alunoDeveriaSerPersistido(){
        RepositorioAlunosEmMemoria repositorio = new RepositorioAlunosEmMemoria();
        MatricularAluno useCase = new MatricularAluno(repositorio);
        MatricularAlunoDTO alunoDTO = new MatricularAlunoDTO("Paloma", "444.444.444-40", "paloma@gmail.com");
        useCase.executarMatricula(alunoDTO);

        Aluno encontrado = repositorio.procurarAlunoPorCPF(new CPF("444.444.444-40"));
        assertEquals("Paloma", encontrado.getNome());
        assertEquals("444.444.444-40", encontrado.getCpf());
        assertEquals("paloma@gmail.com", encontrado.getEmail());
    }

}