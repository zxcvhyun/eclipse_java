package kr.co.helloWorld.javastudy;

public class StringReplace {
	public static void main(String[] args) {
		String new_id = "z1";
		
		//1�ܰ� new_id�� ��� �빮�ڸ� �����Ǵ� �ҹ��ڷ� ġȯ�մϴ�.
		String id = new_id.toLowerCase();
		System.out.println(id);
		//2�ܰ� new_id���� ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.)�� ������ ��� ���ڸ� �����մϴ�.
		id = id.replaceAll("[^a-z0-9-_.]", "");
		System.out.println("2�ܰ�: "+id);
		//3�ܰ� new_id���� ��ħǥ(.)�� 2�� �̻� ���ӵ� �κ��� �ϳ��� ��ħǥ(.)�� ġȯ�մϴ�.
		id = id.replaceAll("[.]+", ".");
		System.out.println(id);
		//4�ܰ� new_id���� ��ħǥ(.)�� ó���̳� ���� ��ġ�Ѵٸ� �����մϴ�.
		id = id.replaceAll("^[.]|[.]$", "");
		System.out.println(id);
		//5�ܰ� new_id�� �� ���ڿ��̶��, new_id�� "a"�� �����մϴ�.
		if (id.equals("")) {
			id += 'a';
			System.out.println(id);
		}
		//6�ܰ� new_id�� ���̰� 16�� �̻��̸�, new_id�� ù 15���� ���ڸ� ������ ������ ���ڵ��� ��� �����մϴ�.
		if (id.length() >= 16) {
			 id = id.substring(0, 15);
			 System.out.println(id);
			//���� ���� �� ��ħǥ(.)�� new_id�� ���� ��ġ�Ѵٸ� ���� ��ġ�� ��ħǥ(.) ���ڸ� �����մϴ�.
			 id = id.replaceAll("^[.]|[.]$", "");
		}
		//7�ܰ� new_id�� ���̰� 2�� ���϶��, new_id�� ������ ���ڸ� new_id�� ���̰� 3�� �� ������ �ݺ��ؼ� ���� ���Դϴ�.
		if(id.length() <= 2) {
			do {
				// �ݺ� �� ����� - ������ �ѹ��� ����
				id += id.charAt(id.length()-1);
				System.out.println("7�ܰ�: "+id);
			}while(id.length() < 3);//������ ���ؼ� �����ϸ� do�� �ö󰡼� ����
		
			System.out.println(id);
		
		}
	}
	

}
/*...!@BaT#*..y.abcdefghijkim.
for (int i = 0; i < new_id.length(); i++) {
	// CharAt() : String���� ����� ���ڿ� �߿��� �� ���ڸ� �����ؼ� charŸ������ ��ȯ���ִ� �༮
	char c = new_id.charAt(i);
	if(c >= 'a' && c <= 'z') {
		id += String.valueOf(c);
		System.out.println("�ҹ��� ����: " +id);
	}else if(c >= '0' && c <= '9') {
		id += String.valueOf(c);
		System.out.println("���� ����" + id);
	}
			
}
*/