package first;

public class LedTV implements TV {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("�Ѵ�");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("����");
	}

	@Override
	public void changeVolume(int vol) {
		// TODO Auto-generated method stub
		System.out.println("��������");
	}

	@Override
	public void changeChahhel(int cha) {
		// TODO Auto-generated method stub
		System.out.println("ä�κ���");
	}

}
