package VoetbalToernooi;

public class Main {
    public static void main(String[] args) {

        Toernooi crockyCup = new Toernooi("Crocky Cup");
        System.out.println("Welkom bij de "+crockyCup.getNaam());

        ProfessioneelTeam proTeam1 = new ProfessioneelTeam("Liverpool",0,"Red bull",400);
        ProfessioneelTeam proTeam2 = new ProfessioneelTeam("AC Milan",0,"Armani",300);
        ProfessioneelTeam proTeam3 = new ProfessioneelTeam("Ajax",0,"Ziggo",40);
        ProfessioneelTeam proTeam4 = new ProfessioneelTeam("Real Madrid",0,"El Toro Poker",800);

        AmateurTeam amTeam1 = new AmateurTeam("FC knudde",0,"Snake","De derde ronde");
        AmateurTeam amTeam2 = new AmateurTeam("Elinkwijk",0,"The super Dog","Heaven");
        AmateurTeam amTeam3 = new AmateurTeam("FC Pechvogels",0,"De Vogel","Het nest");
        AmateurTeam amTeam4 = new AmateurTeam("Duitsland 2018",0,"Low","Berlijn");

        crockyCup.addProfessioneelTeams(proTeam1);
        crockyCup.addProfessioneelTeams(proTeam2);
        crockyCup.addProfessioneelTeams(proTeam3);
        crockyCup.addProfessioneelTeams(proTeam4);

        crockyCup.addAmateurTeam(amTeam1);
        crockyCup.addAmateurTeam(amTeam2);
        crockyCup.addAmateurTeam(amTeam3);
        crockyCup.addAmateurTeam(amTeam4);

        crockyCup.EersteRonde();
        crockyCup.TweedeRonde();
        crockyCup.Finale();
        crockyCup.Winnaar();
    }
}
