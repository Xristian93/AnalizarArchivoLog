import org.junit.Before;

import org.junit.After;

import org.junit.Test;

import static org.junit.Assert.*;


public class UnitTestsR400 {

    

    @Test

    public void test01() {

        EjercicioR400 calculator = new EjercicioR400("29");

        long expectedProduct = 18;

        long actualProduct = calculator.encontrarProductoMasAlto(2);

        assertEquals(expectedProduct, actualProduct);


        calculator = new EjercicioR400("0123456789");

        expectedProduct = 72;

        actualProduct = calculator.encontrarProductoMasAlto(2);

        assertEquals(expectedProduct, actualProduct);


        calculator = new EjercicioR400("576802143");

        expectedProduct = 48;

        actualProduct = calculator.encontrarProductoMasAlto(2);

        assertEquals(expectedProduct, actualProduct);


        calculator = new EjercicioR400("0123456789");

        expectedProduct = 504;

        actualProduct = calculator.encontrarProductoMasAlto(3);

        assertEquals(expectedProduct, actualProduct);


        calculator = new EjercicioR400("1027839564");

        expectedProduct = 270;

        actualProduct = calculator.encontrarProductoMasAlto(3);

        assertEquals(expectedProduct, actualProduct);


        calculator = new EjercicioR400("0123456789");

        expectedProduct = 15120;

        actualProduct = calculator.encontrarProductoMasAlto(5);

        assertEquals(expectedProduct, actualProduct);


        calculator = new EjercicioR400("73167176531330624919225119674426574742355349194934");

        expectedProduct = 23520;

        actualProduct = calculator.encontrarProductoMasAlto(6);

        assertEquals(expectedProduct, actualProduct);


        calculator = new EjercicioR400("0000");

        expectedProduct = 0;

        actualProduct = calculator.encontrarProductoMasAlto(2);

        assertEquals(expectedProduct, actualProduct);


        calculator = new EjercicioR400("99099");

        expectedProduct = 0;

        actualProduct = calculator.encontrarProductoMasAlto(3);

        assertEquals(expectedProduct, actualProduct);


        calculator = new EjercicioR400("123");

        expectedProduct = -1;

        actualProduct = calculator.encontrarProductoMasAlto(4);

        assertEquals(expectedProduct, actualProduct);


        calculator = new EjercicioR400("");

        expectedProduct = -1;

        actualProduct = calculator.encontrarProductoMasAlto(0);

        assertEquals(expectedProduct, actualProduct);


        calculator = new EjercicioR400("123");

        expectedProduct = -1;

        actualProduct = calculator.encontrarProductoMasAlto(0);

        assertEquals(expectedProduct, actualProduct);


        calculator = new EjercicioR400("");

        expectedProduct = -1;

        actualProduct = calculator.encontrarProductoMasAlto(1);

        assertEquals(expectedProduct, actualProduct);


        calculator = new EjercicioR400("12a3");

        expectedProduct = -1;

        actualProduct = calculator.encontrarProductoMasAlto(0);

        assertEquals(expectedProduct, actualProduct);


        calculator = new EjercicioR400("");

        expectedProduct = -1;

        actualProduct = calculator.encontrarProductoMasAlto(-1);

        assertEquals(expectedProduct, actualProduct);

    }

}