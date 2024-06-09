import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int param1 = sc.nextInt();

        System.out.println("Digite o segundo parãmetro: ");
        int param2 = sc.nextInt();

        try{
            count(param1, param2);
        }
        catch(ParametrosInvalidosException e){
            System.out.println(e.getMessage());
        }
    }

    static void count (int param1, int param2) throws ParametrosInvalidosException{

        if(param1 > param2){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int score = param2 - param1;

        for(int i = 1; i <= score; i++){
            System.out.println("Imprimindo o numero "+i);
        }
    }
}
