import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

import java.util.ArrayList;


public class UnitTests {

  

  @Test public void testName() {

    // Failure message:  

    // Tu codigo no pasa los testsEjercicioR405 

    EjercicioR405 objetoBase = new EjercicioR405(); 

    ArrayList<String> origen = new ArrayList<>(Arrays.asList("Madrid", "Roma", "Pekin", "Roma", "Barcelona")); 

    assertEquals("Roma", objetoBase.encontrarPalabraRepetida(origen)); 

    origen = new ArrayList<>(Arrays.asList("Madrid", "Roma", "Pekin", "Barcelona")); 

    assertNull(objetoBase.encontrarPalabraRepetida(origen)); 

    origen = new ArrayList<>(); 

    assertNull(objetoBase.encontrarPalabraRepetida(origen)); 

  }

}