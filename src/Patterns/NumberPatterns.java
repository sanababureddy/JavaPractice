package Patterns;
//https://www.javainterviewpoint.com/number-pattern-programs-in-java/

public class NumberPatterns {
    static void Pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1, p = 1; j <= i; j++, p++) {
                System.out.print(p + " ");
            }
            System.out.println();
        }
    }

    static void Pattern2(int n) {
        for (int i = 1, p = 1; i <= n; i++, p++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(p + " ");
            }
            System.out.println();
        }
    }

    static void Pattern3(int n) {
        //incremental triangle
        for (int i = 1; i <= n; i++) {
            for (int j = 1, p = 1; j <= i; j++, p++) {
                System.out.print(p + " ");
            }
            System.out.println();
        }
        //decremental triangle
        for (int i = 1; i <= n; i++) {
            for (int j = i, p = 1; j < n; j++, p++) {
                System.out.print(p + " ");
            }
            System.out.println();
        }
    }

    static void Pattern4(int n) {
        //decremental triangle
        for (int i = 1; i <= n; i++) {
            for (int j = i, p = 1; j <= n; j++, p++) {
                System.out.print(p + " ");
            }
            System.out.println();
        } //incremental triangle
        for (int i = 1; i <= n; i++) {
            for (int j = 1, p = 1; j <= i; j++, p++) {
                System.out.print(p + " ");
            }
            System.out.println();
        }
    }

    static void Pattern5(int n) {
        //decremental triangle
        for (int i = 1, q = 5; i <= n; i++, q--) {
            for (int j = i, p = q; j <= n; j++, p--) {
                System.out.print(p + " ");
            }
            System.out.println();
        } //incremental triangle
        for (int i = 1, q = 1; i <= n; i++, q++) {
            for (int j = 1, p = q; j <= i; j++, p--) {
                System.out.print(p + " ");
            }
            System.out.println();
        }
    }

    static void Pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            //decrementing Triangle with space
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            //incrementing with numbers
            for (int j = 1, p = 1; j <= i; j++, p++) {
                System.out.print(p + " ");
            }
            System.out.println();
        }
    }

    static void Pattern7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i, p = 5; j <= n; j++, p--) {
                System.out.print(p + " ");
            }
            System.out.println();
        }
    }

    static void Pattern8(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1, p = 5; j <= i; j++, p--) {
                System.out.print(p + " ");
            }
            System.out.println();
        }
    }

    static void Pattern9(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i, p = 1; j <= n; j++, p++) {
                System.out.print(p + " ");
            }
            System.out.println();
        }
    }

    static void Pattern10(int n) {
        int p = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(p++ + " ");
            }
            System.out.println();
        }
    }

    static void Pattern11(int n) {
        for (int i = 1, p = 1; i <= n; i++, p++) {
            for (int j = 1, q = p; j <= i; j++, q--) {
                System.out.print(q + " ");
            }
            System.out.println();
        }
    }

    static void Pattern12(int n) {
        for (int i = 1,p=1; i <= n; i++,p++) {
            for (int j = 1,q=p; j <= i; j++) {
                System.out.print(q+ " ");
                q=q+5;
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        System.out.println("Pattern 1");
        Pattern1(5);
        System.out.println("Pattern 2");
        Pattern2(5);
        System.out.println("Pattern 3");
        Pattern3(5);
        System.out.println("Pattern 4");
        Pattern4(5);
        System.out.println("Pattern 5");
        Pattern5(5);
        System.out.println("Pattern 6");
        Pattern6(5);
        System.out.println("Pattern 7");
        Pattern7(5);
        System.out.println("Pattern 8");
        Pattern8(5);
        System.out.println("Pattern 9");
        Pattern9(5);
        System.out.println("Pattern 10");
        Pattern10(5);
        System.out.println("Pattern 11");
        Pattern11(5);
        System.out.println("Pattern 12");
        Pattern12(5);

    }

}
