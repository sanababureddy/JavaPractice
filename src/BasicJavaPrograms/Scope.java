package BasicJavaPrograms;

import java.util.Arrays;

public class Scope {
    static int a = 30;
    public static void main(String[] args) {
       friendAbility("teja");
    }

    static void friendAbility(String friend){
        switch (friend){
            case "Praneeth":
                System.out.println("Multi-tallent");
                break;
            case "kalyan":
                System.out.println("good boy without girls");
                break;
            case "harish":
                System.out.println("Work is more important");
                break;
            case "teja":
                System.out.println("IIT nothing else");
                break;
            case "mohan":
                System.out.println("NOt satisfied");
                break;
            default:
                System.out.println("Not found");
        }
    }

}
