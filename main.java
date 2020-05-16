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
			System.out.println("---------"+i+"단--------");
			for(int j=1;j<=9;j++)
			{
				System.out.println(i+" X "+j+" = "+j*i+"입니다.");
			}
			
		}
	}

	private static int input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int i = sc.nextInt();
		return i;
	}

}
