package ProyectoUni.views;

import javax.swing.*;

import ProyectoUni.controllers.LoginController;
import ProyectoUni.models.User;

public class LoginView {
    private String username;
    private String password;
    private LoginController loginController = new LoginController();
    
    public LoginView() {
        super();
    }
    
    public void showLogin() {
      JOptionPane.showMessageDialog(null, "Welcome to the system of the university");
      this.username = JOptionPane.showInputDialog("Introduce your username");
      this.password = JOptionPane.showInputDialog("Introduce your password");
      this.loginController.validateUser(this.username, this.password);
      
    }
    
    
}
