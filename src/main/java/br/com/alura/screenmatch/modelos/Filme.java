package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo  {

  private String diretor;

  public Filme(String nome) {
    this.setNome(nome);
  }

  public String getDiretor() {
    return diretor;
  }

  public void setDiretor(String diretor) {
    this.diretor = diretor;
  }

  @Override
  public String toString() {
    return "Nome do filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
  }
}
