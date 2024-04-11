package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;
import java.util.ArrayList;

public class PrincipalComListas {
  public static void main(String[] args) {
    Filme filme = new Filme("Velozes e furiosos",2001);
    filme.avaliar(8);
    Filme filme2 = new Filme("Interestelar",2018);
    filme2.avaliar(9);
    Filme filme3 = new Filme("Nascido para correr",2015);
    filme3.avaliar(7);

    Serie lost = new Serie("Friends", 2000);

    ArrayList<Titulo> meusTitulos = new ArrayList<>();
    meusTitulos.add(filme);
    meusTitulos.add(filme2);
    meusTitulos.add(filme3);
    meusTitulos.add(lost);
    for(Titulo item : meusTitulos) {
      System.out.println(item);
      if(item instanceof Filme meuFilme && meuFilme.getClassificacao() > 2) {
        System.out.println("Classificação: " + meuFilme.getClassificacao());
      }
    }
  }
}
