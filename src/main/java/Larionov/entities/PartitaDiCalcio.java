package Larionov.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.time.LocalDate;
@Entity
@DiscriminatorValue("partita_di_calcio")
public class PartitaDiCalcio extends Evento{
    private String squdraDiCasa;
    private String ospite;
    private String squadraVincente;
    private int numeroGolSquadraDiCasa;
    private int getNumeroGolSquadraOspite;

    public PartitaDiCalcio (){}
    public PartitaDiCalcio(String titolo, LocalDate dataEvento, String descrizione,
                           TipoEvento tipoEvento, int numeroMassimoPartecipanti,
                           Location location, String squdraDiCasa, String ospite,
                           String squadraVincente, int numeroGolSquadraDiCasa,
                           int getNumeroGolSquadraOspite) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti, location);
        this.squdraDiCasa = squdraDiCasa;
        this.ospite = ospite;
        if (squadraVincente.equals("pareggio")) this.squadraVincente = null;
        else this.squadraVincente = squadraVincente;
        this.numeroGolSquadraDiCasa = numeroGolSquadraDiCasa;
        this.getNumeroGolSquadraOspite = getNumeroGolSquadraOspite;
    }


    public String getSqudraDiCasa() {
        return squdraDiCasa;
    }

    public String getOspite() {
        return ospite;
    }

    public String getSquadraVincente() {
        return squadraVincente;
    }

    public int getNumeroGolSquadraDiCasa() {
        return numeroGolSquadraDiCasa;
    }

    public int getGetNumeroGolSquadraOspite() {
        return getNumeroGolSquadraOspite;
    }

    public void setSqudraDiCasa(String squdraDiCasa) {
        this.squdraDiCasa = squdraDiCasa;
    }

    public void setOspite(String ospite) {
        this.ospite = ospite;
    }

    public void setSquadraVincente(String squadraVincente) {
        this.squadraVincente = squadraVincente;
    }

    public void setNumeroGolSquadraDiCasa(int numeroGolSquadraDiCasa) {
        this.numeroGolSquadraDiCasa = numeroGolSquadraDiCasa;
    }

    public void setGetNumeroGolSquadraOspite(int getNumeroGolSquadraOspite) {
        this.getNumeroGolSquadraOspite = getNumeroGolSquadraOspite;
    }

    @Override
    public String toString() {
        return "PartitaDiCalcio{" +
                "id="  +
                ", squdraDiCasa='" + squdraDiCasa + '\'' +
                ", ospite='" + ospite + '\'' +
                ", squadraVincente='" + squadraVincente + '\'' +
                ", numeroGolSquadraDiCasa=" + numeroGolSquadraDiCasa +
                ", getNumeroGolSquadraOspite=" + getNumeroGolSquadraOspite +
                '}';
    }
}
