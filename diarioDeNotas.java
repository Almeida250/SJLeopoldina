import java.util.Scanner;

public class diarioDeNotas{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 'Aluno' se você for um aluno e 'Professor' se você for um professor");
        String usuario = sc.nextLine();

            if(usuario.equalsIgnoreCase("Professor")) {
                System.out.println("Digite o seu nome"); 
                String nome = sc.nextLine();
                System.out.println("Ola Professor " + nome + ".Seja bem vindo ");

                System.out.println("Para registrar as notas avaliativas, insira o nome do aluno:");
                String nomeAluno = sc.nextLine();


                System.out.println("Coloque a nota da A1 do aluno " + nomeAluno + ":");
                int nota1 = sc.nextInt();
                System.out.println("Coloque a nota da A2 do aluno " + nomeAluno + ":");
                int nota2 = sc.nextInt();
                System.out.println("Coloque a nota da A3 do aluno " + nomeAluno + ":");
                int nota3 = sc.nextInt();

                int notaFinal = nota1 + nota2 + nota3;
                System.out.println("O resultado final é:" + notaFinal);

            }else if(usuario.equalsIgnoreCase("Aluno")) {
                System.out.println("Digite o seu nome"); 
                String nome = sc.nextLine();
                System.out.println("Ola Aluno " + nome + ".Seja bem vindo ");
            } else {
                System.out.println("Erro:opção inválida");
            }
            sc.close();
    }
}
