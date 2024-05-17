package controller;

import tools.Menu;

public class AdministratorController {

    public void showMenu() {
        String[] options = {
            "Department", "Municipalities", "Farms", "Users",
            "Milkmen", "Milkings", "Companies", "Processing" // "en mascotas va: "users, pets,"
        };

        int choice;
        do {
            Menu.clearScreen();
            Menu.showMenu("Administrator Menu",options, 1);
            choice = Menu.getOption(options); // Mostrar opciones o Menu
            switch (choice) {
                case 1: {
                    DepartmentController dc = new DepartmentController();
                    dc.showMenu();
                }
                break; //Department
                case 2:break; //municipalities
                case 3:break; //Farms
                case 4:break; //Users
                case 5:break; //Milkmen
                case 6:break; //Milkings
                case 7:break; //companies
                case 8:break; //processing
                default:
                    break;
            }
        } while (choice != 0);
    }
}
