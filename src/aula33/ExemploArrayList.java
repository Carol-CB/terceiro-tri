package aula33;
import java.util.List;
import java.util.ArrayList;
public class ExemploArrayList {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        //adicionar um elemento na lista
        lista.add("A");
        lista.add("C");
        lista.add("F");
        lista.add("B");
        lista.add("E");
        //adicionando um elemento em uma posição
        lista.add(3,"D");
        System.out.println(lista);
        lista.sort(null);
        System.out.println(lista);
        System.out.println("A lista tem um 'T'? "+lista.contains("T"));
        System.out.println("Onde está o 'D' na lista? "+lista.indexOf("D"));
        System.out.println("Onde está a última ocorrência de 'C' na lista? "+lista.lastIndexOf("C"));
        System.out.println("Removendo o elemento da posição 2: "+lista.remove(2));
        System.out.println("Removendo o elemento 'A': "+lista.remove("A"));
        System.out.println(lista);
        System.out.println("A lista está vazia? "+lista.isEmpty());
        lista.clear();
        System.out.println("A lista está vazia? "+lista.isEmpty());
    }
}
