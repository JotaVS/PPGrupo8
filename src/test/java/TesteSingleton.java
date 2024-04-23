import Singleton.GerenciadorCache;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TesteSingleton {

    @Test
    public void testPutAndGet() {
        GerenciadorCache gerenciadorCache = GerenciadorCache.getInstance();

        gerenciadorCache.put("chaveTeste", "valorTeste");

        assertEquals("valorTeste", gerenciadorCache.get("chaveTeste"));
    }

    @Test
    public void testContains() {
        GerenciadorCache gerenciadorCache = GerenciadorCache.getInstance();

        gerenciadorCache.put("chaveTeste", 123);

        assertTrue(gerenciadorCache.contains("chaveTeste"));
    }

    @Test
    public void testRemove() {
        GerenciadorCache gerenciadorCache = GerenciadorCache.getInstance();

        gerenciadorCache.put("chaveTeste", "valorTeste");

        gerenciadorCache.remove("chaveTeste");

        assertFalse(gerenciadorCache.contains("chaveTeste"));
    }
}
