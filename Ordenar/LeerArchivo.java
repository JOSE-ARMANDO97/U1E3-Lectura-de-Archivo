package Ordenar;
import java.io.BufferedReader;
    import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public class LeerArchivo {
        public static  void main(String args[]){

     LeerArchivo intancia =new LeerArchivo();
     intancia.Ordenar();
        }
     public void Ordenar(){
     List <String> listaordenada=new ArrayList<String>();
    
     String[]palabraDeArchivo=null;
      String[]palabraDeOriginales=null;
      ArrayList  < String> comparador;
       comparador= new ArrayList<>();
     listaordenada.add("MEGUSTA LA PROGRAMACION QUE EL PROFE ME REPROBO   ");
              File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;

      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File ("C:\\Users\\BIENVENIDOS\\Desktop\\prueva.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
      
       
        
        
         
         // Lectura del fichero
         String linea;
         while((linea=br.readLine())!=null){
            palabraDeArchivo=linea.split(" ");
            
         }
         for(String nombre:listaordenada){
          palabraDeOriginales=nombre.split(" ");
      }
          
          System.out.println("********************texto de archivo desordenadas*******************");
       for(int i=0;i<palabraDeArchivo.length;i++){
             System.out.println(palabraDeArchivo[i]); 
         }
       
     
       System.out.println("************texto palabra ordenada***************");
       
      for(int i=0;i<palabraDeOriginales.length;i++){
             System.out.println(palabraDeOriginales[i]); 
         }
          System.out.println("*******************Arreglo final *****************");
       for(int i=0;i<palabraDeOriginales.length;i++){
             for(int j=0;j<palabraDeArchivo.length;j++){
        if(palabraDeOriginales[i].equals(palabraDeArchivo[j])){
          
          comparador.add("\n"+palabraDeArchivo[j]);
          
        }
        
      }
            
   }
        System.out.println(comparador);
      }catch(Exception e){
         e.printStackTrace();
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
     }
     
}
