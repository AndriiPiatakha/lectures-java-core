package date;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class DemoTest {

	private static final String DATE_FORMAT = "dd-M-yyyy hh:mm:ss a";

	public static void main(String[] args) throws ParseException {
//		calendarExample(); 
		
		testConvertionInstant();
		
//		calendarEx1();
		 
//		 parseEx();
		//
		// Calendar calendar = Calendar.getInstance();
		// Date date = calendar.getTime();
		//
		// durationAndClock();
		// testConvertionInstant();
//		 zoneDateTimeConversion();
		// durationExample();
		// periodEx();
//		zoneId();
	}

	public static void calendarEx1() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		sdf.setTimeZone(TimeZone.getDefault());
		
//		Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
//		TimeZone.getTimeZone(ZoneId.of(""))
		
		Date dateParsed = sdf.parse("1999/01/10 10:02:02");
		System.out.println(dateParsed);
		Date from = Date.from(Instant.now());

		String date = sdf.format(new Date());
		System.out.println(date);
	}

	private static void parseEx() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String dateInString = "31-08-1982 10:20:56";
		Date date = sdf.parse(dateInString);
		System.out.println(sdf.format(date));
	}

	public static void convertDateCalender() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String dateInString = "22-01-2015 10:20:56";
		Date date = sdf.parse(dateInString);

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
	}

	public static void calendarExample() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
		Calendar calendar = new GregorianCalendar(2013, 1, 28, 13, 24, 56);

		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH); // Jan = 0, dec = 11
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
		int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);

		int hour = calendar.get(Calendar.HOUR); // 12 hour clock
		int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY); // 24 hour clock
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		int millisecond = calendar.get(Calendar.MILLISECOND);

		System.out.println(sdf.format(calendar.getTime()));

		System.out.println("year \t\t: " + year);
		System.out.println("month \t\t: " + month);
		System.out.println("dayOfMonth \t: " + dayOfMonth);
		System.out.println("dayOfWeek \t: " + dayOfWeek);
		System.out.println("weekOfYear \t: " + weekOfYear);
		System.out.println("weekOfMonth \t: " + weekOfMonth);

		System.out.println("hour \t\t: " + hour);
		System.out.println("hourOfDay \t: " + hourOfDay);
		System.out.println("minute \t\t: " + minute);
		System.out.println("second \t\t: " + second);
		System.out.println("millisecond \t: " + millisecond);
	}

	// compare dates (calendar, date) compareT0, after, before

	public static void localDateTimeEx() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();

		System.out.println(dtf.format(now)); // 2016/11/16 12:08:43
	}

	public static void durationAndClock() {
		Clock c = Clock.systemUTC();
		Duration d = Duration.ofHours(5);
		Duration.of(1, ChronoUnit.DAYS);
		Duration.of(1, ChronoUnit.CENTURIES);
		Clock clock = Clock.offset(c, d);
		System.out.println(clock.instant());

	}

	public static void testConvertionInstant() {
		Instant i = Instant.now();
		// ZoneId.systemDefault();
		ZonedDateTime atZone = i.atZone(ZoneId.of("Europe/Moscow"));
		Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
		for (String string : availableZoneIds) {
			System.out.println(string);
		}
		System.out.println(i.isSupported(ChronoUnit.CENTURIES));
		LocalDateTime ldt = LocalDateTime.ofInstant(i, ZoneOffset.UTC);
		System.out.println(atZone);
	}

	public static void zoneDateTimeConversion() {
		String dateInString = "22-1-2018 10:15:55 AM";
		LocalDateTime ldt = LocalDateTime.parse(dateInString, DateTimeFormatter.ofPattern(DATE_FORMAT));

		ZoneId singaporeZoneId = ZoneId.of("Asia/Singapore");
		System.out.println("TimeZone : " + singaporeZoneId);

		// LocalDateTime + ZoneId = ZonedDateTime
		ZonedDateTime asiaZonedDateTime = ldt.atZone(singaporeZoneId);
		System.out.println("Date (Singapore) : " + asiaZonedDateTime);

		ZoneId newYokZoneId = ZoneId.of("America/New_York");
		System.out.println("TimeZone : " + newYokZoneId);

		ZonedDateTime nyDateTime = asiaZonedDateTime.withZoneSameInstant(newYokZoneId);
		System.out.println("Date (New York) : " + nyDateTime);

		DateTimeFormatter format = DateTimeFormatter.ofPattern(DATE_FORMAT);
		System.out.println("\n---DateTimeFormatter---");
		System.out.println("Date (Singapore) : " + format.format(asiaZonedDateTime));
		System.out.println("Date (New York) : " + format.format(nyDateTime));
	}

	public static void timezoneForSdf() {
		SimpleDateFormat sdfAmerica = new SimpleDateFormat("dd-M-yyyy hh:mm:ss a");
		sdfAmerica.setTimeZone(TimeZone.getTimeZone("America/New_York"));
		String sDateInAmerica = sdfAmerica.format(new Date());
	}

	public static void durationExample() {
		Duration oneHours = Duration.ofHours(1);
		System.out.println(oneHours.getSeconds() + " seconds");

		Duration oneHours2 = Duration.of(1, ChronoUnit.HOURS);
		oneHours.getSeconds();
		System.out.println(oneHours2.getSeconds() + " seconds");

		// Test Duration.between
		System.out.println("\n--- Duration.between --- ");

		LocalDateTime oldDate = LocalDateTime.of(2016, Month.AUGUST, 31, 10, 20, 55);
		LocalDateTime newDate = LocalDateTime.of(2016, Month.NOVEMBER, 9, 10, 21, 56);

		System.out.println(oldDate);
		System.out.println(newDate);
		
		// count seconds between dates
		Duration duration = Duration.between(oldDate, newDate);
		long seconds = duration.getSeconds();

		System.out.println(seconds + " seconds");

		int day = (int) TimeUnit.SECONDS.toDays(seconds);
		long hours = TimeUnit.SECONDS.toHours(seconds) - (day * 24);
		long minute = TimeUnit.SECONDS.toMinutes(seconds) - (TimeUnit.SECONDS.toHours(seconds) * 60);
		long second = TimeUnit.SECONDS.toSeconds(seconds) - (TimeUnit.SECONDS.toMinutes(seconds) * 60);

		System.out.println(day + " " + hours + " " + minute + " " + second);

		System.out.println(TimeUnit.SECONDS.toDays(seconds));
	}

	public static void periodEx() {

		Period tenDays = Period.ofDays(10);
		System.out.println(tenDays.getDays()); // 10

		Period oneYearTwoMonthsThreeDays = Period.of(1, 2, 3);
		System.out.println(oneYearTwoMonthsThreeDays.getYears()); // 1
		System.out.println(oneYearTwoMonthsThreeDays.getMonths()); // 2
		System.out.println(oneYearTwoMonthsThreeDays.getDays()); // 3

		System.out.println("\n--- Period.between --- ");
		LocalDate oldDate = LocalDate.of(1982, Month.AUGUST, 31);
		LocalDate newDate = LocalDate.of(2016, Month.NOVEMBER, 9);

		System.out.println(oldDate);
		System.out.println(newDate);

		// check period between dates
		Period period = Period.between(oldDate, newDate);

		System.out.print(period.getYears() + " years,");
		System.out.print(period.getMonths() + " months,");
		System.out.print(period.getDays() + " days");

		System.out.println(period.isNegative());
	}

	// Coming to the point, actual different between Period and Duration
	// lies in how they calculate the time difference.
	// Duration is most suitable when we measure machine based timings where
	// as Period is most suitable when we want to know the human readable
	// time representation. For example, when you want to find age using
	// the current date and birth date, Period makes more sense.

	public static void chronoUnitExample() {
		LocalDateTime oldDate = LocalDateTime.of(1982, Month.AUGUST, 31, 10, 20, 55);
		LocalDateTime newDate = LocalDateTime.of(2016, Month.NOVEMBER, 9, 10, 21, 56);

		System.out.println(oldDate);
		System.out.println(newDate);

		// count between dates
		long years = ChronoUnit.YEARS.between(oldDate, newDate);
		long months = ChronoUnit.MONTHS.between(oldDate, newDate);
		long weeks = ChronoUnit.WEEKS.between(oldDate, newDate);
		long days = ChronoUnit.DAYS.between(oldDate, newDate);
		long hours = ChronoUnit.HOURS.between(oldDate, newDate);
		long minutes = ChronoUnit.MINUTES.between(oldDate, newDate);
		long seconds = ChronoUnit.SECONDS.between(oldDate, newDate);
		long milis = ChronoUnit.MILLIS.between(oldDate, newDate);
		long nano = ChronoUnit.NANOS.between(oldDate, newDate);
	}

	public static void zoneId() {
		Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
		for (String string : availableZoneIds) {
			System.out.println(string);
		}
		
		availableZoneIds.stream()
			.filter(zoneId -> zoneId.startsWith("Europe"))
			.forEach(System.out::println);
	}

	public static void addingDaysExample() {
		String DATE_FORMAT = "yyyy/MM/dd HH:mm:ss";
		DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
		DateTimeFormatter dateFormat8 = DateTimeFormatter.ofPattern(DATE_FORMAT);

		// Get current date
		Date currentDate = new Date();
		System.out.println("date : " + dateFormat.format(currentDate));

		// convert date to localdatetime
		LocalDateTime localDateTime = currentDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
		System.out.println("localDateTime : " + dateFormat8.format(localDateTime));

		// plus one
		localDateTime = localDateTime.plusYears(1).plusMonths(1).plusDays(1);
		localDateTime = localDateTime.plusHours(1).plusMinutes(2).minusMinutes(1).plusSeconds(1);

		// convert LocalDateTime to date
		Date currentDatePlusOneDay = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());

		System.out.println("\nOutput : " + dateFormat.format(currentDatePlusOneDay));
	}

	public static void temporalAdjustersEx() {
		LocalDate localDate = LocalDate.now();
		System.out.println("current date : " + localDate);

		LocalDate with = localDate.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("firstDayOfMonth : " + with);

		LocalDate with1 = localDate.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("lastDayOfMonth : " + with1);

		LocalDate with2 = localDate.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		System.out.println("next monday : " + with2);

		LocalDate with3 = localDate.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("firstDayOfNextMonth : " + with3);
	}
}
