import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Schedule {
	private String name;
	private LocalDateTime starttime;
	private LocalDateTime endtime;
	private String memo;

	public Schedule(String name, String starttime, String endtime, String memo){
		this.name = name;
		this.starttime = LocalDateTime.parse(starttime, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
		this.endtime = LocalDateTime.parse(endtime, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
		this.memo = memo;	
	}
	
	public Schedule(String name, String starttime, String endtime){
		this.name = name;
		this.starttime = LocalDateTime.parse(starttime, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
		this.endtime = LocalDateTime.parse(endtime, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
	}
	
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setStarttime(String starttime)
	{
		LocalDateTime start = LocalDateTime.parse(starttime, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
		this.starttime = start;
	}
	
	public void setEndtime(String endtime)
	{
		LocalDateTime end = LocalDateTime.parse(endtime, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
		this.starttime = end;
	}
	
	public void setMemo(String memo)
	{
		this.memo = memo;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getStarttime()
	{
		//LocalDateTime -> String		
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");		
		String start = starttime.format(pattern);
		return start;
	}
	
	public String getEndtime()
	{
		//LocalDateTime -> String		
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");		
		String end = endtime.format(pattern);
		return end;
	}
	
	public String getMemo()
	{
		return this.memo;
	}
	
	public void print()
	{
		System.out.print(getName() + " // ");
		System.out.print(getStarttime() + " - ");
		System.out.print(getEndtime() + " : ");
		System.out.println(getMemo());
	}
}
