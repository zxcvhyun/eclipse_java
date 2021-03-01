package first;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 45;
		String ans = "";
		while(num > 0) {
			ans = (num%3) + ans;
			num /= 3;
		}
		System.out.println(ans);
	}

}
