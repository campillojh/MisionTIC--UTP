package utp.misiontic2022.c2.p56.reto4.modelo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p56.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p56.reto4.modelo.vo.Requerimiento_3;
import utp.misiontic2022.c2.p56.reto4.util.JDBCUtilities;

public class Requerimiento_3Dao {
    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
        ArrayList<Requerimiento_3> resultados = new ArrayList<>();
        JDBCUtilities conexion = new JDBCUtilities();

        // Por hacer
        ResultSet resultSet = 	conexion.ejecutarConsulta("SELECT p.Constructora ,  SUM(l.Salario) AS \"total_salarios\" FROM Proyecto p  \n"
        		+ "JOIN Lider l ON l.ID_Lider = p.ID_Lider \n"
        		+ "GROUP BY p.Constructora \n"
        		+ "HAVING \"total_salarios\" > 40000000");
    while(resultSet.next()) {
    	String ConstructoraR = resultSet.getString("Constructora");
       	Double SalarioR  = resultSet.getDouble("total_salarios");
       	Requerimiento_3 requerimiento_3 = new Requerimiento_3(ConstructoraR,SalarioR );
       // System.out.println(ConstructoraR);
       	resultados.add(requerimiento_3);
      
    }
    

        return resultados;
    }
}