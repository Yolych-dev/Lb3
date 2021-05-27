import java.time.LocalDate;
import java.util.*;

public class Student {
    int weight;
    String surname;
    int height;


    Student(String Name, int Weight, int Height){
        this.surname = Name;
        this.weight = Weight;
        this.height = Height;

    }


    @Override
    public String toString() {
        return "\n{" + "surname=" + surname + ", height=" + height + ", weight=" + weight +'}';
    }

    public String getName(){
        return surname;
    }
public void setName(String surname){
        this.surname = surname;
}

    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }

    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height = height;
    }


    public Student() {
    }


    public void show(){
        System.out.println(surname+" is exist ");
    }




}

