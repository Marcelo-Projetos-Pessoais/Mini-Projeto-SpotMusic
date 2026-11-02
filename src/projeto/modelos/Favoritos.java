package projeto.modelos;

public class Favoritos{

    public void incluiMusica(Audio audio) {
        if (audio.getClassificacao() >= 8) {
            System.out.println(audio.getTitulo() +  " esta nas favoritas!");
        }
        else {
            System.out.println(audio.getTitulo() + " nao esta entre as favoritas!");
        }
    }

    public void incluiPodcast(Audio audio) {
        if (audio.getClassificacao() >= 8) {
            System.out.println("O podcast " + audio.getTitulo() + " esta nos favoritos!");
        } else {
            System.out.println("O podcast " + audio.getTitulo() + " nao esta entre os favoritos!");

        }
    }
}
