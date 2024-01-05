package ProyectoUni.views;

import javax.swing.JOptionPane;

import ProyectoUni.controllers.IRegisterController;
import ProyectoUni.controllers.RegisterController;

public class RegisterView {
    
    private String username;
    private String password;
    private RegisterController register = new RegisterController();
    
    
    
    public RegisterView() {
        super();
        
    }



    public void showRegister() {
        JOptionPane.showMessageDialog(null, "Welcome to the register of the University");
        this.username=JOptionPane.showInputDialog("Enter your username");
        this.password=JOptionPane.showInputDialog("Enter your password");
        System.out.println(this.username + " " + this.password);
        this.register.saveRegister(username, password);
        JOptionPane.showMessageDialog(null, "You've been register successfully");
    }
    

}
