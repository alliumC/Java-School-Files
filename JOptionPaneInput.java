import java.util.ArrayList;
import javax.swing.*;

public class JOptionPaneInput {
    public static void main(String[] args) {

        String StudentName=JOptionPane.showInputDialog("INPUTS\nEnter name: ");

        /*System.out.println("Enter subjects, seperate each by a space: ");
        String Subjects=dataInput.nextLine();*/

        String[] subjects = {"Math","Science","English","Social Science", "Filipino"};
        ArrayList<Float> grades = new ArrayList<>();
        float sum = 0f;

        System.out.print("\n");
        for (int i=0; i<subjects.length;i++){
            String input=JOptionPane.showInputDialog("Enter "+subjects[i]+" Grade: ");
            float grade=Float.parseFloat(input);
            sum += grade;
            grades.add(grade);
        }
        
        System.out.println("\nOUTPUTS\nName: " + StudentName+"\n");

        for (int i=0; i<grades.size();i++){
            System.out.println("Grade in "+subjects[i]+": "+
                                String.valueOf(grades.get(i)).replaceAll("\\.0*$", ""));
        }

        float average = sum/subjects.length;
        System.out.print("\nFinal Average: " + String.valueOf(average).replaceAll("\\.0*$", ""));
        
        if (average < 75){
            System.out.print("\nYou Failed.");
        }
        else if (average >= 75 && average < 90){
            System.out.print("\nYou did Good.");
        }
        else if (average >= 90 && average < 95){
            System.out.print("\nYou did Great.");
        } 
        else{
            System.out.print("\nYou did Excellent.");
        }
    }
}