package Larionov.entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@DiscriminatorValue("gara_di_atletica")
public class GaraDiAtletica extends Evento{
    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "partecipante_id")
    private Persona partecipante;
    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "vincitore_id")
    private Persona vincitore;

   public GaraDiAtletica (){}
    public GaraDiAtletica(String titolo, LocalDate dataEvento, String descrizione,
                          TipoEvento tipoEvento, int numeroMassimoPartecipanti,
                          Location location, Persona atleta, Persona vincitore) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti, location);
        this.partecipante = atleta;
        this.vincitore = vincitore;
    }



    public Persona getAtleta() {
        return partecipante;
    }

    public Persona getVincitore() {
        return vincitore;
    }

    public void setAtleta(Persona atleta) {
        this.partecipante = atleta;
    }

    public void setVincitore(Persona vincitore) {
        this.vincitore = vincitore;
    }

    @Override
    public String toString() {
        return "GaraDiAtletica{" +
                "id=" +
                ", atleta=" + partecipante +
                ", vincitore=" + vincitore +
                '}';
    }
}
