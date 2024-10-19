import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks Out of 100!");
        System.out.println("Enter The Marks of Physics: ");
        int Physics=sc.nextByte();

        System.out.println("Enter The Marks of Chemistry: ");
        int Chemistry=sc.nextByte();

        System.out.println("Enter The Marks of Mathematics: ");
        int Mathematics=sc.nextByte();

        System.out.println("Enter The Marks of English: ");
        int English=sc.nextByte();

        System.out.println("Enter The Marks of Hindi: ");
        int Hindi=sc.nextByte();

        int totalMarks=Physics+Chemistry+Mathematics+English+Hindi;
        float avgPer=totalMarks/5;

        System.out.println("Your Total Marks is: " + totalMarks+ " And Average Percentage is: " + avgPer  );

        if(avgPer <= 100 & avgPer >=85 ){
            System.out.println("Grade A.");
        } else if (avgPer < 85 & avgPer >=70) {
            System.out.println("Grade B.");
        } else if (avgPer < 70 & avgPer >= 55) {
            System.out.println("Grade C.");
        } else if (avgPer < 55 & avgPer >= 35) {
            System.out.println("Grade D.");
        }else{
            System.out.println("Fail!");
        }
    }
}