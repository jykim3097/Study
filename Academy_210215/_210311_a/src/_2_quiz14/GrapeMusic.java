package _2_quiz14;

public class GrapeMusic implements SongList {

	//멤버변수
	private String[] list = new String[100];
	private int count = 0;
	
	/*
	 * insertList는 list 배열에 매개변수를 순서대로 저장
	 * playList는 배열 안에 음악을 랜덤하게 출력
	 * playLength는 음악의 개수를 반환
	 * 
	 */
	
	@Override
	public void insertList(String song) {
		
		list[count] = song;
		count++;
	}

	@Override
	public void playList() {
		
		int idx = (int)(Math.random()*(count));
		System.out.println(list[idx]);
	}

	@Override
	public int playLength() {
		
		return count;
	}

}
