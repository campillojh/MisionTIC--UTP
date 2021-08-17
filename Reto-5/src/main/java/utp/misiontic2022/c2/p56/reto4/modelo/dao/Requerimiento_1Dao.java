package utp.misiontic2022.c2.p56.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import utp.misiontic2022.c2.p56.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p56.reto4.util.JDBCUtilities;

public class Requerimiento_1Dao {

    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException{
        ArrayList<Requerimiento_1> resultados = new ArrayList<>();
        JDBCUtilities conexion = new JDBCUtilities();

        ResultSet resultSet = 	conexion.ejecutarConsulta("SELECT mc2.Nombre_Material  ,mc2.Precio_Unidad ,c.ID_Proyecto\n"
					+ "FROM MaterialConstruccion mc2\n"
					+ "JOIN Compra c ON  c.ID_MaterialConstruccion =  mc2.ID_MaterialConstruccion \n"
					+ "JOIN Proyecto p ON p.ID_Proyecto = c.ID_Proyecto \n"
					+ "WHERE mc2.Importado =\"Si\" AND  p.Ciudad = \"Ibague\" LIMIT 100");
        while(resultSet.next()) {
        	String nombreMatrial = resultSet.getString("Nombre_Material");
           	Double precioUnidad  = resultSet.getDouble("Precio_Unidad");
           	Integer idProyecto = resultSet.getInt("ID_Proyecto");
           	Requerimiento_1 requerimiento_1 = new Requerimiento_1(nombreMatrial, precioUnidad, idProyecto);
           	resultados.add(requerimiento_1);
        }
        
        return resultados;
    }
}