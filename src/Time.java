public class Time {

	int hours;
	int minutes;
	int seconds;

   Time(int hours, int minutes, int seconds){

	   this.hours = hours;

	   this.minutes = minutes;

	  this.seconds = seconds;
   }
	public String getTime(){

		return String.format("%02d:%02d:%02d %.2s", hours, minutes, seconds ,hours > 12 ? "AM" : "PM");
	}
}
