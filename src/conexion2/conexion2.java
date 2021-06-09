/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author gusta
 */
public class conexion2 {
    Connection con;
    
    public conexion2() {
        String driver ="com.mysql.jdbc.Driver";
        String url ="jdbc:mysql://localhost:3306/soccershop";
        try{
             Class.forName(driver);
             con = DriverManager.getConnection(url, "root", "root"); 
                
        }catch(Exception e){
            
        }
    }
    public Connection getConnection(){
        return con;
    
    }
//thisone!!!!!!!!//}
//    public static void main(String[] args) {
//        //1.REQUIREMENTS
//        
//        String driver ="com.mysql.jdbc.Driver";
//        
//        
//        
//        
//        //2. URL (CADENA CONEXION)
//        String url ="jdbc:mysql://localhost:3306/soccershop";
//        
//        
//        try{
//             Class.forName(driver);
//             System.out.println("Conexion Existosa");
//                
//        }catch(Exception e){
//            System.err.println("Error de Conexion!!! "+ e.getMessage());
//        }
//        try{
//            Connection cn = DriverManager.getConnection(url, "root", "root");
//            System.out.println("Conectado a la base de datos");
//            System.out.println("----------------------------");
//            
//            String sql= "select * from items"; 
//            Statement st = cn.createStatement();
//            ResultSet rs = st.executeQuery(sql); 
////            
////           while(rs.next()) {
////                System.out.println(rs.getInt(1));
////                System.out.println(rs.getString(2));
////                System.out.println(rs.getString(3));
////                System.out.println(rs.getInt(4));
////                System.out.println(rs.getString(5));
////                System.out.println(rs.getInt(6));
////                System.out.println(rs.getDouble(7));
////                System.out.println(rs.getString(8));
////                System.out.println("-------------------------");
////            }
//
//              while(rs.next()) {
//                System.out.println(rs.getInt("id"));
//                System.out.println(rs.getString("articulo"));
//                System.out.println(rs.getString("descripcion"));
//                System.out.println(rs.getString("talla"));
//                System.out.println(rs.getString("color"));
//                System.out.println(rs.getInt("precio"));
//                //System.out.println(rs.getDouble("salary"));
//                System.out.println(rs.getString("fechacompra"));
//                System.out.println("-------------------------");
//            }
//            
//            
//        }catch(Exception e){
//            System.err.println("Sin conexion a la base de datos");
//            return;
//            
//        }
//    }
}

    

