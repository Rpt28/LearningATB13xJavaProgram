package ex_08_If_Else;

public class Lab035_CLI_If {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if (age > 18){
            System.out.println("Yes you can go to GOA!");
        }else {
            System.out.println("You can't Go to GOA!!");
        }
    }
}
