
package controladortransito.Model;

/**
 * Classe que representa a malha viaria
 * 
 * @author Giancarlo Pandini
 */
public class Malha {
    
    private Nodo[][] nodos;

    public Nodo getNodo(int idxLinha, int idxColuna) {
        return this.nodos[idxLinha][idxColuna];
    }
    
    public void setNodo(int idxLinha, int idxColuna, Nodo nodo) {
        this.nodos[idxLinha][idxColuna] = nodo;
    }

    public void setNodos(Nodo[][] nodos) {
        this.nodos = nodos;
    }

    public Nodo[][] getNodos() {
        return nodos;
    }

}
