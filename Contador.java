import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        int num1, num2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o parâmetro de começo: ");
        num1 = sc.nextInt();
        System.out.println("Digite o parâmetro de parada: ");
        num2 =  sc.nextInt();

        try {
            Contar(num1, num2);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }


        
    }

    static void Contar(int num1, int num2) throws ParametrosInvalidosException{

        if(num2 < num1){
            throw new ParametrosInvalidosException();
        }else{
                int contagem = num2 - num1;
            for( int cont = 0 ; cont < contagem; cont++  ){

                System.out.println("Imprimido o numero "+cont);
                num1++;
            }
        }


    }
}