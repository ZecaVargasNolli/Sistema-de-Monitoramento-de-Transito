package controladortransito.Model;

import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Giancarlo
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        LeitorMalha leitor = new LeitorMalha("E:/facul/6-semestre/Sistemas Paralelos/TrabalhoTransito/Malhas exemplo/malha-exemplo-3.txt");

        int[][] malhaCrua = leitor.lerMalha();

        ConversorMatrizMalhaViaria conversor = new ConversorMatrizMalhaViaria(malhaCrua);
        Malha malhaViariaobj = conversor.getMatrizConvertidaParaMalha();
        Nodo[][] malhaViaria = malhaViariaobj.getNodos();
        
//        Carro carro = new Carro("G");
//        malhaViaria[7][0].setCarro(carro);
//        malhaViaria[0][7].setCarro(carro);
//        malhaViaria[0][18].setCarro(carro);
//        malhaViaria[6][24].setCarro(carro);
//        malhaViaria[19][0].setCarro(carro);
//        malhaViaria[24][8].setCarro(carro);
//        carro.setNodoAtual(malhaViaria[7][0]);
//        carro.start();

//        Carro carro = new Carro("G");
//        malhaViaria[7][0].setCarro(carro);
//        carro.setNodoAtual(malhaViaria[7][0]);
//        carro.start();
//        
//        Carro carro2 = new Carro("C");
//        malhaViaria[0][7].setCarro(carro2);
//        carro2.setNodoAtual(malhaViaria[0][7]);
//        carro2.start();
//            
//        Carro carro3 = new Carro("X");
//        malhaViaria[19][0].setCarro(carro3);
//        carro3.setNodoAtual(malhaViaria[19][0]);
//        carro3.start();
        ColocadorDeCarro clc = new ColocadorDeCarro(malhaViariaobj);
        clc.start();
        
        while (true) {
            for (int i = 0; i < malhaViaria.length; i++) {
                for (int j = 0; j < malhaViaria[i].length; j++) {
                    Nodo nodo = malhaViaria[i][j];
                    if (nodo == null) {
                        System.out.print("  ");
                    }
                    else {
                        System.out.print( (nodo.getCarro() != null ? nodo.getCarro().getNome() : "-") + " ");
                    }

                }
                System.out.println("");
            }
            Thread.sleep(500);
        }
    }
    
    private static class ColocadorDeCarro extends Thread {
        private Malha malha;

        public ColocadorDeCarro(Malha malha) {
            this.malha = malha;
        }
        
        @Override
        public void run() {
            Random ran = new Random();
            int id;
            String idStr;
            Carro carro;
            Nodo nodo;
            
            while (true) {   
                id = ran.nextInt(5);
                idStr = "";
                if(id == 0) {
                   idStr = "X" ;
                }
                if(id == 1) {
                   idStr = "A" ;
                }
                if(id == 2) {
                   idStr = "B" ;
                }
                if(id == 3) {
                   idStr = "Y" ;
                }
                if(id == 4) {
                   idStr = "Z" ;
                }
                if(id == 5) {
                   idStr = "M" ;
                }
                carro = new Carro(idStr);
                nodo = this.malha.getNodo(7, 0);
                nodo.setCarro(carro);
                carro.setNodoAtual(nodo);
                carro.start();
                
                
                
                
                
                
                id = ran.nextInt(5);
                idStr = "";
                if(id == 0) {
                   idStr = "X" ;
                }
                if(id == 1) {
                   idStr = "A" ;
                }
                if(id == 2) {
                   idStr = "B" ;
                }
                if(id == 3) {
                   idStr = "Y" ;
                }
                if(id == 4) {
                   idStr = "Z" ;
                }
                if(id == 5) {
                   idStr = "M" ;
                }
                carro = new Carro(idStr);
                nodo = this.malha.getNodo(0, 7);
                nodo.setCarro(carro);
                carro.setNodoAtual(nodo);
                carro.start();
                
                
                
                
                
                
                
                
                id = ran.nextInt(5);
                idStr = "";
                if(id == 0) {
                   idStr = "X" ;
                }
                if(id == 1) {
                   idStr = "A" ;
                }
                if(id == 2) {
                   idStr = "B" ;
                }
                if(id == 3) {
                   idStr = "Y" ;
                }
                if(id == 4) {
                   idStr = "Z" ;
                }
                if(id == 5) {
                   idStr = "M" ;
                }
                carro = new Carro(idStr);
                nodo = this.malha.getNodo(0, 18);
                nodo.setCarro(carro);
                carro.setNodoAtual(nodo);
                carro.start();
                
//                id = (char) ran.nextInt(256);
//                carro = new Carro(id + "");
//                nodo = this.malha.getNodo(0, 18);
//                nodo.setCarro(carro);
//                carro.setNodoAtual(nodo);
//                carro.start();
//                
//                id = (char) ran.nextInt(256);
//                carro = new Carro(id + "");
//                nodo = this.malha.getNodo(0, 7);
//                nodo.setCarro(carro);
//                carro.setNodoAtual(nodo);
//                carro.start();
//                
//                id = (char) ran.nextInt(256);
//                carro = new Carro(id + "");
//                nodo = this.malha.getNodo(6, 24);
//                nodo.setCarro(carro);
//                carro.setNodoAtual(nodo);
//                carro.start();
//                
//                id = (char) ran.nextInt(256);
//                carro = new Carro(id + "");
//                nodo = this.malha.getNodo(19, 0);
//                nodo.setCarro(carro);
//                carro.setNodoAtual(nodo);
//                carro.start();
//                
//                id = (char) ran.nextInt(256);
//                carro = new Carro(id + "");
//                nodo = this.malha.getNodo(24, 8);
//                nodo.setCarro(carro);
//                carro.setNodoAtual(nodo);
//                carro.start();
//                
                try {
                    sleep(5000);
                }
                catch (InterruptedException ex) {}
            }
        
        }
        
        
    }

}
