package task_5;
/**
 * Assignment task 5: Class and Instance
 * Author: Aadil Imran, 2022
 */
import static java.lang.System.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		List<Note> notes = new LinkedList<>(); //creating list for notes
		notes.add(new Note("D", 19)); //adding notes to list
		notes.add(new Note("C", 20));
		notes.add(new Note("F", 31));
		notes.add(new Note("B", 45));
		notes.add(new Note("C", 73));
		notes.add(new Note("F", 13));
		notes.add(new Note("B", 34));
		notes.add(new Note("C", 53));
		processNotes(notes); //calling method to play notes
	}
	
	public static void processNotes(List<Note> notes) {
		int total = 0;
		for(Note n : notes) { //For-each loop to iteratre through list of notes, playing them and adding up total time duration counter
			n.playNote();
			total += n.getDuration();
		}
		out.printf("\nTotal duration: %d", total);
	}
}
