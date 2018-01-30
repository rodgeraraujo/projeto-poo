/**
 *
 * @author RODGER
 */

package Modelo;

import java.time.LocalDate;

public class Externo extends Servico {
    
    private LocalDate horaInicio;
    private LocalDate horaTermino;

    public Externo(LocalDate horaInicio, LocalDate horaTermino, String defeito,
           String descricao, float orcamento, LocalDate dataEntrada,
           String ordemServico, String estado, Peca[] pecas) {
        super(defeito, descricao, orcamento, dataEntrada, ordemServico, estado,
              pecas);
        this.horaInicio = horaInicio;
        this.horaTermino = horaTermino;
    }

    public LocalDate getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalDate horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalDate getHoraTermino() {
        return horaTermino;
    }

    public void setHoraTermino(LocalDate horaTermino) {
        this.horaTermino = horaTermino;
    }

    @Override
    public String toString() {
        return "Externo{" + "horaInicio=" + horaInicio + ", horaTermino=" +
                horaTermino + '}';
    }
    
}
