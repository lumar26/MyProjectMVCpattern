package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import panel.AutenticationPanel;
import user.User;

public class AutenticationController {

    User[] users;
    AutenticationPanel aPanel;

    public AutenticationController(User[] users) {
        this.users = users;
    }

    private void handleEvents() {
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

    }

    private void fillFormAgain() {
        aPanel.getjLblError().setText("Error: invalid username or password");
    }
}
