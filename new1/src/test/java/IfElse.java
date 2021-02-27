public class IfElse {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        if(b > a)
        {
            System.out.println("b is greater then a");
        }else{
            System.out.println("a is greater then b");
    }
        int testscore =78;
        char grade ;
        if (testscore >= 90){
            grade = 'A';
        }else if (testscore >= 80) {
            grade ='B';
        }else if (testscore >= 70) {
            grade = 'C';
        }else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade ="+ grade);
}
}
