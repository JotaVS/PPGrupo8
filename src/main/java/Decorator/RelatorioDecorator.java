package Decorator;

public class RelatorioDecorator implements Relatorio{

    protected Relatorio relatorioDecorado;

    public RelatorioDecorator (Relatorio decoratedReport) {
        this.relatorioDecorado = decoratedReport;
    }

    @Override
    public String gerarRelatorio(){
        return relatorioDecorado.gerarRelatorio();
    }

    @Override
    public int getValorComplexidade() {
        return relatorioDecorado.getValorComplexidade();
    }
}
