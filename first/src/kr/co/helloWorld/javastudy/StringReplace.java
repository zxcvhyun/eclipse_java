package kr.co.helloWorld.javastudy;

public class StringReplace {
	public static void main(String[] args) {
		String new_id = "z1";
		
		//1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
		String id = new_id.toLowerCase();
		System.out.println(id);
		//2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
		id = id.replaceAll("[^a-z0-9-_.]", "");
		System.out.println("2단계: "+id);
		//3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
		id = id.replaceAll("[.]+", ".");
		System.out.println(id);
		//4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
		id = id.replaceAll("^[.]|[.]$", "");
		System.out.println(id);
		//5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
		if (id.equals("")) {
			id += 'a';
			System.out.println(id);
		}
		//6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
		if (id.length() >= 16) {
			 id = id.substring(0, 15);
			 System.out.println(id);
			//만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
			 id = id.replaceAll("^[.]|[.]$", "");
		}
		//7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
		if(id.length() <= 2) {
			do {
				// 반복 할 문장들 - 무조건 한번은 수행
				id += id.charAt(id.length()-1);
				System.out.println("7단계: "+id);
			}while(id.length() < 3);//조건을 비교해서 만족하면 do로 올라가서 수행
		
			System.out.println(id);
		
		}
	}
	

}
/*...!@BaT#*..y.abcdefghijkim.
for (int i = 0; i < new_id.length(); i++) {
	// CharAt() : String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환해주는 녀석
	char c = new_id.charAt(i);
	if(c >= 'a' && c <= 'z') {
		id += String.valueOf(c);
		System.out.println("소문자 제거: " +id);
	}else if(c >= '0' && c <= '9') {
		id += String.valueOf(c);
		System.out.println("숫자 제거" + id);
	}
			
}
*/