package utp.misiontic2022.c2.p56.reto4;

import utp.misiontic2022.c2.p56.reto4.util.JDBCUtilities;
import utp.misiontic2022.c2.p56.reto4.vista.VentanaMenu;
import utp.misiontic2022.c2.p56.reto4.vista.VistaRequerimientos;

/**
 * Esta clase solo se debe usar para hacer pruebas locales,
 * no se debe subir en iMaster
 */
public class App
{
    public static void main( String[] args )
    {
          JDBCUtilities conexion = new JDBCUtilities();
          VentanaMenu menuPrincipal = new VentanaMenu();
          menuPrincipal.setVisible(true);
         
//        System.out.println("Requerimiento 1");
//        VistaRequerimientos.requerimiento1();
//
//        System.out.println("\nRequerimiento 2");
//        VistaRequerimientos.requerimiento2();
//
//        System.out.println("\nRequerimiento 3");
//        VistaRequerimientos.requerimiento3();

    }
}