package utp.misiontic2022.c2.p56.reto4.modelo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p56.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p56.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p56.reto4.util.JDBCUtilities;

public class Requerimiento_2Dao {
    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
        ArrayList<Requerimiento_2> resultados = new ArrayList<>();
        JDBCUtilities conexion = new JDBCUtilities();

        // Por hacer
        ResultSet resultSet = 	conexion.ejecutarConsulta("SELECT c.Proveedor , COUNT(c.Cantidad) AS  \"Ventas\" \n"
        		+ "FROM Compra c \n"
        		+ "GROUP BY c.Proveedor ORDER BY \"ventas\" DESC \n" + "LIMIT 100");
       while(resultSet.next()) {
    	String ProveedorR = resultSet.getString("Proveedor");
       	Double VentasR  = resultSet.getDouble("Ventas");
       	Requerimiento_2 requerimiento_2 = new Requerimiento_2(ProveedorR, VentasR);
       	resultados.add(requerimiento_2);
       	//System.out.println(ProveedorR);
    }
        return resultados;
    }
}