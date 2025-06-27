package Codility;

import java.time.Duration;
import java.time.LocalTime;

public class ParkingTicket {

	public static int solution(String E, String L) {
		
		LocalTime eTime = LocalTime.parse(E);
//		System.out.println("eTime: "+eTime);
		LocalTime lTime = LocalTime.parse(L);
//		System.out.println("lTime : "+lTime);
		
		long durationInMinutes = Duration.between(eTime, lTime).toMinutes();
		System.out.println("Duration: "+durationInMinutes);
		
		// Extract hours and minutes
//        long hours = duration.toHours();
//        long minutes = duration.toMinutes() % 60;
        
        long totalHours = (durationInMinutes + 59)/60; 
        
        
        System.out.println("parking duration: "+totalHours+" hrs");
        int cost = 2;
			if(totalHours > 0) {
				cost += 3;  
				if(totalHours > 1) {
				cost += (totalHours-1)*4;
				}
			}
		
		return cost;
	}
	
	public static void main(String[] args) {
		

		
		// TODO Auto-generated method stub
		int result = solution("09:42","11:42");
		System.out.println("Ticket is Rs: "+result);
	}

}
