package Vue;

import Controller.HouseBuilder;
import Model.House;

public class Menu {
    private House house;

    public void setHouse(House house) {
      this.house = house;
    }

    public void mainMenu() {
        UITools.clearScreen();
        UITools.header("MVC CRIBS");

        if (house != null) {
          UITools.header("[HOUSE OF " + house + " ]");
        }

        while (true) {
            try {
                System.out.println("1. Build house");
                System.out.println("2. Explore house");
                System.out.println("3. Help");
                System.out.println("4. Exit");

                int userInput = UITools.getInt();

                if(userInput == 1) {

                  this.house = HouseBuilder.build();
                  buildMenu();
                  break;
                } else if (userInput == 2) {
                  exploreMenu();
                  break;
                } else if (userInput == 4) {
                  UITools.warning("EXITING PROGRAM. BYE 👋");
                  break;
                } else {
                  UITools.warning("NOT A VALID MENU ITEM! RETRY");
                }

            } catch (NumberFormatException nfe) {
                UITools.warning("INTEGERS ONLY! RETRY");
            }
        }
    }

    public void buildMenu() {
        UITools.clearScreen();

        UITools.header("MVC CRIBS ⪢ BUILD");

        while (true) {
          try {
              System.out.println("1. Add Room");
              System.out.println("2. Remove Room");
              System.out.println("3. Main Menu");

              int userInput = UITools.getInt();

              if(userInput == 1) {
                addRoom();
                break;
              } else if (userInput == 2) {
                removeRoom();
                break;
              } else if (userInput == 3) {
                this.mainMenu();
                break;
              } else {
                UITools.warning("NOT A VALID MENU ITEM! RETRY");
              }

          } catch (NumberFormatException nfe) {
              UITools.warning("INTEGERS ONLY! RETRY");
          }
        }
      }

      public void exploreMenu() {
        UITools.clearScreen();
        UITools.header("MVC CRIBS ⪢ EXPLORE");

        while (true) {
          try {
              System.out.println("   ┌─────────────────────┐");
              System.out.println("   │ [1] Show House Plan │");
              System.out.println("   │ [2] Visit House     │");
              System.out.println("   │ [3] Main Menu       │");
              System.out.println("   └─────────────────────┘");

              int userInput = UITools.getInt();

              if(userInput == 1) {
                displayPlan();
                break;
              } else if (userInput == 2) {
                visitHouse();
                break;
              } else if (userInput == 3) {
                this.mainMenu();
                break;
              } else {
                UITools.warning("NOT A VALID MENU ITEM! RETRY");
              }

          } catch (NumberFormatException nfe) {
              UITools.warning("INTEGERS ONLY! RETRY");
          }
        }
    }

  private void displayPlan() {
    this.house.displayInfos();
  }

  private static void visitHouse() {
  }

  private static void addRoom() {
    HouseBuilder.addRoom();
  }

  private static void removeRoom() {
  }
}
