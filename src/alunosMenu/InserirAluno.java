package alunosMenu;

import alunosModelos.Aluno;

public class InserirAluno extends ItemDeMenu{
   
    @Override
    public String getDescricao(){
        return "Inserir Aluno";
    }
    
    @Override
    public boolean executar(){

        String matricula = leitor.lerString("Matrícula: ");
        String nome = leitor.lerString("Nome:");
        double p1 = leitor.lerDouble("P1: ");
        double p2 = leitor.lerDouble("P2: ");
         
        Aluno aluno = new Aluno(matricula, nome);
        aluno.setP1(p1);
        aluno.setP2(p2);

        dao.inserir(aluno);
        
        System.out.println("Aluno cadastrado com sucesso!");

        return false;
    }
}
