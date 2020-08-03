/*
 *
 */
package controladortransito.Controller;

import controladortransito.Model.ConversorMatrizMalhaViaria;
import controladortransito.Model.LeitorMalha;
import controladortransito.Model.Malha;
import controladortransito.Model.Nodo;
import controladortransito.View.Tela;
import java.io.IOException;


/**
 *
 * @author Jose Vargas Nolli
 */
public class ControllerTelaMalha {

    private Tela view;
    private Malha malhaViaria;
    private AdicionadorCarros adicionadorCarros;
    private DesenhadorMalha desenhadorMalha;

    public void setView(Tela view) {
        this.view = view;
    }

    public void CriaMalhaViaria(String caminho) {
        LeitorMalha leitor = new LeitorMalha(caminho);
        int[][] malhaBase = null;

        try {
            malhaBase = leitor.lerMalha();
        }
        catch (IOException ex) {
        }

        ConversorMatrizMalhaViaria conversor = new ConversorMatrizMalhaViaria(malhaBase);
        this.malhaViaria = conversor.getMatrizConvertidaParaMalha();
    }
        

    public void inciarSimulacaoMonitor(int tempoMiliseg, int qtdCarros) {
        AdicionadorCarros addCar = new AdicionadorCarros(this.malhaViaria, false);
        addCar.setTempoMiliseg(tempoMiliseg);
        addCar.setQtdTotalCarros(qtdCarros);
        this.adicionadorCarros = addCar;
        addCar.start();
        
        DesenhadorMalha desenhadorMalha = new DesenhadorMalha(this.view.getTextArea(), this.malhaViaria);
        this.desenhadorMalha = desenhadorMalha;
        desenhadorMalha.start();
    } 
    
    public void inciarSimulacaoSemaforo(int tempoMiliseg, int qtdCarros) {
        AdicionadorCarros addCar = new AdicionadorCarros(this.malhaViaria, true);
        addCar.setTempoMiliseg(tempoMiliseg);
        addCar.setQtdTotalCarros(qtdCarros);
        this.adicionadorCarros = addCar;
        addCar.start();
        
        DesenhadorMalha desenhadorMalha = new DesenhadorMalha(this.view.getTextArea(), this.malhaViaria);
        this.desenhadorMalha = desenhadorMalha;
        desenhadorMalha.start();
    }   
    
    public void pararSimulacao() {
        this.adicionadorCarros.paraExcucao();
    }
    
    public void pararSimulacaoAgora() {
        this.adicionadorCarros.paraExcucao();
        this.desenhadorMalha.paraExecucao();
        this.malhaViaria.paraExecucao();
    }
}
