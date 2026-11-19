
package lanzadardos;

/**
 *
 * @author profesora
 */
public class Main {

       public static void main(String[] args) {
        LanzaDardos2526 miLanzaDardos;
        int capacidadCargaDisponible;
        int x;
        
        miLanzaDardos = new LanzaDardos2526(10,5);
        System.out.println("Munición incial: "+miLanzaDardos.consultar_municion_cargada());
        System.out.println("Capacidad de carga máxima: "+miLanzaDardos.municionMaxima);
        try 
        {
            x=3;
            System.out.println("Descarga de "+x+" municiones");
            miLanzaDardos.descargar(x);
        } catch (Exception e)
        {
            System.out.print("Fallo al descargar");
        }
        
        try
        {
            x=2;
            System.out.println("Carga de "+x+" municiones");
            miLanzaDardos.cargar(x);
        } catch (Exception e)
        {
            System.out.print("Fallo al cargar");
        }
        System.out.println("Munición cargada actualmente: "+ miLanzaDardos.consultar_municion_cargada() );
        capacidadCargaDisponible = miLanzaDardos.consultar_capacidad_disponible();
        System.out.println("Munición máxima que se puede cargar actualmente: "+ capacidadCargaDisponible );
        
    }

}
