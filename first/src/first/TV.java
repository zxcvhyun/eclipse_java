package first;

public interface TV {
	public int MiN_VOLUME = 0;
	public int MAX_VOLUME = 100;
	
	public void turnOn();
	public void turnOff();
	public void changeVolume(int vol);
	public void changeChahhel(int cha);
}
