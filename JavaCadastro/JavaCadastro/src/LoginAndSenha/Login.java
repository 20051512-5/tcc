/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LoginAndSenha;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class Login {

    
    /**
     * @param entrada the entrada to set
     */
    public void setEntrada(String entrada) {
        int cont=1;
        while(!entrada.equals("unicesumar")&& cont <=2){
            System.out.println("\nLogin errado.\nTentativas restante: "+(2-cont)+"\n");
            System.out.println("Login.");
            Scanner t = new Scanner(System.in);
            cont++;
            entrada = t.next();
        }
        if (entrada.equals("unicesumar")) {
            System.out.println("Login correto\n");
        }
        else{
            System.out.println("Tentativas excidas.\n!!!!!!Bloqueado!!!!!!");
            System.exit(0);
        }
    }
  

    /**
     * @param entrada1
     */
    public void setEntrada1(String entrada1) {
         int cont1=1;
         //usei meu Ra como senha.
        while(!entrada1.equals("20051512-5")&& cont1 <=2){
            System.out.println("\nSenha errada.\nTentativas restante: "+(2-cont1)+"\n");
            System.out.println("senha.");
            Scanner t = new Scanner(System.in);
            cont1++;
            entrada1 = t.next();
        }
        if (entrada1.equals("20051512-5")) {
            System.out.println("Senha correta\n");
        }
        else{
            System.out.println("Tentativas excidas.\n!!!!!!Bloqueado!!!!!!");
            System.exit(0);
        }
       
    }
 
    /**
     * @param senhaAdmim the senhaAdmim to set
     */
    public void setSenhaAdmim(String senhaAdmim) {
        int cont2 = 1;
         while(!senhaAdmim.equals("1234")&& cont2 <=2){
            System.out.println("\nSenha do administrador errada.\nTentativas restante: "+(2-cont2)+"\n");
            Scanner t = new Scanner(System.in);
            cont2++;
            senhaAdmim = t.next();
        }
        if (senhaAdmim.equals("1234")) {
            System.out.println("Senha do administrador correta");
        }
        else{
            System.out.println("Tentativas excidas.\n!!!!!!Bloqueado!!!!!!");
            System.exit(0);
        }
    }
    
    
}
