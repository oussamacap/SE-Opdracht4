package VoetbalToernooi;

import java.util.Random;

public class TweedeRonde {
    Random rand = new Random();
    private final Toernooi toernooi;

    public TweedeRonde(Toernooi toernooi) {
        this.toernooi = toernooi;
    }

    public void TweedeRonde() {
        // loop door de nieuwe array om score in te vullen
        ScoreTweedeRonde();

        //stand Tweederonde
        System.out.println("Tweede Ronde:");
        standTweedeRonde(0,1);
        standTweedeRonde(2,3);

        //team 1 tegen 2 if
        //verliezer uit de lijst
        uitslagTweedeRonde(0, 1);

        // team 3 tegen 4 if
        uitslagTweedeRonde(1, 2);
    }

    private void ScoreTweedeRonde() {
        for (int i = 0; i < toernooi.getTweedeRondeTeams().size(); i++) {
            int n = toernooi.rand.nextInt(11);
            toernooi.getTweedeRondeTeams().get(i).setScore(n);
        }
    }

    private void uitslagTweedeRonde(int i2, int i3) {
        // verliezer uit de lijst
        if (toernooi.getTweedeRondeTeams().get(i2).getScore() > toernooi.getTweedeRondeTeams().get(i3).getScore()) {
            toernooi.deleteTweedeRondeTeams(toernooi.getTweedeRondeTeams().get(i3));
        } else if (toernooi.getTweedeRondeTeams().get(i2).getScore() < toernooi.getTweedeRondeTeams().get(i3).getScore()) {
            toernooi.deleteTweedeRondeTeams(toernooi.getTweedeRondeTeams().get(i2));
        } else {
            toernooi.deleteTweedeRondeTeams(toernooi.getTweedeRondeTeams().get(i3));
        }
    }
    public void standTweedeRonde(int team1,int team2) {
        System.out.println("stand " + toernooi.getTweedeRondeTeams().get(team1).getScore() + " - " + toernooi.getTweedeRondeTeams().get(team2).getScore() + " " + toernooi.getTweedeRondeTeams().get(team1).getNaam() + " - " + toernooi.getTweedeRondeTeams().get(team2).getNaam());
        System.out.println();
    }
}