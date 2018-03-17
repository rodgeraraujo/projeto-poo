/**
 *
 * @author RODGER
 */

package Visao;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        
        String userCode = "root"; //nome de usuário
        String passCode = "123"; //senha do usuário
        String userName = "fn-2198"; //nome do usuário a ser exibido                        
        
        Sistema.AbriSistema(userCode, passCode, userName);
       
   } 
}