package aula32;

public class Lista<T> {
    private T[] elementos;
    private int tamanho;
    public Lista(){
        this(10);
    }

    public Lista(int capacidade){
        elementos = (T[]) new Object[capacidade];
        tamanho = 0;
    }

    private void aumentaCapacide(){
        if(tamanho == elementos.length){
            T[] aux = (T[]) new Object[tamanho * 2];
            System.arraycopy(elementos, 0, aux, 0, tamanho);
            elementos = aux;
        }
    }

    public void adiciona(T elemento){
        aumentaCapacide();
        elementos[tamanho++] = elemento;
    }

    public void adiciona(int posicao, T elemento){
        if(posicao < 0 || posicao >= tamanho)
            throw new IllegalArgumentException("Posição " + posicao + " é inválida");
        aumentaCapacide();
        for(int i = tamanho - 1; i >= posicao; i--)
            elementos[i + 1] = elementos[i];
        elementos[posicao] = elemento;
        tamanho++;
    }

    public boolean contem(T elemento){
        for(int i = 0; i < tamanho; i++){
            if(elementos[i].equals(elemento)){
                return true;
            }
        }
        return false;
    }

    public boolean remover(T elemento){
        int posicao = posicaoDe(elemento);
        if(posicao >= 0){
            remove(posicao);
            return true;
        }
        return false;
    }

    public void limpar(){
        elementos = (T[]) new Object[elementos.length];
        tamanho = 0;
    }

    public int tamanho(){
        return tamanho;
    }

    public boolean estaVazia(){
        return tamanho == 0;
    }

    public int ultimaPosicaoElemento(T elemento){
        for(int i = tamanho - 1; i >= 0; i--) {
            if (elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public int posicaoDe(T elemento){
        for(int i = 0; i < tamanho; i++){
            if(elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    public T obter(int posicao){
        if(posicao < 0 || posicao >= tamanho)
            throw new IllegalArgumentException("Posição " + posicao + " é inválida");
        return elementos[posicao];
    }

    public T remove(int posicao){
        if(posicao < 0 || posicao >= tamanho)
            throw new IllegalArgumentException("Posição " + posicao + " é inválida");
        T elemento = elementos[posicao];
        for(int i = posicao; i < tamanho - 1; i++){
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
        return elemento;
    }

    @Override
    public String toString(){
        StringBuilder retorno = new StringBuilder("[");
        if(tamanho > 0){
            for(int i = 0; i < tamanho - 1; i++){
                retorno.append(elementos[i]).append(", ");
            }
            retorno.append(elementos[tamanho - 1]);
        }
        retorno.append("]");
        return retorno.toString();
    }
}