package Larionov.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.time.LocalDate;
@Entity
public class PartitaDiCalcio extends Evento{
    @GeneratedValue
    private long id;
    private String squdraDiCasa;
    private String ospite;
    private String squadraVincente;
    private int numeroGolSquadraDiCasa;
    private int getNumeroGolSquadraOspite;

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

    @Override
    public long getId() {
        return id;
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
                "id=" + id +
                ", squdraDiCasa='" + squdraDiCasa + '\'' +
                ", ospite='" + ospite + '\'' +
                ", squadraVincente='" + squadraVincente + '\'' +
                ", numeroGolSquadraDiCasa=" + numeroGolSquadraDiCasa +
                ", getNumeroGolSquadraOspite=" + getNumeroGolSquadraOspite +
                '}';
    }
}
