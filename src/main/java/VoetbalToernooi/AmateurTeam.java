package VoetbalToernooi;

public class AmateurTeam extends Team {
    private String drinkMascotte;
    private String honkKroeg;

    public AmateurTeam(String naam, int score, String drinkMascotte, String honkKroeg) {
        super(naam, score);
        this.drinkMascotte = drinkMascotte;
        this.honkKroeg = honkKroeg;
    }

    public String getDrinkMascotte() {
        return drinkMascotte;
    }

    public void setDrinkMascotte(String drinkMascotte) {
        this.drinkMascotte = drinkMascotte;
    }

    public String getHonkKroeg() {
        return honkKroeg;
    }

    public void setHonkKroeg(String honkKroeg) {
        this.honkKroeg = honkKroeg;
    }
}
