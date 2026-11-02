package projeto.principal;

import projeto.modelos.Musica;
import projeto.modelos.Favoritos;
import projeto.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {

        Musica musica = new Musica();
        musica.setTitulo("Gorila roxo");
        musica.setArtista("Matue");
        musica.setAlbum("Maquina do tempo");
        musica.setGenero("Trap");
        for (int i = 0; i < 1000; i++) {
            musica.reproduzir();
        }
        for (int i = 0; i < 50; i++) {
            musica.curtir();
        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("GoliasCast");
        podcast.setGenero("Games");
        podcast.setApresentador("Marcelo Golias");
        for (int i = 0; i < 300; i++) {
            podcast.reproduzir();
        }
        for (int i = 0; i < 8; i++) {
            podcast.curtir();
        }

        Favoritos favoritos = new Favoritos();
        favoritos.incluiMusica(musica);
        favoritos.incluiPodcast(podcast);
    }
}
