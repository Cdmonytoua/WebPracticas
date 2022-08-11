package conexion;

import java.sql.*;
public class Conexion {
    

    public static void main(String[] args) {
        
        try{
            System.out.println("Intentando conectarse a la base de datos.");
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/id12656499_facultad","id12656499_admin","12345");
            System.out.println("Conexion exitosa.");
            
            //consulta
            Statement estado = con.createStatement();
            ResultSet resultado = estado.executeQuery("select * from contactos");
            
            System.out.println("DNI \t Nombre \t Apellido \t Celular");
            
            while(resultado.next()){
                System.out.println(resultado.getString("dni") + "\t" + resultado.getString("nombres") + "\t" + resultado.getString("apellidos") + "\t" );
                
            }
        }
        catch(SQLException e){
            System.out.println("Error de MySQL.");
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        catch(Exception e){
            System.out.println("Se ha encontrado el sig error " + e.getMessage());
        }
        
    }
    
}
