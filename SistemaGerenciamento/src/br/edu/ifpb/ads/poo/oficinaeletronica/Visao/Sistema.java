package br.edu.ifpb.ads.poo.oficinaeletronica.Visao;

import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * Classe que implementa um metodo para abri o sistema por meio de Login e Senha
 * 
 * @since 1.0
 * @version 1.0
 * @author Rogério Araújo <rogerio.araujo@mail.com>
 * @author Lucas Garrido <lucasgf07@gmail.com>
 * @date 18/03/2018
 */
public class Sistema {
        
    /**
     * 
     * @param userCode login so usuário
     * @param passCode senha do usuário
     * @param userName nome do usuário administrador do sistema
     * @throws IOException 
     */
    static void AbriSistema(String userCode, String passCode, String userName) 
            throws IOException {
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
    
    /**
     * Metodo para imprimir na tela o menu textual da aplicação
     * 
     * @param userName nome do usuário administrador do sitema
     */
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
                + " │ • Fechar System     [0]     │\n"
                + " │ • Cadastrar Serviço [1]     │\n"
                + " │ • Consultar Serviço [2]     │\n"
                + " │ • Inativar Serviço  [3]     │\n"
                + " └─────────────────────────────┘\n");
        System.out.print("=>");
    }
}
