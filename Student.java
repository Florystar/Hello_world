public class Student {
    private String name;
    private int rating;

    //Create default constructor
    public Student() {
    }

    //Create constructor with parameters
    public Student(String name, int rating) {
        this.name = name;
        this.rating = rating;
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
    public static double average(int... rating) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < rating.length; i++) {
            sum += rating[i];
            count++;
        }
        double average = sum / count;
        return average;
    }

    //Method of changing rating
    public static Student[] changeStudentsRating(int changeRating, Student... s) {
        for (int i = 0; i < s.length; i++) {
            s[i].rating = s[i].rating + changeRating;
        }
        return s;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Octavian");
        s1.setRating((int) (Math.random() * 100));
        Student s2 = new Student("Varvara", (int) (Math.random() * 100));
        Student s3 = new Student("Denys", (int) (Math.random() * 100));

        System.out.println("The rating of first student is " + s1.rating);
        System.out.println("The rating of second student is " + s2.rating);
        System.out.println("The rating of third student is " + s3.rating);
        System.out.println("-------------------------------------------------------------");
        System.out.println(String.format(
                "The average rating of all students before changing: %.2f", average(s1.rating, s2.rating, s3.rating)));
        changeStudentsRating(15, s2);
        System.out.println(String.format(
                "The new average rating of all students after changing: %.2f", average( s1.rating, s2.rating,
                        s3.rating)));
    }
}


