package com.basedd;
import javax.swing.*;
import java.sql.*;

/* @ChemaPF */

public class EliminarBD {
    
    ResultSet rs;
    Statement st;
    
    BDLogin c=new BDLogin();
    Connection conexion;
    
    public EliminarBD(){
        conexion=c.retornoConexion();
    }
    
        public int eliminarAlumno(String matricula){
        String sql="delete from alumnos where matricula='"+matricula+"';";
        int respuesta=0;
        try{
            st=conexion.createStatement();
            respuesta=st.executeUpdate(sql);//Si todo bien, se guarda numero 1
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
        public int eliminarMateria(String ID){
        String sql="delete from materias where id_m="+ID+";";
        int respuesta=0;
        try{
            st=conexion.createStatement();
            respuesta=st.executeUpdate(sql);//Si todo bien, se guarda numero 1
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
