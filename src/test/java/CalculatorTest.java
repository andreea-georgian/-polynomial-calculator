import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Model theModel = new Model();
    Polinom p1 = new Polinom();
    Polinom p2 = new Polinom();
    Polinom res = new Polinom();

    @BeforeEach
    public void setUp() {
        p1.monomial.clear();
        p2.monomial.clear();
        res.monomial.clear();

        p1.monomial.add(new Monomial(5, 1));
        p1.monomial.add(new Monomial(2, 0));
        theModel.setP1(p1);

        p2.monomial.add(new Monomial(5, 3));
        p2.monomial.add(new Monomial(8, 0));
        theModel.setP2(p2);
    }

    @Test
    public void testAdd()
    {
        res.monomial.add(new Monomial(5, 3));
        res.monomial.add(new Monomial(5, 1));
        res.monomial.add(new Monomial(10, 0));

        for (int i = 0; i < res.monomial.size(); i++) {
            assertEquals(res.monomial.get(i).getGrad(), theModel.adunareP().monomial.get(i).getGrad());
            assertEquals(res.monomial.get(i).getCoef(), theModel.adunareP().monomial.get(i).getCoef());
        }
    }

    @Test
    public void testSub()
    {
        res.monomial.add(new Monomial(-5, 3));
        res.monomial.add(new Monomial(5, 1));
        res.monomial.add(new Monomial(-6, 0));

        Polinom res2 = theModel.scadereP();

        for (int i = 0; i < res.monomial.size(); i++) {
            assertEquals(res.monomial.get(i).getGrad(), res2.monomial.get(i).getGrad());
            assertEquals(res.monomial.get(i).getCoef(), res2.monomial.get(i).getCoef());
        }

    }

    @Test
    public void testMultiplicate()
    {
        res.monomial.add(new Monomial(25, 4));
        res.monomial.add(new Monomial(10,3));
        res.monomial.add(new Monomial(40, 1));
        res.monomial.add(new Monomial(16, 0));

        for (int i = 0; i < res.monomial.size(); i++) {
            assertEquals(res.monomial.get(i).getGrad(), theModel.inmulireP().monomial.get(i).getGrad());
            assertEquals(res.monomial.get(i).getCoef(), theModel.inmulireP().monomial.get(i).getCoef());
        }
    }

    @Test
    public void testDivide()
    {
        p1.monomial.clear();
        p2.monomial.clear();
        res.monomial.clear();

        p1.monomial.add(new Monomial(1, 3));
        p1.monomial.add(new Monomial(-2, 2));
        p1.monomial.add(new Monomial(6, 1));
        p1.monomial.add(new Monomial(-5, 0));
        theModel.setP1(p1);

        p2.monomial.add(new Monomial(1, 2));
        p2.monomial.add(new Monomial(-1, 0));
        theModel.setP2(p2);

        res.monomial.add(new Monomial(1, 1));
        res.monomial.add(new Monomial(-2,0));

        for (int i = 0; i < res.monomial.size(); i++) {
            assertEquals(res.monomial.get(i).getGrad(), theModel.impartireP().getP1().monomial.get(i).getGrad());
            assertEquals(res.monomial.get(i).getCoef(), theModel.impartireP().getP1().monomial.get(i).getCoef());
        }
    }

    @Test
    public void testDerivate()
    {
        res.monomial.add(new Monomial(15, 2));

        assertEquals(res.monomial.get(0).getGrad(), theModel.getP2().derivare().monomial.get(0).getGrad());
        assertEquals(res.monomial.get(0).getCoef(), theModel.getP2().derivare().monomial.get(0).getCoef());
    }

    @Test
    public void testIntegrate()
    {
        res.monomial.add(new Monomial(5.0/4.0, 4));
        res.monomial.add(new Monomial(8, 1));

        assertEquals(res.monomial.get(0).getGrad(), theModel.getP2().integrare().monomial.get(0).getGrad());
        assertEquals(res.monomial.get(0).getCoef(), theModel.getP2().integrare().monomial.get(0).getCoef());
    }
}
