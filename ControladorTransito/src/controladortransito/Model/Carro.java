package controladortransito.Model;

/**
 * Objeto Carro que irá se locomover na  malha
 * @author José Vargas Nolli
 */
public class Carro  implements Runnable{

    private String nome;
    private long posicaoAltura;
    private long posicaoLateral;
    private int  indicaPosicao;

    public Carro(String nome, long posicaoAltura, long posicaoLateral) {
        this.nome = nome;
        this.posicaoAltura = posicaoAltura;
        this.posicaoLateral = posicaoLateral;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getPosicaoAltura() {
        return posicaoAltura;
    }

    public void setPosicaoAltura(long posicaoAltura) {
        this.posicaoAltura = posicaoAltura;
    }

    public long getPosicaoLateral() {
        return posicaoLateral;
    }

    public void setPosicaoLateral(long posicaoLateral) {
        this.posicaoLateral = posicaoLateral;
    }
    
    
    @Override
    public void run() {
        
    }
    
}
