import java.util.Scanner;

public class Aluno {
    String nome;
    float nota[] = new float[4];
    float media;
    float exame;

    Scanner input = new Scanner(System.in);

    void recebeNome(){
        System.out.println("Nome:");
        this.nome = input.nextLine();
    }

    void recebeNotas(){
        int i;
        for(i=0; i<4; i++){
            System.out.printf("Nota %d:", (i+1));
            this.nota[i] = input.nextFloat();
        }
    }

    void calculaMedia(){
        this.media = ((nota[0]*2)+(nota[1]*3)+(nota[2]*4)+(nota[3]*1))/4;

        System.out.println("\nMedia:" +this.media);
        if(this.media >= 7.0){
            System.out.println("Aluno Aprovado!");
            }else if(this.media < 5.0){
                    System.out.println("Aluno reprovado!");
                }else if(this.media >= 5.0 && this.media <= 6.9){
                        System.out.println("Aluno em exame.");

                        System.out.println("Iforme a nota do exame:");
                        this.exame = input.nextFloat();
                    
                        this.media = (media+exame)/2;

                        if(this.media >= 7.0){
                            System.out.println("Aluno Aprovado!");
                        }else{
                            System.out.println("REPROVADO!");
                        }

                        System.out.println("Media final:"+this.media);
                    }
    }
}