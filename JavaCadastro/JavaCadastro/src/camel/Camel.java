/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package camel;

/**
 *
 * @author Eduardo
 */
public class Camel {
     
    /**
     *
     * @param nomeCamel
     * @return
     */
    public String tranforCamelCase(String nomeCamel){
        nomeCamel = nomeCamel.toLowerCase();
        String[] partes = nomeCamel.split("_");
        String camelCase = "";
        for (String parte : partes) {
          char primeiraLetra = parte.charAt(0);
          String primeira = Character.toString(primeiraLetra);
          String resto = parte.substring(1);
          camelCase = camelCase.concat(primeira.toUpperCase()).concat(resto).concat("_");
        }
          return camelCase;
    }
    
}
