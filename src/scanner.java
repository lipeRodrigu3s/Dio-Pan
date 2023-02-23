import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Qual seu nome? ");
        String nome = leia.nextLine();

        System.out.println("Digite sua idade ");
        int idade = leia.nextInt();

        System.out.println("meu nome é " + nome + " e tenho " + idade + " anos");
    leia.close();
    }
}
