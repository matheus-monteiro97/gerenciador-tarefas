import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        Usuario usuario = new Usuario(null, null, null);
        // Tarefa tarefa = new Tarefa(null, 0);

        System.out.println("Digite 1 caso deseje logar no sistema e 2 para sair.");

        int login = scan.nextInt();

        switch (login) {
            case 1: 
                System.out.println("Login");

                System.out.println("Digite seu nome");
                usuario.setNome(scan.nextLine());

                System.out.println("Digite seu email");
                usuario.setEmail(scan.nextLine());
                usuario.validarEmail(usuario.getEmail());

                System.out.println("Digite sua senha");
                usuario.setSenha(scan.nextLine());
                usuario.validarSenha(usuario.getSenha());

            case 0: 
                System.out.println("Finalizado");
           
            default: 
                System.out.println("Opção inválida.");
        } 

        scan.close();
    }
}
