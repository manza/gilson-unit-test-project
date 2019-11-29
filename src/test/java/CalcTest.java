import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void testSomar() {
        Calc c = new Calc();
        int res = c.somar(1,1);
        assertEquals(2, res);
    }

    @Test
    void testSubtrair() {
        Calc c = new Calc();
        int res = c.subtrair(1,1);
        assertEquals(0, res);
    }

    @Test
    void testDividir() {
        Calc c = new Calc();
        double res = c.dividir(2,2);
        assertEquals(1, res);
    }
}