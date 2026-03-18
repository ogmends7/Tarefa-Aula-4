import java.util.Scanner;

//Gustavo Mendes Ramalho

public class exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String periodo;

        System.out.println("Em qual período você estuda");
        periodo = entrada.next();

        switch (periodo) {
            case "M":
                System.out.println("Bom dia");

                break;

            case "V":
                System.out.println("Boa tarde");

                break;

            case "N":

                System.out.println("Boa noite");

                break;
        }

    }
}