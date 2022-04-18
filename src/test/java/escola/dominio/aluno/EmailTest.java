package escola.dominio.aluno;

import escola.dominio.aluno.Email;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    void naoDeveriaCriarEmailsComEnderecosInvalidos(){
        assertThrows(IllegalArgumentException.class, () -> new Email(null));
        assertThrows(IllegalArgumentException.class, () -> new Email(""));
        assertThrows(IllegalArgumentException.class, () -> new Email("null"));
    }

    @Test
    void deveriaCriarEmailCorretamente(){
        assertAll("fulano@gmail.com", () -> new Email("fulano@gmail.com"));
        assertAll("fulano.sobrenome@gmail.com", () -> new Email("fulano.sobrenome@gmail.com"));
    }

    @Test
    void deveriaCriarEmailCorretamente2(){
        String email = "paloma@gmail.com";
        Email newEmail = new Email("paloma@gmail.com");
        assertEquals(email, newEmail.getEmail());
    }
}