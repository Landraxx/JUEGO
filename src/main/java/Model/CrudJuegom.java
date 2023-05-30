/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import DAO.DAOJuegom;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author Alumno
 */
public class CrudJuegom {
    
    Conexion conexion = new Conexion();
    public String Create(Object obj) throws SQLException{
        DAOJuegom juegom = (DAOJuegom) obj;
        Connection connection;
        PreparedStatement pst;
        String query = "INSERT INTO TBL_JUEGOM VALUES (?,?,?)";
        String respuesta;
        
        try{
            Class.forName(conexion.getDriver());
            connection = (Connection) DriverManager.getConnection(conexion.getUrl(),
                    conexion.getUsuario(), conexion.getPassword());
            
            pst = (PreparedStatement) connection.prepareStatement(query);
            pst.setString(1, juegom.getVCH_NOMBRE_JUEGOM());
            pst.setString(2, juegom.getVCH_CATEGORIA_JUEGO());
            pst.setString(3, juegom.getDATE_FECHA_JUEGOM());
            respuesta = Integer.toString(pst.executeUpdate());
        }
        catch(ClassNotFoundException | SQLException ex) {
            respuesta = ex.getMessage();
        }
        return respuesta;
            
        }
    }
   
    

