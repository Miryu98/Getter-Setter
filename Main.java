import java.util.Scanner;

class Main {

   public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       String name = read.nextLine();
       int age = read.nextInt();
       Student student = new Student();
       student.name = name;
       
       //set the age via Setter
       if (age < 0) {
           System.out.println("Invalid age");
           student.setAge(0);
       } else {
           student.setAge(age);
       }
       
       System.out.println("Name: " + student.name);
       System.out.println("Age: " + student.getAge());
   }
}

class Student {

   public String name;
   private int age;
   
   public int getAge() {
      //complete Getter
      return age;
   }
   
   public void setAge(int age) {
       //complete Setter
       this.age = age;
   }
}


/*
The program you are given receives name and age of student as input.
Complete the program to set the values for the corresponding attributes of the Student class and prints out the final result. If the age is <0, program should output "Invalid age" and assign a 0 value to the age attribute.
*/
