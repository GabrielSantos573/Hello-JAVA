import java.util.Scanner;

public class semana {
    int num;

    Scanner input = new Scanner(System.in);

    void diaSemana(){
        System.out.println("Informe um numero inteiro:");
        num = input.nextInt();
        switch(num){
            case 1:    
                System.out.println("Domingo");
            break;
            
            case 2:
                System.out.println("Segunda-Feira");
            break;

            case 3:
                System.out.println("Terça-Feira");
            break;

            case 4:
                System.out.println("Quarta-Feira");
            break;

            case 5:
                System.out.println("Quinta-Feira");
            break;

            case 6:
                System.out.println("Sexta-Feira");
            break;

            case 7:
                System.out.println("Sábado");
            break;
        }
    }
}
