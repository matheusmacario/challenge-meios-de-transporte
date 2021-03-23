import java.util.Scanner;
import java.util.InputMismatchException;

public abstract class Transportes {
    protected String marca, modelo, cor;
    protected float comprimento, largura, preco;
    public Motor m1 = new Motor();
    
    //Construtores
    public Transportes(){        
    }
    public Transportes(String modelo, String marca, String cor, float comprimento, float largura, float preco){
        this.setModelo(modelo);
        this.setMarca(marca);
        this.setCor(cor);
        this.setComprimento(comprimento);
        this.setLargura(largura);
        this.setPreco(preco);
    }
    public Transportes(String marca, String cor, float comprimento, float largura, float preco){
        this.setMarca(marca);
        this.setCor(cor);
        this.setComprimento(comprimento);
        this.setLargura(largura);
        this.setPreco(preco);
    }
    public Transportes(String modelo, String marca, String cor, float comprimento, float largura){
        this.setModelo(modelo);
        this.setMarca(marca);
        this.setCor(cor);
        this.setComprimento(comprimento);
        this.setLargura(largura);
    }
    public Transportes(String modelo, String marca, String cor, float comprimento){
        this.setModelo(modelo);
        this.setMarca(marca);
        this.setCor(cor);
        this.setComprimento(comprimento);
    }
    public Transportes(String modelo, String marca, String cor){
        this.setModelo(modelo);
        this.setMarca(marca);
        this.setCor(cor);
    }
    public Transportes(String modelo, String marca){
        this.setModelo(modelo);
        this.setMarca(marca);
    }    
    public Transportes(String modelo){
        this.setModelo(modelo);
    }    
    
    //set e get
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    
    //ENTRADA DADOS
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        boolean continua = true;
        do{
            try{
        System.out.println("Marca: ");
        setMarca((sc.nextLine()));
        System.out.println("Modelo: ");
        setModelo((sc.nextLine()));
        System.out.println("Cor: ");
        setCor((sc.nextLine()));
        System.out.println("Comprimento: ");
        setComprimento(Float.parseFloat(sc.nextLine()));
        System.out.println("Largura: ");
        setLargura(Float.parseFloat(sc.nextLine()));
        System.out.println("Preço: ");
        setPreco(Float.parseFloat(sc.nextLine()));
        continua = false;
            } catch (ArithmeticException arithmeticException){
                System.err.printf("\nExceção na última entrada. Tente novamente.");                
            } catch (NumberFormatException numberFormatException){
                System.err.printf("\nExceção na última entrada. Tente novamente.");                
            }
        } while (continua);
    }
    
    public void cadastrar(String modelo, String marca, String cor, float comprimento, float largura, float preco){
        setModelo(modelo);
        setMarca(marca);
        setCor(cor);
        setComprimento(comprimento);
        setLargura(largura);
        setPreco(preco);
    }
    
    public void imprimir(){
        System.out.println("Modelo: "+getModelo());
        System.out.println("Maca: "+getMarca());
        System.out.println("Cor: "+getCor());
        System.out.println("Comprimento: "+getComprimento());
        System.out.println("Largura: "+getLargura());
        System.out.println("Preço: "+getPreco());
    }
    
    public abstract double valorDesconto();
    
}