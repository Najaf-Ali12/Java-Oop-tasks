/*41. Sports Event Management
•	Scenario: Develop a sports event management system where organizers can schedule events. Events can be Football, 
Basketball, or Cricket matches.
•	Concepts: Classes, Inheritance, Date
•	Task: Create a base class Event and derive FootballMatch, BasketballMatch, and CricketMatch classes. 
Implement methods to schedule events and display event details.
 */

import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.LocalDateTimeFormatter;


abstract class Event{
   abstract scheduleEvent();
   abstract displayEvent();
}
class FootballMatch extends Event{
    LocalDate EventDate;
    FootballMatch(LocalDate EventDate){
        this.EventDate=EventDate;
    }
    public void ScheduleEvent(){
        System.out.println("The Event is scheduled at: "+EventDate);
    }
    public void displayEvent(){
        System.out.println("Event: Football Match");
        System.out.println("Date of Event: "+EventDate);
    }
}
class BasketballMatch extends Event{
    LocalDate EventDate;
    BasketballMatch(LocalDate EventDate){
        this.EventDate=EventDate;
    }
    public void ScheduleEvent(){
        System.out.println("The Event is scheduled at: "+EventDate);
    }
    public void displayEvent(){
        System.out.println("Event: BasketBall Match");
        System.out.println("Date of Event: "+EventDate);
    }
}
class CricketMatch extends Event{
    LocalDate EventDate;
    CricketMatch(LocalDate EventDate){
        this.EventDate=EventDate;
    }
    public void ScheduleEvent(){
        System.out.println("The Event is scheduled at: "+EventDate);
    }
    public void displayEvent(){
        System.out.println("Event: Cricket Match");
        System.out.println("Date of Event: "+EventDate);
    }
}
public class SportsEventManagement{
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the date at which you want to schedule the football match(like in form 2024-07-29): ");
        String date_of_football=Sc.nextLine();
        LocalDate football_date=LocalDate.parse(date_of_football);
        FootballMatch football_obj=new FootballMatch(football_date);
        football_obj.ScheduleEvent();
        football_obj.displayEvent();

        System.out.println("Enter the date at which you want to schedule the Basketball match(like in form 2024-07-29): ");
        String date_of_Basketball=Sc.nextLine();
        LocalDate Basketball_date=LocalDate.parse(date_of_Basketball);
        BasketballMatch Basketball_obj=new BasketballMatch(Basketball_date);
        Basketball_obj.ScheduleEvent();
        Basketball_obj.displayEvent();

        System.out.println("Enter the date at which you want to schedule the Cricket match(like in form 2024-07-29): ");
        String date_of_cricket=Sc.nextLine();
        LocalDate cricket_date=LocalDate.parse(date_of_cricket);
        CricketMatch cricket_obj=new CricketMatch(cricket_date);
        cricket_obj.ScheduleEvent();
        cricket_obj.displayEvent();
    }

}