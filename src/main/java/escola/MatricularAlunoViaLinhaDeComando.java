package escola;

import escola.aplicacao.matricular.MatricularAluno;
import escola.aplicacao.matricular.MatricularAlunoDTO;
import escola.infraestrutura.aluno.RepositorioAlunosEmMemoria;

public class MatricularAlunoViaLinhaDeComando {

    public static void main(String[] args){
        String nome = "Paloma";
        String cpf = "444.444.444-40";
        String email = "paloma@gmail.com";

        MatricularAluno matricular = new MatricularAluno(new RepositorioAlunosEmMemoria());
        matricular.executarMatricula(
                new MatricularAlunoDTO(nome, cpf, email)
        );

    }
}
