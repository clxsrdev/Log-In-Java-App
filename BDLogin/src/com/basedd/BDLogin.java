package com.basedd;
import java.sql.*;
import javax.swing.*;

/* @ChemaPF */
public class BDLogin {
    Connection conexion=null;
    Statement st;
    ResultSet rs;
    String driver="org.postgresql.Driver";
    String user="postgres";
    String bd="jdbc:postgresql://localhost:5432/bdlogin";
    String password="1";
   
    public BDLogin(){
        try{
            Class.forName(driver);
            conexion=DriverManager.getConnection(bd, user, password);
            if(conexion!=null){
                System.out.println("Conexion exitosa");
            }else{
                System.out.println("Conexion fallida");
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());   
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }  
    }
    
    public Connection retornoConexion(){
        return conexion;
    }    
    
    public ResultSet rsMethod(String sentencia){//Metodo que recibe una sentencia sql y retorna un Resultset
        try{
            st=conexion.createStatement();
            rs=st.executeQuery(sentencia);
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return rs;
    }
        
}
