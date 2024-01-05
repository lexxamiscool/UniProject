package ProyectoUni.utils;

import java.util.HashMap;

public class DataStorage {
    private static DataStorage instance = new DataStorage();
    private HashMap<String, String> userData = new HashMap<>();
    private HashMap<String, String>loginData = new HashMap<>();
    
    private DataStorage() {
        super();
    }

    public static DataStorage getInstance() {
        return instance;
    }

    public HashMap<String, String> getUserData(){
        return userData;
    }
    
    public void setUserData(HashMap<String,String> userData){
        this.userData=userData;
    }
    
    public HashMap<String, String> getLoginData(){
        return loginData;
    }
    
    public void setLoginData(HashMap<String,String> loginData){
        this.loginData=loginData;
    }
    
    
    
    
    

}
