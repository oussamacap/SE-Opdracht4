package VoetbalToernooi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Toernooi {
    private String naam;
    Random rand = new Random();
    private List<ProfessioneelTeam> professioneelTeams;
    private List<AmateurTeam> amateurTeams;
    private List<Team> tweedeRondeTeams;

    public Toernooi(String naam) {
        this.naam = naam;
        this.professioneelTeams = new ArrayList<>();
        this.amateurTeams = new ArrayList<>();
        this.tweedeRondeTeams = new ArrayList<>();
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public List<ProfessioneelTeam> getProfessioneelTeams() {
        return professioneelTeams;
    }

    public void setProfessioneelTeams(List<ProfessioneelTeam> professioneelTeams) {
        this.professioneelTeams = professioneelTeams;
    }

    public List<AmateurTeam> getAmateurTeams() {
        return amateurTeams;
    }

    public void setAmateurTeams(List<AmateurTeam> amateurTeams) {
        this.amateurTeams = amateurTeams;
    }

    public List<Team> getTweedeRondeTeams() {
        return tweedeRondeTeams;
    }

    public void setTweedeRondeTeams(List<Team> tweedeRondeTeams) {
        this.tweedeRondeTeams = tweedeRondeTeams;
    }

    public void addAmateurTeam(AmateurTeam amateurTeam) {
        this.amateurTeams.add(amateurTeam);
    }

    public void deleteAmateurTeam(AmateurTeam amateurTeam) {
        this.amateurTeams.remove(amateurTeam);
    }

    public void addProfessioneelTeams(ProfessioneelTeam professioneelTeam) {
        this.professioneelTeams.add(professioneelTeam);
    }

    public void deleteProfessioneelTeams(ProfessioneelTeam professioneelTeam) {
        this.professioneelTeams.remove(professioneelTeam);
    }

    public void addTweedeRondeTeams(Team team) {
        this.tweedeRondeTeams.add(team);
    }

    public void deleteTweedeRondeTeams(Team team) {
        this.tweedeRondeTeams.remove(team);
    }


    public void EersteRonde(){
        // loop door eerst array om score te vullen
        for (int i = 0; i <professioneelTeams.size() ; i++) {
            int n = rand.nextInt(11);
            professioneelTeams.get(1).setScore(n);
        }

        // loop door tweede array om score te vullen, deze teams zijn zwakker door het lastiger is voor hun om te winnen,daarom is bound iets lager gezet
        for (int i = 0; i <amateurTeams.size() ; i++) {
            int n = rand.nextInt(9);
            amateurTeams.get(1).setScore(n);
        }

        //stand Eerste ronde
        System.out.println("stand "+professioneelTeams.get(0).getScore()+" - "+amateurTeams.get(0).getScore()+" "+professioneelTeams.get(0).getNaam()+" - "+amateurTeams.get(0).getNaam());
        System.out.println();
        System.out.println("stand "+professioneelTeams.get(1).getScore()+" - "+amateurTeams.get(1).getScore()+" "+professioneelTeams.get(1).getNaam()+" - "+amateurTeams.get(1).getNaam());
        System.out.println();
        System.out.println("stand "+professioneelTeams.get(2).getScore()+" - "+amateurTeams.get(2).getScore()+" "+professioneelTeams.get(2).getNaam()+" - "+amateurTeams.get(2).getNaam());
        System.out.println();
        System.out.println("stand "+professioneelTeams.get(3).getScore()+" - "+amateurTeams.get(3).getScore()+" "+professioneelTeams.get(3).getNaam()+" - "+amateurTeams.get(3).getNaam());
        System.out.println();



        // loop door met if die kijkt welke score hoger is de hoogte blijft in zijn lijst, als score gelijk is dan nog keer spelen
        for (int i = 0; i <amateurTeams.size() ; i++) {
            System.out.println();
            if(amateurTeams.get(i).getScore() > professioneelTeams.get(i).getScore()){
                addTweedeRondeTeams(amateurTeams.get(i));

            } else if (amateurTeams.get(i).getScore() < professioneelTeams.get(i).getScore()){
                addTweedeRondeTeams(professioneelTeams.get(i));
            } else if (amateurTeams.get(i).getScore() == professioneelTeams.get(i).getScore()) {

                int nPro = rand.nextInt(11);
                int nAm = rand.nextInt(6);

                professioneelTeams.get(i).setScore(nPro);
                amateurTeams.get(i).setScore(nAm);

                if(amateurTeams.get(i).getScore() > professioneelTeams.get(i).getScore()){
                    addTweedeRondeTeams(amateurTeams.get(i));

                } else if (amateurTeams.get(i).getScore() < professioneelTeams.get(i).getScore()){
                    addTweedeRondeTeams(professioneelTeams.get(i));
                } else {
                   //bij een tweede gelijkspel pro team door net als fifa hoger op coeffientlijst gaat door
                    addTweedeRondeTeams(professioneelTeams.get(i));
                }

            }

        }
    }
    public void TweedeRonde(){
        // loop door de nieuwe array om score in te vullen
        for (int i = 0; i < tweedeRondeTeams.size(); i++) {
            int n = rand.nextInt(11);
            tweedeRondeTeams.get(i).setScore(n);
        }

        //stand Tweederonde
        System.out.println("stand "+tweedeRondeTeams.get(0).getScore()+" - "+tweedeRondeTeams.get(0).getScore()+" "+tweedeRondeTeams.get(0).getNaam()+" - "+tweedeRondeTeams.get(1).getNaam());
        System.out.println();
        System.out.println("stand "+tweedeRondeTeams.get(2).getScore()+" - "+tweedeRondeTeams.get(3).getScore()+" "+tweedeRondeTeams.get(2).getNaam()+" - "+tweedeRondeTeams.get(3).getNaam());


        //team 1 tegen 2 if
        //verliezer uit de lijst
        if (tweedeRondeTeams.get(0).getScore() > tweedeRondeTeams.get(1).getScore()){
            deleteTweedeRondeTeams(tweedeRondeTeams.get(1));
        } else   if (tweedeRondeTeams.get(0).getScore() < tweedeRondeTeams.get(1).getScore()) {
            deleteTweedeRondeTeams(tweedeRondeTeams.get(0));
        } else {
            deleteTweedeRondeTeams(tweedeRondeTeams.get(1));
        }

        // team 3 tegen 4 if
        // verliezer uit de lijst
        if (tweedeRondeTeams.get(1).getScore() > tweedeRondeTeams.get(2).getScore()){
            deleteTweedeRondeTeams(tweedeRondeTeams.get(2));
        } else   if (tweedeRondeTeams.get(1).getScore() < tweedeRondeTeams.get(2).getScore()) {
            deleteTweedeRondeTeams(tweedeRondeTeams.get(1));
        } else {
            deleteTweedeRondeTeams(tweedeRondeTeams.get(2));
        }


    }

    public void Finale(){
        // loop door laatste team
        // if
       
        // loop door de nieuwe array om score in te vullen
        for (int i = 0; i < tweedeRondeTeams.size(); i++) {
            int n = rand.nextInt(11);
            tweedeRondeTeams.get(i).setScore(n);
        }

        //stand finale
        System.out.println();
        System.out.println("stand "+tweedeRondeTeams.get(0).getScore()+" - "+tweedeRondeTeams.get(1).getScore()+" "+tweedeRondeTeams.get(0).getNaam()+" - "+tweedeRondeTeams.get(1).getNaam());
        System.out.println();

        //team 1 tegen 2 if
        //verliezer uit de lijst
        if (tweedeRondeTeams.get(0).getScore() > tweedeRondeTeams.get(1).getScore()){
            deleteTweedeRondeTeams(tweedeRondeTeams.get(1));
        } else   if (tweedeRondeTeams.get(0).getScore() < tweedeRondeTeams.get(1).getScore()) {
            deleteTweedeRondeTeams(tweedeRondeTeams.get(0));
        } else {
            deleteTweedeRondeTeams(tweedeRondeTeams.get(1));
        }
    }

    // winnaars naam  en andere dingen in sout
    public void Winnaar(){
        for (int i = 0; i < tweedeRondeTeams.size(); i++) {
            if (tweedeRondeTeams.get(i).getNaam().equals(amateurTeams.get(i).getNaam())){
                System.out.println("Wie dat gedacht team "+amateurTeams.get(i).getNaam()+" is de Winnaaarrr");
                System.out.println("Zie "+amateurTeams.get(i).getDrinkMascotte()+" dansen");
            } else if (tweedeRondeTeams.get(i).getNaam().equals(professioneelTeams.get(i).getNaam())){
                System.out.println("Natuurlijk is "+professioneelTeams.get(i).getNaam()+" de winnaar");
                System.out.println("De sponsor "+professioneelTeams.get(i).getSponsor()+" zal uiteraad zeer bij zijn met de winst");
            }
        }
    }
    
}
