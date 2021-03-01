package first;

public class LedTV implements TV {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("켜다");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("끄다");
	}

	@Override
	public void changeVolume(int vol) {
		// TODO Auto-generated method stub
		System.out.println("볼륨조절");
	}

	@Override
	public void changeChahhel(int cha) {
		// TODO Auto-generated method stub
		System.out.println("채널변경");
	}

}
