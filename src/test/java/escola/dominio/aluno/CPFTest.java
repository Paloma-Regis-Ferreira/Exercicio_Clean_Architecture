package escola.dominio.aluno;

import escola.dominio.aluno.CPF;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CPFTest {

    @Test
    void naoDevePermitirCriacaoDeCPF(){
        assertThrows(IllegalArgumentException.class, () -> new CPF(null));
        assertThrows(IllegalArgumentException.class, () -> new CPF(""));
        assertThrows(IllegalArgumentException.class, () -> new CPF("null"));
    }

    @Test
    void devePermitirCriacaoDeCPF(){
        assertAll("444.444.444-44", () -> new CPF("444.444.444-44"));
        assertAll("44444444444", () -> new CPF("44444444444"));
    }

    @Test
    void devePermitirCriacaoDeCPF2(){
       String cpf = "111.111.111-11";
       CPF newCpf = new CPF(cpf);
       assertEquals(cpf, newCpf.getCpf());
    }
}