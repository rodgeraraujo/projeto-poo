/**
 *
 * @author RODGER
 */

package Visao;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Main {
    public static void main(String[] args) {
        
        String userCode = "root";
        String passCode = "123";
        
        //Função para autenticação por login e senha
        Login(userCode, passCode);
   }

    //Login autenticação
    private static void Login(String userCode, String passCode) {
        JTextField username = new JTextField();
        JTextField password = new JPasswordField();
        Object[] message = {
            "Usuário:", username,
            "Senha:", password
        };
        
        ImageIcon icone = new ImageIcon("icon\\login.png");
        
        int option = JOptionPane.showConfirmDialog(null,
                                                   message, 
                                                   "Login", 
                                                   JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            if (username.getText().equals(userCode) && 
                password.getText().equals(passCode)) {
               //System.out.println("Login bem-sucedido!");
               JOptionPane.showMessageDialog(null,
                                            "Login bem-sucedido!",
                                            "Successful", 
                                            JOptionPane.INFORMATION_MESSAGE);
               
               //Função para construir menu textual
               menuConstrutor(userCode);
            } else {
                System.out.println("Falha na autenticação.");
                JOptionPane.showMessageDialog(null,
                                              "Falha na autenticação.",
                                              "Failure",
                                              JOptionPane.ERROR_MESSAGE);
            }
        } else {
            System.out.println("Login cancelado.");
        }
    }
    
    //Menu textual construtor
    private static void menuConstrutor(String userCode) {
        System.out.println("    Seja bem-vindo " + userCode);
        System.out.print(
                "┌───────────────────────────────┐"
                + "\n│  Gerência Oficina Eletrônica  │\n"
                + "│  ---------------------------  │\n"
                + "│          Version 1.0          │\n"
                + "└┬=============================┬┘\n"
                + " │  Use as instruções baixo    │\n"
                + " │    Digitando o código ↓     │\n"
                + " -------------------------------\n"
                + " │ • Cadastrar funcionário [1] │\n"
                + " │ • Cadastrar cliente [2]     │\n "
                + "└─────────────────────────────┘\n");
    }
}
