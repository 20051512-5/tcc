/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacadastro;

import LoginAndSenha.Login;
import entidade.Usuario;
import java.util.Scanner;
import DAO.usuarioDAO;
import entidade.fornecedores;
import DAO.fornecedoreDAO;
import DAO.produtosDAO;
import camel.Camel;
import entidade.produtos;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Eduardo
 */
public class JavaCadastro {

    public static void main(String[] args) {
        Date hoje = new Date();
        SimpleDateFormat dataFormatar = new SimpleDateFormat("dd/MM/YYYY");
        String dataformt = dataFormatar.format(hoje);

        Scanner t = new Scanner(System.in);
        Login login = new Login();
        Camel camel = new Camel();
        System.out.println("Login");
        String entrada = t.next();

        login.setEntrada(entrada);

        System.out.println("Senha");
        String entrada1 = t.next();

        //login.setEntrada1(entrada1);
        boolean rodando = true;
        while (rodando) {
            produtos prod = new produtos();
            System.out.println("[1] Cadastrado de usuarios");
            System.out.println("[2] Cadastro de fornecedores");
            System.out.println("[3] Cadastro de produdos/estoque e saida de produtos");
            System.out.println("[4] Listar fornecedores");
            System.out.println("[5] Listar podutos cadastrados");
            System.out.println("[6] Lista quantidade de produtos");
            System.out.println("[7] Sair\n");
            System.out.println("Digite sua opção");
            int op = t.nextInt();

            switch (op) {

                case 1 -> {

                    Usuario u = new Usuario();
                    System.out.println("Digite o nome do usuário");
                    String NomeUser = t.next();
                    NomeUser = camel.tranforCamelCase(NomeUser);
                    u.setNome(NomeUser);

                    System.out.println("Digite o Cargo do usuário");
                    String cargoUser = t.next();
                    cargoUser = camel.tranforCamelCase(cargoUser);
                    u.setCargo(cargoUser);

                    System.out.println("Digite o registro do Usuario");
                    String registroUser = t.next();
                    u.setRegistroDeFuncionario(registroUser);

                    new usuarioDAO().cadastarUsuario(u);
                    break;
                }
                case 2 -> {
                    System.out.println("Digite a senha do administrador");
                    String senhaAdmim = t.next();
                    login.setSenhaAdmim(senhaAdmim);

                    fornecedores f = new fornecedores();

                    System.out.println("Digite o nome do fornecedor");
                    String nomefor = t.next();
                    nomefor = camel.tranforCamelCase(nomefor);
                    f.setNome(nomefor);

                    System.out.println("Digite o telefone do fornecedor");
                    long telFor = t.nextLong();
                    f.setTelefone(telFor);

                    System.out.println("Digite o nome da empresa");
                    String nomeEmp = t.next();
                    nomeEmp = camel.tranforCamelCase(nomeEmp);
                    f.setEmpresa(nomeEmp);

                    System.out.println("Digite o produto da empresa Parafuso, aruela, alicate ou martelo");
                    String produto = t.next();
                    produto = camel.tranforCamelCase(produto);
                    f.setProduto(produto);

                    new fornecedoreDAO().cadastrarFornecedores(f);

                    break;
                }
                case 3 -> {
                    boolean run = true;
                    while (run) {

                        System.out.println("[1] Cadastrar parafusos");
                        System.out.println("[2] Cadastrar aruelas");
                        System.out.println("[3] Cadastrar alicates");
                        System.out.println("[4] Cadastrar martelos");
                        System.out.println("[5] Saida de parafusos");
                        System.out.println("[6] Saida de aruelas");
                        System.out.println("[7] Saida de alicates");
                        System.out.println("[8] Saida de martelos");
                        System.out.println("[9] Voltar\n");
                        System.out.println("Qual produto deseja cadastrar?");
                        int opç = t.nextInt();
                        switch (opç) {

                            case 1 -> {

                                System.out.println("Digite a quantidade de parafusos");
                                int paraf = t.nextInt();
                                prod.setParafusos(paraf);

                            }
                            case 2 -> {

                                System.out.println("Digite a quantidade de aruelas");
                                int aru = t.nextInt();
                                prod.setAruelas(aru);

                            }
                            case 3 -> {

                                System.out.println("Digite a quantidade de alicates");
                                int ali = t.nextInt();
                                prod.setAlicate(ali);

                            }
                            case 4 -> {

                                System.out.println("Digite a quntidade de martelos");
                                int mar = t.nextInt();
                                prod.setMartelo(mar);

                            }
                            case 5 -> {
                                System.out.println("Digite  quantidade de reirada de parafusos");
                                int saidaPara = t.nextInt();
                                prod.setSaidaParafusos(saidaPara);
                            }
                            case 6 -> {
                                System.out.println("Digite a quantidade de retirada de aruelas");
                                int saidaAru = t.nextInt();
                                prod.setSaidaAruelas(saidaAru);
                            }
                            case 7 -> {
                                System.out.println("Digite a quantidade de retirada de alicates");
                                int saidaAli = t.nextInt();
                                prod.setSaidaAlicates(saidaAli);
                            }
                            case 8 -> {
                                System.out.println("Digite a quantidade de retirada de martelos");
                                int saidaMarte = t.nextInt();
                                prod.setSaidaMartelos(saidaMarte);
                            }
                            case 9 -> {
                                run = false;
                            }
                            default ->
                                System.out.println("Opçao invalida");

                        }

                    }

                    prod.setDataCadastro(dataformt);
                    new produtosDAO().cadastrarProdutos(prod);

                }
                case 4 -> {
                    System.out.println("Digite a senha do administrador");
                    String senhaAdmim = t.next();
                    login.setSenhaAdmim(senhaAdmim);

                    listaFornecedor listafor = new listaFornecedor();
                    listafor.setLocationRelativeTo(null);
                    listafor.setVisible(true);
                }
                case 5 -> {
                    listarProdutos listarPro = new listarProdutos();
                    listarPro.setLocationRelativeTo(null);
                    listarPro.setVisible(true);

                }
                case 6 -> {
                    produtosDAO produ = new produtosDAO();
                    boolean run = true;
                    while (run) {
                        System.out.println("[1] Quantidade de parafusos");
                        System.out.println("[2] Quantidade de aruelas");
                        System.out.println("[3] Quantiade de alicates");
                        System.out.println("[4] Quantidade de martelos");
                        System.out.println("[5] Voltar");

                        System.out.println("Digite sua opção");
                        int opc = t.nextInt();
                        switch (opc) {
                            case 1 -> {
                                produ.qnt_parafusos();
                            }
                            case 2 -> {
                                produ.qnt_aruelas();
                            }
                            case 3 -> {
                                produ.qnt_alicate();
                            }
                            case 4 -> {
                                produ.qnt_martelos();
                            }
                            case 5 -> {
                                run = false;
                            }
                            default ->
                                System.out.println("Opção invalida");
                        }

                    }

                }
                case 7 -> {
                    rodando = false;
                }
                default ->
                    System.out.println("Opçao invalida");

            }
        }
    }
}
