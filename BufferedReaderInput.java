import java.io.*;

public class BufferedReaderInput {
    public static void main(String[] args) throws IOException {
        BufferedReader dataInput = new  BufferedReader(new InputStreamReader(System.in));
        String StudentName = "";

        System.out.print("Enter name:");
        StudentName=dataInput.readLine();
        
        System.out.print("\nGRADE INPUTS\nEnter Your Math Grade:");
        String math=dataInput.readLine();
        float mathInt=Float.parseFloat(math);

        System.out.print("Enter Your Science Grade:");
        String sci=dataInput.readLine();
        float sciInt=Float.parseFloat(sci);

        System.out.print("Enter Your English Grade:");
        String eng=dataInput.readLine();
        float engInt=Float.parseFloat(eng);

        System.out.print("Enter Your Social Science Grade:");
        String socSci=dataInput.readLine();
        float socSciInt=Float.parseFloat(socSci);

        System.out.print("Enter Your Filipino Grade:");
        String fili=dataInput.readLine();
        float filiInt=Float.parseFloat(fili);

        System.out.println("\nOUTPUTS\nName:  "+ StudentName +
                            "\nGrade in Math: "+ mathInt+
                            "\nGrade in Science:  "+ sciInt+
                            "\nGrade in English:  "+ engInt+
                            "\nGrade in Social Science:  "+ socSciInt+
                            "\nGrade in Filipino:  "+ filiInt+
                            "\n\nAverage Grade:  "+ ((mathInt+sciInt+engInt+socSciInt+filiInt)/5)
                        );
    }
}
