import java.util.Scanner;
import java.util.InputMismatchException;

public class Aviao extends Transportes {
    protected String identificacao;
    public Motor m2 = new Motor();
    public Motor m3 = new Motor();
    public Motor m4 = new Motor();
    
    public Aviao() {
    }
    public Aviao(String identificacao, String modelo, String marca, String cor, float comprimento, float largura, float preco){
        this.setIdentificacao(identificacao);
        super.setModelo(modelo);
        super.setMarca(marca);
        super.setCor(cor);
        super.setComprimento(comprimento);
        super.setLargura(largura);
        super.setPreco(preco);
    }    
    public Aviao(String identificacao, String modelo, String marca, String cor, float comprimento, float largura){
        this.setIdentificacao(identificacao);
        super.setModelo(modelo);
        super.setMarca(marca);
        super.setCor(cor);
        super.setComprimento(comprimento);
        super.setLargura(largura);
    }
    public Aviao(String identificacao, String modelo, String marca, String cor, float comprimento){
        this.setIdentificacao(identificacao);
        super.setModelo(modelo);
        super.setMarca(marca);
        super.setCor(cor);
        super.setComprimento(comprimento);
    }    
    public Aviao(String identificacao, String modelo, String marca, String cor){
        this.setIdentificacao(identificacao);
        super.setModelo(modelo);
        super.setMarca(marca);
        super.setCor(cor);
    }
    
    //set / get
    public String getIdentificacao() {
        return identificacao;
    }
    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }
    
    //metodos
    public void cadastrar(String identificacao) {
        super.cadastrar(modelo, marca, cor, comprimento, largura, preco);
        setIdentificacao(identificacao);
    }

    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        do{
            try{
                super.entradaDados();
                System.out.println("Identificação: ");
                setIdentificacao(sc.nextLine());
                continuar = false;
            } catch (ArithmeticException arithmeticException){
                System.err.printf("\nExceção na última entrada. Tente novamente.");                
            } catch (NumberFormatException numberFormatException){
                System.err.printf("\nExceção na última entrada. Tente novamente.");                
            }
        } while (continuar);
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Identificação: " + getIdentificacao());
    }

    public double valorDesconto() {
        double aux, desconto;
        aux = (getPreco() / 100) * 8;
        desconto = getPreco() - aux;
        return desconto;
    }
}