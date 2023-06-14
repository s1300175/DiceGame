import java.util.Random;
class DiceGameApplication{
    public static void main(String args[]){
        Random random = new Random();
        int n=2;
        int total=0;
        int[] dices = new int[n];
        System.out.println("Rolling dice...");
        for(int i=0;i<n;i++){
            int die = random.nextInt(6)+1;
            dices[i]=die;
            System.out.println("Die "+(i+1)+": "+dices[i]);
            total+=dices[i];
        }
        System.out.println("Total value: "+total);
        if(total>7)System.out.println("You won");
        else System.out.println("You lost");
    }
}