/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package teoria.ej21.SerializacionObjectToJSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;

class Student {
    private int id;
    private String firstname;
    private String lastname;
    private String professor;
    private int age;

    // Constructor
    public Student(int id, String firstname, String lastname, String professor, int age) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.professor = professor;
        this.age = age;
    }

    // Getters y setters omitidos por brevedad
}

public class ObjectToJSON {
    public static void main(String[] args) {
        Student student = new Student(1, "Juan", "Pérez", "Dr. Smith", 20);
        
        //Gson gson = new Gson();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        
        try (FileWriter writer = new FileWriter(
                "C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\UT9SerializacionGSON\\src\\main\\java\\ficheros\\student.json")) {
            gson.toJson(student, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
