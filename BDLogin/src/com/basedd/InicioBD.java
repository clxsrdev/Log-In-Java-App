package com.basedd;
import javax.swing.*;
import java.sql.*;

/* @ChemaPF */
public class InicioBD {
    
    ResultSet rs;
    Statement st;
    
    BDLogin c=new BDLogin();
    Connection conexion;
    
    public InicioBD(){
        conexion=c.retornoConexion();
    }
    
    public int consultarU(String user){
        int resultado=0;
        
        String sql="select id_u from usuario where id_u='"+user+"';";
        System.out.println(sql);
        
        try{
            st=conexion.createStatement();
            rs=st.executeQuery(sql);
            rs.next();
            if(user.equals(rs.getString("id_u"))){
                resultado=1;
                System.out.println("Si se encontro al usuario");
            }else{
                System.out.println("No se encontro al usuario");
            }
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Error de conexión", JOptionPane.ERROR_MESSAGE);
        }finally {
            try {
                st.close();
                rs.close();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e, "Error al cerrar statements and result sets", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        return resultado;
    }
    
    public int consultarUser(String usuario, String pass){
        int resultado=0;
        
//        String usuario ="";
//        //String pass ="";
//        String usuariobd;
//        String passwordb;
        
        
        String sql="select id_u, pass from usuario where id_u='"+usuario+"' and pass='"+pass+"';";
    
        
        try{
            st=conexion.createStatement();
            rs=st.executeQuery(sql);
            rs.next();
            if(usuario.equals(rs.getString("id_u"))){
                if(pass.equals(rs.getString("pass"))){
                    resultado=1;
                    System.out.println("Si se encontro al usuario en la BD");
                }
                
            }else{
                System.out.println("No se encontro al usuario");
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Error de conexión", JOptionPane.ERROR_MESSAGE);

        }finally{
            try {

                //conexion.close();
                st.close();
                rs.close();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e, "Error al cerrar statements and resultsets", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        return resultado;
    }
    public int consultarAlumno(String matricula){
        int resultado=0;      
        
        String sql="select matricula from alumnos where matricula='"+matricula+"';";
        System.out.println(sql);
        
        try{
            st=conexion.createStatement();
            rs=st.executeQuery(sql);
            rs.next();
            if(matricula.equals(rs.getString("matricula"))){
                    resultado=1;
                    System.out.println("Si se encontro al alumno en la BD");
                
                
            }else{
                System.out.println("No se encontro al alumno");
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Error de conexión", JOptionPane.ERROR_MESSAGE);

        }finally{
            try {

                //conexion.close();
                st.close();
                rs.close();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e, "Error al cerrar statements and resultsets", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        return resultado;
    }
    
    public int consultarMateria(String ID){
        int resultado=0;      
        
        String sql="select id_m from materias where id_m="+ID+";";
        System.out.println(sql);
        
        try{
            st=conexion.createStatement();
            rs=st.executeQuery(sql);
            rs.next();
            if(ID.equals(rs.getString("id_m"))){
                    resultado=1;
                    System.out.println("Si se encontro al alumno en la BD");
                
                
            }else{
                System.out.println("No se encontro al alumno");
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Error de conexión", JOptionPane.ERROR_MESSAGE);

        }finally{
            try {

                //conexion.close();
                st.close();
                rs.close();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e, "Error al cerrar statements and resultsets", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        return resultado;
    }
}

