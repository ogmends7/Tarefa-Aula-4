import java.util.Scanner;

//Gustavo Mendes Ramalho

public class exercicio5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double num1, num2;
        String opcao;

        System.out.println("Digite dois números: ");
        num1 = ler.nextDouble();
        num2 = ler.nextDouble();

        System.out.println("Digite M para: Mmédia entre os números digitados \nDigite S para: diferença do maior pelo menor\n" +
                "Digite P para: produto entre os números digitados \nDigite D para: divisão do primeiro pelo segundo\n");

        opcao = ler.next();

        switch (opcao) {
            case "M":
                double media = (num1 + num2) / 2;
                System.out.println("A média dos dois números é de: " + media);

                break;

            case "S":

                if (num1 > num2) {
                    double dif = num1 - num2;
                    System.out.printf("%nA diferença de %f para %f é de %f" ,num1, num2, dif);

                } else if (num2 > num1) {
                    double dif = num2 - num1;
                    System.out.printf("%nA diferença de %f para %f é de %f" ,num2, num1, dif);

                } else {
                    System.out.println("Os números são iguais.");
                }

                break;

            case "P":

                double prod = num1 * num2;

                System.out.printf("%nO produto entre %f X %f: %f", num1, num2, prod);

                break;

            case "D":

                double div = num1 / num2;

                System.out.println("A divisão do primeiro pelo segundo é de " + div);

                break;

            default:

                System.out.println("Escolha invalida");
        }


    }
}