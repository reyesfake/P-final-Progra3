/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pfp3;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


/**
 *
 * @author DAVID
 */
public class Cl_AbirCsv 
{
    

public static final char SEPARATOR=',';
   public static final char QUOTE='"';


 CSVReader reader = null;
      try {
         reader = new CSVReader(new FileReader("C:\\Users\\DAVID\\Documents\\GitHub\\P-final-Progra3\\PFP3\\archivoCsv"));
         String[] nextLine=null;
         
         while ((nextLine = reader.readNext()) != null) {
            System.out.println(Arrays.toString(nextLine));
         }
         
      } catch (IOException e){
     System.out.println(e);
    
      } finally {
         if (null != reader) {
            reader.close();
         } 
      }





/*

ArchivoCSV =("C:\\Users\\DAVID\\Documents\\GitHub\\P-final-Progra3\\PFP3\\archivoCsv");
Reader = new CSVReader(ArchivoCSV);

String[] fila =null;


while((fila=csvReader.readNext())!=null){

    system.out.println(fila[0]
    
    +"|" +fila[1]
    +"|"+fila[2]);


}

   


    */
}
