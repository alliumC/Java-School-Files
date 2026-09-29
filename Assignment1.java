public class Assignment1 {
    public static void main(String[] args) {
        System.out.println("""
ASSIGNMENT FOR ICT11 TERM 1 || A.Y. 2026-2027

Pabon, Chloe Marguerite O.
G11-02 ICT

=====================================

        """);
        Number1();
        Number2();
        Number3();
        Number4();
        System.out.println("\n\n=====================================");
    }

    public static void Number1() {
        System.out.println("Number 1:");
        for (int i=5; i<51; i+=5){
            System.out.print(i + " ");
        }
    }

    public static void Number2() {
        System.out.println("\n\n=====================================");
        System.out.println("\nNumber 2:");
        for (int i=20; i>1; i-=2){
            System.out.print(i + " ");
        }
    }

    public static void Number3() {
        System.out.println("\n\n=====================================");
        System.out.println("\nNumber 3:");
        for (int i=1, x=10; i<11; i++, x--){
            System.out.print(i + " " + x + " ");
        }
    }

    public static void Number4() {
        System.out.println("\n\n=====================================");
        System.out.println("\nNumber 4:");
        for (int i=50; i>9; i-=10){
            System.out.print(i + " ");
        }
    }
}