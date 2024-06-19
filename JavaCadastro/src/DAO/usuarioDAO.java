/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import entidade.Usuario;
import java.sql.PreparedStatement;
import ConecxaoBD.Conecxao;
import java.sql.SQLException;


/**
 *
 * @author Eduardo
 */
public class usuarioDAO {
    public void cadastarUsuario(Usuario usuario){
    
    String  sql = "INSERT INTO USUÁRIO(nome, cargo, registroDefuncionario) VALUES (?,?,?)";
    
    PreparedStatement ps;
    try {
         ps = Conecxao.Conecxao().prepareStatement(sql);
         ps.setString(1, usuario.getNome());
         ps.setString(2, usuario.getCargo());
         ps.setString(3, usuario.getRegistroDeFuncionario());
         ps.execute();
         ps.close();
        
    
    
        
           
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Erro de inserção de dados");
        }
    }
}
