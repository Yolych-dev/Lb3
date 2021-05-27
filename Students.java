import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Students {
    ArrayList<Student> person = new ArrayList<Student>();

    Students(){
        person.add(new Student("Student3",50+(int)(Math.random()*10),150+(int)(Math.random()*50)));
        person.add(new Student("Student1",50+(int)(Math.random()*10),150+(int)(Math.random()*50)));
        person.add(new Student("Student7",50+(int)(Math.random()*10),150+(int)(Math.random()*50)));
        person.add(new Student("Student4",50+(int)(Math.random()*10),150+(int)(Math.random()*50)));


    }

    public void addStudent(String surname, int weight,int height){
        person.add(new Student(surname, height, weight));
    }
    public void checkStudents(){
        System.out.println(person.toString());


    }


    public Student FindStudent(String Name){
        Student Student = new Student();
        for(Student f : person){
            if(f.surname.equals(Name)){Student = f;}
        }
        return Student;
    }

    public void filter1(){
       person.sort(Comparator.comparing(Student::getName));
       for(int i=0;i<person.size();i++){
           System.out.println(person.get(i));
       }

    }
    public void filter2(){
        person.sort(Comparator.comparing(Student::getHeight));
        for(int i=0;i<person.size();i++){
            System.out.println(person.get(i));
        }

    }
    public void filter3(){
        person.sort(Comparator.comparing(Student::getWeight));
        for(int i=0;i<person.size();i++){
            System.out.println(person.get(i));
        }

    }

}