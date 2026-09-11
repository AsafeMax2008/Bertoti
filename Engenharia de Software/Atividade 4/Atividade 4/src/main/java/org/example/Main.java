import io.github.ollama4j.Ollama;
import io.github.ollama4j.models.generate.OllamaGenerateRequest;

public class Main {
    public static void main(String[] args) throws Exception {
        Ollama ollama = new Ollama("http://localhost:11434");

        OllamaGenerateRequest request = new OllamaGenerateRequest(
                "llama3.2",
                "Me mostre os primeros 30 digitos de pi"
        );

        String resposta = ollama.generate(request, null).getResponse();

        System.out.println(resposta);
    }
}