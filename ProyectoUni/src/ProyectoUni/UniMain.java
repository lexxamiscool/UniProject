package ProyectoUni;

import javax.swing.JOptionPane;

import ProyectoUni.views.LoginView;
import ProyectoUni.views.RegisterView;

public class UniMain {
    
    public static void main(String args[]) {
        LoginView loginView = new LoginView();
        RegisterView registerView = new RegisterView();
        
        int option;
        do {
            JOptionPane.showMessageDialog(null, "Welcome to the university");
            option = Integer.parseInt(JOptionPane.showInputDialog("Select an option \n 1.)Login \n2.)Register \n3.)Exit"));
            if(option == 1) {
                loginView.showLogin();
            }else if(option == 2) {
                registerView.showRegister();
            }
        }while(option != 3);
      
      
    }
}
