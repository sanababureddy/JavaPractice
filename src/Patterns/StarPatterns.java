package Patterns;

public class StarPatterns {
    public static void main(String[] args) {
        DimondPattern(5);
    }
    static void Rectangle(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void Square(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static  void IncreasingTriangle(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static  void DecreasingTriangle(int n){
        for(int i = 1; i <= n; i++){
            for (int j = i; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void RightSideTriangle(int n){
        for (int i = 1; i <= n; i++){
            //decreasing Triangle with spaces
            for (int j = i; j <= n; j++){
                System.out.print(" ");
            }
            //increasing Triangle with *
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void RightSideTriangle2(int n){
        for (int i = 1; i <= n; i++){
            //increasing Triangle with spaces
            for (int j = 1; j <= i; j++){
                System.out.print("  ");
            }
            //decreasing Triangle with *
            for (int j = i; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void HillPattren(int n){
        for (int i = 1; i <= n; i++){
            //decreasing Triangle with spaces
            for (int j = i; j <= n; j++){
                System.out.print("  ");
            }
            //increasing Triangle with *
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            //increasing Triangle wit * one less
            for (int j = 1; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void ReverseHill(int n){
        for (int i = 1; i <= n; i++){
            //increasing triangle with spaces
            for (int j = 1; j <= i; j++){
                System.out.print("  ");
            }
            //decreasing triangle with *
            for (int j = i;  j <= n; j++){
                System.out.print("* ");
            }
            //decreasing triangle with * one less
            for (int j = i; j < n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void DimondPattern(int n){
        //hill pattern
        for (int i = 1; i < n; i++){ // removed =
            //decreasing space triangle
            for (int j = i; j <= n; j++){
                System.out.print("  ");
            }
            //increasing * triangle
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            //increasing * trangle with one less
            for (int j = 1; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //down hill pattern
        for (int i = 1; i <= n; i++){
            //increasing space triangle
            for (int j = 1; j <= i; j++){
                System.out.print("  ");
            }
            //decreasing * triangle
            for (int j = i; j <= n; j++){
                System.out.print("* ");
            }
            //decreasing * triangle with one less
            for( int j = i; j < n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
