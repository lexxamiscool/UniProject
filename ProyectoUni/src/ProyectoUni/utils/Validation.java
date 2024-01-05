package ProyectoUni.utils;

import java.util.HashMap;

public class Validation {
    private HashMap<String, String>registerUser = new HashMap<String,String>();
    private HashMap<String, String>loginUser = new HashMap<String, String>();
    
    public Validation() {
        super();
    }
    
    public boolean validation() {
        System.out.println("Login user: " + loginUser.get("username"));
        System.out.println("Register user: " + registerUser.get("username"));
        return true;
    }
    
    public HashMap<String, String> getRegisterUser() {
        return registerUser;
    }
    public void setRegisterUser(HashMap<String, String> registerUser) {
        this.registerUser = registerUser;
    }
    public HashMap<String, String> getLoginUser() {
        return loginUser;
    }
    public void setLoginUser(HashMap<String, String> loginUser) {
        this.loginUser = loginUser;
    }
    
    
}
