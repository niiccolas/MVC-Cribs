package Model;

public class House {
    static String name;
    static Room[] rooms;

    public House(String name, Room[] rooms) {
        this.name = name;
        this.rooms = rooms;
    }

    public void displayInfos() {
        for (Room room : rooms) {
            room.displayInfos();
        }
    }
}
