class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException() {
        super("Age is not within the allowed range (15-21).");
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException() {
        super("Name is not valid (contains numbers or special symbols).");
    }
}

class Student {
    private int roll_no;
    private String name;
    private int age;
    private String course;

    public Student(int roll_no, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        this.roll_no = roll_no;

      
        if (!name.matches("^[a-zA-Z]+$")) {
            throw new NameNotValidException();
        }
        this.name = name;
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException();
        }
        this.age = age;

        this.course = course;
    }

    public void displayDetails() {
        System.out.println("Roll No: " + roll_no);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class StudentCheckApp {
    public static void main(String[] args) {
        try {
            Student student1 = new Student(1, "krushna", 20, "Computer Science");
            student1.displayDetails();
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
           
            Student student2 = new Student(2, "soham", 20, "java");
            student2.displayDetails();
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
           
            Student student3 = new Student(3, "Vishal12", 20, "java");
            student3.displayDetails();
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
