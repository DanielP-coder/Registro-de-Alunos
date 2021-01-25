package alunosMenu;

import alunosModelos.Aluno;

public class ListarAlunosReprovados extends ListarAluno {
    
    @Override
    public String getDescricao(){
        return "Listar alunos reprovados";
    }
    
    @Override
    public boolean deveImprimir(Aluno aluno){
        return !aluno.passou();
    }

}
