import Decorator.Relatorio;
import Decorator.RelatorioBase;
import Decorator.RelatorioDetalhado;
import Decorator.RelatorioFormatado;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TesteDecorator {
    @Test
    public void testeGerarRelatorioBase() {
        Relatorio relatorio = new RelatorioBase();
        assertEquals("Relatório básico gerado", relatorio.gerarRelatorio());
    }

    @Test
    public void testeGetValorComplexidadeBase() {
        Relatorio relatorio = new RelatorioBase();
        assertEquals(0, relatorio.getValorComplexidade());
    }

    @Test
    public void testeGerarRelatorioDetalhado() {
        Relatorio relatorio = new RelatorioBase();
        Relatorio relatorioDetalhado = new RelatorioDetalhado(relatorio);
        assertEquals("Relatório básico gerado com detalhes adicionados", relatorioDetalhado.gerarRelatorio());
    }

    @Test
    public void testeGetValorComplexidadeDetalhado() {
        Relatorio relatorio = new RelatorioBase();
        Relatorio relatorioDetalhado = new RelatorioDetalhado(relatorio);
        assertEquals(1, relatorioDetalhado.getValorComplexidade());
    }

    @Test
    public void testeGerarRelatorioFormatado() {
        Relatorio relatorio = new RelatorioBase();
        Relatorio relatorioFormatado = new RelatorioFormatado(relatorio);
        assertEquals("Relatório formatado: Relatório básico gerado", relatorioFormatado.gerarRelatorio());
    }

    @Test
    public void testeGetValorComplexidadeFormatado() {
        Relatorio relatorio = new RelatorioBase();
        Relatorio relatorioFormatado = new RelatorioFormatado(relatorio);
        assertEquals(1, relatorioFormatado.getValorComplexidade());
    }
}
