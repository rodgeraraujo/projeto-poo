/**
 *
 * @author RODGER
 */

package Modelo;

import java.time.LocalDate;

public class Externo extends Servico {
    
    private LocalDate horaInicio;
    private LocalDate horaTermino;

    public Externo(LocalDate horaInicio, LocalDate horaTermino, String defeito, String descricao, LocalDate dataEntrada, String ordemServico) {
        super(defeito, descricao, dataEntrada, ordemServico);
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
        return "Externo{" + "horaInicio=" + horaInicio + ", horaTermino=" + horaTermino + '}';
    }
    
}
