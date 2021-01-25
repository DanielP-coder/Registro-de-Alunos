package alunosMenu;

import alunosIo.Leitor;
import alunosDao.Dao;
import alunosDao.DaoArrayList;

public abstract class ItemDeMenu {
   protected Leitor leitor;

   protected Dao dao;
   
   public ItemDeMenu(){
      leitor = new Leitor();
      dao = new DaoArrayList();
   }

   public abstract String getDescricao();

   public abstract boolean executar();
}