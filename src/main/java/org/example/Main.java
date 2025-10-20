package org.example;

import org.example.DAO.UsuarioDAO;
import org.example.modelos.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuario = new Usuario();

        System.out.println("Bienvenido motherFucker 😁");

        System.out.print("Digita tu nombre: ");
        usuario.setNombres(leer.nextLine());

        System.out.print("Digita tu contraseña: ");
        usuario.setContraseña(leer.nextLine());

        System.out.print("Digita tu perfil: ");
        usuario.setPerfil(leer.nextLine());

        usuarioDAO.registrarUsuario(usuario);

    }
}