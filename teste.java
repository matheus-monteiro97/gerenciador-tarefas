import java.util.Scanner;

public class teste {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("Digite algo");
        String teste = scan.nextLine();
        
        System.out.println(teste);

        scan.close();
    }
    
}
