import java.util.Scanner;

class Person {
    private int age;

    public Person(int initialAge) {
        if (initialAge >= 0) {
            this.age = initialAge;
        }else {
            System.out.println("Age is not valid, setting age to 0.");
            this.age=0;
        }

    }
    public void yearPasses(){
        this.age+=1;
    }
    public void amIOld(){
        if(age<13){
            System.out.println("You are young.");
        }else if (age>=13&&age<18){
            System.out.println("You are a teenager.");
        }else {
            System.out.println("You are old.");
        }
    }
}
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of cases from the range 1 to 4: ");
        int T = sc.nextInt();//One of the constrains: number of taste cases 1<=T<=4
        if (T>=1&&T<=4) {
            for (int i = 0; i < T; i++) {
                System.out.println("Enter the age from the range -5 to 30: ");
                int age = sc.nextInt();//One of the constrains: -5<=age<=30
                if (age >= -5 && age <= 30) {
                    Person person = new Person(age);
                    person.amIOld();
                    for (int j = 0; j < 3; j++) {
                        person.yearPasses();
                    }
                    person.amIOld();
                    System.out.println();
                } else {
                    System.out.println("Age not in the range");
                    break;
                }
            }
        }
        sc.close();
    }
}

