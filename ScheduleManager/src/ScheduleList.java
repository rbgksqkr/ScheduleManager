import java.io.File;
import java.util.Scanner;

public class ScheduleList {
	
	Schedule[] schedulelist = new Schedule[100];
	
	private int numOfSchedules = 0;
	
	public ScheduleList(String fileName)
	{
		File file = new File(fileName);
		int i = 0;
		try{				
			Scanner input = new Scanner(file);
	        
	        while(input.hasNext())
	        {
	        	String line = input.nextLine();			
	        	if(line.charAt(0) == ';')
	        		continue;
	        	String[] tokens = line.split("//");
	        	
	        	for(int j = 0; j < tokens.length; j++)
	        	{
	        		tokens[j] = tokens[j].trim();
	        	}
	        	if(tokens.length == 3)
	        		schedulelist[i] = new Schedule(tokens[0], tokens[1], tokens[2]);
	        	if(tokens.length == 4)
	        		schedulelist[i] = new Schedule(tokens[0], tokens[1], tokens[2], tokens[3]);
	        		
	        	i++;
	        	numOfSchedules++;
	        }	
	        
	        input.close();
	            
	        }catch(Exception e){
	            e.printStackTrace();
	            return;
	        }
	}
	
	public int numSchedules()
	{
		return numOfSchedules; 
	}
	
	public Schedule getSchedule(int i)
	{
		return schedulelist[i];
	}
}
