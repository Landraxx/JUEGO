/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Alumno
 */
public class Conexion {

    private final String driver;
    private final String url;
    private final String usuario;
    private final String password;

    public Conexion() {
        this.driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        this.url = "jdbc:sqlserver://localhost\\6-113-DESKTOP:1433;databaseName=ENTRETENCION;trustServerCertificate=true";
        this.usuario = "sa";
        this.password = "12345";
    }
    
    public String getDriver(){
    return driver;
    
    }
      
    public String getUrl(){
    return url;
    
    }
      
    public String getUsuario(){
    return usuario;
    
    }
      
    public String getPassword(){
    return password;
    
    }
    
     
    
}
