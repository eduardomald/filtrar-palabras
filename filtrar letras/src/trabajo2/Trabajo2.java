

package trabajo2;


public class Trabajo2 {

    
    public static void main(String[] args) {
        transformar_mayusculas x=new transformar_mayusculas ();
        abrir_texto abr=new abrir_texto();
        filtrador fina=new filtrador();
        String direccion="C:\\Users\\eduardo\\Desktop\\textop.txt";// ACA TIENE QUE PONER LA DIRECION DEL TXT EN ESTE
        //EJEMPLO SERIA C:\\Users\\eduardo\\Desktop  LUEGO SE COLOCA EL NIMBRE DEL ARCHIVO \\textop.txt
        String f=abr.abrir_archivo(direccion) ;
       
        fina.buscar_repetidos( x.todo_mayuscula(f));
      
        
    }
    
}
