/**
 *
 * @author RODGER
 */

package Visao;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Sistema {
        
    //Login autenticação
    static void AbriSistema(String userCode, String passCode, String userName) {
        JTextField username = new JTextField();
        JTextField password = new JPasswordField();
        Object[] message = {
            "Usuário:", username,
            "Senha:", password
        };
        
        ImageIcon userIcon = new ImageIcon("icon\\users.png");
        
        int option = JOptionPane.showConfirmDialog(null,
                                                   message, 
                                                   "Login Admin Confirmation",
                                                   JOptionPane.OK_CANCEL_OPTION, 
                                                   JOptionPane.PLAIN_MESSAGE, 
                                                   userIcon);
        
        if (option == JOptionPane.OK_OPTION) {
            if (username.getText().equals(userCode) && 
                password.getText().equals(passCode)) {
               
               ImageIcon successIcon = new ImageIcon("icon\\success.png");
               JOptionPane.showMessageDialog(null,
                                            "Login bem-sucedido!",
                                            "Successful", 
                                            JOptionPane.INFORMATION_MESSAGE,
                                            successIcon);
               
               //Função para construir menu textual
               Dados.menuConstrutor(userName);
            } else {
                
                System.out.println("Falha na autenticação.");
                ImageIcon errorIcon = new ImageIcon("icon\\error.png");
                JOptionPane.showMessageDialog(null,
                                              "Falha na autenticação.",
                                              "Failure",
                                              JOptionPane.ERROR_MESSAGE,
                                              errorIcon);
            }
        } else {
            System.out.println("Login cancelado.");
        }
    }
    
    //Imprimir menu de opções
    static void menu(String userName) {
        System.out.println("   Seja bem-vindo \'" + userName + "\'");
        System.out.print(
                "┌───────────────────────────────┐"
                + "\n│  Gerência Oficina Eletrônica  │\n"
                + "│  ---------------------------  │\n"
                + "│          Version 1.0          │\n"
                + "└┬=============================┬┘\n"
                + " │   Use as instruções baixo   │\n"
                + " -------------------------------\n"
                + " │ • Fechar System [0]         │\n"
                + " │ • Cadastrar Serviço [1]     │\n"
                + " │ • Consultar Serviço [2]     │\n"
                + " │ • Inativar Serviço [3]      │\n"
                + " └─────────────────────────────┘\n");
        System.out.print("=>");
    }
}
