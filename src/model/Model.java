package model;

import form.MainForm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import panel.AuthenticationPanel;
import user.User;

public class Model {

    User[] users;
    AuthenticationPanel aPanel;
    MainForm mainForm;

    public Model(User[] users, AuthenticationPanel aPanel, MainForm mainForm) {
        this.users = users;
        this.aPanel = aPanel;
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
        this.mainForm.getjMenuAdministrationUsers().setEnabled(true);
        this.mainForm.getjMenuLoginLogoutLogout().setEnabled(true);
        this.mainForm.getjMenuLoginLogoutLogin().setEnabled(false);
        this.mainForm.getAuthenticationPanel1().setVisible(false);
    }

    private void fillFormAgain() {
        aPanel.getjLblError().setText("Error: invalid username or password");
    }
}
