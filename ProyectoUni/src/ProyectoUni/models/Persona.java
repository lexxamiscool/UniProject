package ProyectoUni.models;

public class Persona {
    private String name;
    private String lastname;
    private String program;
    public Persona() {
        super();
    }
    public Persona(String name, String lastname, String program) {
        super();
        this.name = name;
        this.lastname = lastname;
        this.program = program;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getProgram() {
        return program;
    }
    public void setProgram(String program) {
        this.program = program;
    }
    
    
}
