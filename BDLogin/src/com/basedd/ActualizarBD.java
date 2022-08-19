package com.basedd;

import javax.swing.*;
import java.sql.*;

/* @ChemaPF */

public class ActualizarBD {
    
    ResultSet rs;
    Statement st;
    
    BDLogin c=new BDLogin();
    Connection conexion;
    
    public ActualizarBD(){
        conexion=c.retornoConexion();
    }
    
    
    public int actualizarPass(String user, String pass){
        String sql="update usuario set pass='"+pass+"'where id_u='"+user+"';";
        int respuesta=0;
        try{
            st=conexion.createStatement();
            respuesta=st.executeUpdate(sql);
        }catch(Exception e){
             JOptionPane.showMessageDialog(null,e.getMessage() );
        }finally{
            try {
                st.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage() );
            }
        }
        return respuesta;
    }
    
    public int actualizarAlumno(String matricula, String matriculaN, String  nombre, String id_u, String id_m){
        String sql="update alumnos set matricula='"+matriculaN+"',nombre='"+nombre+"',id_u='"+id_u+"', id_m="+id_m+" where matricula='"+matricula+"';";
        System.out.println(sql);
        int respuesta=0;
        try{
            st=conexion.createStatement();
            respuesta=st.executeUpdate(sql);
        }catch(Exception e){
             JOptionPane.showMessageDialog(null,e.getMessage() );
        }finally{
            try {
                st.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage() );
            }
        }
        return respuesta;
    }
    
    public int actualizarMateria(String ID, String IDN, String nombre){
        String sql="update materias set id_m="+IDN+",nombrem='"+nombre+"' where id_m="+ID+";";
        System.out.println(sql);
        int respuesta=0;
        try{
            st=conexion.createStatement();
            respuesta=st.executeUpdate(sql);
        }catch(Exception e){
             JOptionPane.showMessageDialog(null,e.getMessage() );
        }finally{
            try {
                st.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage() );
            }
        }
        return respuesta;
    }
}
  
