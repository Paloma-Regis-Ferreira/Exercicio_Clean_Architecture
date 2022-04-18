package escola.dominio.aluno;

import escola.dominio.aluno.Telefone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelefoneTest {

    @Test
    void naoDeveriaGerarTelefoneComCamposVazios(){
        assertThrows(IllegalArgumentException.class, () -> new Telefone("", "111"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("11", ""));
    }

    @Test
    void naoDeveriaGerarTelefoneComCamposNaoNumericos(){
        assertThrows(IllegalArgumentException.class, () -> new Telefone("11", "111111q1"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("ç1", "11111111"));
    }

    @Test
    void naoDeveriaGerarTelefoneComQuantidadeDiferenteDeOitoOuNoveNumeros(){
        assertThrows(IllegalArgumentException.class, () -> new Telefone("11", "11111"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("11", "1111111111"));
    }

    @Test
    void deveriaGerarTelefoneSeCamposForemNumericosComOitoOuNoveNumeros(){
        String ddd = "11";
        String numero = "12345678";
        Telefone telefone = new Telefone("11", "12345678");
        assertEquals(ddd, telefone.getDdd());
        assertEquals(numero, telefone.getNumero());
    }
}