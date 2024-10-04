package br.com.hotel.quarto;

public class QuartoSimples extends Quarto {

    private boolean frigobar;

    public QuartoSimples(String tipoCama, boolean frigobar) {
        super(tipoCama);
        this.frigobar = frigobar;
    }

    @Override
    public double calcularValor(int numNoite, double vlrNoite) {
        return super.calcularValor(numNoite, vlrNoite) + 30;
    }

    @Override
    public void informacoesQuarto() {
        super.informacoesQuarto();
        if (frigobar) {
            System.out.println("Plano com frigobar");
        }
    }

    public boolean isFrigobar() {
        return frigobar;
    }

    public void setFrigobar(boolean frigobar) {
        this.frigobar = frigobar;
    }
}