package br.edu.ifpb.ads.poo.oficinaeletronica.Visao;


import br.edu.ifpb.ads.poo.oficinaeletronica.DAO.ClienteDao;import br.edu.ifpb.ads.poo.oficinaeletronica.DAO.FuncionarioDao;
import br.edu.ifpb.ads.poo.oficinaeletronica.DAO.PecaDao;
import br.edu.ifpb.ads.poo.oficinaeletronica.DAO.ServicoDao;
import br.edu.ifpb.ads.poo.oficinaeletronica.Modelo.Cliente;
import br.edu.ifpb.ads.poo.oficinaeletronica.Modelo.Equipamento;
import br.edu.ifpb.ads.poo.oficinaeletronica.Modelo.Funcionario;
import br.edu.ifpb.ads.poo.oficinaeletronica.Modelo.Peca;
import br.edu.ifpb.ads.poo.oficinaeletronica.Modelo.Servico;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @since 1.0
 * @version 1.0
 * @author Rogério Araújo <rogerio.araujo@mail.com>
 * @author Lucas Garrido <llucasgf07@gmail.com>
 * @date 18/03/2018
 */
public class Dados {
    
    /**
     * Metodo com as funções do menu textual (salvar, remover, buscar, fechar
     * sitema)
     * 
     * @param userName nome do usuário administrador do sistema
     * @throws IOException 
     */
    static void menuConstrutor(String userName) throws IOException, ClassNotFoundException {
        
        Scanner entrada = new Scanner(System.in);
        
        PecaDao pecas = new PecaDao();
        
        ServicoDao  servicos = new ServicoDao();
        
        FuncionarioDao funcionarios = new FuncionarioDao();
        
        ClienteDao clientes = new ClienteDao();
       
        pecas.salvar(new Peca("Capacitor", 30, 10.50f, 1));
        pecas.salvar(new Peca("Resistor", 50, 0.50f, 2));
        pecas.salvar(new Peca("Fusivel", 30, 10.50f, 3));
        pecas.salvar(new Peca("HD", 30, 430.90f, 4));
        pecas.salvar(new Peca("Fonte", 30, 99.50f, 5));
        
        int ordemServico = 0;
        int codCliente = 1;
        int codFuncionario = 1;
        int choice = 1;     
        while(choice !=0){
                
            Sistema.menu(userName);

            choice = entrada.nextInt();
            if(choice == 1){
                System.out.println("Digite o defeito do equipamento: ");
                String defeito = entrada.next();
                
                System.out.println("Digite a descrição do serviço: ");
                String descricao =  entrada.next();

                System.out.println("Digite o valor do orçamento: ");
                float orcamento = entrada.nextFloat();
                LocalDate dataEntrada = LocalDate.now();
                ordemServico++;
                System.out.println("Digite o status do serviço: ");
                String estado = entrada.next();

                servicos.salvar(new Servico(defeito, descricao, orcamento, 
                        dataEntrada, ordemServico, estado, null));
                
                JOptionPane.showMessageDialog(null,
                                            "Ordem de Serviço: " + ordemServico 
                                            + "\nCadastro realizado com sucesso!",
                                            "Successful", 
                                            JOptionPane.INFORMATION_MESSAGE,
                                            null);
                //Inserir cod de adicionar serviço aqui.
                
            }else if(choice == 2){
                System.out.println("Digite o número da OS: ");
                int id = entrada.nextInt();
                JOptionPane.showMessageDialog(null,
                                            servicos.buscar(id),
                                            "Successful", 
                                            JOptionPane.INFORMATION_MESSAGE,
                                            null);
                //inserir cod de buscar aqui.

            }else if(choice == 3){
                System.out.println("Digite o número da OS: ");
                int id = entrada.nextInt();
                JOptionPane.showMessageDialog(null,
                                            "Descrição do Serviço\n" 
                                                + servicos.buscar(id)
                                                + "\nRemovido com sucesso.",
                                            "Successful", 
                                            JOptionPane.INFORMATION_MESSAGE,
                                            null);
                servicos.remover(servicos.buscar(id));

            }else if(choice == 4){
                System.out.println("Digite o nome do funcionário");
                String nome = entrada.next();
                
                System.out.println("Digite o cpf do funcionário, incluíndo os "
                        + "pontos");
                String cpf = entrada.next();
                
                System.out.println("Digite o número do telefone do "
                        + "funcionário");
                String telefone = entrada.next();
                
                System.out.println("Digite o valor do salário do funcionário");
                float salario = entrada.nextFloat();
                
                funcionarios.salvar(new Funcionario(nome, telefone, salario, 
                        LocalDate.now(),cpf, codFuncionario));
                JOptionPane.showMessageDialog(null,
                            "Código: " + codFuncionario
                            +"\n   " + nome
                            + "\nCadastro realizado com sucesso!",
                            "Successful", 
                            JOptionPane.INFORMATION_MESSAGE,
                            null);
                codFuncionario++;
            }else if(choice == 5){
                System.out.println("Digite o código do funcionario");
                int id = entrada.nextInt();
                funcionarios.buscar(id);
                JOptionPane.showMessageDialog(null,
                                            funcionarios.buscar(id),
                                            "Successful", 
                                            JOptionPane.INFORMATION_MESSAGE,
                                            null);
                        
            }else if(choice == 6){
                System.out.println("Digite o código do funcionario");
                int id = entrada.nextInt();
                JOptionPane.showMessageDialog(null,
                                            "Descrição do Funcionário\n" 
                                                + funcionarios.buscar(id)
                                                + "\nRemovido com sucesso.",
                                            "Successful", 
                                            JOptionPane.INFORMATION_MESSAGE,
                                            null);
                funcionarios.remover(funcionarios.buscar(id));
                
            }else if(choice == 7){
                System.out.println("Digite o nome do Cliente");
                String nome = entrada.next();
                
                System.out.println("Digite o cpf do cliente incluíndo os "
                        + "pontos");
                String cpf = entrada.next();
                
                //Aqui pediu pra criar um construtor em Cliente
                clientes.salvar(new Cliente(cpf, null, nome, null, codCliente));
                JOptionPane.showMessageDialog(null,
                            "Código: " + codCliente
                            +"\n  " + nome
                            + "\nCadastro realizado com sucesso!",
                            "Successful", 
                            JOptionPane.INFORMATION_MESSAGE,
                            null);
                codCliente++;
                
            }else if(choice == 8){
                System.out.println("Digite o cod do cliente");
                int id = entrada.nextInt();
                JOptionPane.showMessageDialog(null,
                                            clientes.buscar(id),
                                            "Successful", 
                                            JOptionPane.INFORMATION_MESSAGE,
                                            null);
            }else if(choice == 9){
                System.out.println("Digite o cod do cliente");
                int id = entrada.nextInt();
                JOptionPane.showMessageDialog(null,
                                            "Descrição do Cliente\n" 
                                                + clientes.buscar(id)
                                                + "\nRemovido com sucesso.",
                                            "Successful", 
                                            JOptionPane.INFORMATION_MESSAGE,
                                            null);
                clientes.remover(clientes.buscar(id));
            }else{
                System.out.println("Valor Invalido!!");
            }
        }
    }
}
