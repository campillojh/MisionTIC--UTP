package utp.misiontic2022.c2.p56.reto4.vista;

import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;

import utp.misiontic2022.c2.p56.reto4.controlador.ControladorRequerimientos;
import utp.misiontic2022.c2.p56.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p56.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p56.reto4.modelo.vo.Requerimiento_3;

public class VistaRequerimientos {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1(){
        try {
            ArrayList<Requerimiento_1> resultados = controlador.consultarRequerimiento1();
            // Por hacer`
            System.out.println("Nombre material-Precio unidad-Id del proyecto");
            resultados.forEach(requerimientoUno -> {
            	System.out.println(
            			String.format("%s-$%s-%d", requerimientoUno.getNombre_Material(), new DecimalFormat("#").format(requerimientoUno.getPrecio_Unidad()), requerimientoUno.getID_Proyecto())
            	);
            });
          
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    public static void requerimiento2(){
        try {
            ArrayList<Requerimiento_2> resultados = controlador.consultarRequerimiento2();
            // Por hacer
            System.out.println( "Proveedor-Ventas");
            resultados.forEach(requerimientodos ->{
            	System.out.println(String.format("%s-%s", requerimientodos.getProveedor(), new DecimalFormat("#").format(requerimientodos.getVentas()))
            	);
            });
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    public static void requerimiento3(){
        try {
            ArrayList<Requerimiento_3> resultados = controlador.consultarRequerimiento3();
            // Por hacer
            System.out.println( "Constructora-Costo de lideres");
            resultados.forEach(requerimientotres ->{
            	System.out.println(String.format("%s-%s", requerimientotres.getConstructora(), new DecimalFormat("#").format(requerimientotres.getSalario()))
            	);
            });
        } catch (Exception e) {
            System.err.println(e);
        }
    }

}
