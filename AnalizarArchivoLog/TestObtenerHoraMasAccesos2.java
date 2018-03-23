import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestObtenerHoraMasAccesos.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestObtenerHoraMasAccesos2
{
    /**
     * Default constructor for test class TestObtenerHoraMasAccesos
     */
    public TestObtenerHoraMasAccesos2()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testObtenerHoraMasAccesos2()
    {
        AnalizadorAccesosAServidor analizad1 = new AnalizadorAccesosAServidor();
        analizad1.analizarArchivoDeLog("access02.log");
        assertEquals(3, analizad1.obtenerHoraMasAccesos());
    }
}

