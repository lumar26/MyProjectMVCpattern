package main;

import controller.AutenticationController;
import controller.Controller;
import form.MainForm;
import model.Model;
import user.User;

public class Main {

    public static void main(String[] args) {
        MainForm mainForm = new MainForm();
        Model model = new Model();
        User user1 = new User("Luka", "sifra1");
        User user2 = new User("Lazar", "sifra2");
        User user3 = new User("Dusan", "sifra3");

        User[] users = {user1, user2, user3};
        AutenticationController aController = new AutenticationController(users);
//        Controller controller;
        new Controller(mainForm, model, aController);
    }

}
