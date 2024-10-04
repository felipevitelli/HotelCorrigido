package br.com.hotel.quarto;

public class QuartoLuxo extends Quarto {

    private boolean cafeDaManha;
    private boolean frigobar;

    public QuartoLuxo(String tipoCama, boolean cafeDaManha, boolean frigobar) {
        super(tipoCama);
        this.cafeDaManha = cafeDaManha;
        this.frigobar = frigobar;
    }

    @Override
    public double calcularValor(int numNoite, double vlrNoite) {
        return super.calcularValor(numNoite, vlrNoite) + 300;
    }

    @Override
    public void informacoesQuarto() {
        super.informacoesQuarto();
        if (cafeDaManha) {
            System.out.println("Plano com cafe da manha");
        }
        if(frigobar){
            System.out.println("Plano com frigobar");
        }
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