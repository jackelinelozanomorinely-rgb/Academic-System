package cesde.domain;

import java.util.Scanner;

public class Student {
    Scanner sc = new Scanner(System.in);

    //POJO - Plain Old Java Object


    //Atributes

    int id;
    private String name;
    private String lastName;
    private String email;
    private boolean status;

    //constructores
    //constructor vacio

    public Student(){

    }
    //constructor con email:
    public Student(String email){
        this.email = email;
    }
    // Constructor con todos los argumentos (alt+insert) para todos shift flecha abajo
    //para el vacio ( select none ) o selecciono el que deseo


    public Student(int id, String name, String lastname, String email, boolean status){
        this.id = id;
        this.name = name;
        this.lastName = lastname;
        this.email = email;
        this.status = status;

    }
    //Getters and setters
    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;

    }
    public String getName(){
        return name;

    }
    public void setName(String name){
        this.name = name;

    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastname){
        this.lastName = lastname;
    }
    public String getEmail(){
        return  email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public boolean isStatus(){
        return status;
    }
    public void setStatus(boolean status){
        this.status = status;
    }


}
