import java.util.Scanner;

public class ExemploEtradaDados {
    public static void main(String[] args) {
        //Criar o objeto para ler o teclado
        Scanner leitor = new Scanner(System.in);



        System.out.println("Digite a nota da cp 1");
        double cp1 = leitor.nextDouble();

        System.out.println("Digite a nota da cp 2");
        double cp2 = leitor.nextDouble();

        System.out.println("Digite a nota de sprint 1 (challenge)");
        double challenge1 = leitor.nextDouble();

        System.out.println("Digite a nota de sprint 2 (challenge)");
        double challenge2 = leitor.nextDouble();

        System.out.println("Digite a nota da GS");
        double gs = leitor.nextDouble();
        double mediaCp = (cp1 + cp2) / 2;
        double mediaChallenge = (challenge1 + challenge2) / 2;
        double mediaFinal = mediaCp * 0.2 + mediaChallenge * 0.2 + gs * 0.6;
        System.out.println("Média final: " + mediaFinal);

    }
}
