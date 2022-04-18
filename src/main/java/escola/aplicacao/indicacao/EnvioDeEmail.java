package escola.aplicacao.indicacao;

import escola.dominio.aluno.Aluno;

public interface EnvioDeEmail {

    void enviarEmailAoAlunoIndicado(Aluno indicado);
}
