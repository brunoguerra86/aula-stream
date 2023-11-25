import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Startup {
    public static void main(String[] args) {
        List<String> estudantes = Arrays.asList("Bruno", "Mayara", "Pedro", "Francisco");

        // ---------- FOREACH ----------

        System.out.println("***** Utilizando o foreach *****");

        for(String nome: estudantes){
            System.out.println("Estudante: " + nome);
        }

        // ---------- ITERATOR ----------

        System.out.println("***** Utilizando o iterator *****");

        Iterator<String> iterator = estudantes.iterator();

        while (iterator.hasNext()){
            System.out.println("Estudante: " + iterator.next());
        }

        // ---------- STREAM ----------

        System.out.println("***** Utilizando a stream *****");

        Stream<String> stream = estudantes.stream();
        stream.forEach(System.out::println);

    }
}
