
public class MultiplicationTable{
    public static void main(String[] args){
        Multiplication();
        ACTIVITY1();
        ACTIVITY2();
        ACTIVITY3();
    }

    public static void Multiplication(){
        System.out.println("Multiplication Table");
        for (int i=1; i<11; i++){
            for (int x=1; x<11; x++){
                System.out.print(i*x + " \t ");
            }
            System.out.println("");
        }
    }

    public static void ACTIVITY1(){
        System.out.println("\nACTIVITY 1");
        for (int i=1; i<4; i++){
            for (int x=1; x<4; x++){
                System.out.print(i + " ");
            }
        }
    }

    public static void ACTIVITY2(){
        System.out.println("\n\nACTIVITY 2");
        for (int num1=1, num2=5; num1<6; num1++, num2--){
            System.out.print(num1 + " " + num2 + " ");
        }

    }

    public static void ACTIVITY3() {
        System.out.println("\n\nACTIVITY 3");
        System.out.println("number\tsquare\tcube");
        for (int i=1; i<6; i++){
            System.out.println(i + "\t " + i*i + "\t " + i*i*i);
        }
    }
}