package controladortransito.Model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * classe responsavel por ler o arquivo txt da malha viária
 *
 * @author Giancarlo
 */
public class LeitorMalha {

    private int malha[][];
    private String diretorio;

    public LeitorMalha(String diretorio) {
        this.diretorio = diretorio;
    }
    
    /**
     * le o arquivo de texto e rotar a uma matriz de inteiros reprresentado 
     * a malha viaria
     * 
     * @return matriz de inteiro
     * @throws IOException 
     */
    public int[][] lerMalha() throws IOException {
        BufferedReader buffRead = this.criaBuffer();
        if (buffRead == null) {
            return null;
        }
        
        this.iniciaMalha(buffRead);
        this.preencheMalha(buffRead);
     
        buffRead.close();
        return this.malha;
    }
    
    /**
     * preenche o atributo 'malha'
     * 
     * @param buffRead
     * @throws IOException 
     */
    private void preencheMalha(BufferedReader buffRead) throws IOException {
        String linha = buffRead.readLine();
        int idxLinha = 0;
            
        while(linha != null) {
            String[] numerosMalha = linha.split("\t");
            
            this.preencheLinhaMalha(idxLinha, this.arrayLinhaStringToInt(numerosMalha));
            idxLinha++;
            
            linha = buffRead.readLine();      
        }
    }
    
    /**
     * Funcao que converte array de informações em String para inteiro
     * 
     * @param linha array com as informacoes do tipo String
     * @return array com as informacoes do tipo int
     */
    private int[] arrayLinhaStringToInt(String[] linha) {
        int[] linhaInt = new int[linha.length];
        for (int idx = 0; idx < linha.length; idx++) {
            linhaInt[idx] = Integer.parseInt(linha[idx]);
        }
        return linhaInt;
    }
    
    /**
     * adiciona uma linha no atributo malha 
     * 
     * @param idxLinha indice da linha que serao adicionao os daddos
     * @param linha array de inteiros com os dados de uma linha
     */
    private void preencheLinhaMalha(int idxLinha, int[] linha) {
        for (int idxCol = 0; idxCol < this.malha[idxLinha].length; idxCol++) {
            this.malha[idxLinha][idxCol] = linha[idxCol];
        }
    }
    
    /**
     * função que cria uma nova matriz para o atributo 'malha'
     * 
     * @param buffRead usado para ler o arqivo txt e obter o tamanho da matriz
     * @throws IOException 
     */
    private void iniciaMalha(BufferedReader buffRead) throws IOException {
        String lnQtdLinhas = buffRead.readLine().trim();
        String lnQtdColunas = buffRead.readLine().trim();
        
        int qtdLinhas = Integer.parseInt(lnQtdLinhas);
        int qtdColunas = Integer.parseInt(lnQtdColunas);
        
        this.malha = new int[qtdLinhas][qtdColunas];
    }
    
    /**
     * função que cria um BufferedReader
     * 
     * @return BufferedReader
     */
    private BufferedReader criaBuffer() {
       BufferedReader buffRead = null;
        try {
            buffRead = new BufferedReader(new FileReader(this.diretorio)); 
        }
        catch (FileNotFoundException ex) { }
        return buffRead;
    }

}
