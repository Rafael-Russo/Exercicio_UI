package dominio;

public class Hamburger {
    public String nome;
    public Double valor;
    public boolean isArtesanal;

    public Hamburger(String nome, Double valor, boolean isArtesanal){
        this.nome = nome;
        this.valor = calcValor(valor, isArtesanal);
        this.isArtesanal = isArtesanal;
    }

    public Double calcValor(Double valor, boolean isArtesanal){
        if (isArtesanal){
            valor += 8.0;
        }
        return valor;
    }

    public String getNome() {
        return nome;
    }
}