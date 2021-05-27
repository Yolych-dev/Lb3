import java.util.ArrayList;
import java.util.Scanner;

public class ShowInfo {
    Students Soc1 = new Students();
    Scanner scan = new Scanner(System.in);
    int i = 0;
    ArrayList<Student> person = new ArrayList<Student>();




    public void AddStudent(){
        System.out.println("Enter Surname of new person: ");
        String surname = scan.next();
        System.out.println("Enter Weight of new person: ");
        int weight = scan.nextInt();
        System.out.println("Enter Height of new person: ");
        int height = scan.nextInt();
        Soc1.addStudent(surname,weight,height);
    }
    public void FindStudent(){
        System.out.println("Enter Surname to find person: ");
        String Name = scan.next();
        Student f = Soc1.FindStudent(Name);
        if(f.surname==null){System.out.println("No find"); return;}
        f.show();
    }

    public void CheckStudents() {
       Students abc1 = new Students();
        abc1.checkStudents();
        }

    public void Filter(){
        System.out.println("You want to sort by 1 - by Name : 2 - by Weight : 3 - by Height ");
        String choose = scan.next();
        Students f = new Students();
        Scanner scan = new Scanner(System.in);
        boolean contin = true;

        while (contin) {
            int i = scan.nextInt();
            switch (i) {
                case 1:
                    f.filter1();
                    break;
                case 2:
                    f.filter2();
                    break;
                case 3:
                   f.filter3();
                    break;
                case 4:
                    contin = false;
                    break;
                default:
                    System.out.println("Not found");
            }
        }


    }

}

