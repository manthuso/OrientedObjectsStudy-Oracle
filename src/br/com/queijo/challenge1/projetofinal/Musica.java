package br.com.queijo.challenge1.projetofinal;

public class Musica extends Audio {
    private String album;
    private String artista;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    private String casoNulo(String texto) {
        if (texto.isEmpty()) {
            return "N/A";
        }
        return texto;
    }

    public String retornarInfoMusica() {
        return "Musica " + casoNulo(getNome()) +
                "\nArtista: " + casoNulo(getArtista()) +
                "\nAlbum: " + casoNulo(getAlbum()) +
                "\nGenero: " + casoNulo(getGenero());
    }
}
