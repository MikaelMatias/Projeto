
package br.com.pizzaria.utils;

import java.sql.Connection;

public class TestarConexao {

    public static void main(String[] args) {
        try{
            Connection conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso");
        }catch(Exception ex){
            System.out.println("Não conectou \n Erro:" +ex.getMessage());
        }
        
    }
     
}
