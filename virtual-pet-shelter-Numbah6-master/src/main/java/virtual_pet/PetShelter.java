package virtual_pet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

import virtual_pet.VirtualPet;

public class PetShelter {
    //HashMap to hold the pets
    static HashMap<Integer, VirtualPet> pets = new HashMap<>();
    public static void rollCall(){
        

        // pets.put(1, pet1);
        pets.put(1, new VirtualPet("Archer", "Cat", "Male", 100, 100, 0, 0 ));
        pets.put(2, new VirtualPet("Jessie", "Cat", "Female", 100, 100, 0, 0 ));
        pets.put(3, new VirtualPet("Mittens", "Cat", "Male", 100, 100, 0, 0 ));
        pets.put(4, new VirtualPet("Gary", "Cat", "Female", 100, 100, 0, 0 ));
        pets.put(5, new VirtualPet("Goddard", "Dog", "Male", 100, 100, 0, 0 ));
        pets.put(6, new VirtualPet("Lady", "Dog", "Female", 100, 100, 0, 0 ));
        pets.put(7, new VirtualPet("Chip", "Dog", "Male", 100, 100, 0, 0 ));
        pets.put(8, new VirtualPet("Roxy", "Dog", "Female", 100, 100, 0, 0 ));
        pets.put(9, new VirtualPet("Zazu", "Bird", "Male", 100, 100, 0, 0 ));
        pets.put(10, new VirtualPet("Hedwig", "Bird", "Female", 100, 100, 0, 0 ));
        pets.put(11, new VirtualPet("Tweety", "Bird", "Male", 100, 100, 0, 0 ));
        pets.put(12, new VirtualPet("Ari", "Bird", "Female", 100, 100, 0, 0 ));
        pets.put(13, new VirtualPet("Bugs", "Rabbit", "Male", 100, 100, 0, 0 ));
        pets.put(14, new VirtualPet("Judy", "Rabbit", "Female", 100, 100, 0, 0 ));
        pets.put(15, new VirtualPet("Gumball", "Rabbit", "Male", 100, 100, 0, 0 ));
        pets.put(16, new VirtualPet("Ruby", "Rabbit", "Female", 100, 100, 0, 0 ));

        
        pets.forEach((k, v) -> System.out.println("\n" + v.getName()+ "\nHunger: "+ v.getHunger()+ ", Thirst: "+ v.getThirst()+ ", Boredom:  "+ v.getBoredLevel()+ ", Tiredness: "+ v.getTiredness()));
    
        
    }

    

    //Method for calling the name
    public static void petName(String name){
        HashMap<Integer, String> names = new HashMap<>();
        names.put(1,"Ari");
        names.put(2,"Hedwig");
        names.put(3,"Tweety");
        names.put(4,"Zazu");
        names.put(5,"Archer");
        names.put(6,"Gary");
        names.put(7,"Jessie");
        names.put(8,"Mittens");
        names.put(9,"Chip");
        names.put(10,"Goddard");
        names.put(11,"Lady");
        names.put(12,"Roxy");
        names.put(13,"Bugs");
        names.put(14,"Gumball");
        names.put(15,"Judy");
        names.put(16,"Ruby");
        
        System.out.println(names);
    }

    //

    //HashMap to hold the birds
    public void allBirds(){
        // pets.put(9, new VirtualPet("Zazu", "Bird", "Male", 100, 100, 0, 0 ));
        // pets.put(10, new VirtualPet("Hedwig", "Bird", "Female", 100, 100, 0, 0 ));
        // pets.put(11, new VirtualPet("Tweety", "Bird", "Male", 100, 100, 0, 0 ));
        // pets.put(12, new VirtualPet("Ari", "Bird", "Female", 100, 100, 0, 0 ));
    }

    //HashMap to hold the cats
    public static void allCats(){
        HashMap<Integer, VirtualPet> cats = new HashMap<>();   
        cats.put(1, new VirtualPet("\nArcher", "Cat", "Male", 100, 100, 0, 0 ));
        cats.put(2, new VirtualPet("Jessie", "Cat", "Female", 100, 100, 0, 0 ));
        cats.put(3, new VirtualPet("Mittens", "Cat", "Male", 100, 100, 0, 0 ));
        cats.put(4, new VirtualPet("Gary", "Cat", "Female", 100, 100, 0, 0 ));

        cats.forEach((k, v) -> System.out.println("\n"+v.getName()+ "\nHunger: "+ v.getHunger()+ ", Thirst: "+ v.getThirst()+ ", Boredom: "+ v.getBoredLevel()+ ", Tiredness: "+ v.getTiredness()));

        

        
        
        List<String> catQuestions = new ArrayList<>();
        catQuestions.add("\nThese are all the cats housed at the shelter at the moment");
        catQuestions.add("\nHow would you like to take care of them today?");
        catQuestions.add("\n1.Take care of all the cats at once?");
        catQuestions.add("2.Take care of a specific cat?");
        catQuestions.add("3.Adopt a cat to a loving family? ");
        catQuestions.add("4.Add a new cat the roster.");
        catQuestions.add("5.Go back to the main menu.");

        boolean helping = true;
        while(helping){
            for(String ques : catQuestions){
                System.out.println(ques);
                helping = false;
            }
        }

        Scanner userInput = new Scanner(System.in);
        int catChoice = userInput.nextInt();
        userInput.nextLine();
        switch(catChoice){
            case 1:
            
            break;

            case 2:
            System.out.println("Which cat would you like to take care of?");
            
            
        
            break;

            case 3:
            System.out.println("");
            break;

            case 4:
            addAPet(cats);
            break;

            case 5:
            PetShelter.taskChoice();
            PetShelter.taskAnswer();
            break;

            default:
            System.out.println("");
            break;
        }

    }



    //HashMap to hold the dogs
    public void allDogs (){
        // pets.put(5, new VirtualPet("Goddard", "Dog", "Male", 100, 100, 0, 0 ));
        // pets.put(6, new VirtualPet("Lady", "Dog", "Female", 100, 100, 0, 0 ));
        // pets.put(7, new VirtualPet("Chip", "Dog", "Male", 100, 100, 0, 0 ));
        // pets.put(8, new VirtualPet("Roxy", "Dog", "Female", 100, 100, 0, 0 ));
    }

    //HashMap to hold the rabbits
    public void allRabbits(){
        // pets.put(13, new VirtualPet("Bugs", "Rabbit", "Male", 100, 100, 0, 0 ));
        // pets.put(14, new VirtualPet("Judy", "Rabbit", "Female", 100, 100, 0, 0 ));
        // pets.put(15, new VirtualPet("Judy", "Rabbit", "Male", 100, 100, 0, 0 ));
        // pets.put(16, new VirtualPet("Ruby", "Rabbit", "Female", 100, 100, 0, 0 ));
    }

    //Methods to interact with all the pets at once
    public static void takeAttendance(){
        
    }

    

    public void feedAll(){

    }
    
    
    


    

    


    //Asking the user how they would like to handle today
    public static void taskChoice(){
        List<String> allQuestions = new ArrayList<>();
        allQuestions.add("What task would you like to work on today?");
        allQuestions.add("1.Take care of the birds?");
        allQuestions.add("2.Take care of the cats?");
        allQuestions.add("3.Take care of the dogs?");
        allQuestions.add("4.Take care of the rabbits?");
        allQuestions.add("5.Bring in volunteers to help take care of everybody?");
        allQuestions.add("6.Adopt a pet to a loving family?");
        allQuestions.add("7.Take in a new pet?");
        allQuestions.add("8.Call in volunteers and take a break?");

        boolean helping = true;
        while(helping){
            for(String ques : allQuestions){
                System.out.println(ques);
                helping = false;
            }
        }
    }

    //taking the answer and doing something with it
    public static void taskAnswer(){
        Scanner userInput = new Scanner(System.in);
        int taskAnswer = userInput.nextInt();
        userInput.nextLine();
        switch (taskAnswer){
            case 1:
            System.out.println("You decided to take care of the birds today.");
            break;

            case 2:
            System.out.println("You decided to take care of the cats today.");
            allCats();
            userInput.nextLine();
            
            break;

            case 3:
            System.out.println("You decided to take care of the dogs today.");
            break;

            case 4:
            System.out.println("You decided to take care of the rabbits today.");
            break;

            case 5:
            System.out.println("You decided to call in backup to take care of everybody today.");
            PetShelter.rollCall();
            userInput.nextLine();
            break;

            case 6:
            System.out.println("Someone came by to adopt a pet. Can you recommend one for them?");
            break;

            case 7:
            System.out.println("Someone found a pet in the street and decided to bring them to your shelter.");
            break;

            case 8:
            System.out.println("You took a much needed day off to recharge!");
            break;

            default:
            System.out.println("That's not a valid answer please try again");
            break;
        }
        userInput.close();
    }

    // general method for adding a animal 
    public static VirtualPet addAPet(HashMap<Integer, VirtualPet> petMap){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the pets name: ");
        String name = userInput.nextLine();

        System.out.println("Please enter the type of animal it is (We can only accept birds, cats, dogs, and rabbits at this time): ");
        String type = userInput.nextLine();

        System.out.println("Please enter the pets gender: ");
        String gender = userInput.nextLine();

        userInput.close();

        int nextKey = 1;
        if(!petMap.isEmpty()) {
            nextKey = petMap.keySet().stream().max(Integer::compareTo).orElse(0) + 1;
        }
        VirtualPet newPet = new VirtualPet(name, type, gender, 100, 100, 0, 0);
        return petMap.put(nextKey, newPet);
    }

    

        
    
        
    

    

    

    



}

