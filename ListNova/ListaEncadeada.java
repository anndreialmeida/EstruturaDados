package main;

public class ListaEncadeada {

    private Nodo lista;

    public ListaEncadeada() {
        this.lista = null;
    }

    public Nodo getLista() {
        return lista;
    }

    public void setLista(Nodo lista) {
        this.lista = lista;
    }

    public void insereElemento(Nodo novoNodo) {
        if (lista == null) {
            this.lista = novoNodo;
        } else {
            novoNodo.setProx(this.lista);
            this.lista = novoNodo;
        }
    }

    public void insereElementoFinal(Nodo novoNodo) {
        // implementar s
        if (lista == null) {
            this.lista = novoNodo;

        } else {
            // Navegar até o ultimo elemento 
            // ultimo set.prox = novoNodo
            Nodo aux = this.lista;
            while (aux.getProx() != null) {
                aux = aux.getProx();
            }

            aux.setProx(novoNodo);
        }
    }

    public void removeElementoInicioLlista() {
        if (lista == null) {
            System.out.println("Lista esta vazaia!");
        } else {
            this.lista = this.lista.getProx();
        }
    }

    public void removeElementoFinalLista() {

        if (lista == null) {
            System.out.println("Lista esta vazia!");
        } else {

            Nodo aux = this.lista;
            Nodo anterior = this.lista;
            while (aux.getProx() != null) {
                anterior = aux;
                aux = aux.getProx();
            }

            anterior.setProx(null);
        }

    }

    public void mostrar() {
        if (lista == null ){
            System.out.println("Lista esta vazia");
        }else {
            Nodo aux = lista; 
            while(aux != null){
                System.out.println(aux);
                aux = aux.getProx();
            }
        }
    }
}
