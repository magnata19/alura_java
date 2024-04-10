package br.com.alura.screenmatch.desafio.Modelo;

import br.com.alura.screenmatch.desafio.Interface.AudioUtilidades;

public class Audio implements AudioUtilidades {

  private String titulo;
  private int duracao;
  private int totalDeReproducoes;
  private int totalcurtidas;
  private int classificacao;

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public int getDuracao() {
    return duracao;
  }

  public int getTotalDeReproducoes() {
    return totalDeReproducoes;
  }

  public int getTotalcurtidas() {
    return totalcurtidas;
  }

  public int getClassificacao() {
    return classificacao;
  }

  public void curtir() {
    this.totalcurtidas++;
  }

  public void reproduzir() {
    this.totalDeReproducoes++;
  }
}
