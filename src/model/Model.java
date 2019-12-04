package model;

import form.MainForm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import panel.AuthenticationPanel;
import user.User;

public class Model {

    User[] users;
    AuthenticationPanel aPanel;
    MainForm mainForm;

    public Model(User[] users, MainForm mainForm) {
        this.users = users;
        this.aPanel = mainForm.getAuthenticationPanel1();
        this.mainForm = mainForm;
    }

    public Model(User[] users) {
        this.users = users;
    }

    public Model(User[] users, AuthenticationPanel aPanel) {
        this.users = users;
        this.aPanel = aPanel;
    }

    public void handleEvents() {
        //ovde ce mozda da treba pristup preko forme a ne direktno preko panela
        aPanel.getjBtnSubmit().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkAutentication()) {
                    enterFullForm();
                } else {
                    fillFormAgain();
                }
            }
        });
    }

    private boolean checkAutentication() {
        User user1 = new User(aPanel.getjTxtUsername().getText(), aPanel.getjTxtPassword().getText());
        for (User user : users) {
            if (user.equals(user1)) {
                return true;
            }
        }
        return false;
    }
    //   dovrsi  /\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\
    //   dovrsi  /\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\
    //   dovrsi  /\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\

    private void enterFullForm() {
        mainForm.getjMenuAdministrationUsers().setEnabled(true);
        mainForm.getjMenuLoginLogoutLogout().setEnabled(true);
        mainForm.getjMenuLoginLogoutLogin().setEnabled(false);
        mainForm.getAuthenticationPanel1().setVisible(false);
    }

    private void fillFormAgain() {
        aPanel.getjLblError().setText("Error: invalid username or password");
    }

    public void logout() {
        mainForm.getjMenuAdministrationUsers().setEnabled(false);
        mainForm.getjMenuLoginLogoutLogout().setEnabled(false);
        mainForm.getjMenuLoginLogoutLogin().setEnabled(true);
        mainForm.getAuthenticationPanel1().setVisible(false);
    }

    public void showUsers() {
        this.mainForm.getjListUsers().setVisible(true);
        DefaultListModel usersList = new DefaultListModel();
        this.mainForm.getjListUsers().setModel(usersList);
        for (User user : users) {
            usersList.addElement(user.getUsername());
        }
        
        
    }


}
