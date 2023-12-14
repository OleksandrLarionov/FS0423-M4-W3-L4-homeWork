package Larionov.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Concerto extends Evento{
    @Id
    @GeneratedValue
    private long id;
    @Enumerated(EnumType.STRING)
    private Genere genere;
    @Enumerated(EnumType.STRING)
    private Instreaming instreaming;


    public Concerto(){}
    public Concerto(String titolo, LocalDate dataEvento, String descrizione,
                    TipoEvento tipoEvento, int numeroMassimoPartecipanti,
                    Location location, Genere genere, Instreaming instreaming) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti, location);
        this.genere = genere;
        this.instreaming = instreaming;
    }

    @Override
    public long getId() {
        return id;
    }

    public Genere getGenere() {
        return genere;
    }

    public Instreaming getInstreaming() {
        return instreaming;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    public void setInstreaming(Instreaming instreaming) {
        this.instreaming = instreaming;
    }

    @Override
    public String toString() {
        return "Concerto{" +
                "id=" + id +
                ", genere=" + genere +
                ", instreaming=" + instreaming +
                '}';
    }
}
