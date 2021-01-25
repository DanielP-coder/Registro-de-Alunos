
import java.util.Scanner;

import alunosMenu.*;

public class Program {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        ItemDeMenu[] principal = new ItemDeMenu[]{
            new InserirAluno(),
            new ListarAlunosPorNome(),
            new ConsultarAluno(),
            new Atualizar(),
            new RemoverAluno(),
            new ListarAlunosAprovados(),
            new ListarAlunosReprovados(),
            new ListarAlunosPorMedia(),
            new Sair()
        };

        boolean sair = false;
        do{
            for (int i = 0;i < principal.length; i++){
              System.out.println(i + " - " + principal[i].getDescricao());  
            }
            System.out.println("Qual opção desejada?");
            int opcao = Integer.parseInt(console.nextLine());

            sair = principal[opcao].executar();
        }while(!sair);
    }
}
