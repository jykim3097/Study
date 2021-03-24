package _3_anonymous.basic2;

public class Computer {

	//멤버변수
	private int sound;
	private RemoteControl remocon;
	
	//생성자
	public Computer() {
		remocon = new RemoteControl() {
			
			@Override
			public void volumeUp() {
				sound++;
				System.out.println("컴퓨터 볼륨: "+ sound);
			}
			
			@Override
			public void volumeDown() {
				sound--;
				System.out.println("컴퓨터 볼륨: "+ sound);
			}
			
			@Override
			public void turnOn() {
				System.out.println("전원을 켭니다");
			}
			
			@Override
			public void turnOff() {
				System.out.println("전원을 끕니다");
			}
		};
	}

	public int getSound() {
		return sound;
	}

	public void setSound(int sound) {
		this.sound = sound;
	}

	public RemoteControl getRemocon() {
		return remocon;
	}

	public void setRemocon(RemoteControl remocon) {
		this.remocon = remocon;
	}
	
	
}
