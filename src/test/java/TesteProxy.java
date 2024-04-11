import Proxy.ISistemaArquivos;
import Proxy.LogProxy;
import Proxy.SistemaArquivosReal;
import Proxy.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteProxy {
    @Test
    public void testProxy() {
        ISistemaArquivos fileSystem = new SistemaArquivosReal();
        ISistemaArquivos proxy = new LogProxy(fileSystem);
        User user = new User("Bob");

        // Teste de leitura de arquivo
        assertEquals("Operação de Leitura em arquivo 'documento.txt' registrada por Bob em 2024-04-09T12:00:00",
                proxy.readFile("documento.txt", user));

        // Teste de escrita de arquivo
        assertEquals("Operação de Escrita em arquivo 'novo_documento.txt' registrada por Bob em 2024-04-09T12:00:00",
                proxy.writeFile("novo_documento.txt", user));

        // Teste de exclusão de arquivo
        assertEquals("Operação de Exclusão em arquivo 'documento.txt' registrada por Bob em 2024-04-09T12:00:00",
                proxy.deleteFile("documento.txt", user));
    }
}
