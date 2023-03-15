package dominio;

public class Pizza {
    public String nome;
    public Double valor;
    public boolean hasBorda;

    public Pizza(String nome, Double valor, boolean hasBorda){
        this.nome = nome;
        this.valor = calcValor(valor, hasBorda);
        this.hasBorda = hasBorda;
    }

    public Double calcValor(Double valor, boolean hasBorda){
        if (hasBorda){
            valor += 5.0;
        }
        return valor;
    }

    public String getNome() {
        return nome;
    }
}
