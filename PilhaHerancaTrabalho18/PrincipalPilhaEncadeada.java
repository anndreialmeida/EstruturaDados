
public class PrincipalPilhaEncadeada {

    public static void main(String[] args) {
        PilhaEncadeada pilha = new PilhaEncadeada();
        pilha.mostra();

        Nodo novo = new Nodo();
        novo.setValor(10);
        pilha.push(novo);

        novo = new Nodo();
        novo.setValor(4);
        pilha.push(novo);

        novo = new Nodo();
        novo.setValor(80);
        pilha.push(novo);

        System.out.println("Mostra pilha, todos os elementos!");
        pilha.mostra();
        System.out.println("Remove elemento com o POP");
        Nodo topo = pilha.pop();
        if (topo == null)
            System.out.println("Pilha vazia!");
        else
            System.out.println("Valor: " + topo.getValor());
        System.out.println("Mostra pilha, removendo elementos");
        pilha.mostra();
    }

}
