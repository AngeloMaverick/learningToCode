package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	// Stream é uma sequencia de elementos que suporta operações sequenciais e
	// paralelas sem precisar ficar declarando cada detalhe

	public static void main(String[] args) {

		Consumer<Object> print = System.out::print;

		// Criando e exibindo uma Stream de Strings
		Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
		langs.forEach(print);

		// Exibindo um array de Strings com o Stream
		String[] maisLangs = { "Python ", "Lisp ", "Perl ", "Go\n" };
		Stream.of(maisLangs).forEach(print);

		// Exibindo apartir de Arrays.stream
		Arrays.stream(maisLangs).forEach(print);

		// Exibindo o segundo ao quarto item de maisLangs
		// (O segundo parãmetro é o índice que começa e o segundo é o índice onde
		// termina sem contar com ele)
		Arrays.stream(maisLangs, 1, 4).forEach(print);

		// Outra forma de exibir
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print);

		// Stream de processamento paralelo
		outrasLangs.parallelStream().forEach(print);

		// Geração de "a" indefinidamente
		// Stream.generate(() -> "a").forEach(print);

		// Iterador infinito
		// Stream.iterate(0, n -> n + 1).forEach(print);
		;
		;
	}
}
