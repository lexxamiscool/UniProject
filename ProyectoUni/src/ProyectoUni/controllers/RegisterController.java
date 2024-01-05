package ProyectoUni.controllers;

import java.util.HashMap;

import ProyectoUni.models.Register;
import ProyectoUni.utils.DataStorage;
import ProyectoUni.utils.Validation;

public class RegisterController  implements IRegisterController {
   
    private HashMap<String, String> saveRegisterPerson = new HashMap<String,String>();
   private Validation validation = new Validation();
    
    public RegisterController() {
        super();
        
    }



    @Override
    public void saveRegister(String username, String password) {
        // TODO Auto-generated method stub
        
       this.saveRegisterPerson.put("username", username);
       this.saveRegisterPerson.put("password", password);
       DataStorage.getInstance().setUserData(saveRegisterPerson);
       
    }
    
    
    
    public HashMap<String, String> getSaveRegisterPerson() {
        return saveRegisterPerson;
    }


    public void setSaveRegisterPerson(HashMap<String, String> saveRegisterPerson) {
        this.saveRegisterPerson = saveRegisterPerson;
    }

    
    
    

}
