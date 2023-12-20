public class Usuario {
    private String nome;
    private String email;
    private String senha;

    public void validarSenha (String textoSenha) {

        if (textoSenha.matches(".*[@#$%&*].*") && textoSenha.matches(".*\\d.*")) {
            System.out.println("Senha válida, pode.");
        }   else {
            System.out.println("Senha inválida, tente novamente.");
        }
    }

    public void validarEmail (String textoEmail) {
        if (textoEmail.matches(".*[@.].*")) {
            System.out.println("Email válido, pode prosseguir");
        } else {
            System.out.println("Email inválido, tente novamente");
        }
    }

    public Usuario () {}

    public Usuario (String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}