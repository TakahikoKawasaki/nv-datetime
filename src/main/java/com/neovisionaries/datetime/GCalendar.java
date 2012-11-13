package com.neovisionaries.datetime;


import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;


/**
 * A subclass of {@link GregorianCalendar} that provides
 * some utility methods such as {@link #getYear()}.
 *
 * <p>
 * GCalendar provides getXxx(), setXxx(), addXxx() and
 * rollXxx() methods for each Calendar field. For example,
 * getYear() method exists. In addition, some format() and
 * parse() methods are available.
 * </p>
 *
 * <p>
 * GregorianCalendar class has {@link GregorianCalendar#isLeapYear(int)
 * isLeapYear(int year)} method, but it is not a static method for
 * some reasons. On the other hand, GCalendar provides no-argument
 * {@link #isLeapYear()} instance method and {@link #isLeapYear(int)
 * isLeapYear(int year)} as a static method. Some constructor variants,
 * for example, {@link GCalendar#GCalendar(Date) GCalendar(Date)},
 * are provided, too.
 * </p>
 *
 * @author Takahiko Kawasaki
 */
@SuppressWarnings("serial")
public class GCalendar extends GregorianCalendar
{
    public GCalendar()
    {
        super();
    }


    public GCalendar(int year, int month, int dayOfMonth, int hourOfDay, int minute, int second)
    {
        super(year, month, dayOfMonth, hourOfDay, minute, second);
    }


    public GCalendar(int year, int month, int dayOfMonth, int hourOfDay, int minute)
    {
        super(year, month, dayOfMonth, hourOfDay, minute);
    }


    public GCalendar(int year, int month, int dayOfMonth)
    {
        super(year, month, dayOfMonth);
    }


    public GCalendar(Locale locale)
    {
        super(locale);
    }


    public GCalendar(TimeZone zone, Locale locale)
    {
        super(zone, locale);
    }


    public GCalendar(TimeZone zone)
    {
        super(zone);
    }


    /**
     * A constructor that calls super.{@link GregorianCalendar#setTime(Date)
     * setTime(Date)}.
     */
    public GCalendar(Date date)
    {
        super.setTime(date);
    }


    /**
     * A constructor that calls super.{@link GregorianCalendar#setTimeInMillis(long)
     * setTimeInMillis(long)}.
     */
    public GCalendar(long millis)
    {
        super.setTimeInMillis(millis);
    }


    /**
     * Equivalent to {@link #get(int) get}({@link Calendar#AM_PM} AM_PM}).
     */
    public int getAMPM()
    {
        return get(AM_PM);
    }


    public boolean isAM()
    {
        return (getAMPM() == AM);
    }


    public boolean isPM()
    {
        return (getAMPM() == PM);
    }


    public GCalendar setAM()
    {
        set(AM_PM, AM);

        return this;
    }


    public GCalendar setPM()
    {
        set(AM_PM, PM);

        return this;
    }


    public int getDate()
    {
        return get(DATE);
    }


    public GCalendar setDate(int date)
    {
        set(DATE, date);

        return this;
    }


    public GCalendar addDate(int date)
    {
        add(DATE, date);

        return this;
    }


    public GCalendar rollDate(int date)
    {
        roll(DATE, date);

        return this;
    }


    public int getDayOfMonth()
    {
        return get(DAY_OF_MONTH);
    }


    public GCalendar setDayOfMonth(int dayOfMonth)
    {
        set(DAY_OF_MONTH, dayOfMonth);

        return this;
    }


    public GCalendar addDayOfMonth(int dayOfMonth)
    {
        add(DAY_OF_MONTH, dayOfMonth);

        return this;
    }


    public GCalendar rollDayOfMonth(int dayOfMonth)
    {
        roll(DAY_OF_MONTH, dayOfMonth);

        return this;
    }


    public int getDayOfWeek()
    {
        return get(DAY_OF_WEEK);
    }


    public GCalendar setDayOfWeek(int dayOfWeek)
    {
        set(DAY_OF_WEEK, dayOfWeek);

        return this;
    }


    public GCalendar addDayOfWeek(int dayOfWeek)
    {
        add(DAY_OF_WEEK, dayOfWeek);

        return this;
    }


    public GCalendar rollDayOfWeek(int dayOfWeek)
    {
        roll(DAY_OF_WEEK, dayOfWeek);

        return this;
    }


    public int getDayOfWeekInMonth()
    {
        return get(DAY_OF_WEEK_IN_MONTH);
    }


    public GCalendar setDayOfWeekInMonth(int dayOfWeekInMonth)
    {
        set(DAY_OF_WEEK_IN_MONTH, dayOfWeekInMonth);

        return this;
    }


    public GCalendar addDayOfWeekInMonth(int dayOfWeekInMonth)
    {
        add(DAY_OF_WEEK_IN_MONTH, dayOfWeekInMonth);

        return this;
    }


    public GCalendar rollDayOfWeekInMonth(int dayOfWeekInMonth)
    {
        roll(DAY_OF_WEEK_IN_MONTH, dayOfWeekInMonth);

        return this;
    }


    public int getDayOfYear()
    {
        return get(DAY_OF_YEAR);
    }


    public GCalendar setDayOfYear(int dayOfYear)
    {
        set(DAY_OF_YEAR, dayOfYear);

        return this;
    }


    public GCalendar addDayOfYear(int dayOfYear)
    {
        add(DAY_OF_YEAR, dayOfYear);

        return this;
    }


    public GCalendar rollDayOfYear(int dayOfYear)
    {
        roll(DAY_OF_YEAR, dayOfYear);

        return this;
    }


    public int getDstOffset()
    {
        return get(DST_OFFSET);
    }


    public GCalendar setDstOffset(int dstOffset)
    {
        set(DST_OFFSET, DST_OFFSET);

        return this;
    }


    public GCalendar addDstOffset(int dstOffset)
    {
        add(DST_OFFSET, DST_OFFSET);

        return this;
    }


    public GCalendar rollDstOffset(int dstOffset)
    {
        roll(DST_OFFSET, DST_OFFSET);

        return this;
    }


    public int getEra()
    {
        return get(ERA);
    }


    public boolean isAD()
    {
        return (getEra() == AD);
    }


    public boolean isBC()
    {
        return (getEra() == BC);
    }


    public GCalendar setEra(int era)
    {
        set(ERA, era);

        return this;
    }


    public int getHour()
    {
        return get(HOUR);
    }


    public GCalendar setHour(int hour)
    {
        set(HOUR, hour);

        return this;
    }


    public GCalendar addHour(int hour)
    {
        add(HOUR, hour);

        return this;
    }


    public GCalendar rollHour(int hour)
    {
        roll(HOUR, hour);

        return this;
    }


    public int getHourOfDay()
    {
        return get(HOUR_OF_DAY);
    }


    public GCalendar setHourOfDay(int hourOfDay)
    {
        set(HOUR_OF_DAY, hourOfDay);

        return this;
    }


    public GCalendar addHourOfDay(int hourOfDay)
    {
        add(HOUR_OF_DAY, hourOfDay);

        return this;
    }


    public GCalendar rollHourOfDay(int hourOfDay)
    {
        roll(HOUR_OF_DAY, hourOfDay);

        return this;
    }


    public int getMillisecond()
    {
        return get(MILLISECOND);
    }


    public GCalendar setMillisecond(int millisecond)
    {
        set(MILLISECOND, millisecond);

        return this;
    }


    public GCalendar addMillisecond(int millisecond)
    {
        add(MILLISECOND, millisecond);

        return this;
    }


    public GCalendar rollMillisecond(int millisecond)
    {
        roll(MILLISECOND, millisecond);

        return this;
    }


    public int getMinute()
    {
        return get(MINUTE);
    }


    public GCalendar setMinute(int minute)
    {
        set(MINUTE, minute);

        return this;
    }


    public GCalendar addMinute(int minute)
    {
        add(MINUTE, minute);

        return this;
    }


    public GCalendar rollMinute(int minute)
    {
        roll(MINUTE, minute);

        return this;
    }


    public int getMonth()
    {
        return get(MONTH);
    }


    public GCalendar setMonth(int month)
    {
        set(MONTH, month);

        return this;
    }


    public GCalendar addMonth(int month)
    {
        add(MONTH, month);

        return this;
    }


    public GCalendar rollMonth(int month)
    {
        roll(MONTH, month);

        return this;
    }


    public int getSecond()
    {
        return get(SECOND);
    }


    public GCalendar setSecond(int second)
    {
        set(SECOND, second);

        return this;
    }


    public GCalendar addSecond(int second)
    {
        add(SECOND, second);

        return this;
    }


    public GCalendar rollSecond(int second)
    {
        roll(SECOND, second);

        return this;
    }


    public int getWeekOfMonth()
    {
        return get(WEEK_OF_MONTH);
    }


    public GCalendar setWeekOfMonth(int weekOfMonth)
    {
        set(WEEK_OF_MONTH, weekOfMonth);

        return this;
    }


    public GCalendar addWeekOfMonth(int weekOfMonth)
    {
        add(WEEK_OF_MONTH, weekOfMonth);

        return this;
    }


    public GCalendar rollWeekOfMonth(int weekOfMonth)
    {
        roll(WEEK_OF_MONTH, weekOfMonth);

        return this;
    }


    public int getWeekOfYear()
    {
        return get(WEEK_OF_YEAR);
    }


    public GCalendar setWeekOfYear(int weekOfYear)
    {
        set(WEEK_OF_YEAR, weekOfYear);

        return this;
    }


    public GCalendar addWeekOfYear(int weekOfYear)
    {
        add(WEEK_OF_YEAR, weekOfYear);

        return this;
    }


    public GCalendar rollWeekOfYear(int weekOfYear)
    {
        roll(WEEK_OF_YEAR, weekOfYear);

        return this;
    }


    public int getYear()
    {
        return get(YEAR);
    }


    public GCalendar setYear(int year)
    {
        set(YEAR, year);

        return this;
    }


    public GCalendar addYear(int year)
    {
        add(YEAR, year);

        return this;
    }


    public GCalendar rollYear(int year)
    {
        roll(YEAR, year);

        return this;
    }


    public int getZoneOffset()
    {
        return get(ZONE_OFFSET);
    }


    public GCalendar setZoneOffset(int zoneOffset)
    {
        set(ZONE_OFFSET, zoneOffset);

        return this;
    }


    public GCalendar addZoneOffset(int zoneOffset)
    {
        add(ZONE_OFFSET, zoneOffset);

        return this;
    }


    public GCalendar rollZoneOffset(int zoneOffset)
    {
        roll(ZONE_OFFSET, zoneOffset);

        return this;
    }


    public boolean isLeapYear()
    {
        return isLeapYear(getYear());
    }


    public static boolean isLeap(int year)
    {
        GCalendar cal = new GCalendar();

        cal.setYear(year);

        return cal.isLeapYear();
    }


    public static String format(DateFormat format, Calendar calendar)
    {
        return format.format(calendar.getTime());
    }


    public static String format(String format, Calendar calendar)
    {
        return format(new SimpleDateFormat(format), calendar);
    }


    public String format(DateFormat format)
    {
        return format(format, this);
    }


    public String format(String format)
    {
        return format(format, this);
    }


    public static StringBuffer format(DateFormat format, Calendar calendar, StringBuffer toAppendTo, FieldPosition position)
    {
        return format.format(calendar.getTime(), toAppendTo, position);
    }


    public static StringBuffer format(String format, Calendar calendar, StringBuffer toAppendTo, FieldPosition position)
    {
        return format(new SimpleDateFormat(format), calendar, toAppendTo, position);
    }


    public StringBuffer format(DateFormat format, StringBuffer toAppendTo, FieldPosition position)
    {
        return format(format, this, toAppendTo, position);
    }


    public StringBuffer format(String format, StringBuffer toAppendTo, FieldPosition position)
    {
        return format(format, this, toAppendTo, position);
    }


    public static GCalendar parse(DateFormat format, String source) throws ParseException
    {
        return new GCalendar(format.parse(source));
    }


    public static GCalendar parse(String format, String source) throws ParseException
    {
        return parse(new SimpleDateFormat(format), source);
    }


    public static GCalendar parse(DateFormat format, String source, ParsePosition position)
    {
        Date date = format.parse(source, position);

        if (date == null)
        {
            return null;
        }

        return new GCalendar(date);
    }


    public static GCalendar parse(String format, String source, ParsePosition position)
    {
        return parse(new SimpleDateFormat(format), source, position);
    }
}
