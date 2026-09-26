/** * Real-world use case: A website analytics dashboard identifies the hour * of the day with the highest number of visits so infrastructure can be * scaled ahead of peak load. */ 
public class T68_PeakTrafficHourFinder {    
	public static int findPeakHour(int[] hourlyVisits) {        
		int peakHour = 0;        
		for (int hour = 1; hour < hourlyVisits.length; hour++) {            
			if (hourlyVisits[hour] > hourlyVisits[peakHour]) {                
				peakHour = hour;            
				}        
			}        
		return peakHour;    
		}    
	public static void main(String[] args) {        
		int[] hourlyVisits = new int[24];        
		hourlyVisits[9] = 1200;        
		hourlyVisits[13] = 2100;        
		hourlyVisits[20] = 3400;        
		hourlyVisits[21] = 3100;        
		int peakHour = findPeakHour(hourlyVisits);        
		System.out.println("Peak traffic hour: " + peakHour + ":00 with "                
		+ hourlyVisits[peakHour] + " visits");    
		} 
	}