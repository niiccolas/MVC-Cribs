package Controller;

import java.util.Scanner;

import Model.House;
import Model.Room;
import Vue.UITools;

public class HouseBuilder {
  public static void addRoom() {

  }

  public static House build() {
    Scanner input = new Scanner(System.in);
    UITools.prompt("Enter a name for your house: ");

    String houseName = input.nextLine();
    System.out.println("*** The House of " + houseName + " ***");

    String[] entranceFurniture = {"welcome rug"};
    Room entrance = new Room("Entrance", 5, entranceFurniture);

    Room[] houseRooms = {entrance};
    House newHouse = new House(houseName, houseRooms);

    return newHouse;
  }
}
