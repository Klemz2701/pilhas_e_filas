public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(3);
        Fila fila = new Fila(3);
        int escolha = -1;

        while (escolha != 0) {
            System.out.println("\nEscolha uma operacaoo:");
            System.out.println("1 - Inserir na Pilha");
            System.out.println("2 - Remover da Pilha");
            System.out.println("3 - Imprimir Pilha");
            System.out.println("4 - Inserir na Fila");
            System.out.println("5 - Remover da Fila");
            System.out.println("6 - Imprimir Fila");
            System.out.println("0 - Sair");

            try {
                System.out.print("Digite a opcao: ");
                escolha = 0;
                int c;
                while ((c = System.in.read()) != '\n' && c != -1) {
                    if (c >= '0' && c <= '9') {
                        escolha = escolha * 10 + (c - '0');
                    }
                }

                switch (escolha) {
                    case 1:
                        System.out.print("Digite o caracter para inserir na Pilha: ");
                        String elementoPilha = "";
                        while ((c = System.in.read()) != '\n' && c != -1) {
                            elementoPilha += (char) c;
                        }
                        pilha.insere(elementoPilha.trim());
                        break;
                    case 2:
                        System.out.println("caracter removido da Pilha: " + pilha.remove());
                        break;
                    case 3:
                        System.out.println("caracteres da Pilha:");
                        pilha.imprime();
                        break;
                    case 4:
                        System.out.print("Digite o caracter para inserir na Fila: ");
                        String elementoFila = "";
                        while ((c = System.in.read()) != '\n' && c != -1) {
                            elementoFila += (char) c;
                        }
                        fila.insere(elementoFila.trim());
                        break;
                    case 5:
                        System.out.println("caracter removido da Fila: " + fila.remove());
                        break;
                    case 6:
                        System.out.println("caracter da Fila:");
                        fila.imprime();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("esse opcao nao existe");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}
