
public class Principal {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        lista.mostra();

        Nodo novoNodo = new Nodo();
        novoNodo.setValor(10);
        lista.insereInicio(novoNodo);

        novoNodo = new Nodo();
        novoNodo.setValor(5);
        lista.insereFim(novoNodo);

        lista.mostra();

        int posicao = 1;
        Nodo nodoAcessado = lista.acesso(posicao);
        if (nodoAcessado == null) {
            System.out.println("Não existe na lista!");
        } else
            System.out.println("Nodo acessado: " + nodoAcessado.getValor());

        int valor = 5;
        Nodo nodoPesquisa = lista.pesquisa(valor);
        if (nodoPesquisa == null) {
            System.out.println("Não existe na lista!");
        } else
            System.out.println("Nodo pesquisa: " + nodoPesquisa.getValor());

//        lista.removeFim();
//        lista.mostra();
//        lista.removeInicio();
//        lista.mostra();

    }
}
