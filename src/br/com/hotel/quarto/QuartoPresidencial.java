package br.com.hotel.quarto;

public class QuartoPresidencial extends Quarto{

    private boolean spa;
    private boolean cafeDaManha;
    private boolean frigobar;

    public QuartoPresidencial(String tipoCama, boolean spa, boolean cafeDaManha, boolean frigobar) {
        super(tipoCama);
        this.spa = spa;
        this.cafeDaManha = cafeDaManha;
        this.frigobar = frigobar;
    }

    @Override
    public double calcularValor(int numNoite, double vlrNoite) {
        return super.calcularValor(numNoite, vlrNoite)+1200;
    }

    @Override
    public void informacoesQuarto() {
        super.informacoesQuarto();
        if (spa)
            System.out.println("Plano com spa");

        if(cafeDaManha)
            System.out.println("Plano com cafe da manha");

        if(frigobar)
            System.out.println("Plano com frigobar ");
    }


    public boolean isSpa() {
        return spa;
    }

    public void setSpa(boolean spa) {
        this.spa = spa;
    }

    public boolean isCafeDaManha() {
        return cafeDaManha;
    }

    public void setCafeDaManha(boolean cafeDaManha) {
        this.cafeDaManha = cafeDaManha;
    }

    public boolean isFrigobar() {
        return frigobar;
    }

    public void setFrigobar(boolean frigobar) {
        this.frigobar = frigobar;
    }
}
