package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        //Interact with a VirtualPet object in this method

        //Scanner for user interaction
        Scanner userInput = new Scanner(System.in);

        boolean playing = true;
        
        while(playing){
            PetShelter.taskChoice();
            PetShelter.taskAnswer();
        }

    // PetShelter.allCats();

        

        userInput.close();
        
        
        
    }

}
