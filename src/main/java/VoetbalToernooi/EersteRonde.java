package VoetbalToernooi;

import java.util.List;
import java.util.Random;

public class EersteRonde {
    private final Toernooi toernooi;
    Random rand = new Random();

    public EersteRonde(Toernooi toernooi) {
        this.toernooi = toernooi;
    }

    public void berekenScorePro(List<ProfessioneelTeam> teamList, int kans){
        // loop door eerst array om score te vullen
        for (int i = 0; i < teamList.size(); i++) {
            int n = rand.nextInt(kans);
            teamList.get(i).setScore(n);
        }
    }

    public void berekenScoreAm(List<AmateurTeam> teamList, int kans){
        // loop door eerst array om score te vullen
        for (int i = 0; i < teamList.size(); i++) {
            int n = rand.nextInt(kans);
            teamList.get(i).setScore(n);
        }
    }
    public void EersteRonde() {

        berekenScorePro(toernooi.getProfessioneelTeams(),11);
        berekenScoreAm(toernooi.getAmateurTeams(),7);

        //stand Eerste ronde

        System.out.println("Eerste Ronde:");
        stand(0,0);
        stand(1,1);
        stand(2,2);
        stand(3,3);

        // loop door met if die kijkt welke score hoger is de hoogte blijft in zijn lijst, als score gelijk is dan nog keer spelen
        for (int i = 0; i < toernooi.getAmateurTeams().size(); i++) {
            if (toernooi.getAmateurTeams().get(i).getScore() > toernooi.getProfessioneelTeams().get(i).getScore()) {
                toernooi.addTweedeRondeTeams(toernooi.getAmateurTeams().get(i));

            } else if (toernooi.getAmateurTeams().get(i).getScore() < toernooi.getProfessioneelTeams().get(i).getScore()) {
                toernooi.addTweedeRondeTeams(toernooi.getProfessioneelTeams().get(i));
            } else if (toernooi.getAmateurTeams().get(i).getScore() == toernooi.getProfessioneelTeams().get(i).getScore()) {


                berekenScorePro(toernooi.getProfessioneelTeams(),11);
                berekenScoreAm(toernooi.getAmateurTeams(),7);


                if (toernooi.getAmateurTeams().get(i).getScore() > toernooi.getProfessioneelTeams().get(i).getScore()) {
                    toernooi.addTweedeRondeTeams(toernooi.getAmateurTeams().get(i));

                } else if (toernooi.getAmateurTeams().get(i).getScore() < toernooi.getProfessioneelTeams().get(i).getScore()) {
                    toernooi.addTweedeRondeTeams(toernooi.getProfessioneelTeams().get(i));
                } else {
                    //bij een tweede gelijkspel pro team door net als fifa hoger op coeffientlijst gaat door
                    toernooi.addTweedeRondeTeams(toernooi.getProfessioneelTeams().get(i));
                }

            }

        }
    }

    public void stand(int team1,int team2) {
        System.out.println("stand " + toernooi.getProfessioneelTeams().get(team1).getScore() + " - " + toernooi.getAmateurTeams().get(team2).getScore() + " " + toernooi.getProfessioneelTeams().get(team1).getNaam() + " - " + toernooi.getAmateurTeams().get(team2).getNaam());
        System.out.println();
    }
}