import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Esta es la classe "ContadorVogalConsoante" cuenta consonantes y vocales
 * @author Fernando del Toro Ciscar
 */
public class ContadorVogalConsoante {
    private List<Character> listaDeVogais = new ArrayList<Character>();
    private List<Character> listaDeConsoantes = new ArrayList<Character>();

    private char letraDigitada;

    public ContadorVogalConsoante() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, este programa lê N valores e mostra a quantidade de vogais e quais foram.");

        do {
            System.out.println("Digite um caractere // [0] para sair");
            setLetraDigitada(sc.nextLine().toLowerCase().charAt(0));

            switch (getLetraDigitada()) {
                case 'a', 'e', 'i', 'o', 'u':
                    addVogal(getLetraDigitada());
                    break;
                case 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y',
                        'z':
                    addConsoante(getLetraDigitada());
                    break;
                default:
                    break;
            }
        } while (checaAlfabetico(getLetraDigitada()));

        sc.close();

        System.out
                .print("A quantidade de vogais é " + getListaDeVogais().size() + ", sendo elas " + getListaDeVogais());
        System.out.println("\nA quantidade de consoantes é " + getListaDeConsoantes().size() + ", sendo elas "
                + getListaDeConsoantes());

    }

    /**
     * La funcion comprueba si un valor es alfabetico 
     * 
     * @param valor un caracter que comprueba si un valor es alfabetico (a-z) o (A-Z)
     * @return El metodo devuelve un valor boolean, "true" si "valor" es una letra y "false" si es lo contrario
     */
    public boolean checaAlfabetico(char valor) {
        if ((valor >= 'a' && valor <= 'z') || valor >= 'A' && valor <= 'Z') {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Esta funcion agrega una vocal a una lista de vocales
     * 
     * @param letra una variable(char) que agrega una vocal a una lista de vocales
     */
    public void addVogal(char letra) {
        this.listaDeVogais.add(letra);
    }

    /**
     * Esta funcion añade una consonante a una lista de consonantes
     * 
     * @param letra es un unico caracter que se agrega a una lista de consonantes
     */
    public void addConsoante(char letra) {
        this.listaDeConsoantes.add(letra);
    }

    /**
     * La funcion devuelve una lista de vocales.
     * 
     * @return Una lista de caracteres que representan vocales
     * @see addVogal(char letra)
     */
    public List<Character> getListaDeVogais() {
        return this.listaDeVogais;
    }

    /**
     * La funcion devuelve una lista de consonantes
     * 
     * @return Una lista de consonantes
     * @see addConsoante(char letra)
     */
    public List<Character> getListaDeConsoantes() {
        return this.listaDeConsoantes;
    }

    /**
     * Esta funcion devueve el caracter escrito
     * 
     * @return El metodo devuelve el valor de "letraDigitada"
     */
    public char getLetraDigitada() {
        return this.letraDigitada;
    }

    /**
     * Esta funcion establece el valor de "letra"
     * 
     * @param letra Es un parametro que recive su valor mediante el metodo
     *              setLetraDigitada que hace que la instancia "letraDigitada" le de
     *              le valor a la variable "letra"(el valor ha de ser char).
     */
    public void setLetraDigitada(char letra) {
        this.letraDigitada = letra;
    }
}