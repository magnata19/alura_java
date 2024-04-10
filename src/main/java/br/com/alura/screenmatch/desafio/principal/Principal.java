package br.com.alura.screenmatch.desafio.principal;

import br.com.alura.screenmatch.desafio.utilitarios.MinhasPreferidas;
import br.com.alura.screenmatch.desafio.utilitarios.Musica;
import br.com.alura.screenmatch.desafio.utilitarios.Podcast;

public class Principal {
  public static void main(String[] args) {
    Musica musica = new Musica();
    musica.setTitulo("I like you");
    musica.setArtista("Post Malone");

    for (int i = 0; i < 1000; i++) {
      musica.curtir();
    }

    for (int i = 0; i < 50; i++) {
      musica.reproduzir();
    }

    Podcast podcast = new Podcast();
    podcast.setTitulo("Bolha dev");
    podcast.setApresentador("Marcos Mendes");

    for (int i = 0; i < 1000; i++) {
      podcast.reproduzir();
    }

    for (int i = 0; i < 100; i++) {
      podcast.curtir();
    }

    MinhasPreferidas preferidas = new MinhasPreferidas();
    preferidas.incluir(podcast);
    preferidas.incluir(musica);
  }
}
