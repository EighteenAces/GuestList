/*******************************************
 * Java Course 2 Module 3 Ungraded Activity
 * 
 * Guest List 
 * 
 * @author: Jellie Mae Ortiz
 * Date Created: May 18, 2022
 ******************************************/

public class Party {

    private int maxNumofGuest;
    private int numOfGuests;
    private String partyHostName;
    private String guestName[]; // guest's names will be stored here

    public Party(int maxGuest, String hostName) { // constructor with 2 parameters 

        this.maxNumofGuest = maxGuest;
        this.partyHostName = hostName;
        this.guestName = new String[maxGuest];

    }

    public void addGuest(String guestName) { //main function of the program that gives the parameter's value 

        if (numOfGuests >= maxNumofGuest) { //tests if  he number of guests exceeds to the maximum number of guests & prints it 

            System.out.println(guestName + " cannot come to the party. The guest list is full.");
        }

        else if (isOnList(guestName)) { //tests if the guest is already on the list 

            System.out.println(guestName + " " + "is already on the party list.");

        }

        else {

            for (int i = 0; i < this.guestName.length; i++) { // iterates/loops depending of the number of the guests 

                if (this.guestName[i] == null) { // test if the guest name's index number is null
                    this.guestName[i] = guestName; 
                    numOfGuests += 1; // increases the number of guests 
                    break;
                }
            }
        }
    }

    private boolean isOnList(String guest) { //checks if the guest name is already included in the guest list & executes it 

        for(int i = 0; i < this.guestName.length; i++){

            if(this.guestName[i] == null){

                    return false;

            }
            else if(this.guestName[i].equals(guest)){

                return true;
            }
        }

        return false;
    }
    

    public void printParty() { //displays the value of the guest name with party host name 

        System.out.println("\nThe Guest list for " + partyHostName + "'s Party:");

        for (int i = 0; i < this.guestName.length; i++) {

            System.out.println(this.guestName[i]);
        }
    }
} //end of Party class 