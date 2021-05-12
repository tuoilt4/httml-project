import javax.script.ScriptContext;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
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
        int thang;
        System.out.print("Nhập thông tin tháng muốn tra cứu:");
        thang = scanner.nextInt();
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.printf("Tháng %d có 31 ngày \n", thang);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.printf("Tháng %d có 30 ngày\n", thang);
                break;
            case 2:
                System.out.printf("Tháng %d có 28 ngày \n", thang);
                break;

            default:
                System.out.println("Không có tháng này");
                break;
        }
        // tinh thang theo ham if else
        if (thang < 13) {
            if (thang == 2) {
                System.out.printf("Tháng %d có 28 ngày \n", thang);
            } else if (thang == 1 | thang == 3 | thang == 5 | thang == 7 | thang == 8 | thang == 10 | thang == 12) {
                System.out.printf("Tháng %d có 31 ngày\n", thang);
            } else if (thang == 4 | thang == 6 | thang == 9 | thang == 11) {
                System.out.printf("Tháng %d có 30 ngày\n", thang);
            }
        } else {
            System.out.println("Không có tháng này");
        }

        //tinh thông tin canh huyen

        System.out.print("Thông tin các cạnh tam giác vuông:\n");
        System.out.print("Nhập thông tin chiều dài cạnh vuông thứ nhất:");
        double a = scanner.nextDouble();
        System.out.print("Nhập thông tin chiều dài cạnh vuông thứ hai:");
        double b = scanner.nextDouble();
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.printf("Chiều dài cạnh huyền tam giác: %.2f \n", c);
    }
}