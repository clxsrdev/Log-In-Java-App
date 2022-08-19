package com.basedd;
import javax.swing.*;
import java.sql.*;

/* @ChemaPF */
public class RegistroBD {
    
    ResultSet rs;
    Statement st;
    
    BDLogin c=new BDLogin();
    Connection conexion;
    
    public RegistroBD(){
        conexion=c.retornoConexion();
    }
    
    public boolean insertarUser(String id_u, String  pass){
        String sql="Insert into usuario (id_u, pass) values ('"+id_u+"','"+pass+"');";
        boolean respuesta=true;
        try{
            st=conexion.createStatement();
            respuesta=st.execute(sql); //Si todo fue bien, retorna false
            System.out.println(respuesta);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage() );
            System.out.println(e.getMessage());
        }finally{
            try{
                st.close();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex.getMessage() );
                System.out.println(ex.getMessage());
            }
        }
        return !respuesta;
    }
    
        public boolean insertarAlumno(String matricula, String  nombre, String id_u, String id_m){
        String sql="Insert into alumnos (matricula, nombre, id_u, id_m) values ('"+matricula+"','"+nombre+"','"+id_u+"',"+id_m+");";
        System.out.println(sql);
        boolean respuesta=true;
        try{
            st=conexion.createStatement();
            respuesta=st.execute(sql); //Si todo fue bien, retorna false
            System.out.println(respuesta);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage() );
            System.out.println(e.getMessage());
        }finally{
            try{
                st.close();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex.getMessage() );
                System.out.println(ex.getMessage());
            }
        }
        return !respuesta;
    }
        
        public boolean insertarMateria(String ID, String  nombre){
        String sql="Insert into materias (id_m, nombrem) values ("+ID+",'"+nombre+"');";
        System.out.println(sql);
        boolean respuesta=true;
        try{
            st=conexion.createStatement();
            respuesta=st.execute(sql); //Si todo fue bien, retorna false
            System.out.println(respuesta);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage() );
            System.out.println(e.getMessage());
        }finally{
            try{
                st.close();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex.getMessage() );
                System.out.println(ex.getMessage());
            }
        }
        return !respuesta;
    }
}
