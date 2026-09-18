import java.io.*;
import java.util.ArrayList;

public class BufferedReaderFixed {
    public static void main(String[] args) throws IOException {
        BufferedReader dataInput = new  BufferedReader(new InputStreamReader(System.in));
        String StudentName = "";

        System.out.print("INPUTS\nEnter name: ");
        StudentName=dataInput.readLine();

        String[] subjects = {"Math","Science","English","Social Science", "Filipino"};
        ArrayList<Float> grades = new ArrayList<>();
        float sum = 0f;

        System.out.print("\n");
        for (int i=0; i<subjects.length;i++){
            System.out.print("Enter "+subjects[i]+" Grade: ");
            String input=dataInput.readLine();
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
    }
}