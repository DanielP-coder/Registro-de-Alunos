package alunosMenu;

import alunosModelos.Aluno;

public class ListarAlunosPorNome extends ListarAluno {

	@Override
	public boolean deveImprimir(Aluno aluno) {
		return true;
	}

	@Override
	public String getDescricao() {
    	return "Listar Alunos (ordem alfabética)";
	}
   
}
