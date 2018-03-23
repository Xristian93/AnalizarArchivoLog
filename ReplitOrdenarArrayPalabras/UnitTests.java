import org.junit.Before;

import org.junit.After;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import java.util.Arrays;


public class UnitTests {


    @Test

    public void test01() {

        // Failure message: 

        // Tu codigo no pasa los tests

        EjercicioR207 ejercici1 = new EjercicioR207();


        ArrayList<String> origen = new ArrayList<>(Arrays.asList("Mesa","Silla","Ordenador","Futbolin","Libros","Berenjenas"));

        String resultadoEsperado = "Berenjenas,Ordenador,Futbolin,Libros,Silla,Mesa";

        assertEquals(resultadoEsperado, ejercici1.devolverEnOrden(origen));


        origen = new ArrayList<>(Arrays.asList("Mesas","Silla","Ordenador","Esquinera","Libros","Berenjenas"));

        resultadoEsperado = "Berenjenas,Esquinera,Ordenador,Libros,Silla,Mesas";

        assertEquals(resultadoEsperado, ejercici1.devolverEnOrden(origen));


        origen = new ArrayList<>();

        resultadoEsperado = "";

        assertEquals(resultadoEsperado, ejercici1.devolverEnOrden(origen));

        //prueba

    }

}