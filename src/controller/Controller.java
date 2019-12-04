package controller;

import form.MainForm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import model.Model;
import panel.AuthenticationPanel;
import user.User;

public class Controller {

    MainForm mainForm;
    Model model;
    User user1 = new User("Luka", "sifra1");
    User user2 = new User("Lazar", "sifra2");
    User user3 = new User("Dusan", "sifra3");

    User[] users = {user1, user2, user3};

    public Controller(MainForm mainForm, Model model, Model aController) {
        this.mainForm = mainForm;
        this.model = model;

        showForm();
        handleEvents();
    }

    public Controller(MainForm mainForm, Model model) {
        this.mainForm = mainForm;
        this.model = model;

        showForm();
        handleEvents();
    }

    private void showForm() {
        this.mainForm.setVisible(true);
        this.mainForm.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.mainForm.getjMenuAdministrationUsers().setEnabled(false);
        this.mainForm.getjMenuLoginLogoutLogout().setEnabled(false);
        this.mainForm.getAuthenticationPanel1().setVisible(false);
    }

    private void handleEvents() {
        this.mainForm.getjMenuLoginLogoutLogin().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // nece da se pojavi panel na formi uopste
                // nece ni nakon sto sam dodao na panel metodu setVisible
                mainForm.getAuthenticationPanel1().setVisible(true);
                Model authenticationModel = new Model(users, mainForm.getAuthenticationPanel1(), mainForm);
                authenticationModel.handleEvents();
            }
        });
        
    }

}
