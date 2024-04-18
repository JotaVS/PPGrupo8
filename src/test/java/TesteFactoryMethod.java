import FactoryMethod.IRespostaHttp;
import FactoryMethod.RespostaHttpFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TesteFactoryMethod {
    @Test
    public void testCreateHtmlResponse() {
        IRespostaHttp resposta = RespostaHttpFactory.criarResposta("html");
        assertNotNull(resposta);
        assertEquals("<html><body><h1>Hello, World!</h1></body></html>", resposta.gerarResposta());

    }

    @Test
    public void testCreateJsonResponse() {
        IRespostaHttp resposta = RespostaHttpFactory.criarResposta("json");
        assertNotNull(resposta);
        assertEquals("{\"message\": \"Hello, World!\"}", resposta.gerarResposta());

    }

    @Test
    public void testCreateXmlResponse() {
        IRespostaHttp resposta = RespostaHttpFactory.criarResposta("xml");
        assertNotNull(resposta);
        assertEquals("<message>Hello, World!</message>", resposta.gerarResposta());

    }

    @Test
    public void testUnknownResponseType() {
        try {
            RespostaHttpFactory.criarResposta("csv");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Tipo de resposta desconhecido: csv", e.getMessage());
        }
    }
}
