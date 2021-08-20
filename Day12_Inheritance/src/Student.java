public class Student extends Person {
    private int [] scores;

    public Student(String firstName, String lastName, int idNumber, int[] scores) {
        super(firstName, lastName, idNumber);
        this.scores = scores;
    }

    char calculate(){

        int sum=0;
        int avg;
        char grade;
        for (int i=0;i<scores.length;i++){
            sum+=scores[i];
        }
        avg=(int)(sum/scores.length);

            if (avg >= 90 && avg <= 100) {
                grade = 'O';
            } else if (avg >= 80 && avg < 90) {
                grade = 'E';
            } else if (avg >= 70 && avg < 80) {
                grade = 'A';
            } else if (avg >= 55 && avg < 70) {
                grade = 'P';
            } else if (avg >= 40 && avg < 55) {
                grade = 'D';
            } else {
                grade = 'T';
            }

        return grade;
    }
}
