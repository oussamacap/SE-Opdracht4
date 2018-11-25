package VoetbalToernooi;

public class ProfessioneelTeam extends Team {
    private String sponsor;
    private int budget;

    public ProfessioneelTeam(String naam, int score, String sponsor, int budget) {
        super(naam, score);
        this.sponsor = sponsor;
        this.budget = budget;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}
