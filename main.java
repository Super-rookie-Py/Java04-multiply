package multiply_1;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		int a = input();
		multiply(a);

	}

	private static void multiply(int a) {
		for(int i=2;i<=a;i++) 
		{
			System.out.println("---------"+i+"��--------");
			for(int j=1;j<=9;j++)
			{
				System.out.println(i+" X "+j+" = "+j*i+"�Դϴ�.");
			}
			
		}
	}

	private static int input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		int i = sc.nextInt();
		return i;
	}

}
