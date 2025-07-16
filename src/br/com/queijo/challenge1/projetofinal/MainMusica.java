package br.com.queijo.challenge1.projetofinal;

public class MainMusica {
    public static void main(String[] args) {
        Musica queijofy = new Musica();
        queijofy.setNome("Half Asleep");
        queijofy.setArtista("Low Roar");
        queijofy.setAlbum("0");
        queijofy.setGenero("");
        System.out.println(queijofy.retornarInfoMusica());

        Podcast flow = new Podcast();
        flow.setHost("Igor 3K");
        flow.setDescricao("O podcast mais famoso do Brasil");
    }



}
