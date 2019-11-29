import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit tests para a classe Calc que representa uma simples calculadora
 */
class CalcTest {

    @Test
    void testSomar() {
        // Instancia a classe Calc
        Calc c = new Calc();
        // Chama o método somar da classe e armazena na variável res
        int res = c.somar(1,1);
        // Com o Junit realizamos o unit test para ter certeza que a implementação está conforme esperado
        assertEquals(2, res);
    }

    /**
     * Testes unitários conforme acima para o método Subtrair
     */
    @Test
    void testSubtrair() {
        Calc c = new Calc();
        int res = c.subtrair(1,1);
        assertEquals(0, res);
    }

    /**
     * Testes unitários conforme acima para o método Dividir
     */
    @Test
    void testDividir() {
        Calc c = new Calc();
        double res = c.dividir(2,2);
        assertEquals(1, res);
    }
}