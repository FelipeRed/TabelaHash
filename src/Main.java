public class Main {
    public static void main(String[] args) {
        TabelaHash tHashABB = new TabelaHash(1);

        tHashABB.inserir(10);
        tHashABB.inserir(17);
        tHashABB.inserir(55);
        tHashABB.inserir(91);
        tHashABB.inserir(23);
        tHashABB.inserir(77);
        tHashABB.inserir(36);
        tHashABB.inserir(68);
        tHashABB.excluir(55);
        tHashABB.imprimir();
    }
}