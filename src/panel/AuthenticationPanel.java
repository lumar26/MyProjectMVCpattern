package panel;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AuthenticationPanel extends javax.swing.JPanel {

    public AuthenticationPanel() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLblUsername = new javax.swing.JLabel();
        jTxtUsername = new javax.swing.JTextField();
        jTxtPassword = new javax.swing.JTextField();
        jLblPassword = new javax.swing.JLabel();
        jBtnSubmit = new javax.swing.JButton();
        jLblError = new javax.swing.JLabel();

        jLblUsername.setText("Username:");

        jLblPassword.setText("Password:");

        jBtnSubmit.setText("SUBMIT");

        jLblError.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLblError)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnSubmit)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblUsername)
                            .addComponent(jLblPassword))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(72, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblUsername)
                    .addComponent(jTxtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblPassword)
                    .addComponent(jTxtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnSubmit)
                    .addComponent(jLblError))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnSubmit;
    private javax.swing.JLabel jLblError;
    private javax.swing.JLabel jLblPassword;
    private javax.swing.JLabel jLblUsername;
    private javax.swing.JTextField jTxtPassword;
    private javax.swing.JTextField jTxtUsername;
    // End of variables declaration//GEN-END:variables

    public JButton getjBtnSubmit() {
        return jBtnSubmit;
    }

    public JTextField getjTxtPassword() {
        return jTxtPassword;
    }

    public JTextField getjTxtUsername() {
        return jTxtUsername;
    }

    public JLabel getjLblError() {
        return jLblError;
    }

}
