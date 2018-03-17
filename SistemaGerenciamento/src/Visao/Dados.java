/**
 *
 * @author RODGER
 */

package Visao;

import Modelo.Peca;
import Modelo.PecaDao;
import Modelo.Servico;
import Modelo.ServicoDao;
import java.io.Console;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dados {
    static void menuConstrutor(String userName) throws IOException {
        
        PecaDao pecas = new PecaDao();

        Scanner entrada = new Scanner(System.in);
        
        ServicoDao  servicos = new ServicoDao();
       
        pecas.salvar(new Peca("Capacitor", 30, 10.50f, 1));
        pecas.salvar(new Peca("Resistor", 50, 0.50f, 2));
        pecas.salvar(new Peca("Fusivel", 30, 10.50f, 3));
        pecas.salvar(new Peca("HD", 30, 430.90f, 4));
        pecas.salvar(new Peca("Fonte", 30, 99.50f, 5));
        
        int ordemServico = 0;
        int choice = 1;     
        while(choice !=0){
                
            Sistema.menu(userName);

            choice = entrada.nextInt();
            if(choice == 1){
                System.out.println("Digite o defeito do equipamento: ");
                String defeito = entrada.next();
                
                System.out.println("Digite a descriçaõ do serviço: ");
                String descricao =  entrada.next();

                System.out.println("Digite o valor do orçamento: ");
                float orcamento = entrada.nextFloat();
                
                
                
                
                System.out.println("Foi utilizado alguma peça? \n"
                        + "Digite \n"
                        + "1 - Sim \n"
                        + "0 - Não");

                int id = entrada.nextInt();
                
                while(id == 1){
                System.out.println("Digite o Cod das peças:\n"
                        + "1 - Capacitor\n"
                        + "2 - Resistor\n"
                        + "3 - Fusivel\n"
                        + "4 - HD\n"
                        + "5 - Fonte\n");

                }
                
                
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
                servicos.remover(servicos.buscar(id));

            }else if(choice != 0){
                System.out.println("Valor inválido!");
            }
            
        }
    }
}
