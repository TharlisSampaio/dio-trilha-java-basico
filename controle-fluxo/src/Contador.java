import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = scanner.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("O primeiro parâmetro deve ser maior que o segundo");
        }

        scanner.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if(parametroDois > parametroUm){
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        for(int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o número " + i);
        }
    }
}