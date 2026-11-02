package projeto.modelos;

public class Musica extends Audio{
    private String artista;
    private String genero;
    private String Album;

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlbum() {
        return Album;
    }

    public void setAlbum(String album) {
        Album = album;
    }

    @Override
    public int getClassificacao() {
        if (getTotalDeReproducoes() > 200) {
            return 10;
        }
        else {
            return 6;
        }
    }
}
