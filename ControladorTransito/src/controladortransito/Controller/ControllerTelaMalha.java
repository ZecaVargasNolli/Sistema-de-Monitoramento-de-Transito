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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author José Vargas Nolli
 */
public class ControllerTelaMalha {

    private Tela view;
    private Malha malhaViaria;

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

    public void inciarSimulacao(int tempoMiliseg) {
        AdicionadorCarros clc = new AdicionadorCarros(this.malhaViaria, tempoMiliseg);
        clc.start();

        Nodo[][] malhaVi = this.malhaViaria.getNodos();

        Thread th = new Thread(new Runnable() {
            String malhaPrint = "";

            @Override
            public void run() {
                while (true) {
                    malhaPrint = "";
                    for (int i = 0; i < malhaVi.length; i++) {
                        for (int j = 0; j < malhaVi[i].length; j++) {
                            Nodo nodo = malhaVi[i][j];
                            if (nodo == null) {
                                malhaPrint += "  ";
                            }
                            else {
                                malhaPrint += ((nodo.getCarro() != null ? nodo.getCarro().getNome() : "-") + " ");
                            }

                        }
                        malhaPrint += "\n";
                    }

                    view.getTextArea().setText(malhaPrint);
                    try {
                        Thread.sleep(250);
                    }
                    catch (InterruptedException ex) {
                    }

                }
            }
        });
        th.start();
    }

}
