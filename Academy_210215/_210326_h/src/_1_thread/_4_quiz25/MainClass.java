package _1_thread._4_quiz25;

public class MainClass {

	public static void main(String[] args) {
		
		Video music = new Video();
		Downlaod download = new Downlaod();
		
		Thread m = new Thread(music, "music");
		Thread v = new Thread(download, "video");
		
		m.start();
		v.start();
	
		
	}
}
