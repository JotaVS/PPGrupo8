package Interpreter;

class PromotionExpression implements Expression {
    private String promotion;
    private int originalPrice;
    private String discount;

    public PromotionExpression(String promotion, int originalPrice) {
        this.promotion = promotion;
        this.originalPrice = originalPrice;
    }

    @Override
    public String interpret() {
        if (promotion.equals("natal")) {
            discount = "15%";
        } else if (promotion.equals("pascoa")) {
            discount = "5%";
        } else {
            return "Promoção Desconhecida!";
        }
        return "Aplicando desconto de " + discount + " devido a promoção de " + promotion + " na Compra de Valor " + originalPrice + "R$ .";
    }
}
