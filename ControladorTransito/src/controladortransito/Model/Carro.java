
package controladortransito.Model;

/**
 *
 * @author Giancarlo
 */
public abstract class Carro extends Thread {
    public abstract String getNome();
    public abstract void setNodoAtual(Nodo nodo);
}
