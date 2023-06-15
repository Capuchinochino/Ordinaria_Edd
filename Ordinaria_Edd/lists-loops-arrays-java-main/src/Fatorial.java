import java.util.Scanner;

/**
 * @author Fernando del Toro Ciscar
 * La clase factorial recibe dos valores del usuario para hacer el calculo factorial
 */
public class Fatorial {
    int valorDigitado;
    int resultado;

    public Fatorial() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, este programa faz o cálculo de fatorial");

        setResultado(1);

        System.out.println("Digite um valor para receber seu fatorial ");
        setValorDigitado(sc.nextInt());

        for (int i = getValorDigitado(); i >= 1 ; i--) {
            setResultado(getResultado() * i);
        }
        sc.close();
        System.out.println(getValorDigitado() + "!" + " = " + getResultado());
    }


/**
 * Esta funcion devuelve el valor que se le ha insertado
 * 
 * @return El metodo "getValorDigitado" devuelve el valord de "valorDigitado".
 * @since 0.3
 */
    public int getValorDigitado() {
        return this.valorDigitado;
    }

    

/**
 * La funcion sirve para establecer un valor para "valorDigitado"
 * 
 * @param valorDigitado es un parametro que recibe su valor mediante la funcion "setValorDigitado"
 */
    public void setValorDigitado(int valorDigitado) {
        this.valorDigitado = valorDigitado;
    }

/**
 * La funcion devuelve resultado
 * 
 * @return La funcion devuelve el valor de "resultado"
 */
    public int getResultado() {
        return resultado;
    }

/**
 * La funcion establece el valor de resultado
 * 
 * @param resultado `resultado` es una variable que recibe su valor mediante "this.resultado"
 */
    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
}
