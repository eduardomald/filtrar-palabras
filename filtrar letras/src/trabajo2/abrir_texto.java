
package trabajo2;
import java.io.*;

public class abrir_texto {
    public String abrir_archivo(String direccion){

        String texto = "";

        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            // se repetira el ciclo, mientras el bfRead contiene datos
            while((bfRead = bf.readLine()) != null){
                temp = temp + bfRead;
            }

            texto = temp;
        }catch(Exception e){
            System.err.println("No se encontro archivo");
        }
        return texto;
    }
}
