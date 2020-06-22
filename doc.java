 
/**
 * Write a description of class doc here.
 * 
 * @author (Andrei Miu) 
 * @version (22/06/2020)
 * @param X: Numero de la linea
 * @return File: Contenido de la linea X
 */
public interface doc
{
   
   // Devuelve el contenido del archivo tras insertar la linea line en la linea numero x, 
   // el contenido de la linea x, pasa a ser la linea x+1 y asi sucesivamente.
   public abstract String escribirLinea(int x, String line, String file);
   /**
    * @resumen:Devuelve el perimetro de una ciudad en km2
    * @entrada: String ciudad
    * @salida: int km
    * @precondicion: No pueden haber numeros en el string, de ser asi daría error. La ciudad debe ser correcta.
    * @postcondicion: Devolver el perimetro de una ciudad en km2.
    */
   //Devuelve el perimetro de una ciudad en km2
   public abstract int perimetro (String ciudad, int km);
   
}