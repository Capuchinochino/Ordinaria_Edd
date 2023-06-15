import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Esta clase almacena numeros pares e inpares
 * @author Fernando del Toro Ciscar
 */

public class ContadorParesImpares {
    int valorDigitado;
    List<Integer> pares = new ArrayList<Integer>();
    List<Integer> impares = new ArrayList<Integer>();

    public ContadorParesImpares() { 
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Olá, este programa lê N números, mostra quais e quantos foram par/ímpar.");

        while(true){
            System.out.println("Adicione um valor  // [0] para sair");
            setValorDigitado(sc.nextInt());
    

            if (getValorDigitado() == 0){
                break;
            }
            else if (getValorDigitado() % 2 == 0){
                addPar(getValorDigitado());
            }
            else {
                addImpar(getValorDigitado());
            }
        }

        sc.close();
        
        System.out.println("A quantidade de pares foi " + getPares().size() + ", sendo " + getPares() + ".");
        System.out.println("A quantidade de ímpares foi " + getImpares().size() + ", sendo " + getImpares() + ".");
    }

    

/**
 * La funcion añade un valor a una lista de valores pares
 * 
 * @param valor es un integuer que recoge valores pares
 */
    public void addPar(int valor){
        this.pares.add(valor);

    }


/**
 * Esta funcion añade un valor a una lista de valores impares
 * 
 * @param valor es un integuer que recoge valores impares
 */
    public void addImpar(int valor){
        this.impares.add(valor);

    }

/**
 * Esta funcion devuelve los valores agregados anteriormente
 * 
 * @return el metodo getValorDigitado devuelve los valores de "valorDigitado"
 * @see addPar(int valor) y addImpar(int valor)
 */
    public int getValorDigitado() {
        return this.valorDigitado;
    }

/**
 * Esta funcion establece el valor de "valorDigitado"
 * 
 * @param valorDigitado es un integer que recive valor de "setValorDigitado"
 */
    public void setValorDigitado(int valorDigitado) {
        this.valorDigitado = valorDigitado;
    }
/**
 * Esta funcion devuelve una lista de numeros pares
 * 
 * @return El integer getPares devuelve una lista de numeros pares
 * @see addPar(int valor)
 */

    public List<Integer> getPares() {
        return this.pares;
    }

/**
 * La funcion devuelve una lista de numeros impares
 * 
 * @return Devuelve una lista de numeros impares
 * @see addImpar(int valor)
 */
    public List<Integer> getImpares() {
        return this.impares;
    }

}
