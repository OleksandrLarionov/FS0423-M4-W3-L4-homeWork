package Larionov;

import Larionov.dao.EventoDAO;
import Larionov.dao.LocationDAO;
import Larionov.dao.PartecipazioneDAO;
import Larionov.dao.PersonaDAO;
import Larionov.entities.*;
import com.github.javafaker.Faker;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("FS0423-M4-W3-L4-homeWork");
    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        EventoDAO ed = new EventoDAO(em);
        PersonaDAO pd = new PersonaDAO(em);
        LocationDAO ld = new LocationDAO(em);
        PartecipazioneDAO partd = new PartecipazioneDAO(em);

        Faker faker = new Faker();

//        ********************CREAZIONE LOCATION****************
        Location tokyo = new Location("Giappone","Tokyo");
//        ld.save(tokyo);

        Location circoMassimo = new Location("Circo Massimo", "Roma");
//        ld.save(circoMassimo);

//        ********************CREAZIONE EVENTI****************
        Evento olimpiadi = new Evento("Nuoto", LocalDate.of(2024,2,25), "Olimpiadi di nuoto libero con lo skate",TipoEvento.PUBBLICO, 20000, tokyo);
//        ed.save(olimpiadi);

        Concerto fallingInReverse = new Concerto("Falling In Reverse", LocalDate.of(2023, 5, 22),"CONCERTONE MITICOO! WATCH THE WORLD BURN",TipoEvento.PUBBLICO,10000,circoMassimo, Genere.ROCK, Instreaming.TRUE);
//        ed.save(fallingInReverse);

        System.out.println("********************CREAZIONE DEL PARTECIPANTE********************");
        Persona paolo = new Persona("Paolo","Marchetti","paolo@mail.com", LocalDate.of(1991,4,25), Gender.MALE);
        Persona marco = new Persona("Marco","Carta","sondicarta@mail.com", LocalDate.of(1985,1,11), Gender.MALE);

//        pd.save(paolo);
//        pd.save(marco);

        System.out.println("******************************CONFERMO LA PARTECIPAZIONE*******************");
        Partecipazione partUno = new Partecipazione(paolo, olimpiadi, Stato.CONFERMATA);
        Partecipazione partDue = new Partecipazione(marco, olimpiadi, Stato.CONFERMATA);

//        partd.save(partUno);
//        partd.save(partDue);

        System.out.println("********************LISTA EVENTI********************");

//        List<Evento> listaEventi = ed.getAllEvents();
//        listaEventi.forEach(System.out::println);

        System.out.println("********************CONCERTO PER GENERE********************");

        ed.getCongertiPerGenere(Genere.ROCK).forEach(System.out::println);

        System.out.println("********************CONCERTO PER STREAMING********************");

        ed.getConcertiInStreaming(Instreaming.TRUE).forEach(System.out::println);


//        ********************DELETE EVENT****************
        System.out.println("********************EVENTI CANCELLATI********************");

//        ed.findByIdAndDelete(40);

        em.close();
        emf.close();
    }
}
