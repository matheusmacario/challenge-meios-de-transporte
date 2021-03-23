import java.util.Scanner;
import java.util.ArrayList;
import classes.Aviao;
import classes.Carro;
import classes.Lancha;
import java.util.Iterator;

public class App2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        boolean continuaA = true, continuaC = true, continuaL = true;
        
        //Array dos objetos da classe aviao
        ArrayList<Aviao> av = new ArrayList<Aviao>();
        
        System.out.println(" ---- Aviões ---- ");
        while(continuaA){
            Aviao aux = new Aviao();
            aux.entradaDados();
            System.out.println("Dados do Motor 1:");
            aux.m1.entradaDados();
            System.out.println("Dados do Motor 2:");
            aux.m2.entradaDados();
            System.out.println("Dados do Motor 3:");
            aux.m3.entradaDados();
            System.out.println("Dados do Motor 4:");
            aux.m4.entradaDados();
            av.add(aux);
            System.out.println("criar mais aviões? Digite 1 (sim) e 2 (não)");
            int escolha = Integer.parseInt(sc.nextLine());
            if (escolha != 1 ){
                continuaA = false;
            }
        }
        Iterator<Aviao> avioes = av.iterator();
        for(int i=0; avioes.hasNext(); i++){
            System.out.println(" -- Avião "+(i+1)+" dados principais --");
            avioes.next().imprimir();
        }
        Iterator<Aviao> mt1 = av.iterator();
        for(int i=0; mt1.hasNext(); i++){
            System.out.println("---------------------");
            System.out.println(" -- Avião "+(i+1)+"  Motor 1 --");
            mt1.next().m1.imprimir();
        }
        Iterator<Aviao> mt2 = av.iterator();
        for(int i=0; mt2.hasNext(); i++){
            System.out.println("---------------------");
            System.out.println(" -- Avião "+(i+1)+"  Motor 2 --");
            mt2.next().m2.imprimir();
        }
        Iterator<Aviao> mt3 = av.iterator();
        for(int i=0; mt3.hasNext(); i++){
            System.out.println("---------------------");
            System.out.println(" -- Avião "+(i+1)+"  Motor 3 --");
            mt3.next().m3.imprimir();
        }
        Iterator<Aviao> mt4 = av.iterator();
        for(int i=0; mt4.hasNext(); i++){
            System.out.println("---------------------");
            System.out.println(" -- Avião "+(i+1)+"  Motor 4 --");
            mt4.next().m4.imprimir();
        }
        
        //Array dos objetos da classe carro
        ArrayList<Carro> cr = new ArrayList<Carro>();
        
        System.out.println(" ------ Carros ----- ");
        while(continuaC){
            Carro aux = new Carro();
            aux.entradaDados();
            System.out.println("Dados do Motor 1:");
            aux.m1.entradaDados();
            System.out.println("Dados do Motor 2:");
            aux.m2.entradaDados();
            cr.add(aux);
            System.out.println("criar mais carros? Digite 1 (sim) e 2 (não)");
            int escolha = Integer.parseInt(sc.nextLine());
            if (escolha != 1 ){
                continuaC = false;
            }
        }
        Iterator<Carro> carros = cr.iterator();
            for(int i=0; carros.hasNext(); i++){
            System.out.println(" -- Carro "+(i+1)+" dados principais --");
            carros.next().imprimir();
        }
        Iterator<Carro> mo1 = cr.iterator();
        for(int i=0; mo1.hasNext(); i++){
            System.out.println("---------------------");
            System.out.println(" -- Carro "+(i+1)+"  Motor  1 --");
            mo1.next().m1.imprimir();
        }
        Iterator<Carro> mo2 = cr.iterator();
        for(int i=0; mo2.hasNext(); i++){
            System.out.println("---------------------");
            System.out.println(" -- Carro "+(i+1)+"  Motor  2 --");
            mo2.next().m2.imprimir();
        }
        
        //Array dos objetos da classe lancha
        ArrayList<Lancha> la = new ArrayList<Lancha>();
        
        System.out.println(" ---- Lanchas ---- ");
        while(continuaL){
            Lancha aux = new Lancha();
            aux.entradaDados();
            System.out.println("Dados do Motor 1:");
            aux.m1.entradaDados();
            System.out.println("Dados do Motor 2:");
            aux.m2.entradaDados();
            la.add(aux);
            System.out.println("criar mais Lanchas? Digite 1 (sim) e 2 (não)");
            int escolha = Integer.parseInt(sc.nextLine());
            if (escolha != 1 ){
                continuaL = false;
            }
        }
        Iterator<Lancha> lancha = la.iterator();
        for(int i=0; lancha.hasNext(); i++){
            System.out.println(" -- Lancha "+(i+1)+" dados principais --");
            lancha.next().imprimir();
        }
        Iterator<Lancha> mto1 = la.iterator();
        for(int i=0; mto1.hasNext(); i++){
            System.out.println("---------------------");
            System.out.println(" -- Lancha "+(i+1)+" Motor 1 --");
            mto1.next().m1.imprimir();
        }
        Iterator<Lancha> mto2 = la.iterator();
        for(int i=0; mto2.hasNext(); i++){
            System.out.println("---------------------");
            System.out.println(" --- Lancha "+(i+1)+" Motor 2 --");
            mto2.next().m2.imprimir();
        }

        } catch (ArrayIndexOutOfBoundsException e){

            System.out.println("Exceção encontrada! Índice Inexistente.\nExceção: "+e.getMessage());
            e.printStackTrace();
            System.out.println("\n");
        }
}}