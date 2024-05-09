import static org.junit.jupiter.api.Assertions.assertEquals;

import Interpreter.Interpreter;
import org.junit.jupiter.api.Test;

public class TesteInterpreter {

    @Test
    public void testDiscountExpression() {
        Interpreter interpreter = new Interpreter();

        String input = "desconto 50 200";
        String expectedOutput = "Aplicando desconto de 50R$. Valor final após desconto: 150R$.";
        assertEquals(expectedOutput, interpreter.interpret(input));
    }

    @Test
    public void testPromotionExpressionNatal() {
        Interpreter interpreter = new Interpreter();

        String input = "promoção natal 200";
        String expectedOutput = "Aplicando desconto de 15% devido a promoção de natal na Compra de Valor 200R$ .";
        assertEquals(expectedOutput, interpreter.interpret(input));
    }

    @Test
    public void testPromotionExpressionPascoa() {
        Interpreter interpreter = new Interpreter();

        String input = "promoção pascoa 150";
        String expectedOutput = "Aplicando desconto de 5% devido a promoção de pascoa na Compra de Valor 150R$ .";
        assertEquals(expectedOutput, interpreter.interpret(input));
    }

    @Test
    public void testPromotionExpressionIncorrect() {
        Interpreter interpreter = new Interpreter();

        String input = "promoção hallowen 200";
        String expectedOutput = "Promoção Desconhecida!";
        assertEquals(expectedOutput, interpreter.interpret(input));
    }

    @Test
    public void testUnownExpression() {
        Interpreter interpreter = new Interpreter();

        String input = "gratuito";
        String expectedOutput = "Expressão não reconhecida.";
        assertEquals(expectedOutput, interpreter.interpret(input));
    }
}
