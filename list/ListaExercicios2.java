import java.util.*;

public class ListaExercicios2 {
    public static void main(String[] args) {

        List<Cachorro> meusCachorros = new ArrayList<>(){{
            add(new Cachorro("ragnar", "pitbull", 13, "cinza", "F"));
            add(new Cachorro("julio", "pinch", 2, "azul", "F"));
            add(new Cachorro("lara", "buldogue", 14, "amarelo", "M"));
            add(new Cachorro("lincon", "pitbull", 9, "pardo", "M"));
            add(new Cachorro("fe", "labrador", 7, "vermelho", "M"));
            add(new Cachorro("bolinha", "viralata", 6, "verde", "F"));
            add(new Cachorro("noite", "poodle", 7, "preto", "M"));
            add(new Cachorro("furia", "maltes", 15, "branco", "F"));
            add(new Cachorro("coragem", "chowchow", 20, "marrom", "M"));
            add(new Cachorro("valente", "dobermann", 13, "caramelo", "F"));
        }};

        System.out.println(meusCachorros + "\n\n");

        Collections.shuffle(meusCachorros); /*ordem aleatória */
        System.out.println(meusCachorros + "\n\n");

        Collections.sort(meusCachorros);
        System.out.println(meusCachorros + "\n\n");

        Collections.sort(meusCachorros, new ComparatorIdade());
    //    meusCachorros.sort(new ComparatorIdade);
        System.out.println(meusCachorros);

        Collections.sort(meusCachorros, new ComparatorCor());
        System.out.println(meusCachorros);

        Collections.sort(meusCachorros, new ComparatorNomeCorIdade());
        System.out.println(meusCachorros);

    }
}

class Cachorro implements Comparable<Cachorro>{
    private String nome;
    private String raca;
    private Integer idade;
    private String cor;
    private String sexo;

    public Cachorro(String nome, String raca, Integer idade, String cor, String sexo) {
        this.nome =  nome;
        this.raca = raca;
        this.idade = idade;
        this.cor = cor;
        this.sexo = sexo;
        
    }
    
    public String getNome() {
        return nome;
    }
    public String getRaca() {
        return raca;
    }
    public Integer getIdade() {
        return idade;
    }
    public String getCor() {
        return cor;
    }
    public String getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return "{" + 
                " nome = '" + nome + '\'' +
                ", raca = '" + raca + '\'' +
                ", idade = '" + idade + '\'' +
                ", cor = '" + cor + '\'' +
                ", sexo = '" + sexo + '\'' + 
                "}" + "\n";
    }

    @Override
    public int compareTo(Cachorro cachorro) {
        return this.getNome().compareToIgnoreCase(cachorro.getNome());
    } 
}

class ComparatorIdade implements Comparator<Cachorro> {
    @Override
    public int compare(Cachorro c1, Cachorro c2) {
        return Integer.compare(c1.getIdade(), c2.getIdade());
    }
}

class ComparatorCor implements Comparator<Cachorro> {
    @Override
    public int compare( Cachorro c1, Cachorro c2 ) {
        return c1.getCor().compareToIgnoreCase(c2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Cachorro>{
    @Override
    public int compare(Cachorro c1, Cachorro c2) {
        int nome = c1.getNome().compareToIgnoreCase(c2.getNome());
        if( nome != 0) return nome;
        
        int cor = c1.getCor().compareToIgnoreCase((c2.getCor()));
        if(cor != 0) return cor;

        return Integer.compare(c1.getIdade(), c2.getIdade());
    }
}