import java.util.Scanner;
public class precticeProgramme {
    public static void main(String[] args){
        Scanner get=new Scanner(System.in);

        System.out.print("Enter your amount : ");
        float amount= get.nextFloat();
        System.out.print("Enter your interest Rate : ");
        float intrestRate= get.nextFloat();


        System.out.print("your first month inerest with amount is : ");
        testTotalAmount(intrestRate, amount);

        float afterCompound = finTotalAmont(intrestRate, amount) ;

        for(int i=1; i<5;i++){
            amount = afterCompound;
            afterCompound+= finTotalAmont(intrestRate, amount);
            int j=i+1;
            System.out.println("your "+j+"nd month inerest with amount is : "+afterCompound);
        }

        System.out.println("you can get your money after 5 years : " +afterCompound);

    }
    public static float calcAnualInterest(float intrestRate,float amount){
        float intetrest=amount*intrestRate/100;
        return intetrest;
    }
    public static float finTotalAmont(float intrestRate,float amount){
        float intrest=calcAnualInterest(intrestRate, amount);
        float totalAmount=intrest+amount;
        return totalAmount;
    }
    public static void testTotalAmount(float intrestRate,float amount){
        float totalAmount= finTotalAmont(intrestRate, amount);
        System.out.println(totalAmount);
    }
}
