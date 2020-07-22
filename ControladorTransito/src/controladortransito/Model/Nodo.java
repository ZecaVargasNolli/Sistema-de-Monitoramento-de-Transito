
package controladortransito.Model;

/**
 * Classe que representa um nodo da malha viaria
 * 
 * @author Giancarlo Pandini
 */
public class Nodo {
    
    private Carro carro;
    private int direcao;

    public Nodo(int direcao) {
        this.direcao = direcao;
    }
    
    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public int getDirecao() {
        return direcao;
    }

    public void setDirecao(int direcao) {
        this.direcao = direcao;
    }
    
    public boolean isCruzamento() {
        /** @TODO desenvolver */
        return false;
    }
}
