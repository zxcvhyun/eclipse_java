package first;

public class AcceessObjExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessObj obj = new AccessObj();
		System.out.println(obj.p);
		System.out.println(obj.p2); //AcceessObjExam 이 다른 패키지에 있으면 p2와
		System.out.println(obj.k);	//k는 접근 불가함
		//System.out.println(obj.i); private이기 때문에 접근 불가
	}

}
