
import java.util.Scanner;

public class Aluno {
    String nome;
    int idade;
    float media;
    boolean aprovado;

    Scanner input = new Scanner(System.in);

     void recebeNome(){
        System.out.println("Informe seu nome:");
        this.nome = input.nextLine();

        System.out.println("Nome:" +this.nome);
    }

    void recebeIdade(){
        System.out.println("Informe sua idade:");
        this.idade = input.nextInt();

        System.out.println("Idade:" +this.idade);
    }

    void recebeMedia(){
        System.out.println("Digite sua media:");
        this.media = input.nextFloat();

        System.out.println("Media:" +this.media);
    }

    void recebeAprovado(){
        System.out.println("Aprovado: (True/False)");
        this.aprovado = input.nextBoolean();

        System.out.println("Aprovado!:" +this.aprovado);
    }
}
