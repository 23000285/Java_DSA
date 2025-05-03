package Parenthesis;
import java.util.*;
public class Valid {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input:");
		String ip=sc.nextLine();
		while(ip.contains("()") || ip.contains("{}") || ip.contains("[]")) {
			ip=ip.replace("()","");
			ip=ip.replace("{}","");
			ip=ip.replace("[]","");
		}
		if(ip.isEmpty()) {
			System.out.println("Valid paranthesis");
		}
		else {
			System.out.println("Not a Valid paranthesis");
		}
		
	}

}