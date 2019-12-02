package controller;

import form.MainForm;
import form.TempForm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import model.Model;
import panel.AutenticationPanel;

public class Controller {
    MainForm mainForm;
    Model model;
    AutenticationController aController;

    public Controller(MainForm mainForm, Model model, AutenticationController aController) {
        this.mainForm = mainForm;
        this.model = model;
        this.aController = aController;
        
        showForm();
        handleEvents();
    }

    private void showForm() {
        this.mainForm.setVisible(true);
        this.mainForm.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.mainForm.getjMenuAdministrationUsers().setEnabled(false);
        this.mainForm.getjMenuLoginLogoutLogout().setEnabled(false);
    }

    private void handleEvents() {
        this.mainForm.getjMenuLoginLogoutLogin().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // nece da se pojavi panel na formi uopste
                // nece ni nakon sto sam dodao na panel metodu setVisible
                mainForm.add(new AutenticationPanel());
                //cak nece ni novu formu da otvori
//                TempForm tempForm = new TempForm();
//                tempForm.setVisible(true);

            }
        });
        
    }
    
}
