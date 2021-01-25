package alunosMenu;

import alunosModelos.Aluno;

public class ListarAlunosPorMedia extends ListarAluno {

    @Override
    public boolean deveImprimir(Aluno aluno) {
        return true;
    }

    @Override
    public String getDescricao() {
        return "Listar alunos (ordem de média)";
    }
    
    @Override
    public int compare (Aluno o1, Aluno o2){
        double media1 = o1.calcularMedia();
        double media2 = o2.calcularMedia();

        if (media1 < media2){
            return -1;
        }else if(media1 > media2){
            return 1;
        }else{
           return  super.compare(o1, o2);
        }
    }
}
