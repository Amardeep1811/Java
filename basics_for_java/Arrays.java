class Student {
    private String name;
    private int rollNo;

    public Student(String name , int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}

public class Arrays{
    public static void main(String[] args) {
        
        Student[] studentArray;
        studentArray = new Student[5];

        studentArray[0] = new Student("Amardeep" , 20);
        studentArray[1] = new Student("Vaibhaw" , 10);
        studentArray[2] = new Student("Prashant" , 12);
        studentArray[3] = new Student("Dharmesh" , 98);
        studentArray[4] = new Student("Mohit" ,201);

         for (int i = 0; i < studentArray.length; i++)
            System.out.println("Element at " + i + " : { " + studentArray[i].name + " "+ studentArray[i].rollNo+" }");
    }
}