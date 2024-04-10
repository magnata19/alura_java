package br.com.alura.screenmatch.desafio.utilitarios;

import br.com.alura.screenmatch.desafio.Modelo.Audio;

public class MinhasPreferidas {

  public void incluir (Audio audio) {

    if (audio.getClassificacao() >= 8) {
      System.out.println(audio.getTitulo() + " é considerado sucesso!");
    } else {
      System.out.println(audio.getTitulo() + " também um dos que todos escutam!");
    }
  }
}
