package constructor;

public class Deck {
    private int numeroDeCartas;
    private int promedioElixir;
    private String calidadCarta;
    private int nivelCartas;

    public Deck(int numeroDeCartas, int promedioElixir, String calidadCarta, int nivelCartas) {
        this.numeroDeCartas = numeroDeCartas;
        this.promedioElixir = promedioElixir;
        this.calidadCarta = calidadCarta;
        this.nivelCartas = nivelCartas;
    }

    public int getNumeroDeCartas() {
        return numeroDeCartas;
    }

    public void setNumeroDeCartas(int numeroDeCartas) {
        this.numeroDeCartas = numeroDeCartas;
    }

    public int getPromedioElixir() {
        return promedioElixir;
    }

    public void setPromedioElixir(int promedioElixir) {
        this.promedioElixir = promedioElixir;
    }

    public String getCalidadCarta() {
        return calidadCarta;
    }

    public void setCalidadCarta(String calidadCarta) {
        this.calidadCarta = calidadCarta;
    }

    public int getNivelCartas() {
        return nivelCartas;
    }

    public void setNivelCartas(int nivelCartas) {
        this.nivelCartas = nivelCartas;
    }
}