/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ConecxaoBD.Conecxao;
import entidade.produtos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Eduardo
 */
public class produtosDAO {

    PreparedStatement prep;
    ResultSet resul;
    ArrayList<produtos> lista = new ArrayList<>();

    public void cadastrarProdutos(produtos prod) {

        String sql = "insert into produtos(dataCadastro, parafusos, saidaParafusos, aruelas, saidaAruelas,alicates, saidaAlicates,martelos, saidaMartelos )values (?,?,?,?,?,?,?,?,?)";

        
        try {

            prep = Conecxao.Conecxao().prepareStatement(sql);
            prep.setString(1, prod.getDataCadastro());
            prep.setInt(2, prod.getParafusos());
            prep.setInt(3, prod.getSaidaParafusos());
            prep.setInt(4, prod.getAruelas());
            prep.setInt(5, prod.getSaidaAruelas());
            prep.setInt(6, prod.getAlicate());
            prep.setInt(7, prod.getSaidaAlicates());
            prep.setInt(8, prod.getMartelo());
            prep.setInt(9, prod.getSaidaMartelos());
            prep.execute();
            prep.close();

        } catch (SQLException ex) {

            System.out.println("\nErro de inserção de dados produtos \n" + ex);
        }
    }

    public ArrayList<produtos> listarProdutos() {
        String sql = "SELECT * FROM produtos";
        try {

            prep = Conecxao.Conecxao().prepareStatement(sql);
            resul = prep.executeQuery();

            while (resul.next()) {
                produtos prod = new produtos();
                prod.setId_produtos(resul.getInt("id_produtos"));
                prod.setDataCadastro(resul.getString("dataCadastro"));
                prod.setParafusos(resul.getInt("parafusos"));
                prod.setSaidaParafusos(resul.getInt("saidaParafusos"));
                prod.setAruelas(resul.getInt("aruelas"));
                prod.setSaidaAruelas(resul.getInt("saidaAruelas"));
                prod.setAlicate(resul.getInt("alicates"));
                prod.setSaidaAlicates(resul.getInt("saidaAlicates"));
                prod.setMartelo(resul.getInt("martelos"));
                prod.setSaidaMartelos(resul.getInt("saidaMartelos"));

                lista.add(prod);

            }

        } catch (SQLException e) {
            System.out.println("Erro na listagem de produtos" + e);
        }
        return lista;

    }

    public void qnt_parafusos() {
        String sql = "select(sum(parafusos) - (select sum(saidaParafusos) from produtos)) as resultado from produtos ";
        try {
            prep = Conecxao.Conecxao().prepareStatement(sql);

            resul = prep.executeQuery();
            resul.next();
            int qnt_parafusos = resul.getInt(1);
            System.out.print("A quantidade de parafusos é: " + qnt_parafusos +"\n \n");

        } catch (SQLException e) {
            System.out.println("Erro na Quantidade de parafusos" + e);
        }
    }
    

    public void qnt_aruelas() {
        String sql = "select(sum(aruelas) - (select sum(saidaAruelas)from produtos))as resultado from produtos";
        try {
            prep = Conecxao.Conecxao().prepareStatement(sql);
            resul = prep.executeQuery();
            resul.next();
            int qnt_aruelas = resul.getInt(1);
            System.out.print("A quantidade de aruelas é: " + qnt_aruelas + "\n \n");
        } catch (SQLException e) {
            System.out.println("Erro no resulta de aruelas \n " + e);
        }

    }

    public void qnt_alicate() {
        String sql = "select(sum(alicates) - (select sum(saidaAlicates)from produtos)) as resultado from produtos";
        try {
            prep = Conecxao.Conecxao().prepareStatement(sql);
            resul = prep.executeQuery();
            resul.next();
            int qnt_alicates = resul.getInt(1);
            System.out.print("A quantidade de alicates é: " + qnt_alicates + "\n \n");
        } catch (SQLException e) {
            System.out.println("Erro no resulta de alicates \n " + e);
        }

    }
    public void qnt_martelos() {
       String sql = "select(sum(martelos) - (select sum(saidaMartelos)from produtos)) as resultado from produtos";
        try {
            prep = Conecxao.Conecxao().prepareStatement(sql);
            resul = prep.executeQuery();
            resul.next();
            int qnt_martelos = resul.getInt(1);
            System.out.print("A quantidade de martelos é: " + qnt_martelos+ "\n \n");
        } catch (SQLException e) {
            System.out.println("Erro no resulta de martelos \n " + e);
        }

    }
    
}
