import javax.script.ScriptContext;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
        {
            //double cn = 50;
            //double cc = 1.6;
            //double bmi= cn/(cc*cc);
            //System.out.printf("Chỉ số cân năng: %.2f\n",cn);
            //if(bmi<18.5)
            //{System.out.print("Thieu can");}
            //else if(bmi<24.5)
            // {System.out.print("Can doi");}
            // else {System.out.print("can");}
            Scanner scanner = new Scanner(System.in);
                    //double a;
                    //double b;
                    //double c;
                    //double d = (a*a)+(b*b);
                    //c= Math.sqrt(d);
                    //System.out.print("Thông tin các cạnh tam giác vuông:\n");
                    //System.out.print ("Nhập thông tin chiều dài cạnh vuông thứ nhất:");
                    //a= scanner.nextDouble();
                    //System.out.print ("Nhập thông tin chiều dài cạnh vuông thứ hai:");
                    //b=scanner.nextDouble();
                    //System.out.printf("Chiều dài cạnh huyền tam giác: %.2f",c);
            int thang;
            System.out.print ("Nhập thông tin tháng muốn tra cứu:");
            thang= scanner.nextInt();
            switch (thang) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.printf("Tháng %d có 31 ngày", thang);
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.printf("Tháng %d có 30 ngày", thang);
                    break;
                case 2:
                    System.out.printf("Tháng %d có 28 ngày", thang);
                    break;

                default:
                    System.out.println("Không có tháng này");
                    break;
            }

        }

}