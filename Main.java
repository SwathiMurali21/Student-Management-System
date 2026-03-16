
import java.util.ArrayList;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1.Add Student");
            System.out.println("2.Display Students");
            System.out.println("3.Search Student");
            System.out.println("4.Delete Student");
            System.out.println("5.Exit");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            if (ch == 1) {

                System.out.print("Enter id: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter name: ");
                String name = sc.nextLine();

                System.out.print("Enter marks: ");
                int marks = sc.nextInt();

                list.add(new Student(id, name, marks));
                System.out.println("Student Added");

            }

            else if (ch == 2) {

                for (Student s : list) {
                    s.display();
                }

            }

            else if (ch == 3) {

                System.out.print("Enter id to search: ");
                int id = sc.nextInt();

                boolean found = false;

                for (Student s : list) {
                    if (s.id == id) {
                        s.display();
                        found = true;
                    }
                }

                if (!found)
                    System.out.println("Student not found");

            }

            else if (ch == 4) {

                System.out.print("Enter id to delete: ");
                int id = sc.nextInt();

                boolean removed = false;

                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).id == id) {
                        list.remove(i);
                        removed = true;
                        System.out.println("Student Deleted");
                        break;
                    }
                }

                if (!removed)
                    System.out.println("Student not found");

            }

            else if (ch == 5) {
                System.out.println("Thank you");
                break;
            }

            else {
                System.out.println("Invalid choice");
            }
        }
    }
}