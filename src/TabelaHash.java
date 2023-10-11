import ArvoreBinaria.Arvore;

public class TabelaHash {
    private Arvore[] tabelaABB = null;
    //private Fila[] tabelaFILA = null;
    private boolean usandoArvoreBinaria;

    public TabelaHash(int i) {
        if (i==1) {
            this.tabelaABB = new Arvore[5];
            usandoArvoreBinaria = true;
        }
        else {
            //this.tabelaFILA = new Fila[5];
            //usandoArvoreBinaria = false;
        }
    }

    public void inserir(int numero) {
        if (usandoArvoreBinaria) {
            int posicao = numero % tabelaABB.length;
            Arvore chave = tabelaABB[posicao];

            if (chave == null) {
                tabelaABB[posicao] = new Arvore(numero);
            }
            else {
                chave.inserirNumero(numero, chave.getRaiz());
            }
        }
        else {
            //Lógica para Fila
        }
    }

    public void excluir(int numero) {
        if (usandoArvoreBinaria) {
            Arvore chave = tabelaABB[numero % tabelaABB.length];
            chave.excluirNumero(numero);
        }
        else {
            //Lógica para Fila
        }
    }

    public void imprimir() {
        if (usandoArvoreBinaria) {
            for (int i=0; i<tabelaABB.length; i++) {
                System.out.println("Posição " + i + ":");
                if (tabelaABB[i] == null) {
                    System.out.println("Vazio\n");
                }
                else {
                    tabelaABB[i].print();
                }
            }
        }
        else {
            //Lógica para Fila
        }
    }
}
