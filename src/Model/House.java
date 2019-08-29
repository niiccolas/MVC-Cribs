package Model;

public class House {
    static String name;
    static Room[] rooms;

    public House(String name, Room[] rooms) {
        this.name = name;
        this.rooms = rooms;
    }

    public void displayInfos() {
      System.out.println("Your are in the house of: " + name);
      System.out.println("here are the rooms");

        for (Room room : rooms) {
            room.displayInfos();
        }
    }
}
