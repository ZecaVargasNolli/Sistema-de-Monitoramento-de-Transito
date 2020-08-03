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
        for (int i = 0; i < 257; i++) {
            char teste = (char) i;
            System.out.println(i + " - " + teste);
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
            CarroMonitor carro;
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
                carro = new CarroMonitor(idStr);
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
                carro = new CarroMonitor(idStr);
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
                carro = new CarroMonitor(idStr);
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
