
public class Main {

	public static void main(String[] args) {
		ScheduleList list = new ScheduleList("C:\\Users\\�ڱ���\\Desktop\\softwareproject\\schedule-file.data"); 
		
		for(int i =0; i < list.numSchedules(); i++)
		{
			list.getSchedule(i).print();
		}
	}

}
