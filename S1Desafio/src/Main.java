import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       boolean continuar = true;
       String resposta;

       do {
           System.out.println("Qual é o seu peso? ");
           double peso = sc.nextDouble();
           System.out.println("Qual é a sua altura? ");
           double altura = sc.nextDouble();
           final double IMC = peso / (altura * altura);

           if (IMC < 18.5) {
               System.out.println("Abaixo do peso ideal. ");
           } else if (IMC >= 18.5 && IMC <= 24.9) {
               System.out.println("Peso normal. ");
           } else if (IMC >= 25 && IMC <= 29.9) {
               System.out.println("Sobrepeso. ");
           } else if (IMC >= 30 && IMC <= 34.9) {
               System.out.println("Obesidade grau 1. ");
           } else if (IMC >= 35 && IMC <= 39.9) {
               System.out.println("Obesidade grau 2. ");
           } else {
               System.out.println("Obesidade grau 3 (obesidade mórbida. ");
           }

           System.out.println("Gostaria de verificar o seu IMC novamente? (Sim) (Não) ");
           resposta = sc.next();

           if (resposta.equals("Não")) {
                System.out.println("Obrigado por usar nosso programa! [...] ");
                continuar = false;
           } else {
               System.out.println("[...] ");
           }

       } while (continuar);







    }
}