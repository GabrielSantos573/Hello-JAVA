import java.util.Scanner;

public class Caneta {
    String modelo[] = new String[3];
    String cor[] = new String[3];
    Boolean tampada[] = new Boolean[3];
    int i;

    Scanner input = new Scanner(System.in);

    void recebeCaneta(){
        
        for(i=0; i<3; i++){
            System.out.println("\nModelo:");
            this.modelo[i] = input.nextLine();

            System.out.println("Cor:");
            this.cor[i] = input.nextLine();

            System.out.println("esta tampada?(true/false)");
            this.tampada[i] = input.nextBoolean();

            input.nextLine();

            if (this.tampada[i] == true){
                System.out.println("Não posso escrever!");
            } else if(this.tampada[i] == false){
                System.out.println("Posso escrever!");
            }else{
                System.out.println("A resposta tem que ser true/false");
            }
        }
    }

    void printaCaneta(){
        int j;

        System.out.println("\nTodas as canetas:");
        for(j=0; j<3; j++){
            System.out.println("\nModelo:" +this.modelo[j]);
            System.out.println("Cor:" +this.cor[j]);
            System.out.println("esta tampada?"+this.tampada[j]);
        }
    }

    

}
