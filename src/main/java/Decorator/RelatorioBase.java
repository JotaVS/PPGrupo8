package Decorator;

public class RelatorioBase implements Relatorio{
    private int valor = 0;

    @Override
    public String gerarRelatorio() {
        return "Relatório básico gerado";
    }

    @Override
    public int getValorComplexidade() {
        return valor;
    }
}
