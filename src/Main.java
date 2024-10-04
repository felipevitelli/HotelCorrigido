import br.com.hotel.quarto.QuartoLuxo;
import br.com.hotel.quarto.QuartoPresidencial;
import br.com.hotel.quarto.QuartoSimples;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        QuartoSimples objQuartoSimples = new QuartoSimples("Solteiro", true);
        objQuartoSimples.informacoesQuarto();

        double valorReservaSimples = objQuartoSimples.calcularValor(5,100);
        System.out.println("Valor total da reserva: " +valorReservaSimples);

        System.out.println("=======================LUXO=========================");

        QuartoLuxo objQuartoLuxo = new QuartoLuxo("Casal",true, true);
        objQuartoLuxo.informacoesQuarto();
        double valorReservaLuxo = objQuartoLuxo.calcularValor(7, 500);
        System.out.println("Valor total da reserva: " +valorReservaLuxo);

        System.out.println("=======================PRESIDENCIAL=========================");

        QuartoPresidencial objQuartoPresidencial = new QuartoPresidencial("King Size", true, true);
        objQuartoPresidencial.informacoesQuarto();
        double valorReservaPresidencial = objQuartoPresidencial.calcularValor(15, 2500);
        System.out.println("Valor Total da reserva: "+valorReservaPresidencial);


        

        }

}
