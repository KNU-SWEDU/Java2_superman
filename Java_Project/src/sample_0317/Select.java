package sample_0317;
import java.util.*;

public class Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("�Է��ϻ�");
		int x = input.nextInt();
		
		if(x == 0){
			System.out.println("0");
		}else if((x%2) == 0){
			System.out.println("Even");
		}else {
			System.out.println("xxxx");
		}
		
		int result = x %2;
		
		switch(result){
			case 0:
				System.out.println("Even");
				break;
			case 1:
				System.out.println("xxxx");
				break;
		}
	}

}
