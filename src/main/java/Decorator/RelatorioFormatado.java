package Decorator;

public class RelatorioFormatado extends RelatorioDecorator{
    public RelatorioFormatado(Relatorio relatorioDecorado) {
        super(relatorioDecorado);
    }

    @Override
    public String gerarRelatorio() {
        return "Relatório formatado: " + super.gerarRelatorio();
    }

    @Override
    public int getValorComplexidade() {
        return super.getValorComplexidade() + 1;
    }}
