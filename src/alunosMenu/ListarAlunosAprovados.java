package alunosMenu;

import alunosModelos.Aluno;
public class ListarAlunosAprovados extends ListarAluno{
   
    @Override
    public String getDescricao(){
        return "Listar alunos aprovados";
    }

    @Override
    public boolean deveImprimir(Aluno aluno){
        return aluno.passou();
    }
}
