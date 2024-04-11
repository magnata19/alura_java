package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Titulo implements Classificavel  {
  private String nome;
  private int anoDeLancamento;
  private boolean incluidoNoPlano;
  private double somaDasAvaliacoes;
  private int totalDeAvaliacao;
  private int duracaoEmMinutos;

  public Titulo (String nome, int anoDeLancamento) {
    this.nome = nome;
    this.anoDeLancamento = anoDeLancamento;
  }

  public int getTotalDeAvaliacao() {
    return totalDeAvaliacao;
  }

  public String getNome() {
    return nome;
  }

  public int getAnoDeLancamento() {
    return anoDeLancamento;
  }

  public boolean isIncluidoNoPlano() {
    return incluidoNoPlano;
  }

  public int getDuracaoEmMinutos() {
    return duracaoEmMinutos;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setAnoDeLancamento(int anoDeLancamento) {
    this.anoDeLancamento = anoDeLancamento;
  }

  public void setIncluidoNoPlano(boolean incluidoNoPlano) {
    this.incluidoNoPlano = incluidoNoPlano;
  }

  public void setDuracaoEmMinutos(int duracaoEmMinutos) {
    this.duracaoEmMinutos = duracaoEmMinutos;
  }

  public void exibirFichaTecnica () {
    System.out.println("Nome do filme: " + this.nome);
    System.out.println("Ano de lançamento: " + this.anoDeLancamento);
    System.out.println("Duração em minutos: " + this.duracaoEmMinutos);
  }

  public void avaliar (double nota) {
    somaDasAvaliacoes += nota;
    totalDeAvaliacao++;
  }

  public double retornarMedia () {
    return somaDasAvaliacoes / totalDeAvaliacao;
  }

  @Override
  public int getClassificacao() {
    return (int) retornarMedia() / 2;
  }
}
