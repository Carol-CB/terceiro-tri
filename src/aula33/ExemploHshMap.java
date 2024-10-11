package aula33;
import java.util.HashMap;
public class ExemploHshMap {
    public static void main(String[] args) {
        HashMap<String, String> capitais = new HashMap<>(); //chave e objeto
        capitais.put("RS", "POA");
        capitais.put("PR", "Curitiba");
        capitais.put("SC", "Flores");
        System.out.println(capitais);
        capitais.put("RS", "Sao chico"); //muda o valor
        for(String estado:capitais.keySet()){
            System.out.println(estado+" ");
        }
        System.out.println("Lista de cidades");
        for(String cidade:capitais.values()){
            System.out.println(cidade+ " ");
        }

        System.out.println("Apagando a chave 'SC': "+capitais.remove("SC"));
        System.out.println("A lista tem a chave 'RS'? "+ capitais.containsKey("RS"));
        System.out.println("A lista tem uma cidade 'Flores'? "+capitais.containsValue("Curitiba"));
    }
}
