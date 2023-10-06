import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    
    public static void main(String[] args){
        try{
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Seja bem-vindo ao programa Contador\n");
            System.out.print("-----------------------------------\n");

            System.out.println("Digite o primeiro parâmetro: ");
            int parametroUm = scanner.nextInt();

            System.out.println("Digite o segundo parâmetro: ");
            int parametroDois = scanner.nextInt();

            System.out.print("-----------------------------------\n");
            
            scanner.close();
            contar(parametroUm, parametroDois);            

        }  catch (InputMismatchException exception){
            System.out.println("Os parâmetros precisam ser números inteiros!");

        }  catch (ParametrosInvalidosException exception){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroDois > parametroUm){

            int contagem = parametroDois - parametroUm;

            for (; contagem > 0; contagem--){
                int numIntermediario = contagem + parametroUm;
                if (numIntermediario == parametroDois) {continue;}
                System.out.println("Imprimindo o número: " + numIntermediario);
            }

        } else {
            throw new ParametrosInvalidosException();
        }
    }
}