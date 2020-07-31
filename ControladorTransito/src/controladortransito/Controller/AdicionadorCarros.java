package controladortransito.Controller;


import controladortransito.Model.Carro;
import controladortransito.Model.Malha;
import controladortransito.Model.Nodo;
import static java.lang.Thread.sleep;
import java.util.Random;

   public class AdicionadorCarros extends Thread {
       
        private Malha malha;
        private int tempoMiliseg;

        public AdicionadorCarros(Malha malha, int tempoMiliseg) {
            this.malha = malha;
            this.tempoMiliseg = tempoMiliseg;
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
                    sleep(this.tempoMiliseg);
                }
                catch (InterruptedException ex) {}
            }
        
        }
        
        
    }
