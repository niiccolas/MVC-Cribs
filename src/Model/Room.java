package Model;

import java.util.Arrays;

/**
 * Room
 */
public class Room {

    static String name;
    static int size;
    static String[] furniture;
    static Room[] adjacentRoom;

    public Room(String name, int size, String[] furniture) {
        this.name = name;
        this.size = size;
        this.furniture = furniture;
        Room[] adjacentRoom = this.adjacentRoom;// = adjacentRoom;
    }

    public void displayInfos() {
        System.out.println("- Room: \"" + name + "\"");
        System.out.println("- Size: " + size + " sqft.");

        if(furniture != null)
            System.out.println("- Furniture: " + Arrays.toString(furniture));
        if(adjacentRoom != null)
            System.out.println("- Adjacent Rooms: " + Arrays.toString(adjacentRoom));
    }
}