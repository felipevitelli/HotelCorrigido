package br.com.hotel.quarto;

public class Quarto {

    private String tipoCama;

    public Quarto(String tipoCama) {
        this.tipoCama = tipoCama;
    }

    public double calcularValor(int numNoite, double vlrNoite){

        return numNoite * vlrNoite;
    }

    public void informacoesQuarto(){

        System.out.println("Tipo cama: " +tipoCama);

    }

    public String getTipoCama() {
        return tipoCama;
    }

    public void setTipoCama(String tipoCama) {
        this.tipoCama = tipoCama;
    }
}
