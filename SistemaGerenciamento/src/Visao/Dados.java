/**
 *
 * @author RODGER
 */

package Visao;

import Modelo.Servico;
import Modelo.ServicoDao;
import java.io.Console;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class Dados {
    static void menuConstrutor(String userName) throws IOException {

        Scanner entrada = new Scanner(System.in);
        
        ServicoDao  servicos = new ServicoDao();
        
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
