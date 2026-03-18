import java.util.Scanner;

//Gustavo Mendes Ramalho

public class exercico4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double salario,novoSalario;

        System.out.println("Digite seu salário: ");
        salario = ler.nextDouble();

        System.out.println("Qual o seu plano: ");
        String plano = ler.next();

        switch (plano) {
            case "A":

                novoSalario = salario + (salario * 0.1);
                System.out.println("Seu novo salário é de " + novoSalario);

                break;

            case "B":

                novoSalario = salario + (salario * 0.15);
                System.out.println("Seu novo salário é de " + novoSalario);

                break;

            case "C":

                novoSalario = salario + (salario * 0.2);
                System.out.println("Seu novo salário é de " + novoSalario);

                break;

            default:

                System.out.println("Plano inválido!");

        }

    }
}