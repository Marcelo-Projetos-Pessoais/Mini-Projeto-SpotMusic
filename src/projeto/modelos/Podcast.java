package projeto.modelos;

public class Podcast extends Audio {
    private String genero;
    private String apresentador;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    @Override
    public int getClassificacao() {
        if ( getTotalDeCurtidas() > 10){
            return 10;
        }
        else {
            return 7;
        }
    }
}
