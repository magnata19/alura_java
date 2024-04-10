import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import java.util.ArrayList;

public class Principal {
  public static void main(String[] args) {
    Filme meuFilme = new Filme();
    meuFilme.setNome("Intelestelar");
    meuFilme.setAnoDeLancamento(1970);
    meuFilme.setDuracaoEmMinutos(180);


    meuFilme.exibirFichaTecnica();
    meuFilme.avaliar(8);
    meuFilme.avaliar(7);
    meuFilme.avaliar(10);
    System.out.println(meuFilme.getDuracaoEmMinutos());
    System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacao());
    System.out.println(meuFilme.retornarMedia());

    Serie max = new Serie();
    max.setNome("The Big Bang Theory");
    max.setAnoDeLancamento(2000);
    max.setTemporadas(12);
    max.setEpisodiosPorTemporada(24);
    max.setMinutosPorEpisodio(20);
    max.exibirFichaTecnica();
    System.out.println("Tempo de duração de todas temporadas em minutos: " + max.getDuracaoEmMinutos());

    Filme outroFilme = new Filme("Avatar");
    outroFilme.setAnoDeLancamento(2023);
    outroFilme.setDuracaoEmMinutos(250);

    CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
    calculadoraDeTempo.incluir(meuFilme);
    calculadoraDeTempo.incluir(outroFilme );
    calculadoraDeTempo.incluir(max);
    System.out.println(calculadoraDeTempo.getTempoTotal());

    FiltroRecomendacao filtro = new FiltroRecomendacao();
    filtro.filtra(meuFilme);

    Episodio episodio = new Episodio();
    episodio.setNumero(1);
    episodio.setSerie(max);
    episodio.setTotalVisualizacoes(300);
    filtro.filtra(episodio);

    Filme filmeDoDavidson = new Filme("Velozes e Furiosos");
    filmeDoDavidson.setDuracaoEmMinutos(200);
    filmeDoDavidson.setAnoDeLancamento(2001);
    filmeDoDavidson.avaliar(10);

    ArrayList<Filme> meusFilmes = new ArrayList<>();
    meusFilmes.add(filmeDoDavidson);
    meusFilmes.add(meuFilme);
    meusFilmes.add(outroFilme);
    System.out.println("Tamanho da lista de filmes: " + meusFilmes.size());
    System.out.println("Primeiro filme da lista: " + meusFilmes.get(0).getNome());
    meusFilmes.forEach(System.out::println);
  }
}
