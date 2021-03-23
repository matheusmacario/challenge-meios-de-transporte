import java.util.Scanner;

public class Lancha extends Transportes {
    protected String nome;
    public Motor m2 = new Motor();

//Métodos Construtores
    public Lancha() {
    }
    public Lancha(String nome, String modelo, String marca, String cor, float comprimento, float largura, float preco){
        this.setNome(nome);
        super.setModelo(modelo);
        super.setMarca(marca);
        super.setCor(cor);
        super.setComprimento(comprimento);
        super.setLargura(largura);
        super.setPreco(preco);
    }    
    public Lancha(String nome, String modelo, String marca, String cor, float comprimento, float largura){
        this.setNome(nome);
        super.setModelo(modelo);
        super.setMarca(marca);
        super.setCor(cor);
        super.setComprimento(comprimento);
        super.setLargura(largura);
    }
    public Lancha(String nome, String modelo, String marca, String cor, float comprimento){
        this.setNome(nome);
        super.setModelo(modelo);
        super.setMarca(marca);
        super.setCor(cor);
        super.setComprimento(comprimento);
    }    
    public Lancha(String nome, String modelo, String marca, String cor){
        this.setNome(nome);
        super.setModelo(modelo);
        super.setMarca(marca);
        super.setCor(cor);
    }
    
//sets e gets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

//cadastrar
    public void cadastrarLancha(String nome) {
        super.cadastrar(modelo, marca, cor, comprimento, largura, preco);
        setNome(nome);
    }

    //ENTRADA DADOS
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        do{
            try{
                super.entradaDados();
                System.out.println("Identificação: ");
                setNome(sc.nextLine());
                continuar = false;
            } catch (ArithmeticException arithmeticException){
                System.err.printf("\nExceção na última entrada. Tente novamente.");                
            } catch (NumberFormatException numberFormatException){
                System.err.printf("\nExceção na última entrada. Tente novamente.");                
            }
        } while (continuar);
    }

//imprimir
    public void imprimirLancha() {
        super.imprimir();
        System.out.println("Nome: "+getNome());
    }

    public double valorDesconto() {
        double aux, desconto;
        aux = (getPreco() / 100) * 10;
        desconto = getPreco() - aux;
        return desconto;
    }
}
