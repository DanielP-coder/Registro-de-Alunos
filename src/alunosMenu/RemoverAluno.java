package alunosMenu;

import alunosModelos.Aluno;
public class RemoverAluno extends ItemDeMenu {

	@Override
	public String getDescricao() {
    	return "Remover aluno";
	}

	@Override
	public boolean executar() {
        String matricula = leitor.lerString("Matrícula: ");
        
        Aluno aluno = dao.pesquisar(matricula);
        
        if (aluno ==null){
            System.out.println("Aluno não encontrado!");
        }else{
            Aluno alunoRemover = new Aluno(matricula);
            dao.remover(alunoRemover);
        }
        return false;
	}
}
