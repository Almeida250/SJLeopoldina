import java.util.Scanner;
public class Professor {
    public String nome ;
    public int idade ;
    public String email;
    String telefone;
    Scanner sc = new Scanner(System.in);
      
    public void identificarProfessor() {
        System.out.println("Digite o seu nome");
        nome = sc.nextLine();
        System.out.println("Ola Professor " + nome + ".Seja bem vindo ");

        System.out.println("Digite a sua idade");
        idade = sc.nextInt();

        System.out.println("Digite o seu email");
        email = sc.nextLine();

        System.out.println("Digite o seu telefone");
        telefone = sc.nextLine();
        
        sc.close();

    } 
} 
  