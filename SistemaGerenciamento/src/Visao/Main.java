/**
 *
 * @author RODGER
 */

package Visao;

//import Modelo.ServicoDao;
import Modelo.Servico;
import Modelo.ServicoDao;
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
        String userName = "NomeUsuário";
        String passCode = "123";
        
        //Função para autenticação por login e senha
        Login(userCode, passCode, userName);
   }
 
    //Menu textual construtor
    private static void menuConstrutor(String userName) {

        Scanner entrada = new Scanner(System.in);
        
        ServicoDao  servicos = new ServicoDao();
        
        int ordemServico = 0;
        
        int choice = 1;
        
        while(choice !=0){
        
            menu(userName);

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

                servicos.salvar(new Servico(defeito, descricao, orcamento, 
                        dataEntrada, ordemServico, estado));
                //Inserir cod de adicionar serviço aqui.

            }else if(choice == 2){
                System.out.println("Digite o número da OS: ");
                int id = entrada.nextInt();
                
                System.out.println(servicos.buscar(id));
                //inserir cod de buscar aqui.

            }else if(choice == 3){
                System.out.println("Digite o número da OS: ");
                int id = entrada.nextInt();
                //inserir cod de remover aqui.

            }else if(choice != 0){
                System.out.println("Valor inválido!");
            }
        }
    }
    
    //Login autenticação
    private static void Login(String userCode, String passCode, String userName) {
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
               JOptionPane.showMessageDialog(null,
                                            "Login bem-sucedido!",
                                            "Successful", 
                                            JOptionPane.INFORMATION_MESSAGE);
               
               //Função para construir menu textual
               menuConstrutor(userName);
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
    
    //Imprimir menu de opções
    private static void menu(String userName) {
        System.out.println("   Seja bem-vindo \'" + userName + "\'");
        System.out.print(
                "┌───────────────────────────────┐"
                + "\n│  Gerência Oficina Eletrônica  │\n"
                + "│  ---------------------------  │\n"
                + "│          Version 1.0          │\n"
                + "└┬=============================┬┘\n"
                + " │  Use as instruções baixo    │\n"
                + " │    Digitando o código ↓     │\n"
                + " -------------------------------\n"
                + " │ • Fechar Sistema [0]        │\n"
                + " │ • Cadastrar Serviço [1]     │\n"
                + " │ • Consultar Serviço [2]     │\n"
                + " │ • Inativar Serviço [3]      │\n"
                + " └─────────────────────────────┘\n");
        System.out.println("Digite um valor: ");
    }
    
}
