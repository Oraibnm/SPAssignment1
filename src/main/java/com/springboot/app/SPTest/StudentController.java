package com.springboot.app.SPTest;

import com.springboot.app.SPTest.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    //http://localhost:8080/student
    @GetMapping("/student")
    public Student getStudent (){
        return new Student("Oraib" , "Nidal");
    }



    @GetMapping("/students")
    public List<Student> getListStudent(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Karam" , "Mohammad"));
        students.add(new Student("Yafa" , "Mohammad"));
        students.add(new Student("Oraib" , "Mohammad"));
        students.add(new Student("Nidal" , "Oraib"));
        students.add(new Student("Mohammad" ,"AAAAAA"));
        return students;
    }

    //http://localhost:8080/student/1
    @GetMapping("/student/{firstname}/{lastname}")
    public Student studentPathVariable (@PathVariable("firstname") String firstname ,
                                        @PathVariable("lastname")String lastname) {
        return new Student(firstname, lastname);


    }


}
