 
/**
 * Write a description of class doc here.
 * 
 * @author (Andrei Miu) 
 * @version (22/06/2020)
 * @param X: Numero de la linea
 * @return Line: Contenido de la linea X
 */
public interface doc
{
   
   // Devuelve el contenido del archivo tras insertar la linea line en la linea numero x, 
   // el contenido de la linea x, pasa a ser la linea x+1 y asi sucesivamente.
   public abstract String escribirLinea(int x, String line, String file);
   
   
}