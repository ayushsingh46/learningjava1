import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class switchCase {
    public static void main(String[] args) {
        int age;
        System.out.println("please enter your age:");
        Scanner SC = new Scanner(System.in);
        age = SC.nextInt();
        if(age>40){
            System.out.println("You are experienced person! ");
        }
        else if(age>30)
        {
            System.out.println("you are semi experienced ");

        }
        else if(age>18){
            System.out.println("you are amature");
        }
        else{
            System.out.println("stop kid");
        }
    }
}
