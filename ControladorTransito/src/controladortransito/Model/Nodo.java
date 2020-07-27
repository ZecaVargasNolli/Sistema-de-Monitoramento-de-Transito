
package controladortransito.Model;

/**
 * Classe que representa um nodo da malha viaria
 * 
 * @author Giancarlo Pandini
 */
public class Nodo {
    
    private Carro carro;
    private Malha malhaViaria; /* para manter a relação bi-direcional */
    private Direcao direcao;
    private boolean nodoDeSaida;
    private int idxLinha;
    private int idxColuna;

    public Nodo(Direcao direcao, int idxLinha, int idxColuna, Malha malhaViaria) {
        this.direcao = direcao;
        this.nodoDeSaida = false;
        this.idxLinha = idxLinha;
        this.idxColuna = idxColuna;
        this.malhaViaria = malhaViaria;
    }
    
    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Direcao getDirecao() {
        return direcao;
    }

    public void setDirecao(Direcao direcao) {
        this.direcao = direcao;
    }

    public boolean isNodoDeSaida() {
        return nodoDeSaida;
    }

    public void setNodoDeSaida(boolean nodoDeSaida) {
        this.nodoDeSaida = nodoDeSaida;
    }

    public int getIdxLinha() {
        return idxLinha;
    }

    public void setIdxLinha(int idxLinha) {
        this.idxLinha = idxLinha;
    }

    public int getIdxColuna() {
        return idxColuna;
    }

    public void setIdxColuna(int idxColuna) {
        this.idxColuna = idxColuna;
    }

    public Malha getMalhaViaria() {
        return malhaViaria;
    }

    public boolean isCruzamento() {
        /** @TODO desenvolver */
        return false;
    }
}
