public class ListaEncadeadaTeste {
    public static void main(String[] args) {


        System.out.println("Adiciona em Qualquer Posição!");
        ListaEncadeada<Integer> novalista2  = new ListaEncadeada<>();
        //novalista2.adicionarQualquerPosicao(-1,1);
        novalista2.adiciona(1);
        novalista2.adiciona(2);
        novalista2.adiciona(4);
        System.out.println(novalista2);
        //novalista2.adicionarQualquerPosicao(5,0);
        novalista2.adicionarQualquerPosicao(0,0);
        novalista2.adicionarQualquerPosicao(4,5);
        novalista2.adicionarQualquerPosicao(2,3);
        System.out.println(novalista2);

        novalista2.removeInicio();

        System.out.println(novalista2);
        novalista2.removeInicio();
        System.out.println(novalista2);
        System.out.println(novalista2.getTamanho());


        System.out.println("Remove do final");
        ListaEncadeada<Integer> novaLista3  = new ListaEncadeada<>();
        novaLista3.adiciona(1);
        novaLista3.adiciona(2);
        novaLista3.adiciona(3);
        System.out.println(novaLista3);
        novaLista3.removeFinal();
        System.out.println(novaLista3);
        novaLista3.removeFinal();
        novaLista3.removeFinal();
        System.out.println(novaLista3);
        System.out.println(novaLista3.getTamanho());

        System.out.println("Remove Qualquer Posição");
        ListaEncadeada<Integer> novaLista4 = new ListaEncadeada<>();

        novaLista4.adiciona(1);
        novaLista4.adiciona(2);
        novaLista4.adiciona(3);
        novaLista4.adiciona(4);
        novaLista4.adiciona(5);
        System.out.println(novaLista4);
        novaLista4.removeQualquerPosicao(3);
        System.out.println(novaLista4);


    }
}
