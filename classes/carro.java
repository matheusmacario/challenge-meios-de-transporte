import java.util.Scanner;
import java.util.InputMismatchException;

public class Carro extends Transportes{
    protected String placa;
    public Motor m2 = new Motor();
    
    public Carro(){
    }
    public Carro(String placa, String modelo, String marca, String cor, float comprimento, float largura, float preco){
        this.setPlaca(placa);
        super.setModelo(modelo);
        super.setMarca(marca);
        super.setCor(cor);
        super.setComprimento(comprimento);
        super.setLargura(largura);
        super.setPreco(preco);
    }    
    public Carro(String placa, String modelo, String marca, String cor, float comprimento, float largura){
        this.setPlaca(placa);
        super.setModelo(modelo);
        super.setMarca(marca);
        super.setCor(cor);
        super.setComprimento(comprimento);
        super.setLargura(largura);
    }
    public Carro(String placa, String modelo, String marca, String cor, float comprimento){
        this.setPlaca(placa);
        super.setModelo(modelo);
        super.setMarca(marca);
        super.setCor(cor);
        super.setComprimento(comprimento);
    }    
    public Carro(String placa, String modelo, String marca, String cor){
        this.setPlaca(placa);
        super.setModelo(modelo);
        super.setMarca(marca);
        super.setCor(cor);
    }    

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    //ENTRADA DADOS
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        do{
            try{
                super.entradaDados();
                System.out.println("Placa: ");
                setPlaca(sc.nextLine());
                continuar = false;
            } catch (ArithmeticException arithmeticException){
                System.err.printf("\nExceção na última entrada. Tente novamente.");                
            } catch (NumberFormatException numberFormatException){
                System.err.printf("\nExceção na última entrada. Tente novamente.");                
            }
        } while (continuar);
    }
    
    public void cadastrar(String placa){
        super.cadastrar(modelo, marca, cor, comprimento, largura, preco);
        setPlaca(placa);
    }
    
    public void imprimir(){
        super.imprimir();
        System.out.println("Placa: "+placa);
    }
    
    public double valorDesconto() {
        double aux, desconto;
        aux = (getPreco() / 100) * 15;
        desconto = getPreco() - aux;
        return desconto;
    }
}