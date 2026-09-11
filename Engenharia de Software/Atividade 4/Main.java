import io.github.ollama4j.Ollama;
import io.github.ollama4j.models.generate.OllamaGenerateRequest;

public class Main {
    public static void main(String[] args) throws Exception {
        Ollama ollama = new Ollama("http://localhost:11434");

        OllamaGenerateRequest request = new OllamaGenerateRequest(
                "llama3.2",
                "Qual o caminho mais rápido e plausível para a paz mundial?"
        );

        String resposta = ollama.generate(request, null).getResponse();

        System.out.println(resposta);
    }
}