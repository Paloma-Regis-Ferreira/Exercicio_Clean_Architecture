package escola.infraestrutura.indicacao;

import escola.aplicacao.indicacao.EnvioDeEmail;
import escola.dominio.aluno.Aluno;

public class ServicoDeEnvioDeEmail implements EnvioDeEmail {

    @Override
    public void enviarEmailAoAlunoIndicado(Aluno indicado) {
        //alguma tecnologia de envio de email
    }
}
