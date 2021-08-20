import java.util.Scanner;

public class Solution {
//    Objective
//    Today, we're delving into Inheritance. Check out the attached tutorial for learning materials and an instructional video.
//
//    Task
//    You are given two classes, Person and Student, where Person is the base class and Student is the derived class. Completed code for Person and a declaration for Student are provided for you in the editor. Observe that Student inherits all the properties of Person.
//
//    Complete the Student class by writing the following:
//    A Student class constructor, which has 4 parameters:
//
//    A string, firstName.
//    A string,lastName.
//    An integer,idNumber.
//    An integer array (or vector) of test scores,scores.
//
//        .
//    A char calculate() method that calculates a Student object's average and returns the grade character representative of their calculated average:
//
//            [Grading.png]
//
//    Input Format
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String firstName=scanner.next();
        String lastName=scanner.next();
        int id=scanner.nextInt();
        int numScores=scanner.nextInt();
        int scores[]=new int[numScores];
        for(int i=0;i<numScores;i++){
            scores[i]=scanner.nextInt();
        }
        scanner.close();

        Student s=new Student(firstName,lastName,id,scores);
        s.printPerson();
        System.out.println("Grade: "+s.calculate());
    }
}
