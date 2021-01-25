package alunosMenu;

import alunosModelos.*;

public class Atualizar extends ItemDeMenu {
    
    @Override
    public String getDescricao(){
        return "Atualizar Aluno";
    }

    @Override
    public boolean executar(){
        String matricula = leitor.lerString("Matrícula: ");

        Aluno aluno = dao.pesquisar(matricula);
        
        if (aluno == null){
            System.out.println("Aluno não encontrado!");
        }else{
            System.out.println("Nome: "+aluno.getNome());
            System.out.println("P1: "+aluno.getP1());
            System.out.println("P2: "+aluno.getP2());

            String nome = leitor.lerString("Novo nome: ");
            double p1 = leitor.lerDouble("Novo P1: ");
            double p2 = leitor.lerDouble("Novo P2: ");

            aluno.setNome(nome);
            aluno.setP1(p1);
            aluno.setP2(p2);

            dao.atualizar(aluno);
        }
        return false;
    }
}
