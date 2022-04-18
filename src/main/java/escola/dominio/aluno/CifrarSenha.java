package escola.dominio.aluno;

public interface CifrarSenha {

    String cifrarSenha(String senha);
    boolean validarSenha(String senhaCifrada, String senhaOriginal);
}
