package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Comment;
import entities.Post;

public class ProgramBuilder {

	public static void main(String []args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow thats is awesome!");
		
		
		Date date1 = sdf.parse("2018/06/21 13:05:44");
		String title1 = "Traveling to New Zeland";
		String content1 = "I'm going to visita this wonderful country!";
		int like1 = 12;
		
		Post p1 = new Post(date1, title1, content1, like1);
		p1.addComments(c1);
		p1.addComments(c2);
		
		System.out.println(p1);
	}
}
