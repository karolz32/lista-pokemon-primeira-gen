package exerciciocomparator;
//fazer uma lista de um objeto complexo e ordenar com comparator
//objeto complexo: pokemon
public class Pokemon implements Comparable<Pokemon>{

    private final Integer numero;
    private final String nome;
    private final String tipo;

    public Pokemon(Integer numero, String nome, String tipo) {  //ao ser chamado por outra classe, constroi um pokemon contendo os atributos numero, nome e tipo
        this.numero = numero;
        this.nome = nome;
        this.tipo = tipo;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getNome() {  //ao ser chamado por outra classe getNome retorna o nome contido na variavel
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "\n" + numero + " - " + nome + ": " + tipo;
    }

    @Override
    public int compareTo(Pokemon o) {
        return this.getNumero() - o.getNumero();
    }
}
