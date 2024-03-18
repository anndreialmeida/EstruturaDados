public class ListaEncadeada<T> {

    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho = 0;

    public void adiciona (T elemento){
        No<T> celula = new No<T>(elemento);
        if(this.tamanho == 0){
            this.inicio = celula;
        }else{
            this.ultimo.setProximo(celula);
        }
        this.ultimo = celula;
        this.tamanho ++;
    }

    public void adicionaInicio(T elemento){
        if(this.tamanho == 0){
            No<T> novoNo = new No<>(elemento);
            this.inicio = novoNo;
            this.ultimo = novoNo;
        }else{
            No<T> novoNo = new No<>(elemento, this.inicio);
            this.inicio = novoNo;
        }

        this.tamanho++;
    }

    public void adicionarQualquerPosicao(int posicao, T elemento){

        if(posicao < 0 || posicao > this.tamanho){
            throw new IllegalArgumentException("Posição inválida");
        }

        if(posicao == 0){ // esta vazia
            this.adicionaInicio(elemento);

        } else if (posicao == this.tamanho) {
            this.adiciona(elemento);
        }else{
            No<T> noAnterior = this.buscaNo(posicao);
            No<T> proximoNo = noAnterior.getProximo();
            No<T> novoNo = new No<>(elemento, proximoNo);
            noAnterior.setProximo(novoNo);
            this.tamanho++;

        }
    }

    public void removeInicio(){
        if(this.tamanho == 0){
            throw new RuntimeException("Lista esta vazia.");
        }else{
            this.inicio = this.inicio.getProximo();
            this.tamanho --;
            if(this.tamanho == 0){
                this.ultimo = null;
            }
        }
    }

    public void removeFinal() {
        if (this.tamanho == 0) {
            throw new RuntimeException("Lista esta vazia.");
        }else if (this.tamanho == 1) {
            this.removeInicio();
        }else{
            No<T> penultimoNo = this.buscaNo(this.tamanho - 2);
            penultimoNo.setProximo(null);
            this.ultimo = penultimoNo;
            this.tamanho --;
        }
    }

    public void removeQualquerPosicao(int posicao){
        if(posicao < 0 || posicao > this.tamanho){
            throw new IllegalArgumentException("Posição inválida");
        } else if (posicao == 0) {
            this.removeInicio();
        } else if (posicao == this.tamanho -1 ) {
            this.removeFinal();
        }else {
            No<T> noAnterior = this.buscaNo(posicao -1 );
            No<T> atual = noAnterior.getProximo();
            No<T> proximo = atual.getProximo();
            noAnterior.setProximo(proximo);
            this.tamanho --;
        }

    }

    public int getTamanho(){
        return this.tamanho;
    }

    public void limpa(){

        for(No<T> atual = this.inicio; atual != null;){
            No<T> proximo = atual.getProximo();
            atual.setElemento(null);
            atual.setProximo(null);
            atual = proximo;
        }

        // Também funciona.
        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    private No<T> buscaNo(int posicao){
        if(!(posicao >= 0 && posicao <= this.tamanho)){
            throw new IllegalArgumentException("Posição não existe!");
        }

        No<T> noAtual = this.inicio;
        for (int i = 0; i<posicao; i++){
            noAtual = noAtual.getProximo();
        }

        return noAtual;
    }

    public T buscaPorPosicao (int posicao){
        return  this.buscaNo(posicao).getElemento();
    }
    public int busca(T elemento){

        No<T> noAtual = this.inicio;
        int pos = 0;

        while(noAtual != null){
            if(noAtual.getElemento().equals(elemento)){
                return pos;
            }
            pos ++;
            noAtual = noAtual.getProximo();
        }

        return -1;
    }

    @Override
    public String toString() {
        if(this.tamanho == 0){
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        No<T> atual = this.inicio;
        for (int i=0; i<this.tamanho; i++){
            sb.append(atual.getElemento()).append(",");
            atual = atual.getProximo();
        }

        return sb.toString();
    }
}
