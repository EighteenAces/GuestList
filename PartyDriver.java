/*******************************************
 * Java Course 2 Module 3 Ungraded Activity
 * 
 * Guest List 
 * 
 * @author: Jellie Mae Ortiz
 * Date Created: May 18, 2022
 ******************************************/

public class PartyDriver {

    public static void main(String[] args) {

        Party party = new Party(3, "David Beckham");

        party.addGuest("Roberto Baggio");
        party.addGuest("Zinedine Zidane");
        party.addGuest("Roberto Baggio");
        party.addGuest("Johan Cruyff");
        party.addGuest("Diego Maradona");
        party.printParty();

    } // end main
} //end of program
