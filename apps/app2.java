import classes.Carro;
import classes.Aviao;
import classes.Lancha;

public class App8 {
    public static void main(String[] args) {
        try{
            Carro cr[] = new Carro [5];
            Lancha la[] = new Lancha [5];
            Aviao av[] = new Aviao[5];
        
        //CARROS
        for(int i=0; i<5; i++){
            cr[i]=new Carro();
            System.out.println("  --- Carro "+(i+1)+" ---");
            cr[i].entradaDados();
            System.out.println("----------------------------");
        }
        System.out.println("\nDados dos motores\n");
        for(int i=0; i<5; i++){
            System.out.println("  --- Carro "+(i+1)+" Motor 1 ---");
            cr[i].m1.entradaDados();
            System.out.println("  --- Carro "+(i+1)+" Motor 2 ---");            
            cr[i].m2.entradaDados();
            System.out.println("----------------------------");
        }        
        
        for(int i=0; i<5; i++){
            System.out.println("\n  --- Carro "+(i+1)+" ---");
            cr[i].imprimir();
            System.out.println("Valor com desconto: "+cr[i].valorDesconto());
            System.out.println("  --- Motor 1 ---");
            cr[i].m1.imprimir();
            System.out.println("  --- Motor 2 ---");            
            cr[i].m2.imprimir();
            System.out.println("\n");
        }
        //LANCHAS
        for(int i=0; i<5; i++){
            la[i]=new Lancha();
            System.out.println("  --- Lancha "+(i+1)+" ---");
            la[i].entradaDados();
            System.out.println("----------------------------");
        }
        System.out.println("\nDados dos motores\n");
        for(int i=0; i<5; i++){
            System.out.println("  --- Lancha "+(i+1)+" Motor 1 ---");
            la[i].m1.entradaDados();
            System.out.println("  --- Lancha "+(i+1)+" Motor 2 ---");            
            la[i].m2.entradaDados();
            System.out.println("----------------------------");
        }        
        for(int i=0; i<5; i++){
            System.out.println("\n  --- Lancha "+(i+1)+" ---");
            la[i].imprimir();
            System.out.println("Valor com desconto: "+la[i].valorDesconto());
            System.out.println("  --- Motor 1 ---");
            la[i].m1.imprimir();
            System.out.println("  --- Motor 2 ---");            
            la[i].m2.imprimir();
            System.out.println("\n");
        }
        //Aviões
        for(int i=0; i<5; i++){
            av[i]=new Aviao();
            System.out.println("  --- Avião "+(i+1)+" ---");
            av[i].entradaDados();
            System.out.println("----------------------------");
        }
        System.out.println("\nDados dos motores\n");
        for(int i=0; i<5; i++){
            System.out.println("  --- Aviao "+(i+1)+" Motor 1 ---");
            av[i].m1.entradaDados();
            System.out.println("  --- Aviao "+(i+1)+" Motor 2 ---");            
            av[i].m2.entradaDados();
            System.out.println("  --- Aviao "+(i+1)+" Motor 3 ---");
            av[i].m3.entradaDados();
            System.out.println("  --- Aviao "+(i+1)+" Motor 4 ---");            
            av[i].m4.entradaDados();            
            System.out.println("----------------------------");
        }                
        for(int i=0; i<5; i++){
            System.out.println("\n  --- Avião "+(i+1)+" ---");
            av[i].imprimir();
            System.out.println("Valor com desconto: "+av[i].valorDesconto());
            System.out.println("  --- Motor 1 ---");
            av[i].m1.imprimir();
            System.out.println("  --- Motor 2 ---");            
            av[i].m2.imprimir();
            System.out.println("  --- Motor 3 ---");            
            av[i].m3.imprimir();
            System.out.println("  --- Motor 4 ---");            
            av[i].m4.imprimir();
            System.out.println("\n");
        }
        
            System.out.println("\n\n --- Apresentação do tratamento de exceções para vetores ---\n\n");
            System.out.println(cr[6]);
        
        } catch (ArrayIndexOutOfBoundsException e){

            System.out.println("Exceção encontrada! Índice Inexistente.\nExceção: "+e.getMessage());
            e.printStackTrace();
            System.out.println("\n");
        }
    }
}