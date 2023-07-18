package virtual_pet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VirtualPet {
    //Adding instance variables 
    private String name;
    private String type;
    private String gender;
    private int hunger = 100;
    private int thirst = 100;
    private int bladder = 0;
    private int boredLevel = 0;
    private int sickness = 0;
    private int tiredness = 0;
    private int eatPoints = 50;

    //Constructor 
    public VirtualPet(String name, String type, String gender, int hunger, int thirst, int boredLevel, int tiredness){
        this.name = name;
        this.type = type;
        this.gender = gender;
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredLevel = boredLevel;
        this.tiredness = tiredness;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  String getType() {
        return type;
    }

    public  void setType(String type) {
        this.type = type;
    }

    public  String getGender() {
        return gender;
    }

    public  void setGender(String gender) {
        this.gender = gender;
    }

    public  int getHunger() {
        return hunger;
    }

    public  void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public  int getThirst() {
        return thirst;
    }

    public  void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public int getBladder() {
        return bladder;
    }

    public void setBladder(int bladder) {
        this.bladder = bladder;
    }

    public  int getBoredLevel() {
        return boredLevel;
    }

    public  void setBoredLevel(int boredLevel) {
        this.boredLevel = boredLevel;
    }

    public int getSickness() {
        return sickness;
    }

    public void setSickness(int sickness) {
        this.sickness = sickness;
    }

    public  int getTiredness() {
        return tiredness;
    }

    public  void setTiredness(int tiredness) {
        this.tiredness = tiredness;
    }

    //Gets
    public String petName(){
        return name;
    }

    public int petHunger(){
        return hunger;
    }

    public int petThirst(){
        return thirst;
    }

    public int petBoredLevel(){
        return boredLevel;
    }

    public int petTired(){
        return tiredness;
    }

    //Showing instance variables that update 
    // public void displayPets(){
    //     System.out.println("Name: "+name);
    //     System.out.println("Hunger: "+hunger);
    //     System.out.println("Thirst: "+thirst);
    //     System.out.println("Boredom: "+boredLevel);
    //     System.out.println("Tiredness "+tiredness);
    // }
    
    //method for asking and looping through the questions
    public  void listQuestions(){
        List<String> questions = new ArrayList<>();
        questions.add("What would you like to do with "+name+"?");
        questions.add("1.Feed "+name+" ?");
        questions.add("2. Give "+name+" water?");
        questions.add("3. Play with "+name+" ?");
        questions.add("4. Tell "+name+" to go to sleep? ");
        questions.add("5. Do nothing. ");

        boolean playing = true;
        while(playing){
            // displayPets();
            for (String question : questions){
            System.out.println(question);
            playing = false;
        }
    }
    }

    public  void petAnswer(){
        Scanner userInput = new Scanner(System.in);
        int petChoice = userInput.nextInt();
            userInput.nextLine();
            switch(petChoice){
                case 1:
                System.out.println("You gave "+name+" some food.");
                eat(petChoice);
                break;

                case 2:
                System.out.println("You gave "+name+" some water");
                drink(petChoice);;

                case 3:
                System.out.println("You took "+name+"to the park to play");
                play(petChoice);
                break;

                case 4:
                System.out.println(name+" went to sleep...sweet dreams!");
                sleep(petChoice);
                break;

                case 5:
                System.out.println("You and "+name+" decided to be lazy today");
                lazy(petChoice);
                break;

                default:
                System.out.println("Thats not a valid answer, please try again");
                userInput.close();
                break;

            }
    }

    //method to break out of the loop
    public  void loopBreak(){
        System.out.println("Would you like to keep playing? Yes/No");
            Scanner userInput = new Scanner(System.in);
            String keepPlaying = userInput.nextLine();
            if(keepPlaying.equalsIgnoreCase("yes")){
            }
            else if (keepPlaying.equalsIgnoreCase("no")) {
                //Closing the scanner
                System.out.println("Goodbye, "+name+" will miss you!");
                System.exit(0);
            } else {
                System.out.println("That's not a valid answer");
            }
    }



    public  void eat(int petChoice){
    this.hunger += 30;
    this.thirst -= 5;
    System.out.println(name+"has eaten a hearty meal!");
}

public  void drink(int petChoice){
    thirst += 30;
    System.out.println(name+" has drunk some water!");
}

public  void play(int petChoice){
    boredLevel -= 20;
    System.out.println(name+" had a blast playing at the park!");
}

public  void sleep(int petChoice){
    tiredness -= 20;
    System.out.println(name+"After a good night's rest, "+name+" feels refreshed!");
}

public  void lazy(int petChoice){
    System.out.println("You and "+name+" decided to spend the day loafing around!");
    hunger -= 10;
    thirst -= 10;
    boredLevel += 10;
    tiredness += 10;
}

public  void tick(){
    hunger -= 5;
    thirst -= 5;
    boredLevel += 5;
    tiredness += 5;
}




}
