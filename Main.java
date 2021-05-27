import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    int weight;
    int height;
    String surname;

    public Main(int weight, int height, String surname) {
        this.weight = weight;
        this.height = height;
        this.surname = surname;
    }

    public int GetWeight() {
        return weight;
    }

    public int GetHeight() {
        return height;
    }

    public String GetSurname() {
        return surname;
    }

    public void report() {
        System.out.print("Name="+surname+"Weight="+weight+"Height="+height);
    }


//    Створіть модель, яка б дозволяла розподіляти студентів по групам, переводити студентів з однієї групи в іншу,
//    отримувати склад групи відсортований за алфавітом,чи за вагою,чи та зростом. Критерій сортування передається,
//    як параметр методу. Модель повинна дозволяти шукати студентів в групі за прізвищем, фільтрувати за різними критеріями.
//    Критерії передаються як параметри методу фільтрації. Виключити можливість додавання одного й того ж студента декілько разів у групу


    public static void main(String[] args) {


        ArrayList<Student> Fishermen = new ArrayList<Student>();

        Scanner scan = new Scanner(System.in);
        ShowInfo Info = new ShowInfo();

        boolean contin = true;
        while (contin) {

            System.out.println("Enter 1 to AddStudent : 2 to FindStudent : 3 to CheckGroups : 4 to Filter : 5 to Stop it");
            int i = scan.nextInt();
            switch (i) {
                case 1:
                    Info.AddStudent();
                    break;
                case 2:
                    Info.FindStudent();
                    break;
                case 3:
                    Info.CheckStudents();
                    break;
                case 4:
                    Info.Filter();
                    break;
                case 5:
                    contin = false;
                    break;
                default:
                    System.out.println("Not found");
            }
        }


    }
}
