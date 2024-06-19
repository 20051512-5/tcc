/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConecxaoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Eduardo
 */
public class Conecxao {

    private static final String url = "jdbc:mysql://localhost:3306/mybd";
    private static final String user = "root";
    private static final String senha = "root";

    private static Connection conec;

    public static Connection Conecxao() {
        try {
            if (conec == null) {
                conec = DriverManager.getConnection(url, user, senha);
                return conec;
            } else {
                return conec;
            }
        } catch (SQLException ex) {
            System.out.println("Erro de conexão "+ ex);
            return null;
        }

    }
    }


