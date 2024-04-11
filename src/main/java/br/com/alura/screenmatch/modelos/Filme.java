package br.com.alura.screenmatch.modelos;

public class Filme extends Titulo  {

  private String diretor;

  public Filme(String nome, int anoDeLancamento) {
    super(nome, anoDeLancamento);
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
