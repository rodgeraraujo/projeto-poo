package br.edu.ifpb.ads.poo.oficinaeletronica.Visao;

import java.io.IOException;

/**
 * @version 1.0
 * @author Rogério Araújo <rogerio.araujo@mail.com>
 * @author Lucas Garrido <lucasgf07@gmail.com>
 * @date 18/03/2018
 */
public class Main {
    
    /**
     * Iniciador main da aplicação
     * 
     * @param args Iniciador normal
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        
        String userCode = "root"; //nome de usuário
        String passCode = "123"; //senha do usuário
        String userName = "FN-2187"; //nome do usuário administrador do sistema 
        
        Sistema.AbriSistema(userCode, passCode, userName);
       
   } 
}