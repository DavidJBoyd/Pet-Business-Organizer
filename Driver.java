import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeylist = new ArrayList<Monkey>();
    // Instance variables (if needed)

    public static void main(String[] args) {
 
    	Scanner scnr = new Scanner(System.in);
        initializeDogList();
        initializeMonkeyList();
        String x = "a";
        while(!x.equals("q")){
        	displayMenu();
        	x = scnr.nextLine();
        	if(x.equals("1")) {
        		intakeNewDog(scnr);
        	}
        	if(x.equals("2")) {
        		intakeNewMonkey(scnr);
        	}
        	if(x.equals("3")) {
        		reserveAnimal(scnr);
        	}
        	if(x.equals("4")) {
        		printdogs();
        	}
        	if(x.equals("5")) {
        		printmonkeys();
        	}
        	if(x.equals("6")) {
        		printAnimals();
        	}
        }
        
        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.
	// For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods 
	// Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.

    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
    	Monkey monkey2 = new Monkey("Chimp", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States", 10,10,10);
        Monkey monkey3 = new Monkey("Test", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States",10,10,10);
        Monkey monkey4 = new Monkey("Zee", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada",10,10,10);

        monkeylist.add(monkey2);
        monkeylist.add(monkey3);
        monkeylist.add(monkey4);
    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
            else {
            	Dog dog4 = new Dog(name, name, name, name, name, name, name, name, false, name);
            	System.out.println("What breed is " + name + "?");
            	String breed = scanner.nextLine();
            	dog4.setBreed(breed);
            	System.out.println("What gender is " + name + "?");
            	String gender = scanner.nextLine();
            	dog4.setGender(gender);
            	System.out.println("How old is " + name + "?");
            	String age = scanner.nextLine();
            	dog4.setAge(age);
            	System.out.println("How much does " + name + "weigh?");
            	String weight = scanner.nextLine();
            	dog4.setWeight(weight);
            	System.out.println("When did we acquire " + name + "?");
            	String AcquisitionDate = scanner.nextLine();
            	dog4.setAcquisitionDate(AcquisitionDate);
            	System.out.println("Where did we acquire " + name + "?");
            	String location = scanner.nextLine();
            	dog4.setAcquisitionLocation(location);
            	System.out.println("What is " + name + "'s training status?");
            	String trainingstatus = scanner.nextLine();
            	dog4.setTrainingStatus(trainingstatus);
            	System.out.println("What is " + name + " reserved status?");
            	String reserved = scanner.nextLine();
            	if(reserved.equals("reserved")) {
            		dog4.setReserved(true);
            	}
            	else {
            		dog4.setReserved(false);
            	}
            	System.out.println("What is " + name + "in service country?");
            	String inservicecountry = scanner.nextLine();
            	dog4.setInServiceCountry(inservicecountry);
            	dogList.add(dog4);
            	
            	
            	
            	break;
            }
        }

        // Add the code to instantiate a new dog and add it to the appropriate list
    }


        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
        public static void intakeNewMonkey(Scanner scanner) {
        	System.out.println("What is the monkey's name?");
            String name = scanner.nextLine();
            for(Monkey monkey: monkeylist) {
                if(monkey.getName().equalsIgnoreCase(name)) {
                    System.out.println("\n\nThis monkey is already in our system\n\n");
                    return; //returns to menu
                }
                else {
                	Monkey monkey1 = new Monkey(name, name, name, name, name, name, name, name, false, name, 0, 0, 0);
                	System.out.println("What species is " + name + "?");
                	String species = scanner.nextLine();
                	monkey1.setSpecies(species);
                	System.out.println("What gender is " + name + "?");
                	String gender = scanner.nextLine();
                	monkey1.setGender(gender);
                	System.out.println("How old is " + name + "?");
                	String age = scanner.nextLine();
                	monkey1.setAge(age);
                	System.out.println("How much does " + name + "weigh?");
                	String weight = scanner.nextLine();
                	monkey1.setWeight(weight);
                	System.out.println("When did we acquire " + name + "?");
                	String AcquisitionDate = scanner.nextLine();
                	monkey1.setAcquisitionDate(AcquisitionDate);
                	System.out.println("Where did we acquire " + name + "?");
                	String location = scanner.nextLine();
                	monkey1.setAcquisitionLocation(location);
                	System.out.println("What is " + name + "'s training status?");
                	String trainingstatus = scanner.nextLine();
                	monkey1.setTrainingStatus(trainingstatus);
                	System.out.println("What is " + name + " reserved status?");
                	String reserved = scanner.nextLine();
                	if(reserved.equals("reserved")) {
                		monkey1.setReserved(true);
                	}
                	else {
                		monkey1.setReserved(false);
                	}
                	System.out.println("What is " + name + "in service country?");
                	String inservicecountry = scanner.nextLine();
                	monkey1.setInServiceCountry(inservicecountry);
                	monkeylist.add(monkey1);
                	
                	
                	
                	break;
                }
            }

        }

        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
            System.out.println("Press 1 for dogs.");
            System.out.println("Press 2 for monkey.");
            int dogmonkey = scanner.nextInt();
            if (dogmonkey==1) {
            	System.out.println("What country?");
            	String countryselection = scanner.nextLine();
            	System.out.println("" + dogList + countryselection);
            	System.out.println(dogList);
            }
            if (dogmonkey==2) {
            	System.out.println("What country?");
            	String countryselection = scanner.nextLine();
            	System.out.println("" + monkeylist + countryselection);
            }
            }
        

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        public static void printdogs() {
            
            System.out.println(dogList);

        }
        public static void printmonkeys() {
            
            System.out.println(monkeylist);

        }
        public static void printAnimals() {
            
            System.out.println(dogList);
            System.out.println(monkeylist);

        }
}

