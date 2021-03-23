import java.util.Scanner;
import java.util.InputMismatchException;

public class Motor{
    private String tipo;
    private int rpm, velocidade;
    private float peso, preco;
    
    // MÉTODOS CONSTRUTORES
    public Motor(){
    }
    public Motor(String tipo, int rpm, int velocidade, float peso, float preco){
        this.setTipo(tipo);
        this.setRpm(rpm);
        this.setVelocidade(velocidade);
        this.setPeso(peso);
        this.setPreco(preco);
    }
    public Motor(String tipo, int rpm, int velocidade, float peso){
        this.setTipo(tipo);
        this.setRpm(rpm);
        this.setVelocidade(velocidade);
        this.setPeso(peso);
    }
    public Motor(String tipo, int rpm, int velocidade){
        this.setTipo(tipo);
        this.setRpm(rpm);
        this.setVelocidade(velocidade);
    }
    public Motor(String tipo, int rpm){
        this.setTipo(tipo);
        this.setRpm(rpm);
    }
    
    //set e get

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpmm) {
        this.rpm = rpmm;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    
    //IMPRIMIR
    public void imprimir(){
        System.out.println("Peso: "+getPeso());
        System.out.println("RPM: "+getRpm());
        System.out.println("Velocidade: "+getVelocidade());
        System.out.println("Tipo: "+getTipo());
        System.out.println("Preço: "+getPreco());
    }
       
    //CADASTRAR
    public void cadastrar(float peso, int rpm, int velocidade, String tipo, float preco){
        setPeso(peso);
        setRpm(rpm);
        setVelocidade(velocidade);
        setTipo(tipo);
        setPreco(preco);
    }
    
    //ENTRADA DADOS
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        boolean continua = true;
        do{
            try{
        System.out.println("Peso: ");
        setPeso(Float.parseFloat(sc.nextLine()));
        System.out.println("RPM: ");
        setRpm(Integer.parseInt(sc.nextLine()));
        System.out.println("Velocidade: ");
        setVelocidade(Integer.parseInt(sc.nextLine()));
        System.out.println("Tipo: ");
        setTipo(sc.nextLine());
        System.out.println("Preço: ");
        setPreco(Float.parseFloat(sc.nextLine()));
        continua = false;
            } catch (ArithmeticException arithmeticException){
                System.err.printf("\nExceção na última entrada.\nErro: %s.\nTente novamente.\n", arithmeticException);                
            } catch (NumberFormatException numberFormatException){
                System.err.printf("\nExceção na última entrada. \nErro: %s.\nTente novamente.\n", numberFormatException);                
            } catch (InputMismatchException inputMismatchException){
                System.err.printf("\nExceção na última entrada. \nErro: %s.\nTente novamente.\n", inputMismatchException);                
            }
        } while (continua);
    }
}