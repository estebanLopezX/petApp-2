package controller;

import tools.Menu;

public class DepartmentController {

    public void showMenu() {
        String[] options = {
           "Show a department", "Search a department", "Create a new department",
            "Update a department", "Delete a department" // pet: "Show a pet", "Search a pet", "Create a new pet", "Delete a pet"
        };

        int choice;
        do {
            Menu.clearScreen();
            Menu.showMenu("Departments Menu",options, 2); // menuType: es el numero del menu
            choice = Menu.getOption(options); // Mostrar opciones o Menu
            switch (choice) {
                case 1: showAll(); break; // show Department, para mostrar todos los departamentoos se utiliza otra herramienta "dataBase" en tools
                case 2:break; // search a department
                case 3:break; // create a new department
                case 4:break; // update a department
                case 5:break; // Delete department
                default:
                    break;
            }
        } while (choice != 0);
    }

    private void showAll() {
        
    }
}
