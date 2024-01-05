package ProyectoUni.controllers;

import java.util.HashMap;

import ProyectoUni.models.User;
import ProyectoUni.utils.Validation;

public class LoginController implements ILoginController {
    
    
    HashMap<String,String>loginUser = new HashMap<String,String>();
    private Validation validation = new Validation();
    
    

    @Override
    public void validateUser(String username, String password) {
        // TODO Auto-generated method stub
       
        this.loginUser.put("username", username);
        this.loginUser.put("password", password);
        this.validation.setLoginUser(loginUser);
        this.validation.validation();
    }
    
   

    
    
    
    

}
