package ua.edu.ucu.task1;

import lombok.Builder;
import lombok.Singular;
import lombok.ToString;

import java.util.List;

@Builder
@ToString
public class Student {
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private int age;
    @Singular
    private List<String> courses;

//    public static class StudentBuilder{
//        private Student student;
//        public StudentBuilder(){
//            this.student = new Student();
//        }
//
//        public StudentBuilder firstName(String firstName){
//            student.firstName = firstName;
//            return this;
//        }
//        public StudentBuilder lastName(String lastName){
//            student.lastName = lastName;
//            return this;
//        }
//        public StudentBuilder age(int age){
//            student.age = age;
//            return this;
//        }
//        public Student build(){
//            return student;
//        }
//    }
}