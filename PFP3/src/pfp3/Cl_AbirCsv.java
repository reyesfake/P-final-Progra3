
package pfp3;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;


/**
 * 
 * @author jdreyescan
 */
public class Cl_AbirCsv 
{

private BufferedReader lector;
private String linea;
private String partes[]=null;

public void leerArchivo(String nombreArchivo) throws FileNotFoundException, IOException
{

lector = new BufferedReader(new FileReader(nombreArchivo ));
while ((linea = lector.readLine())!=null)
        {
            partes= linea.split(",");
            
            impirmirLinea();
            System.out.println();
            }
    

}
public void impirmirLinea()
{

    for (String parte : partes) {
        System.out.print(parte + " | ");
    }
    
    
    
    
    
    
    
    
    
    
    
}


}
