package org.example.DAO;

import org.example.modelos.Usuario;
import org.example.utilidades.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {

    //NO TIENEN ATRIBUTOS

    //solo los metodos o consultas que quiero realizar en BD

    //REGISTRAR datos
    public void registrarUsuario(Usuario datosUsuario){
        //consulta sql para guardar datos
        String sql="INSERT INTO usuarios(nombres,contraseña,perfil) VALUES(?,?,?)";

        //llamo a la clase conexion
        Conexion conexion= new Conexion();

        try{

            //Establecer la conexion a la BD
            Connection conectar=conexion.conectar();
            //Se utiliza otro paquete para ejecutar la conuslta sql
            PreparedStatement consulta=conectar.prepareStatement(sql);

            //se extraen los campos a guardar

            System.out.println("Exito guardado en usuario en BD");

        }catch(SQLException error){
            System.out.println("Fallamos guardando el usuario "+error.getMessage());
        }
    }

}
