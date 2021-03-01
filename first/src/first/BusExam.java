package first;

public class BusExam {

	public static void main(String[] args) {
		Car c = new Bus();
		c.run();
		//c.ppang();
		Bus bus = (Bus)c ;
		bus.run();
		bus.ppang();
	}

}
