import java.util.Random;
import java.util.Scanner;
class DiceGameApplication{
    public static void main(String args[]){
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int n=2;
        int total=0;
        int[] dices = new int[n];
        System.out.println("What is your name?");
        System.out.print("> ");
        String name = sc.next();
        System.out.println("Hello,"+name+"!");
        System.out.println("Rolling dice...");
        for(int i=0;i<n;i++){
            int die = random.nextInt(6)+1;
            dices[i]=die;
            System.out.println("Die "+(i+1)+": "+dices[i]);
            total+=dices[i];
        }
        System.out.println("Total value: "+total);
    }
}