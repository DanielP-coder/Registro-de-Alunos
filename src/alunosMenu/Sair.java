package alunosMenu;

public class Sair extends ItemDeMenu{

    @Override
    public String getDescricao(){
        return "Sair";
    }
    
    @Override
    public boolean executar(){
        return true;
    }
    
}
