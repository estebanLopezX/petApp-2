package controller;

public class MainController {

    public void login() {
        // FALTA login the user

        // Se crea un switch para elegir el tipo de usuario
        int userType = 1;
        switch (userType) {
            case 1: {
            AdministratorController ac = new AdministratorController();
            ac.showMenu();
            } break;  // administrator
            case 2: break; //Company
            case 3: break; //Milkman
            default:break;
        }
    }

}
