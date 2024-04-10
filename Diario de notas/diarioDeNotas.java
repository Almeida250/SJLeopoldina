import java.util.Scanner;

public class diarioDeNotas{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Digite 'Aluno' se você for um aluno e 'Professor' se você for um professor");
        String usuario = sc.nextLine();
      
        
            if(usuario.equalsIgnoreCase("Professor")) {
                Professor professor = new Professor();
                professor.identificarProfessor();
                System.out.println("Digite o seu nome");
                String nome;
                nome = sc.nextLine();
                System.out.println("Ola Professor " + nome + ".Seja bem vindo ");

            }else if(usuario.equalsIgnoreCase("Aluno")) {
              //  System.out.println("Digite o seu nome");
               // String nome;
              //  nome = sc.nextLine();
              //  System.out.println("Ola Aluno " + nome + ".Seja bem vindo ");
              Aluno aluno = new Aluno();
              aluno.identificarAluno();


            } else {
                System.out.println("Erro:opção inválida");
            }
            sc.close();
    }
}
