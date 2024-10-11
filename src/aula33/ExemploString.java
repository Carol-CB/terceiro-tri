package aula33;

public class ExemploString {
    public static void main(String[] args) {
        String nome = "Jonas ";
        String sobrenome = "Silva";
        String nomeCompleto = nome.concat(sobrenome);
        System.out.println("Nome completo: "+nomeCompleto);
        nomeCompleto = nomeCompleto.toUpperCase();
        System.out.println(nomeCompleto);
        nomeCompleto = nomeCompleto.toLowerCase();
        System.out.println(nomeCompleto);
        System.out.println("Qual a posição da letra 'a' na string? "+nomeCompleto.indexOf("a"));
        System.out.println("Qual a última posição da letra 'a' na string? "+nomeCompleto.lastIndexOf("a"));
        System.out.println("A string inicia com a letra 'j'? "+nomeCompleto.startsWith("j"));
        System.out.println("A string termina com a letra 'a'? "+nomeCompleto.endsWith("a"));

        String frase = "aula de programação";
        System.out.println(frase);
        frase = frase.replace("programação", "chat api");
        System.out.println(frase);
        String[] vetor = frase.split(" ");
        for(String palavra:vetor){
            System.out.println(palavra);
        }
    }
}
