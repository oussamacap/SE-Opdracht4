package VoetbalToernooi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Toernooi {
    private final EersteRonde eersteRonde = new EersteRonde(this);
    private final TweedeRonde tweedeRonde = new TweedeRonde(this);
    private final Finale finale = new Finale(this);
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


    public void EersteRonde() {
        eersteRonde.EersteRonde();
    }

    public void TweedeRonde() {
        tweedeRonde.TweedeRonde();
    }

    public void Finale() {
        finale.Finale();
    }
}
