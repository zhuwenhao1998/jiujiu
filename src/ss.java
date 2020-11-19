import java.util.Scanner;

/**
 * Author:  create by zwh
 * Time:2020/11/10 15:45
 */
public class ss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("初始的数字是：");
        int a = scanner.nextInt();
        System.out.println(reversal_2(a));

    }

   public static  int reversal_2(int n) {

        int temp = 0;
        int m = 0;

        while(n != 0) {
            m = m * 10 + n % 10;//123  3
            if(temp != m/10) {	/*根据补码运算规则,如果发生了 溢出那么temp和m/10的值一定不相等*/
                return 0;
            }
            temp = m;
            n = n/10;
        }

        return m;
    }
}
