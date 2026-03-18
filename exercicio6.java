import java.util.Scanner;

//Gustavo Mendes Ramalho

public class exercicio6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int codigo, qtd;
        float preco, valorTotal;
        String produto;

        System.out.println("Código --- Produto --- Preço");
        System.out.println("100 --- Cachorro quente --- R$ 1,20\n" +
                "101 ---  Bauru Simples --- R$ 1,30\n" +
                "102 --- Bauru com ovo --- R$ 1,50\n" +
                "103 --- Hambúrguer --- R$ 1,20\n" +
                "104 --- Cheeseburguer --- R$ 1,30\n" +
                "105 --- Refrigerante --- R$ 1,00");

        System.out.println("Digite o código do produto: ");
        codigo = ler.nextInt();

        System.out.println("Digite a quantidade desejada: ");
        qtd = ler.nextInt();

        switch (codigo) {
            case 100:
                preco = 1.2f;
                valorTotal = preco * qtd;

                System.out.println("Cachorro quente");
                System.out.printf("%nO valor à ser pago será de: R$%.2f" ,valorTotal);

                break;

            case 101:
                preco = 1.3f;
                valorTotal = preco * qtd;

                System.out.println("Bauru Simples");
                System.out.printf("%nO valor à ser pago será de: R$%.2f" ,valorTotal);

                break;

            case 102:
                preco = 1.5f;
                valorTotal = preco * qtd;

                System.out.println("Bauru com ovo");
                System.out.printf("%nO valor à ser pago será de: R$%.2f" ,valorTotal);

                break;

            case 103:
                preco = 1.2f;
                valorTotal = preco * qtd;

                System.out.println("Hambúrguer");
                System.out.printf("%nO valor à ser pago será de: R$%.2f" ,valorTotal);

                break;

            case 104:
                preco = 1.3f;
                valorTotal = preco * qtd;

                System.out.println("Cheeseburguer");
                System.out.printf("%nO valor à ser pago será de: R$%.2f" ,valorTotal);

                break;

            case 105:

                preco = 1.0f;
                valorTotal = preco * qtd;

                System.out.println("Refrigerante");
                System.out.printf("%nO valor à ser pago será de: R$%.2f" ,valorTotal);

                break;

            default:

                System.out.println("Código invalido");



        }

    }
}
