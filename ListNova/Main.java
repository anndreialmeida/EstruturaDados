/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author alunolages
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Nodo nodo = new Nodo();
        nodo.setValor(10);
        ListaEncadeada lista = new ListaEncadeada();

        lista.insereElemento(nodo);

        Nodo nodo1 = new Nodo();
        nodo1.setValor(50);

        lista.insereElemento(nodo1);
        
        lista.mostrar();

    }

}
