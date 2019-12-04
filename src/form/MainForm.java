
package form;

import javax.swing.JMenuItem;
import javax.swing.JPanel;
import panel.AuthenticationPanel;

public class MainForm extends javax.swing.JFrame {

    public MainForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        authenticationPanel1 = new panel.AuthenticationPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuLoginLogout = new javax.swing.JMenu();
        jMenuLoginLogoutLogin = new javax.swing.JMenuItem();
        jMenuLoginLogoutLogout = new javax.swing.JMenuItem();
        jMenuAdministration = new javax.swing.JMenu();
        jMenuAdministrationUsers = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuLoginLogout.setText("LogIn / LogOut");

        jMenuLoginLogoutLogin.setText("Login");
        jMenuLoginLogout.add(jMenuLoginLogoutLogin);

        jMenuLoginLogoutLogout.setText("LogOut");
        jMenuLoginLogout.add(jMenuLoginLogoutLogout);

        jMenuBar1.add(jMenuLoginLogout);

        jMenuAdministration.setText("Administration");

        jMenuAdministrationUsers.setText("Users");
        jMenuAdministration.add(jMenuAdministrationUsers);

        jMenuBar1.add(jMenuAdministration);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(authenticationPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(authenticationPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private panel.AuthenticationPanel authenticationPanel1;
    private javax.swing.JMenu jMenuAdministration;
    private javax.swing.JMenuItem jMenuAdministrationUsers;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuLoginLogout;
    private javax.swing.JMenuItem jMenuLoginLogoutLogin;
    private javax.swing.JMenuItem jMenuLoginLogoutLogout;
    // End of variables declaration//GEN-END:variables

    public JMenuItem getjMenuAdministrationUsers() {
        return jMenuAdministrationUsers;
    }

    public JMenuItem getjMenuLoginLogoutLogin() {
        return jMenuLoginLogoutLogin;
    }

    public JMenuItem getjMenuLoginLogoutLogout() {
        return jMenuLoginLogoutLogout;
    }

    public AuthenticationPanel getAuthenticationPanel1() {
        return authenticationPanel1;
    }


}
