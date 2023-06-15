import java.util.Scanner;

/**
 * @author Fernando del Toro Ciscar
 */
public class Menu {
    int opcaoEscolhida;

    /**
     * La funcion da elegir entre dos opciones para continuar
     */
    public static void main(String[] args) {
        System.out.println("Olá, selecione um dos programas para continuar.");

        Scanner sc = new Scanner(System.in);
        var menu = new Menu();

        System.out.println(
                "[1]Calculadora\n[2]Fatorial\n[3]Contador de pares e ímpares\n[4]Contador de vogais e consoantes\n[5]Matriz com números aleatórios\n[6]Números e seus sucessores");
        menu.setOpcaoEscolhida(sc.nextInt());

        sc.close();
    }

    /**
     * La funcion devuelve el valor escogido
     * 
     * @return Devuelve un int de "this.opacoEscolhida"
     */
    public int getOpcaoEscolhida() {
        return this.opcaoEscolhida;
    }

    public void setOpcaoEscolhida(int opcaoEscolhida) {
        this.opcaoEscolhida = opcaoEscolhida;

        switch (this.getOpcaoEscolhida()) {
            case 1:
                new Calculadora();
                break;
            case 2:
                new Fatorial();
                break;
            case 3:
                new ContadorParesImpares();
                break;
            case 4:
                new ContadorVogalConsoante();
                break;
            case 5:
                new Matriz();
                break;
            case 6:
                new NumerosSucessores();
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
