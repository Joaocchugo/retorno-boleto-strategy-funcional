import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;

public class Principal {
    public static void main(String[] args) throws URISyntaxException {
        // Processa Banco do Brasil
        final var processadorBB = new ProcessadorBoletos(ProcessadorBoletos::lerBancoBrasil);
        URI caminhoArquivoBB = Principal.class.getResource("banco-brasil-1.csv").toURI();
        processadorBB.processar(caminhoArquivoBB);

        System.out.println("\n============================\n");

        // Processa Bradesco
        final var processadorBradesco = new ProcessadorBoletos(ProcessadorBoletos::lerBancoBradesco);
        URI caminhoArquivoBradesco = Principal.class.getResource("bradesco-1.csv").toURI();
        processadorBradesco.processar(caminhoArquivoBradesco);
    }
}


















