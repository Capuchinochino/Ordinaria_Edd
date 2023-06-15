// Estos son Importes para "ArrayList, List y Scanner"
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * La classe Java para la calculadora
 * @author Fernando del Toro Ciscar
 */
public class Calculadora{
    private List<Double> valoresDigitados = new ArrayList<Double>();
    private int operacao;
    private Double resultado;
    private String resposta = "";

    public Calculadora(){
        var sc = new Scanner(System.in);

        System.out.println("Olá, este programa faz cálculos com as principais operações entre N números, sendo limitado a uma única operação por cálculo");

        do{
            System.out.println("Digite um valor para adicionar ao cálculo // [S] para sair");
            setResposta(sc.nextLine());

            if(checaValorNumerico(getResposta())){
                //getValoresDigitados().add(Double.parseDouble(getResposta()));
                addValor(Double.parseDouble(getResposta()));
                //valoresDigitados.add(Double.parseDouble(getResposta()));
            }
        }
        while(checaValorNumerico(getResposta()));

        System.out.println("Digite a operação a ser feita\n[1]Soma\n[2]Subtração\n[3]Multiplicação\n[4]Divisão");
        //int operacao = sc.nextInt();
        setOperacao(sc.nextInt());

        switch(getOperacao()){
            case 1:
                System.out.println("O resultado foi " + soma(getValoresDigitados()));
                break;

            case 2:
                System.out.println("O resultado foi " + subtrai(getValoresDigitados()));
                break;

            case 3:
                System.out.println("O resultado foi " + multiplica(getValoresDigitados()));
                break;

            case 4:
                System.out.println("O resultado foi " + divide(getValoresDigitados()));
                break;

            default:
                System.out.println("Erro");
                break;
        }

        System.out.println((getValoresDigitados()));
    
        sc.close();
    }

    /**
     * La función comprueba si el string contiene valores numericos
     * 
     * @param valor es un parametro numerico, "checaValorNumerico" comprueba si es valor numerico o no
     * 
     * @return El metodo comprueba si los valores son numericos o no, dependiendo del resultado devuelve "checanumero" como un boolean verdadero o falso
     */
    public static boolean checaValorNumerico(String valor){

        boolean checaNumero = true;

        for (int i = 0; i < valor.length(); i++) {
            if(!Character.isDigit(valor.charAt(i))){
                checaNumero = false;
            }
        }
        return checaNumero;
    }

    /**
     * Soma(suma) es una funcion que suma dos valores
     * 
     * @param valores son valores usados en la suma.
     * @return Devuelve la suma de los vlores que se le han pasado por imput
     */
    public static Double soma(List<Double> valores){
        Double resultado = 0d;

        for (Double valor : valores){
            resultado += valor;
        }

        return resultado;
    }

    /**
     * Esta funcion subrae todos los valores en una lista y devuelve el resultado
     * 
     * @param valores  son los valores usados en la operación
     * @return Devuelve el valor del primer numero en una lista
     */
    public static Double subtrai(List<Double> valores){
        Double resultado = 0d;
        Double soma = 0d;

        for (int i = 1; i < valores.size(); i++) {
            soma += valores.get(i);
        }
        resultado = valores.get(0) - soma;

        return resultado;
    }
    
   /**
    * Es una multiplicacion usando "valores" como operadores
    * 
    * @param valores son los valores que se multiplicaràn
    * @return Devuelve el valor de multiplicar los valores entre si
    */
    public static Double multiplica(List<Double> valores){
        Double resultado = 1d;

        for(Double valor: valores){
            resultado *= valor;
        }

        return resultado;
    }
    
 /**
  * Es una funcion que divide "valores"
  * 
  * @param valores son los numeros que se usaran en la division
  * returned as a Double
  * @return El metodo devuelve el resultado de dividir el primer valor por el segundo
  */
    public static Double divide(List<Double> valores){
        Double resultado = valores.get(0) / valores.get(1);

        for (int i = 2; i < valores.size(); i++) {
            resultado /= valores.get(i);
        }
        return resultado;
    }
    
/**
 * Esta función añade un valor(doble) a la lista valoresDIitados
 * 
 * @param valor un valor(doble) que se añade a la lista
 */
    public void addValor(Double valor){
        this.valoresDigitados.add(valor);
    }

/**
 * Esta función devuelve valores que se han insertado
 * 
 * @return Devuelve valores.
 */
    public List<Double> getValoresDigitados() {
        return this.valoresDigitados;
    }

/**
 * Esta funcion devuelve el valor guardado en "opreacao"
 * 
 * @return Se devuelve un valor que se guarda en "operacao"
 */
    public int getOperacao() {
        return this.operacao;
    }

/**
 * Esta funcion le da un valor a "operacao"
 * 
 * @param operacao Es una variable que recive el valor de "this.operacao" 
 */
    public void setOperacao(int operacao) {
        this.operacao = operacao;
    }

/**
 * Esta funcion devuelve "resultado"
 * 
 * @return El metodo devuelve el valor guardado de "resultado"
 */
    public Double getResultado() {
        return resultado;
    }

/**
 * La funcion le da un valor a resultado
 * 
 * @param resultado Es una variable que recive su valor de "this.resultado"
 */
    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }

/**
 * La funion devuelve "resposta"
 * 
 * @return El contenido de "getResposta"
 */
    public String getResposta() {
        return this.resposta;
    }

/**
 * Esta funcion le da valor a resposta
 * 
 * @param resposta "This.resposta" le da valor a "resposta"
 */
    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

}
