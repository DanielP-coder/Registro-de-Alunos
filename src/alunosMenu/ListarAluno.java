package alunosMenu;

import java.util.ArrayList;
import alunosModelos.Aluno;
import java.util.Comparator;
import java.util.Collections;

public abstract class ListarAluno extends ItemDeMenu implements Comparator<Aluno> {

    @Override
    public boolean executar(){
        ArrayList<Aluno> alunos = dao.listar();

        Collections.sort(alunos, this);

        for(int i =0;i < alunos.size(); i++){
            Aluno atual = alunos.get(i);

            if (deveImprimir(atual)){
                System.out.println(atual.getMatricula()+ " - "+atual.calcularMedia());
        
            }
        }
        return false;
    }
    public abstract boolean deveImprimir(Aluno aluno);

    @Override
    public int compare(Aluno o1, Aluno o2){
        String nome1 = o1.getNome();
        String nome2 = o2.getNome();

        return nome1.compareTo(nome2);
    }
}
