public class Student {
    private String name;
    private int rating;
    static int count=0;
    static double sum=0;

    //Create default constructor
    public Student() {
        count++;
    }

    //Create constructor with parameters
    public Student(String name, int rating) {
        this.name = name;
        this.rating = rating;
        count++;
    }

    //Create constructor with parameters
    public Student(String name) {
        this.name = name;
        count++;
    }

    //Creation methods - Getters and Setters - to access fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
        sum+=this.rating;
    }

    //Method for selecting a better Student
    public boolean betterStudent(Student s2) {
        if (getRating() > s2.rating) {
            return true;
        }
        else {
            return false;
        }
    }

    //Method toString
    public String toString() {
        return "The student name is " + getName() + ". The rating of student is " + getRating();
    }

    //Method calculating of average rating
    public static double average() {
        double average = 0;
        if (count==0)  {
            return average;
        } else {
            return sum / count;
        }
    }

    //Method of changing rating
    public double changeStudentsRating(int changeRating) {
            sum-= this.rating;
            this.setRating(changeRating);
        return sum;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Octavian");
        s1.setRating((int) (Math.random() * 100));
        Student s2 = new Student("Varvara");
        s2.setRating((int) (Math.random() * 100));
        Student s3 = new Student("Denys");
        s3.setRating((int) (Math.random() * 100));

        System.out.println("The rating of first student is " + s1.rating);
        System.out.println("The rating of second student is " + s2.rating);
        System.out.println("The rating of third student is " + s3.rating);
        System.out.println("-------------------------------------------------------------");
        System.out.println(String.format(
                "The average rating of all students before changing: %.2f", average()));
        s1.changeStudentsRating(25);
        System.out.println("The rating of first student AFTER change is " + s1.rating);
        System.out.println("The rating of second student AFTER change is " + s2.rating);
        System.out.println("The rating of third student AFTER change is " + s3.rating);
        System.out.println("-------------------------------------------------------------");
        System.out.println(String.format(
                "The new average rating of all students after changing: %.2f", average()));
    }
}


