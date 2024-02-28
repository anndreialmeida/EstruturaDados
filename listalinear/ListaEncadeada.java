package com.mycompany.listalinear;

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
            
        }else {
            // Navegar até o ultimo elemento 
            // ultimo set.prox = novoNodo
        }
    }
}
