
package controladortransito.Model;

/**
 * Classe que representa a malha viaria
 * 
 * @author Giancarlo Pandini
 */
public class Malha {
    
    private Nodo[][] nodos;

    public Malha(int altura, int largura) {
        this.nodos = new Nodo[altura][largura];
    }
    
    public Nodo getNode(int altura, int largura) {
        return this.nodos[altura][largura];
    }
    
    public void setNode(int altura, int largura, Nodo nodo) {
        this.nodos[altura][largura] = nodo;
    }
    
    
}
