import java.util.ArrayList;
import java.util.List;

public class OlympicSports {
  public static void main(String[] args) {
        NSF nsf1 = new NSF("baseball", "UK");
        NSF nsf2 = new NSF("football", "Ukraine");
        NSF nsf3 = new NSF("soccer", "USA");
        NSF nsf4 = new NSF("swim", "Sweden");
        NSF nsf5 = new NSF("climb", "Germany");

        ISF isf1 = new ISF("A"); //3 nsfs here
        ISF isf2 = new ISF("B"); //2nsfs here
        isf1.addNSF(nsf1);
        isf1.addNSF(nsf2);
        isf1.addNSF(nsf3);

        isf2.addNSF(nsf4);
        isf2.addNSF(nsf5);
        List<ISF> listISF = new ArrayList<>();
        listISF.add(isf1);
        listISF.add(isf2);


        IOC ioc1 = new IOC("ioc1");
        ioc1.setIsfs(listISF);


        Player pl1 = new Player("Bob1", "Smith1");
        Player pl2 = new Player("Bob2", "Smith2");
        Player pl3 = new Player("Bob3", "Smith3");
        Player pl4 = new Player("Bob4", "Smith4");
        Player pl5 = new Player("Bob5", "Smith5");
        Player pl6 = new Player("Bob6", "Smith6");
        Player pl7 = new Player("Bob7", "Smith7");
        Player pl8 = new Player("Bob8", "Smith8");
        Player pl9 = new Player("Bob9", "Smith9");
        Player pl10 = new Player("Bob10", "Smith10");
        Player pl11 = new Player("Bob11", "Smith11");
        Player pl12 = new Player("Bob12", "Smith12");
        Player pl13 = new Player("Bob13", "Smith13");
        Player pl14 = new Player("Bob14", "Smith14");
        Player pl15 = new Player("Bob15", "Smith15");

        //add players to the nsfs
        nsf1.addPlayer(pl1);
        nsf1.addPlayer(pl2);
      nsf1.addPlayer(pl3);
      nsf1.addPlayer(pl15);
      nsf1.addPlayer(pl13);

      nsf2.addPlayer(pl4);
      nsf2.addPlayer(pl5);
      nsf2.addPlayer(pl6);

      nsf3.addPlayer(pl7);
      nsf3.addPlayer(pl8);
      nsf3.addPlayer(pl9);

      nsf4.addPlayer(pl10);
      nsf4.addPlayer(pl11);
      nsf4.addPlayer(pl12);

      nsf5.addPlayer(pl3);
      nsf5.addPlayer(pl14);
      nsf5.addPlayer(pl5);

      //3 players with at least 2 national sports federations
      pl1.addNSF(nsf1);
      pl1.addNSF(nsf2);
      pl1.addNSF(nsf3);

      pl2.addNSF(nsf4);
      pl2.addNSF(nsf5);

      pl3.addNSF(nsf1);
      pl3.addNSF(nsf2);
      pl3.addNSF(nsf3);
      pl3.addNSF(nsf4);
      pl3.addNSF(nsf5);

      //display players for nsfs
      System.out.println("The list of players for the first nsf is: ");
      nsf1.listNSFPlayers();
      System.out.println("\n" + "The list of players for the second nsf is: ");
      nsf2.listNSFPlayers();
      System.out.println("\n" + "The list of players for the third nsf is: ");
      nsf3.listNSFPlayers();
      System.out.println("\n" + "The list of players for the fourth nsf is: ");
      nsf4.listNSFPlayers();
      System.out.println("\n" + "The list of players for the fifth nsf is: ");
      nsf5.listNSFPlayers();

      //display nsfs for some two players
      System.out.println("\n" + "The list of nsfs for the first player is: ");
      pl1.listPlayerNSFs();
      System.out.println("\n" + "The list of nsfs for the second player is: ");
      pl3.listPlayerNSFs();

      //Display the total number of players registered with NSFs in each ISF, and in the IOC
      System.out.println("\n" + "The total number of players in the first international sports league is " + isf1.countPlayersInNSFs());
      System.out.println("The total number of players in the second international sports league is " + isf2.countPlayersInNSFs());
      System.out.println("The total number of players in the first internal olympics committee is " + ioc1.countPlayersInISFNSFs());
    }

}
