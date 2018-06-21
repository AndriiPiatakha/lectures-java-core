package test;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class LocalizedTimeStamp {
	
	public static void main(String[] args) throws ParseException {
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		
		//================
//		Instant i = Instant.ofEpochMilli(ts.getTime());
//		ZonedDateTime atZone = i.atZone(ZoneId.systemDefault());
//		System.out.println(atZone);
//		
//		long between = ChronoUnit.DAYS.between(atZone, atZone);
//		System.out.println(between);
		//================
		
//		Date date = new Date(ts.getTime() + 600000);
//		DateFormat fullDateFormatEN = DateFormat.getDateTimeInstance(
//	            DateFormat.MEDIUM,
//	            DateFormat.MEDIUM,
//	            Locale.getDefault());
//		
//		String format = fullDateFormatEN.format(date);
//		System.out.println(format);
//		
//		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
//		sdf.setTimeZone(TimeZone.getDefault());
//		String format2 = sdf.format(date);
//		System.out.println(format2);
//		
//		Date date1 = sdf.parse(sdf.format(date));
//		Date date2 = sdf.parse("22-6-2018");
//		System.out.println(date1);
//		System.out.println(date2);
//		System.out.println(date1.before(date2));
//		
//		long diffInMillies = Math.abs(date2.getTime() - date1.getTime());
//	    long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
//		
//		System.out.println(diff);
//		
		
		//======================
		
		Date date = new Date(ts.getTime());
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date date1 = sdf.parse(sdf.format(date));
		Date date2 = sdf.parse("22-6-2018");
		long diffInMillies = Math.abs(date2.getTime() - date1.getTime());
	    long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
		
		System.out.println(diff);
		
	}

}
