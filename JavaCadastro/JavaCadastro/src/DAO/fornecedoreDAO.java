/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import entidade.fornecedores;
import java.sql.PreparedStatement;
import ConecxaoBD.Conecxao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Eduardo
 */
public class fornecedoreDAO {
      PreparedStatement ps1; 
      ResultSet resul;
      ArrayList<fornecedores> lista = new ArrayList<>();
     public void cadastrarFornecedores(fornecedores fornecedores){
    
    String  sql1 = "insert into fornecedores( nomefornecedor, telefone, empresa, produto)values (?,?, ?,?)";
    
   
      
    try {
        
        ps1 = Conecxao.Conecxao().prepareStatement(sql1);
        ps1.setString(1, fornecedores.getNome());
        ps1.setLong(2, fornecedores.getTelefone());
        ps1.setString(3, fornecedores.getEmpresa());
        ps1.setString(4, fornecedores.getProduto());
        ps1.execute();
        ps1.close();
    } 
    catch (SQLException ex) {
       
            System.out.println("\nErro de inserção de dados \n"+ ex);
        }
}
     public ArrayList<fornecedores> listarFornecedores(){
        String sql = "SELECT * FROM fornecedores" ;
         try {
         
          ps1 = Conecxao.Conecxao().prepareStatement(sql);
          resul = ps1.executeQuery();
          
          while (resul.next()){
             fornecedores forne  = new fornecedores();
             forne.setIdfornecedor(resul.getInt("idfornecedor"));
             forne.setNome(resul.getString("nomefornecedor"));
             forne.setTelefone(resul.getLong("telefone"));
             forne.setEmpresa(resul.getString("empresa"));
             forne.setProduto(resul.getString("produto"));
             
             lista.add(forne);
             
          }
        
         } catch (SQLException e) {
             System.out.println("Erro na listagem"+ e);
         }
         return lista;
     }
             
}