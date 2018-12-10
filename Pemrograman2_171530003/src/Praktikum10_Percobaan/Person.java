package Praktikum10_Percobaan;


public class Person {
    
    protected String name;
    protected String address;
    
    /**
     * Default contructor
     */
    
    public Person(){
        System.out.println("Inside Person : Constructor");
        name = "";
        address = "";
    }
    
    /**
     * Contructor dengan parameter
     */
    
    public Person(String vname, String vaddress){
        this.name = vname;
        this.address = vaddress;
    }
    
    /**
     * Method accessor
     */
    
    public String getName(){
        
        return name;
    }
    
    public String getAddress(){
        
        return address;
    }
    
    public void setName(String vname){
        this.name = vname;
    }
    
    public void setAddress(String vaddress){
        this.address = vaddress;
    }
}
