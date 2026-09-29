import java.io.*;
import java.util.Scanner;

public class ScannerInputFixed{
    public static void main(String[] args) throws IOException {
        Scanner dataInput = new Scanner(System.in);
        String StudentName = "";

        System.out.print("INPUTS\nEnter name: ");
        StudentName=dataInput.nextLine();

        String[] subjects = {"Math","Science","English","Social Science", "Filipino"};
        int[] grades = new int[subjects.length];
        float sum = 0f;

        System.out.print("\n");
        for (int i=0; i<subjects.length;i++){
            System.out.print("Enter "+subjects[i]+" Grade: ");
            grades[i]=dataInput.nextInt();
            sum += grades[i];
            System.out.println(sum);
        }
        
        System.out.println("\nOUTPUTS\nName: " + StudentName+"\n");

        for (int i=0; i<grades.length;i++){
            System.out.println("Grade in "+subjects[i]+": "+
                                String.valueOf(grades[i]).replaceAll("\\.0*$", ""));
        }

        float average = sum/subjects.length;
        System.out.print("\nFinal Average: " + String.valueOf(average).replaceAll("\\.0*$", ""));

        
        if (average < 75){
            System.out.print("\nYou Failed.");
        }
        else if (average >= 75 && average < 90){
            System.out.print("\nYou did Satisfactory.");
        }
        else if (average >= 90 && average < 95){
            System.out.print("\nYou did Great.");
        } 
        else{
            System.out.print("\nYou did Excellent.");
        }

        dataInput.close();

    }
}