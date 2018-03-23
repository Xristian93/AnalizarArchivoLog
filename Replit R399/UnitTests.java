import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

import java.util.Arrays;


public class UnitTests {

  

  public void test01() 

  {

    // Failure message:  

    // Tu codigo no pasa los tests


    EjercicioR399 objetoBase = new EjercicioR399(); 

    ArrayList<String> origen = new ArrayList<>(Arrays.asList("Madrid", "Roma", "Pekin", "Leon", "Barcelona")); assertEquals("Barcelona", objetoBase.encontrarPalabraConMasAes(origen)); origen = new ArrayList<>(Arrays.asList("Santander", "Roma", "Pekin", "Roma", "Barcelona")); assertEquals("Barcelona", objetoBase.encontrarPalabraConMasAes(origen)); origen = new ArrayList<>(Arrays.asList("Leon", "Jerez", "Oviedo")); assertNull(objetoBase.encontrarPalabraConMasAes(origen)); origen = new ArrayList<>(); assertNull(objetoBase.encontrarPalabraConMasAes(origen)); }


}