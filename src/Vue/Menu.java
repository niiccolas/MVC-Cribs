package Vue;

import Model.House;
import Model.Room;

import java.util.Scanner;

public class Menu {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE  = "\u001B[34m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED   = "\u001B[31m";


    public static void buildHouse() {
        Scanner input = new Scanner(System.in);
        displayPrompt("Enter a name for your house: ");

        String houseName = input.nextLine();
        System.out.println("*** The House of " + houseName + " ***");

        // La maison à forcément une pièce entrée
        String[] entranceFurniture = {"welcome rug"};
        Room entrance = new Room("Entrance", 5, entranceFurniture);

        Room[] houseRooms = {entrance};
        House newHouse = new House(houseName, houseRooms);

        newHouse.displayInfos();
    }

    public static void addRoom() {

    }

    public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
    }

    public static void mainMenu() {
        Scanner kb = new Scanner(System.in);
        int userInput;

        clearScreen();
        displayHeader("MVC CRIBS 🏠  -------");

        while (true) {
            try {
                System.out.println("1. Build your house");
                System.out.println("2. Explore your house");
                System.out.println("3. Exit");
                displayPrompt("ENTER YOUR CHOICE: ");
                userInput = Integer.parseInt(kb.nextLine());

                if(userInput == 1) {
                  buildHouse();
                } else if (userInput == 2) {
                  exploreHouse();
                  break;
                } else if (userInput == 3) {
                  displayWarning("EXITING PROGRAM. BYE 👋");
                  break;
                } else {
                  displayWarning("NOT A VALID MENU ITEM! RETRY");
                }

            } catch (NumberFormatException nfe) {
                displayWarning("INTEGERS ONLY! RETRY");
            }
        }
    }

    private static void exploreHouse() {
      System.out.println("exploring the house");
    }

    public static void buildMenu() {
        System.out.println("BUILD MENU");
        System.out.println("1. Add Room");
        System.out.println("2. Remove Room");
        System.out.println("3. Exit");
    }

    public static void exploreMenu() {
        System.out.println("BUILD MENU");
        System.out.println("1. Add Room");
        System.out.println("2. Remove Room");
        System.out.println("3. Exit");
    }

    public static void displayPrompt(String message) {
        System.out.print(ANSI_BLUE + ">  " + message.toUpperCase() + ANSI_RESET);
    }

    public static void displayHeader(String message) {
        System.out.println(ANSI_GREEN + ">  " + message.toUpperCase() + ANSI_RESET);
    }

    public static void displayWarning(String message) {
        System.out.print(ANSI_RED + ">  " + message.toUpperCase() + "\n" + ANSI_RESET);
    }
}
