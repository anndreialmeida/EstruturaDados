public class PilhaEncadeada extends ListaEncadeada {

    public PilhaEncadeada() {
        super();
    }

    public void push(Nodo novo) {
        super.insereInicio(novo);
    }

    public Nodo pop() {

        Nodo topo = null;
        if (super.getLista() == null)
            return topo;
        else {
            topo = super.getLista();
            super.removeInicio();
            return topo;
        }

    }

    @Override
    public void mostra() {
        if (super.getLista() == null)
            System.out.println("Pilha vazia!");
        else {
            Nodo aux = super.getLista();
            while (aux != null) {
                System.out.println("Valor: " + aux.getValor());
                aux = aux.getProx();
            }
        }
    }
}
