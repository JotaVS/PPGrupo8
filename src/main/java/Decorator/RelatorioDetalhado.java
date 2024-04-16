package Decorator;

public class RelatorioDetalhado extends RelatorioDecorator{
    public RelatorioDetalhado(Relatorio relatorioDecorado) {
        super(relatorioDecorado);
    }

    @Override
    public String gerarRelatorio() {
        return super.gerarRelatorio() + " com detalhes adicionados";
    }

    @Override
    public int getValorComplexidade() {
        return super.getValorComplexidade() + 1;
    }
}
