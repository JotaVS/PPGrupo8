package Interpreter;

public class Interpreter {
    public String interpret(String context) {
        String[] parts = context.split(" ");
        String key = parts[0];

        if (key.equals("desconto")) {
            int value1 = Integer.parseInt(parts[1]);
            int value2 = Integer.parseInt(parts[2]);
            Expression expression = new DiscountExpression(value1, value2);
            return expression.interpret();
        } else if (key.equals("promoção")) {
            String promotion = parts[1];
            int originalPrice = Integer.parseInt(parts[2]);
            Expression expression = new PromotionExpression(promotion, originalPrice);
            return expression.interpret();
        } else {
            return "Expressão não reconhecida.";
        }
    }
}