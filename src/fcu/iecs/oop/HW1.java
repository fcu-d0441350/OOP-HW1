package fcu.iecs.oop;

public class HW1 {

	public static void main(String[] args) {
		String lyrics = "Let it go! Let it go! Cannot hold it back anymore";
		String update = lyrics.replaceAll("it", "\"her\"");
		System.out.println(update.replaceAll("Cannot", "Can't"));
		
	}

}
