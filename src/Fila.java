public class Fila {
    private int primeiro;
    private int ultimo;
    private String[] dados;
    private int capacidade;

    public Fila(int capacidade) {
        this.primeiro = 0;
        this.ultimo = -1;
        this.capacidade = capacidade;
        this.dados = new String[capacidade];
    }

    public boolean cheia() {
        return ultimo == capacidade - 1;
    }

    public boolean vazia() {
        return primeiro > ultimo;
    }

    public void insere(String elemento) throws Exception {
        if (cheia()) {
            throw new Exception("Fila cheia");
        }
        ultimo++;
        dados[ultimo] = elemento;
    }

    public String remove() throws Exception {
        if (vazia()) {
            throw new Exception("Fila vazia");
        }
        String elementoRemovido = dados[primeiro];
        primeiro++;
        return elementoRemovido;
    }

    public void imprime() {
        for (int i = primeiro; i <= ultimo; i++) {
            System.out.println(dados[i]);
        }
    }
}
