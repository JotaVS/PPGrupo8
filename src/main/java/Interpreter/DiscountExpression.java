package Interpreter;

class DiscountExpression implements Expression {
    private int discount;
    private int originalPrice;

    public DiscountExpression(int discount, int originalPrice) {
        this.discount = discount;
        this.originalPrice = originalPrice;
    }

    @Override
    public String interpret() {
        int discountedPrice = originalPrice - discount;
        return "Aplicando desconto de " + discount + "R$. Valor final após desconto: " + discountedPrice +"R$.";
    }
}