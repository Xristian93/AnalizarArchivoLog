
/**
 * Write a description of class TestCalendarioBasico here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestCalendarioBasico
{
    /**
     * Constructor for objects of class TestCalendarioBasico
     */
    public TestCalendarioBasico()
    {
    }

    public void realizarTests()
    {
        int numeroDeTests = 0;
        int numeroDeTestsOk = 0;
        int numeroDeTestsFail = 0;
        String proceso = "";

        CalendarioBasico calendario = new CalendarioBasico();

        numeroDeTests++;
        proceso = "Creando un calendario...";
        try {
            if (calendario.obtenerFecha().equals("01-01-01")) {
                numeroDeTestsOk++;
                System.out.printf("%-60.60s  %-30.30s%n", proceso, "OK");
            }
            else {
                numeroDeTestsFail++;
                System.out.printf("%-60.60s  %-30.30s%n", proceso, "FAIL!");           
            }
        }
        catch (Exception e) {
            numeroDeTestsFail++;            
            System.out.printf("%-60.60s  %-30.30s%n", proceso, "FAIL! (error en tiempo de ejecucion)"); 
        }

        numeroDeTests++;
        proceso = "Fijando la fecha 3-5-9...";
        try {
            calendario.fijarFecha(3, 5, 9);
            numeroDeTestsOk++;
            System.out.printf("%-60.60s  %-30.30s%n", proceso, "OK");      
        }
        catch (Exception e) {
            numeroDeTestsFail++;
            System.out.printf("%-60.60s  %-30.30s%n", proceso, "FAIL! (error en tiempo de ejecucion)");        

        }            

        numeroDeTests++;
        proceso = "Obteniendo la fecha almacenada (se espera \"03-05-09\")...";  
        try {
            if (calendario.obtenerFecha().equals("03-05-09")) {
                numeroDeTestsOk++;
                System.out.printf("%-60.60s  %-30.30s%n", proceso, "OK"); 
            }
            else {
                numeroDeTestsFail++;
                System.out.printf("%-60.60s  %-30.30s%n", proceso, "FAIL! Se obtuvo la fecha " + calendario.obtenerFecha());                            
            }    
        }
        catch (Exception e) {
            numeroDeTestsFail++;
            System.out.printf("%-60.60s  %-30.30s%n", proceso, "FAIL! (error en tiempo de ejecucion)");         

        }

        numeroDeTests++;
        proceso = "Fijando la fecha 13-11-17...";   
        try {
            calendario.fijarFecha(13, 11, 17);
            numeroDeTestsOk++;
            System.out.printf("%-60.60s  %-30.30s%n", proceso, "OK");       
        }
        catch (Exception e) {
            numeroDeTestsFail++;
            System.out.printf("%-60.60s  %-30.30s%n", proceso, "FAIL! (error en tiempo de ejecucion)");           

        }          

        numeroDeTests++;
        proceso = "Obteniendo la fecha almacenada (se espera \"13-11-17\")...";  
        try {
            if (calendario.obtenerFecha().equals("13-11-17")) {
                numeroDeTestsOk++;
                System.out.printf("%-60.60s  %-30.30s%n", proceso, "OK"); 
            }
            else {
                numeroDeTestsFail++;
                System.out.printf("%-60.60s  %-30.30s%n", proceso, "FAIL! Se obtuvo la fecha " + calendario.obtenerFecha());           
            }    
        }
        catch (Exception e) {
            numeroDeTestsFail++;
            System.out.printf("%-60.60s  %-30.30s%n", proceso, "FAIL! (error en tiempo de ejecucion)");        
        } 

        numeroDeTests++;
        proceso = "Avanzando un dia la fecha...";   
        try {
            calendario.avanzarFecha();
            numeroDeTestsOk++;
            System.out.printf("%-60.60s  %-30.30s%n", proceso, "OK");       
        }
        catch (Exception e) {
            numeroDeTestsFail++;
            System.out.printf("%-60.60s  %-30.30s%n", proceso, "FAIL! (error en tiempo de ejecucion)");         

        }   

        numeroDeTests++;
        proceso = "Obteniendo la fecha almacenada (se espera \"14-11-17\")...";  
        try {
            if (calendario.obtenerFecha().equals("14-11-17")) {
                numeroDeTestsOk++;
                System.out.printf("%-60.60s  %-30.30s%n", proceso, "OK"); 
            }
            else {
                numeroDeTestsFail++;
                System.out.printf("%-60.60s  %-30.30s%n", proceso, "FAIL! Se obtuvo la fecha " + calendario.obtenerFecha());            
            }    
        }
        catch (Exception e) {
            numeroDeTestsFail++;
            System.out.printf("%-60.60s  %-30.30s%n", proceso, "FAIL! (error en tiempo de ejecucion)");         
        } 

        numeroDeTests++;
        proceso = "Fijando la fecha 29-11-17...";   
        try {
            calendario.fijarFecha(29, 11, 17);
            numeroDeTestsOk++;
            System.out.printf("%-60.60s  %-30.30s%n", proceso, "OK");       
        }
        catch (Exception e) {
            numeroDeTestsFail++;
            System.out.printf("%-60.60s  %-30.30s%n", proceso, "FAIL! (error en tiempo de ejecucion)");         

        } 

        numeroDeTests++;
        proceso = "Avanzando un dia la fecha...";   
        try {
            calendario.avanzarFecha();
            numeroDeTestsOk++;
            System.out.printf("%-60.60s  %-30.30s%n", proceso, "OK");       
        }
        catch (Exception e) {
            numeroDeTestsFail++;
            System.out.printf("%-60.60s  %-30.30s%n", proceso, "FAIL! (error en tiempo de ejecucion)");          

        }   

        numeroDeTests++;
        proceso = "Obteniendo la fecha almacenada (se espera \"30-11-17\")...";  
        try {
            if (calendario.obtenerFecha().equals("30-11-17")) {
                numeroDeTestsOk++;
                System.out.printf("%-60.60s  %-30.30s%n", proceso, "OK");
            }
            else {
                numeroDeTestsFail++;
                System.out.printf("%-60.60s  %-30.30s%n", proceso, "FAIL! Se obtuvo la fecha " + calendario.obtenerFecha());             
            }    
        }
        catch (Exception e) {
            numeroDeTestsFail++;
            System.out.printf("%-60.60s  %-30.30s%n", proceso, "FAIL! (error en tiempo de ejecucion)");         
        }  

        numeroDeTests++;
        proceso = "Avanzando un dia la fecha...";   
        try {
            calendario.avanzarFecha();
            numeroDeTestsOk++;
            System.out.printf("%-60.60s  %-30.30s%n", proceso, "OK");      
        }
        catch (Exception e) {
            numeroDeTestsFail++;
            System.out.printf("%-60.60s  %-30.30s%n", proceso, "FAIL! (error en tiempo de ejecucion)");         

        }   

        numeroDeTests++;
        proceso = "Obteniendo la fecha almacenada (se espera \"01-12-17\")...";  
        try {
            if (calendario.obtenerFecha().equals("01-12-17")) {
                numeroDeTestsOk++;
                System.out.printf("%-60.60s  %-30.30s%n", proceso, "OK"); 
            }
            else {
                numeroDeTestsFail++;
                System.out.printf("%-60.60s  %-30.30s%n", proceso, "FAIL! Se obtuvo la fecha " + calendario.obtenerFecha());          
            }    
        }
        catch (Exception e) {
            numeroDeTestsFail++;
            System.out.printf("%-60.60s  %-30.30s%n", proceso, "FAIL! (error en tiempo de ejecucion)");        
        }

        numeroDeTests++;
        proceso = "Fijando la fecha 29-12-17...";   
        try {
            calendario.fijarFecha(29, 12, 17);
            numeroDeTestsOk++;
            System.out.printf("%-60.60s  %-30.30s%n", proceso, "OK");       
        }
        catch (Exception e) {
            numeroDeTestsFail++;
            System.out.printf("%-60.60s  %-30.30s%n", proceso, "FAIL! (error en tiempo de ejecucion)");        

        }   

        numeroDeTests++;
        proceso = "Obteniendo la fecha almacenada (se espera \"29-12-17\")...";  
        try {
            if (calendario.obtenerFecha().equals("29-12-17")) {
                numeroDeTestsOk++;
                System.out.printf("%-60.60s  %-30.30s%n", proceso, "OK");
            }
            else {
                numeroDeTestsFail++;
                System.out.printf("%-60.60s  %-30.30s%n", proceso, "FAIL! Se obtuvo la fecha " + calendario.obtenerFecha());            
            }    
        }
        catch (Exception e) {
            numeroDeTestsFail++;
            System.out.printf("%-60.60s  %-30.30s%n", proceso, "FAIL! (error en tiempo de ejecucion)");        
        }  

        numeroDeTests++;
        proceso = "Avanzando un dia la fecha...";   
        try {
            calendario.avanzarFecha();
            numeroDeTestsOk++;
            System.out.printf("%-60.60s  %-30.30s%n", proceso, "OK");       
        }
        catch (Exception e) {
            numeroDeTestsFail++;
            System.out.printf("%-60.60s  %-30.30s%n", proceso, "FAIL! (error en tiempo de ejecucion)");         

        }   

        numeroDeTests++;
        proceso = "Avanzando un dia la fecha (se espera \"30-12-17\")...";  
        try {
            if (calendario.obtenerFecha().equals("30-12-17")) {
                numeroDeTestsOk++;
            System.out.printf("%-60.60s  %-30.30s%n", proceso, "OK");
            }
            else {
                numeroDeTestsFail++;
                System.out.printf("%-60.60s  %-30.30s%n", proceso, "FAIL! Se obtuvo la fecha " + calendario.obtenerFecha());           
            }    
        }
        catch (Exception e) {
            numeroDeTestsFail++;
            System.out.printf("%-60.60s  %-30.30s%n", proceso, "FAIL! (error en tiempo de ejecucion)");         
        }   

        numeroDeTests++;
        proceso = "Avanzando un dia la fecha...";   
        try {
            calendario.avanzarFecha();
            numeroDeTestsOk++;
            System.out.printf("%-60.60s  %-30.30s%n", proceso, "OK");      
        }
        catch (Exception e) {
            numeroDeTestsFail++;
            System.out.printf("%-60.60s  %-30.30s%n", proceso, "FAIL! (error en tiempo de ejecucion)");        

        }   

        numeroDeTests++;
        proceso = "Avanzando un dia la fecha (se espera \"01-01-18\")...";  
        try {
            if (calendario.obtenerFecha().equals("01-01-18")) {
                numeroDeTestsOk++;
            System.out.printf("%-60.60s  %-30.30s%n", proceso, "OK");
            }
            else {
                numeroDeTestsFail++;
                System.out.printf("%-60.60s  %-30.30s%n", proceso, "FAIL! Se obtuvo la fecha " + calendario.obtenerFecha());           
            }    
        }
        catch (Exception e) {
            numeroDeTestsFail++;
            System.out.printf("%-60.60s  %-30.30s%n", proceso, "FAIL! (error en tiempo de ejecucion)");         
        }      
        
        System.out.printf("%-60.60s  %2.2s%n", "======", "==");
        System.out.printf("%-60.60s  %2.2s%n", "Numero de test realizados:", numeroDeTests);
        System.out.printf("%-60.60s  %2.2s%n", "Numero de test pasados correctamente:", numeroDeTestsOk);
        System.out.printf("%-60.60s  %2.2s%n", "Numero de test fallados:", numeroDeTestsFail);        
    }
}

