package socialmedia;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) throws ParseException {
		
		Scanner input = new Scanner(System.in);
		
		SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyy HH:mm");
		ArrayList<Post> post = new ArrayList<>();
		
		System.out.println("How many posts you will make?");
		int x =  input.nextInt();
		input.nextLine(); 
		for(int i = 0; i < x; i++) {
			System.out.println("Enter the momment (dd/mm/yyyy hh:mm)");
			String momment = input.nextLine();
			System.out.println("Enter the title:");
			String title = input.nextLine();
			System.out.println("Enter the content:");
			String content = input.nextLine();
			System.out.println("Enter with likes:");
			Integer likes = input.nextInt();
			input.nextLine();

			Post adPost = new Post(fmt.parse(momment), title, content, likes );
			post.add(adPost);
			
			System.out.println("Faça um comentario");
			String comment1 = input.nextLine();			
			post.get(i).addComment(comment1);
			System.out.println("Faça outro comentario");
			String comment2 = input.nextLine();
			post.get(i).addComment(comment2);
			
		}
		System.out.println(post);
		
	}

}
