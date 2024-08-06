package constructor.lavadora;

public class Lavadora {
    private String tipo;
    private int valorHora;
    private int numeroHora;
    private int cantidadLavadoras;

    public Lavadora(){
    }
    public Lavadora(String tipo, int valorHora, int numeroHora, int cantidadLavadoras) {
        this.tipo = tipo;
        this.valorHora = valorHora;
        this.numeroHora = numeroHora;
        this.cantidadLavadoras = cantidadLavadoras;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }

    public int getNumeroHora() {
        return numeroHora;
    }

    public void setNumeroHora(int numeroHora) {
        this.numeroHora = numeroHora;
    }

    public int getCantidadLavadoras() {
        return cantidadLavadoras;
    }

    public void setCantidadLavadoras(int cantidadLavadoras) {
        this.cantidadLavadoras = cantidadLavadoras;
    }

    public boolean validarDescuento(){
        if(cantidadLavadoras > 3){
            return true;
        } return false;
    }
    public float porcentajeDescuento(){
        if(validarDescuento()){
            return 0.03f;
        }return 0.0f;
    }
    public float calcularCosto(){
        float costo = (numeroHora * valorHora) * cantidadLavadoras ;
        return costo - (costo * porcentajeDescuento());
    }
    public void verificarTipo(){
        if(tipo.equals("pequeña")){
            valorHora = 3000;
        }else{
            valorHora = 4000;
        }
    }
}
