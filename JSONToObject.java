/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoria.ej22.SerializacionJSONToObject;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;

class Student {
    private int id;
    private String firstname;
    private String lastname;
    private String professor;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", professor='" + professor + '\'' +
                ", age=" + age +
                '}';
    }

    // Getters y setters omitidos por brevedad
}

public class JSONToObject {
    public static void main(String[] args) {
        Gson gson = new Gson();

        try (FileReader reader = new FileReader("D:\\OneDrive\\Documentos\\NetBeansProjects\\UT9SerializacionGSON\\src\\main\\java\\ficheros\\student.json")) {
            Student student = gson.fromJson(reader, Student.class);
            System.out.println(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
