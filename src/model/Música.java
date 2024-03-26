package model;

public class Música {
    private String nome;
    private String autor;
    private String gravadora;

    public Música(){
        super();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    @Override
    public String toString() {
        return "Música --> {" +
                "nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", gravadora='" + gravadora + '\'' +
                '}';
    }
}
