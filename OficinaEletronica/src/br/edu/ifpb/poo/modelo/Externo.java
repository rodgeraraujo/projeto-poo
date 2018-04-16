package br.edu.ifpb.poo.modelo;

/**
 * 
 * @verson 1.0
 * @since version 1.0
 * @author Rogério Araújo <rogerio.aruajo@mail.com>
 * @author Lucas Garrido <lucasgf07@gmail.com>
 * @date 18/03/2018
 */
import java.time.LocalDate;

public class Externo extends Servico {
    
    private LocalDate horaInicio;
    private LocalDate horaTermino;

    /**
     * 
     * @param horaInicio hora que iniciou o atendimento
     * @param horaTermino hora que finalizou o atendimento
     * @param defeito defeito alegado pelo cliente
     * @param descricao descrição do serviço efetuado
     * @param orcamento valor do serviço
     * @param dataEntrada entrada do serviço
     * @param ordemServico código identificador do serviço
     * @param estado status do serviço
     * @param pecas peças utilizadas no serviço
     */
    public Externo(LocalDate horaInicio, LocalDate horaTermino, String defeito,
           String descricao, float orcamento, LocalDate dataEntrada,
           int ordemServico, String status) {
//        super(defeito, descricao, orcamento, dataEntrada, ordemServico);
        this.horaInicio = horaInicio;
        this.horaTermino = horaTermino;
    }

    /**
     * @return retorna a hora de inicio
     */
    public LocalDate getHoraInicio() {
        return horaInicio;
    }

    /**
     * @param horaInicio 
     */
    public void setHoraInicio(LocalDate horaInicio) {
        this.horaInicio = horaInicio;
    }

    /**
     * @return retorna a hora do termino
     */
    public LocalDate getHoraTermino() {
        return horaTermino;
    }

    /**
     * @param horaTermino 
     */
    public void setHoraTermino(LocalDate horaTermino) {
        this.horaTermino = horaTermino;
    }

    /**
     * @return retorna a descrição do tipo serviço externo
     */
    @Override
    public String toString() {
        return "Externo{" + "horaInicio=" + horaInicio + ", horaTermino=" +
                horaTermino + '}';
    }
    
}
