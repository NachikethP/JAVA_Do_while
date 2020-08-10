import java.util.Scanner;
import java.lang.Math;
public class sort {
    public static void sopln(String str){
            System.out.println(str);

        }
    public static void main(String args[]) {
        sort obj = new sort();
        Scanner sc = new Scanner(System.in);
        int n=0;

        do
        {
            obj.sopln("enter the principal amount: ");
            float principal = sc.nextFloat();
            obj.sopln("enter the interest/rate : ");
            float interest = sc.nextFloat();
            obj.sopln("enter the time in years/months: ");
            float time = sc.nextFloat();
            obj.sopln("enter the choice:\n 1.Simple interest \n 2.Compound interest");
            int choice = sc.nextInt();

            switch (choice)
            {
                    case 1:
                        float SI = (principal * interest * time) / 100;
                        obj.sopln("The simple interest is:" + SI);
                        break;

                    case 2:
                        double CI = principal * (Math.pow((1 + (interest / 100)), time));
                        obj.sopln("The compound interest is:" + CI);
                        break;

                    default:
                        obj.sopln("invalid choice");

            }


            obj.sopln("do u want to continue (1.yes/2.no):");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                    n=0;
                    break;

                case 2:
                    n=1;
                    break;

                default:
                    obj.sopln("invalid choice");
                    break;
            }

        }while(n==0);
    }
}
