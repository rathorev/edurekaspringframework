package co.edureka;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BoxOffice {
	
	List<String> movies;
	
	@PostConstruct
	public void populateMovies(){
		movies=new ArrayList<String>();
		System.out.println("Adding Movies");
		movies.add("Pulp");movies.add("Happy Valley");movies.add("Extraterrestrial");movies.add("Spiderman 3");
		movies.add("PS I Love you");movies.add("A Walk to remember");movies.add("Hulk");movies.add("Study Hard");
	}
	
	public void currentlyPlaying(){
		System.out.println(movies);
	}
	
	@PreDestroy
	public void clearMovies(){
		System.out.println("Removing Movies");
		movies.clear();
	}
	
	
	

}
