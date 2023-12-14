package Larionov.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
@Entity
public class GaraDiAtletica extends Evento{
    @Id
    @GeneratedValue
    private long id;
   private Persona atleta;
   private Persona vincitore;

   public GaraDiAtletica (){}
    public GaraDiAtletica(String titolo, LocalDate dataEvento, String descrizione,
                          TipoEvento tipoEvento, int numeroMassimoPartecipanti,
                          Location location, Persona atleta, Persona vincitore) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti, location);
        this.atleta = atleta;
        this.vincitore = vincitore;
    }

    @Override
    public long getId() {
        return id;
    }

    public Persona getAtleta() {
        return atleta;
    }

    public Persona getVincitore() {
        return vincitore;
    }

    public void setAtleta(Persona atleta) {
        this.atleta = atleta;
    }

    public void setVincitore(Persona vincitore) {
        this.vincitore = vincitore;
    }

    @Override
    public String toString() {
        return "GaraDiAtletica{" +
                "id=" + id +
                ", atleta=" + atleta +
                ", vincitore=" + vincitore +
                '}';
    }
}
