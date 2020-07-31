package controladortransito.Model;

import java.util.Random;

/**
 * Objeto Carro que irá se locomover na malha
 *
 * @author José Vargas Nolli
 */
public class Carro extends Thread {

    private String nome;
    private Nodo nodoAtual;

    public Carro(String nome) {
        this.nome = nome;
    }

    public Nodo getNodoAtual() {
        return nodoAtual;
    }

    public void setNodoAtual(Nodo nodoAtual) {
        this.nodoAtual = nodoAtual;
    } 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public synchronized void andar(Nodo nodoDestino) {
        if(nodoDestino.getCarro() != null) {
            return;
        }
        this.nodoAtual.setCarro(null);
        this.nodoAtual = nodoDestino;
        this.nodoAtual.setCarro(this);
    }

    public Nodo getProxNodoCima() {
        Malha malhaViaria = this.nodoAtual.getMalhaViaria();
        Nodo proximoNodo = malhaViaria.getNodo(this.nodoAtual.getIdxLinha() - 1, this.nodoAtual.getIdxColuna());
        return proximoNodo;

    }

    public Nodo getProxNodoDireita() {
        Malha malhaViaria = this.nodoAtual.getMalhaViaria();
        Nodo proximoNodo = malhaViaria.getNodo(this.nodoAtual.getIdxLinha(), this.nodoAtual.getIdxColuna() + 1);
        return proximoNodo;
    }

    public Nodo getProxNodoBaixo() {
        Malha malhaViaria = this.nodoAtual.getMalhaViaria();
        Nodo proximoNodo = malhaViaria.getNodo(this.nodoAtual.getIdxLinha() + 1, this.nodoAtual.getIdxColuna());
        return proximoNodo;
    }

    public Nodo getProxNodoEsquerda() {
        Malha malhaViaria = this.nodoAtual.getMalhaViaria();
        Nodo proximoNodo = malhaViaria.getNodo(this.nodoAtual.getIdxLinha(), this.nodoAtual.getIdxColuna() - 1);
        return proximoNodo;
    }

    public void SairMalhaViaria() {
        this.nodoAtual.setCarro(null);
    }
    
    @Override
    public void run() {
        Nodo proximoNodo = null;
        Random rand = new Random();
        while (true) {
            if (this.nodoAtual.isNodoDeSaida()) {
                this.SairMalhaViaria();
                break;
            }
            
            if(this.nodoAtual.getDirecao() == Direcao.CIMA || this.nodoAtual.getDirecao() == Direcao.CRUZAMENTO_CIMA){ 
                proximoNodo = this.getProxNodoCima();
            }
            
            if(this.nodoAtual.getDirecao() == Direcao.DIREITA || this.nodoAtual.getDirecao() == Direcao.CRUZAMENTO_DIREITA){ 
                proximoNodo = this.getProxNodoDireita();
            }
            
            if(this.nodoAtual.getDirecao() == Direcao.BAIXO || this.nodoAtual.getDirecao() == Direcao.CRUZAMENTO_BAIXO){ 
                proximoNodo = this.getProxNodoBaixo();
            }
            
            if(this.nodoAtual.getDirecao() == Direcao.ESQUERDA || this.nodoAtual.getDirecao() == Direcao.CRUZAMENTO_ESQUERDA){ 
                proximoNodo = this.getProxNodoEsquerda();
            }
            
            if(this.nodoAtual.getDirecao() == Direcao.CRUZAMENTO_BAIXO_DIREITA){ 
                if (rand.nextInt(500)%2 == 0) {
                    proximoNodo = this.getProxNodoDireita();
                }
                else {
                    proximoNodo = this.getProxNodoBaixo();
                }
            }
            if(this.nodoAtual.getDirecao() == Direcao.CRUZAMENTO_BAIXO_ESQUERDA) { 
                if (rand.nextInt(500)%2 == 0) {
                    proximoNodo = this.getProxNodoEsquerda();
                }
                else {
                    proximoNodo = this.getProxNodoBaixo();
                }
            }
            if(this.nodoAtual.getDirecao() == Direcao.CRUZAMENTO_CIMA_DIRETIA) { 
                if (rand.nextInt(500)%2 == 0) {
                    proximoNodo = this.getProxNodoDireita();
                }
                else {
                    proximoNodo = this.getProxNodoCima();
                }
            }
            if(this.nodoAtual.getDirecao() == Direcao.CRUZAMENTO_CIMA_ESQUERDA) { 
                if (rand.nextInt(500)%2 == 0) {
                    proximoNodo = this.getProxNodoEsquerda();
                }
                else {
                    proximoNodo = this.getProxNodoCima();
                }
            }
            
            if(proximoNodo.getCarro() == null) {
                this.andar(proximoNodo);
            }
            
            try {
                sleep(500);
            }
            catch (Exception e) {}
        }
        
    }

}
