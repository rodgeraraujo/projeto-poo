/**
 *
 * @author RODGER
 */

package Visao;

import Modelo.Servico;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
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

        Scanner entrada = new Scanner(System.in);
        
        List<Servico> servicos = new ArrayList();
        
        int ordemServico = 0;
        
        int choice = 1;
        
        while(choice !=0){
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
                + " │ • Cadastrar serviço [1] │\n"
                + " │ • Consultar serviço [2]     │\n "
                + " │ • Inativar serviço [3]     │\n "
                + " │ • Fechar Sistema [0]     │\n "
                + "└─────────────────────────────┘\n");
        choice = entrada.nextInt();
        if(choice == 1){
            System.out.println("Digite o defeito do equipamento: ");
            String defeito = entrada.next();
            
            System.out.println("Digite a descriçaõ do serviço: ");
            String descricao =  entrada.next();
            
            System.out.println("Digite o valor do orçamento: ");
            float orcamento = entrada.nextFloat();
            
            LocalDate dataEntrada = LocalDate.now();
            
            ordemServico++;
            
            System.out.println("Digite o status do serviço: ");
            String estado = entrada.next();

            System.out.print("\r\n");
            }
        }
    }
}
