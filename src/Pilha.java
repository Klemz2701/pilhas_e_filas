public class Pilha {
    private int topo;
    private String[] dados;
    private int capacidade;

    public Pilha(int capacidade) {
        this.topo = -1;
        this.capacidade = capacidade;
        this.dados = new String[capacidade];
    }

    public boolean vazia() {
        return topo == -1;
    }

    public boolean cheia() {
        return topo == capacidade - 1;
    }

    public void insere(String elemento) throws Exception {
        if (cheia()) {
            throw new Exception("Pilha cheia");
        }
        topo++;
        dados[topo] = elemento;
    }

    public String remove() throws Exception {
        if (vazia()) {
            throw new Exception("Pilha vazia");
        }
        String elementoRemovido = dados[topo];
        topo--;
        return elementoRemovido;
    }

    public void imprime() {
        for (int i = topo; i >= 0; i--) {
            System.out.println(dados[i]);
        }
    }
}
