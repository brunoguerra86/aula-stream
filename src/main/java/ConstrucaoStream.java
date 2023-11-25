import java.util.stream.Stream;

public class ConstrucaoStream {
    public static void main(String[] args) {
        Stream<Number> notas = Stream.of(10,10,9.6,8.2,9.7,10);
        notas.forEach(System.out::println);

        System.out.println("********** <hr/> **********");

        Number[] maisnotas = {7, 6.5, 7.2, 9};
        Stream.of(maisnotas).forEach(System.out::println);
    }
}
