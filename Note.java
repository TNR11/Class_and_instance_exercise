package task_5;
import static java.lang.System.*;

public class Note {
	private String pitch;
	private int duration;
	
	public Note (String p, int d) {
		this.setPitch(p);
		this.setDuration(d);
	}
	public void playNote() {	
		out.printf("The note %s is played for %d seconds.\n", pitch, duration);	
	}
	public String getPitch() {
		return pitch;
	}
	public void setPitch(String pitch) {
		this.pitch = pitch;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
}
