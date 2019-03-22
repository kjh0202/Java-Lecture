package sec08_04_02;

import sec08_04.RemoteControl;

public class Audio implements RemoteControl{
	//필드
	private int volume;
	private boolean mute;

	//turnOn() 추상 메소도의 실체 메소드
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	//turnOff() 추상 메소도의 실체 메소드
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}

	//setVolume() 추상 메소도의 실체 메소드
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨: " + volume);
	}

	@Override
	public void setMute(boolean mute) {		//default 메소드 재정의
		this.mute = mute;
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
		
	}

}
