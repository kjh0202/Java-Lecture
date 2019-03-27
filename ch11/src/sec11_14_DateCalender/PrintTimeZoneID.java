package sec11_14_DateCalender;

import java.util.Calendar;
import java.util.TimeZone;

public class PrintTimeZoneID {

	public static void main(String[] args) {
		String[] availableIDs = TimeZone.getAvailableIDs();
		for(String id : availableIDs) {
			System.out.println(id);
		}
		TimeZone tz = TimeZone.getTimeZone("US/Pacific");
		Calendar nowLA = Calendar.getInstance(tz);
		System.out.print(nowLA.get(Calendar.MONDAY) +1 + "월 ");
		System.out.print(nowLA.get(Calendar.DAY_OF_MONTH) + "일 ");
		//int amPm = nowLA.get(Calendar.AM_PM);
		System.out.print(nowLA.get(Calendar.HOUR) + "시 ");
		System.out.print(nowLA.get(Calendar.MINUTE) + "분 ");
	}

}
