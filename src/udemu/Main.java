package udemu;


public class Main {



    public static void main(String[] args) {

       FootballPlayer joe=new FootballPlayer("Joe");
        FootballPlayer marko=new FootballPlayer("Marko");
        Team<FootballPlayer> adelaideCrows= new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
        adelaideCrows.addPlayer(marko);
        adelaideCrows.addPlayer(marko);

    }
}
