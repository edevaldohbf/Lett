import java.util.Scanner;

public class Cadastro {
    String nome;
    String idade;
    String tamanho;
    void solicitarCadastro(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Animal: ");
        this.nome = scanner.nextLine();
        System.out.println("Idade em anos: ");
        this.idade = scanner.nextLine();
        System.out.println("Tamanho em centímetros: ");
        this.tamanho = scanner.nextLine();
        System.out.println("");
    }
}
