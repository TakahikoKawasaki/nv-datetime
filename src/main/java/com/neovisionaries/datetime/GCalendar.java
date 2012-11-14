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
 * isLeapYear(int year)} method, but it is not a static method. On the
 * other hand, GCalendar provides no-argument {@link #isLeapYear()}
 * instance method and {@link #isLeap(int) isLeap(int year)}
 * as a static method. Some constructor variants, for example, {@link
 * GCalendar#GCalendar(Date) GCalendar(Date)}, are provided, too.
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


    public GCalendar(TimeZone timeZone, Locale locale, int year, int month, int dayOfMonth, int hourOfDay, int minute, int second, int millisecond)
    {
        super(timeZone, locale);

        setInternal(year, month, dayOfMonth, hourOfDay, minute, second, millisecond);
    }


    public GCalendar(TimeZone timeZone, int year, int month, int dayOfMonth, int hourOfDay, int minute, int second, int millisecond)
    {
        super(timeZone);

        setInternal(year, month, dayOfMonth, hourOfDay, minute, second, millisecond);
    }


    public GCalendar(Locale locale, int year, int month, int dayOfMonth, int hourOfDay, int minute, int second, int millisecond)
    {
        super(locale);

        setInternal(year, month, dayOfMonth, hourOfDay, minute, second, millisecond);
    }


    public GCalendar(int year, int month, int dayOfMonth, int hourOfDay, int minute, int second, int millisecond)
    {
        super(year, month, dayOfMonth, hourOfDay, minute, second);
        super.set(Calendar.MILLISECOND, millisecond);
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
     * A constructor that calls <code>super()</code> and
     * <code>super.{@link GregorianCalendar#setTime(Date)
     * setTime(Date)}</code>.
     */
    public GCalendar(Date date)
    {
        super.setTime(date);
    }


    /**
     * A constructor that calls <code>super()</code> and
     * <code>super.{@link GregorianCalendar#setTimeInMillis(long)
     * setTimeInMillis(long)}</code>.
     */
    public GCalendar(long millis)
    {
        super.setTimeInMillis(millis);
    }


    /**
     * Equivalent to <code>{@link #get(int) get}({@link
     * Calendar#AM_PM AM_PM})</code>.
     */
    public int getAMPM()
    {
        return get(AM_PM);
    }


    /**
     * Equivalent to <code>({@link #getAMPM()} == {@link
     * Calendar#AM AM})</code>.
     */
    public boolean isAM()
    {
        return (getAMPM() == AM);
    }


    /**
     * Equivalent to <code>({@link #getAMPM()} == {@link
     * Calendar#PM PM})</code>.
     */
    public boolean isPM()
    {
        return (getAMPM() == PM);
    }


    /**
     * Equivalent to <code>{@link #set(int, int) set}({@link
     * Calendar#AM_PM AM_PM}, {@link Calendar#AM AM})</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar setAM()
    {
        set(AM_PM, AM);

        return this;
    }


    /**
     * Equivalent to <code>{@link #set(int, int) set}({@link
     * Calendar#AM_PM AM_PM}, {@link Calendar#PM PM})</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar setPM()
    {
        set(AM_PM, PM);

        return this;
    }


    /**
     * Equivalent to <code>{@link #get(int) get}({@link
     * Calendar#DATE DATE})</code>.
     */
    public int getDate()
    {
        return get(DATE);
    }


    /**
     * Equivalent to <code>{@link #set(int, int) set}({@link
     * Calendar#DATE DATE}, date)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar setDate(int date)
    {
        set(DATE, date);

        return this;
    }


    /**
     * Equivalent to <code>{@link #add(int, int) add}({@link
     * Calendar#DATE DATE}, date)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar addDate(int date)
    {
        add(DATE, date);

        return this;
    }


    /**
     * Equivalent to <code>{@link #roll(int, int) roll}({@link
     * Calendar#DATE DATE}, date)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar rollDate(int date)
    {
        roll(DATE, date);

        return this;
    }


    /**
     * Equivalent to <code>{@link #get(int) get}({@link
     * Calendar#DAY_OF_MONTH DAY_OF_MONTH})</code>.
     */
    public int getDayOfMonth()
    {
        return get(DAY_OF_MONTH);
    }


    /**
     * Equivalent to <code>{@link #set(int, int) set}({@link
     * Calendar#DAY_OF_MONTH DAY_OF_MONTH}, dayOfMonth)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar setDayOfMonth(int dayOfMonth)
    {
        set(DAY_OF_MONTH, dayOfMonth);

        return this;
    }


    /**
     * Equivalent to <code>{@link #add(int, int) add}({@link
     * Calendar#DAY_OF_MONTH DAY_OF_MONTH}, dayOfMonth)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar addDayOfMonth(int dayOfMonth)
    {
        add(DAY_OF_MONTH, dayOfMonth);

        return this;
    }


    /**
     * Equivalent to <code>{@link #roll(int, int) roll}({@link
     * Calendar#DAY_OF_MONTH DAY_OF_MONTH}, dayOfMonth)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar rollDayOfMonth(int dayOfMonth)
    {
        roll(DAY_OF_MONTH, dayOfMonth);

        return this;
    }


    /**
     * Equivalent to <code>{@link #get(int) get}({@link
     * Calendar#DAY_OF_WEEK DAY_OF_WEEK})</code>.
     */
    public int getDayOfWeek()
    {
        return get(DAY_OF_WEEK);
    }


    /**
     * Equivalent to <code>{@link #set(int, int) set}({@link
     * Calendar#DAY_OF_WEEK DAY_OF_WEEK}, dayOfWeek)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar setDayOfWeek(int dayOfWeek)
    {
        set(DAY_OF_WEEK, dayOfWeek);

        return this;
    }


    /**
     * Equivalent to <code>{@link #add(int, int) add}({@link
     * Calendar#DAY_OF_WEEK DAY_OF_WEEK}, dayOfWeek)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar addDayOfWeek(int dayOfWeek)
    {
        add(DAY_OF_WEEK, dayOfWeek);

        return this;
    }


    /**
     * Equivalent to <code>{@link #roll(int, int) roll}({@link
     * Calendar#DAY_OF_WEEK DAY_OF_WEEK}, dayOfWeek)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar rollDayOfWeek(int dayOfWeek)
    {
        roll(DAY_OF_WEEK, dayOfWeek);

        return this;
    }


    /**
     * Equivalent to <code>{@link #get(int) get}({@link
     * Calendar#DAY_OF_WEEK_IN_MONTH DAY_OF_WEEK_IN_MONTH})</code>.
     */
    public int getDayOfWeekInMonth()
    {
        return get(DAY_OF_WEEK_IN_MONTH);
    }


    /**
     * Equivalent to <code>{@link #set(int, int) set}({@link
     * Calendar#DAY_OF_WEEK_IN_MONTH DAY_OF_WEEK_IN_MONTH}, dayOfWeekInMonth)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar setDayOfWeekInMonth(int dayOfWeekInMonth)
    {
        set(DAY_OF_WEEK_IN_MONTH, dayOfWeekInMonth);

        return this;
    }


    /**
     * Equivalent to <code>{@link #add(int, int) add}({@link
     * Calendar#DAY_OF_WEEK_IN_MONTH DAY_OF_WEEK_IN_MONTH}, dayOfWeekInMonth)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar addDayOfWeekInMonth(int dayOfWeekInMonth)
    {
        add(DAY_OF_WEEK_IN_MONTH, dayOfWeekInMonth);

        return this;
    }


    /**
     * Equivalent to <code>{@link #roll(int, int) roll}({@link
     * Calendar#DAY_OF_WEEK_IN_MONTH DAY_OF_WEEK_IN_MONTH}, dayOfWeekInMonth)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar rollDayOfWeekInMonth(int dayOfWeekInMonth)
    {
        roll(DAY_OF_WEEK_IN_MONTH, dayOfWeekInMonth);

        return this;
    }


    /**
     * Equivalent to <code>{@link #get(int) get}({@link
     * Calendar#DAY_OF_YEAR DAY_OF_YEAR})</code>.
     */
    public int getDayOfYear()
    {
        return get(DAY_OF_YEAR);
    }


    /**
     * Equivalent to <code>{@link #set(int, int) set}({@link
     * Calendar#DAY_OF_YEAR DAY_OF_YEAR}, year)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar setDayOfYear(int dayOfYear)
    {
        set(DAY_OF_YEAR, dayOfYear);

        return this;
    }


    /**
     * Equivalent to <code>{@link #add(int, int) add}({@link
     * Calendar#DAY_OF_YEAR DAY_OF_YEAR}, year)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar addDayOfYear(int dayOfYear)
    {
        add(DAY_OF_YEAR, dayOfYear);

        return this;
    }


    /**
     * Equivalent to <code>{@link #roll(int, int) roll}({@link
     * Calendar#DAY_OF_YEAR DAY_OF_YEAR}, year)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar rollDayOfYear(int dayOfYear)
    {
        roll(DAY_OF_YEAR, dayOfYear);

        return this;
    }


    /**
     * Equivalent to <code>{@link #get(int) get}({@link
     * Calendar#DST_OFFSET DST_OFFSET})</code>.
     */
    public int getDstOffset()
    {
        return get(DST_OFFSET);
    }


    /**
     * Equivalent to <code>{@link #set(int, int) set}({@link
     * Calendar#DST_OFFSET DST_OFFSET}, dstOffset)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar setDstOffset(int dstOffset)
    {
        set(DST_OFFSET, DST_OFFSET);

        return this;
    }


    /**
     * Equivalent to <code>{@link #add(int, int) add}({@link
     * Calendar#DST_OFFSET DST_OFFSET}, dstOffset)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar addDstOffset(int dstOffset)
    {
        add(DST_OFFSET, DST_OFFSET);

        return this;
    }


    /**
     * Equivalent to <code>{@link #roll(int, int) roll}({@link
     * Calendar#DST_OFFSET DST_OFFSET}, dstOffset)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar rollDstOffset(int dstOffset)
    {
        roll(DST_OFFSET, DST_OFFSET);

        return this;
    }


    /**
     * Equivalent to <code>{@link #get(int) get}({@link
     * Calendar#ERA ERA})</code>.
     */
    public int getEra()
    {
        return get(ERA);
    }


    /**
     * Equivalent to <code>({@link #getEra()} == {@link
     * GregorianCalendar#AD AD})</code>.
     */
    public boolean isAD()
    {
        return (getEra() == AD);
    }


    /**
     * Equivalent to <code>({@link #getEra()} == {@link
     * GregorianCalendar#BC BC})</code>.
     */
    public boolean isBC()
    {
        return (getEra() == BC);
    }


    /**
     * Equivalent to <code>{@link #set(int, int) set}({@link
     * Calendar#ERA ERA}, era)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar setEra(int era)
    {
        set(ERA, era);

        return this;
    }


    /**
     * Equivalent to <code>{@link #get(int) get}({@link
     * Calendar#HOUR HOUR})</code>.
     */
    public int getHour()
    {
        return get(HOUR);
    }


    /**
     * Equivalent to <code>{@link #set(int, int) set}({@link
     * Calendar#HOUR HOUR}, hour)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar setHour(int hour)
    {
        set(HOUR, hour);

        return this;
    }


    /**
     * Equivalent to <code>{@link #add(int, int) add}({@link
     * Calendar#HOUR HOUR}, hour)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar addHour(int hour)
    {
        add(HOUR, hour);

        return this;
    }


    /**
     * Equivalent to <code>{@link #roll(int, int) roll}({@link
     * Calendar#HOUR HOUR}, hour)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar rollHour(int hour)
    {
        roll(HOUR, hour);

        return this;
    }


    /**
     * Equivalent to <code>{@link #get(int) get}({@link
     * Calendar#HOUR_OF_DAY HOUR_OF_DAY})</code>.
     */
    public int getHourOfDay()
    {
        return get(HOUR_OF_DAY);
    }


    /**
     * Equivalent to <code>{@link #set(int, int) set}({@link
     * Calendar#HOUR_OF_DAY HOUR_OF_DAY}, hourOfDay)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar setHourOfDay(int hourOfDay)
    {
        set(HOUR_OF_DAY, hourOfDay);

        return this;
    }


    /**
     * Equivalent to <code>{@link #add(int, int) add}({@link
     * Calendar#HOUR_OF_DAY HOUR_OF_DAY}, hourOfDay)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar addHourOfDay(int hourOfDay)
    {
        add(HOUR_OF_DAY, hourOfDay);

        return this;
    }


    /**
     * Equivalent to <code>{@link #roll(int, int) roll}({@link
     * Calendar#HOUR_OF_DAY HOUR_OF_DAY}, hourOfDay)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar rollHourOfDay(int hourOfDay)
    {
        roll(HOUR_OF_DAY, hourOfDay);

        return this;
    }


    /**
     * Equivalent to <code>{@link #get(int) get}({@link
     * Calendar#MILLISECOND MILLISECOND})</code>.
     */
    public int getMillisecond()
    {
        return get(MILLISECOND);
    }


    /**
     * Equivalent to <code>{@link #set(int, int) set}({@link
     * Calendar#MILLISECOND MILLISECOND}, millisecond)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar setMillisecond(int millisecond)
    {
        set(MILLISECOND, millisecond);

        return this;
    }


    /**
     * Equivalent to <code>{@link #add(int, int) add}({@link
     * Calendar#MILLISECOND MILLISECOND}, millisecond)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar addMillisecond(int millisecond)
    {
        add(MILLISECOND, millisecond);

        return this;
    }


    /**
     * Equivalent to <code>{@link #roll(int, int) roll}({@link
     * Calendar#MILLISECOND MILLISECOND}, millisecond)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar rollMillisecond(int millisecond)
    {
        roll(MILLISECOND, millisecond);

        return this;
    }


    /**
     * Equivalent to <code>{@link #get(int) get}({@link
     * Calendar#MINUTE MINUTE})</code>.
     */
    public int getMinute()
    {
        return get(MINUTE);
    }


    /**
     * Equivalent to <code>{@link #set(int, int) set}({@link
     * Calendar#MINUTE MINUTE}, minute)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar setMinute(int minute)
    {
        set(MINUTE, minute);

        return this;
    }


    /**
     * Equivalent to <code>{@link #add(int, int) add}({@link
     * Calendar#MINUTE MINUTE}, minute)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar addMinute(int minute)
    {
        add(MINUTE, minute);

        return this;
    }


    /**
     * Equivalent to <code>{@link #roll(int, int) roll}({@link
     * Calendar#MINUTE MINUTE}, minute)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar rollMinute(int minute)
    {
        roll(MINUTE, minute);

        return this;
    }


    /**
     * Equivalent to <code>{@link #get(int) get}({@link
     * Calendar#MONTH MONTH})</code>.
     */
    public int getMonth()
    {
        return get(MONTH);
    }


    /**
     * Equivalent to <code>{@link #set(int, int) set}({@link
     * Calendar#MONTH MONTH}, month)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar setMonth(int month)
    {
        set(MONTH, month);

        return this;
    }


    /**
     * Equivalent to <code>{@link #add(int, int) add}({@link
     * Calendar#MONTH MONTH}, month)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar addMonth(int month)
    {
        add(MONTH, month);

        return this;
    }


    /**
     * Equivalent to <code>{@link #roll(int, int) roll}({@link
     * Calendar#MONTH MONTH}, month)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar rollMonth(int month)
    {
        roll(MONTH, month);

        return this;
    }


    /**
     * Equivalent to <code>{@link #get(int) get}({@link
     * Calendar#SECOND SECOND})</code>.
     */
    public int getSecond()
    {
        return get(SECOND);
    }


    /**
     * Equivalent to <code>{@link #set(int, int) set}({@link
     * Calendar#SECOND SECOND}, second)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar setSecond(int second)
    {
        set(SECOND, second);

        return this;
    }


    /**
     * Equivalent to <code>{@link #add(int, int) add}({@link
     * Calendar#SECOND SECOND}, second)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar addSecond(int second)
    {
        add(SECOND, second);

        return this;
    }


    /**
     * Equivalent to <code>{@link #roll(int, int) roll}({@link
     * Calendar#SECOND SECOND}, second)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar rollSecond(int second)
    {
        roll(SECOND, second);

        return this;
    }


    /**
     * Equivalent to <code>{@link #get(int) get}({@link
     * Calendar#WEEK_OF_MONTH WEEK_OF_MONTH})</code>.
     */
    public int getWeekOfMonth()
    {
        return get(WEEK_OF_MONTH);
    }


    /**
     * Equivalent to <code>{@link #set(int, int) set}({@link
     * Calendar#WEEK_OF_MONTH WEEK_OF_MONTH}, weekOfMonth)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar setWeekOfMonth(int weekOfMonth)
    {
        set(WEEK_OF_MONTH, weekOfMonth);

        return this;
    }


    /**
     * Equivalent to <code>{@link #add(int, int) add}({@link
     * Calendar#WEEK_OF_MONTH WEEK_OF_MONTH}, weekOfMonth)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar addWeekOfMonth(int weekOfMonth)
    {
        add(WEEK_OF_MONTH, weekOfMonth);

        return this;
    }


    /**
     * Equivalent to <code>{@link #roll(int, int) roll}({@link
     * Calendar#WEEK_OF_MONTH WEEK_OF_MONTH}, weekOfMonth)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar rollWeekOfMonth(int weekOfMonth)
    {
        roll(WEEK_OF_MONTH, weekOfMonth);

        return this;
    }


    /**
     * Equivalent to <code>{@link #get(int) get}({@link
     * Calendar#WEEK_OF_YEAR WEEK_OF_YEAR})</code>.
     */
    public int getWeekOfYear()
    {
        return get(WEEK_OF_YEAR);
    }


    /**
     * Equivalent to <code>{@link #set(int, int) set}({@link
     * Calendar#WEEK_OF_YEAR WEEK_OF_YEAR}, weekOfYear)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar setWeekOfYear(int weekOfYear)
    {
        set(WEEK_OF_YEAR, weekOfYear);

        return this;
    }


    /**
     * Equivalent to <code>{@link #add(int, int) add}({@link
     * Calendar#WEEK_OF_YEAR WEEK_OF_YEAR}, weekOfYear)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar addWeekOfYear(int weekOfYear)
    {
        add(WEEK_OF_YEAR, weekOfYear);

        return this;
    }


    /**
     * Equivalent to <code>{@link #roll(int, int) roll}({@link
     * Calendar#WEEK_OF_YEAR WEEK_OF_YEAR}, weekOfYear)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar rollWeekOfYear(int weekOfYear)
    {
        roll(WEEK_OF_YEAR, weekOfYear);

        return this;
    }


    /**
     * Equivalent to <code>{@link #get(int) get}({@link
     * Calendar#YEAR YEAR})</code>.
     */
    public int getYear()
    {
        return get(YEAR);
    }


    /**
     * Equivalent to <code>{@link #set(int, int) set}({@link
     * Calendar#YEAR YEAR}, year)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar setYear(int year)
    {
        set(YEAR, year);

        return this;
    }


    /**
     * Equivalent to <code>{@link #add(int, int) add}({@link
     * Calendar#YEAR YEAR}, year)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar addYear(int year)
    {
        add(YEAR, year);

        return this;
    }


    /**
     * Equivalent to <code>{@link #roll(int, int) roll}({@link
     * Calendar#YEAR YEAR}, year)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar rollYear(int year)
    {
        roll(YEAR, year);

        return this;
    }


    /**
     * Equivalent to <code>{@link #get(int) get}({@link
     * Calendar#ZONE_OFFSET ZONE_OFFSET})</code>.
     */
    public int getZoneOffset()
    {
        return get(ZONE_OFFSET);
    }


    /**
     * Equivalent to <code>{@link #set(int, int) set}({@link
     * Calendar#ZONE_OFFSET ZONE_OFFSET}, zoneOffset)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar setZoneOffset(int zoneOffset)
    {
        set(ZONE_OFFSET, zoneOffset);

        return this;
    }


    /**
     * Equivalent to <code>{@link #add(int, int) add}({@link
     * Calendar#ZONE_OFFSET ZONE_OFFSET}, zoneOffset)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar addZoneOffset(int zoneOffset)
    {
        add(ZONE_OFFSET, zoneOffset);

        return this;
    }


    /**
     * Equivalent to <code>{@link #roll(int, int) roll}({@link
     * Calendar#ZONE_OFFSET ZONE_OFFSET}, zoneOffset)</code>.
     *
     * @return <code>this</code> object.
     */
    public GCalendar rollZoneOffset(int zoneOffset)
    {
        roll(ZONE_OFFSET, zoneOffset);

        return this;
    }


    /**
     * Check if the year of this calendar object is a leap year.
     *
     * @return
     *         True if the year of this calendar object is a leap year.
     */
    public boolean isLeapYear()
    {
        return isLeapYear(getYear());
    }


    /**
     * Check if the given year is a leap year.
     * The implementation does the following.
     *
     * <pre style="background-color: #EEEEEE; margin-left: 2em; margin-right: 2em; border: 1px solid black;">
     *
     * return new {@link GCalendar#GCalendar() GCalendar()}.{@link #setYear(int)
     * setYear}(year).{@link #isLeapYear()};
     * </pre>
     *
     * @param year
     *
     * @return
     *         True if the given year is a leap year.
     */
    public static boolean isLeap(int year)
    {
        return new GCalendar().setYear(year).isLeapYear();
    }


    /**
     * Format the given calendar object using the given format.
     * The implementation does the following.
     *
     * <pre style="background-color: #EEEEEE; margin-left: 2em; margin-right: 2em; border: 1px solid black;">
     *
     * return format.{@link DateFormat#format(Date) format}(calendar.{@link
     * Calendar#getTime() getTime()});
     * </pre>
     */
    public static String format(DateFormat format, Calendar calendar)
    {
        return format.format(calendar.getTime());
    }


    /**
     * Format the given calendar object using the given format.
     * The implementation does the following.
     *
     * <pre style="background-color: #EEEEEE; margin-left: 2em; margin-right: 2em; border: 1px solid black;">
     *
     * return {@link #format(DateFormat, Calendar) format}(new {@link
     * SimpleDateFormat#SimpleDateFormat(String) SimpleDateFormat}(format), calendar);
     * </pre>
     */
    public static String format(String format, Calendar calendar)
    {
        return format(new SimpleDateFormat(format), calendar);
    }


    /**
     * Format <code>this</code> calendar object using the given format.
     * The implementation does the following.
     *
     * <pre style="background-color: #EEEEEE; margin-left: 2em; margin-right: 2em; border: 1px solid black;">
     *
     * return {@link #format(DateFormat, Calendar) format}(format, this);
     * </pre>
     */
    public String format(DateFormat format)
    {
        return format(format, this);
    }


    /**
     * Format <code>this</code> calendar object using the given format.
     * The implementation does the following.
     *
     * <pre style="background-color: #EEEEEE; margin-left: 2em; margin-right: 2em; border: 1px solid black;">
     *
     * return {@link #format(String, Calendar) format}(format, this);
     * </pre>
     */
    public String format(String format)
    {
        return format(format, this);
    }


    /**
     * Format the given calendar object using the given format.
     * The implementation does the following.
     *
     * <pre style="background-color: #EEEEEE; margin-left: 2em; margin-right: 2em; border: 1px solid black;">
     *
     * return format.{@link DateFormat#format(Date, StringBuffer, FieldPosition)
     * format}(calendar.{@link Calendar#getTime() getTime()}, toAppendTo, position);
     * </pre>
     */
    public static StringBuffer format(DateFormat format, Calendar calendar, StringBuffer toAppendTo, FieldPosition position)
    {
        return format.format(calendar.getTime(), toAppendTo, position);
    }


    /**
     * Format the given calendar object using the given format.
     * The implementation does the following.
     *
     * <pre style="background-color: #EEEEEE; margin-left: 2em; margin-right: 2em; border: 1px solid black;">
     *
     * return {@link #format(DateFormat, Calendar, StringBuffer, FieldPosition)
     * format}(new {@link SimpleDateFormat#SimpleDateFormat(String)
     * SimpleDateFormat}(format), calendar, toAppendTo, position);
     * </pre>
     */
    public static StringBuffer format(String format, Calendar calendar, StringBuffer toAppendTo, FieldPosition position)
    {
        return format(new SimpleDateFormat(format), calendar, toAppendTo, position);
    }


    /**
     * Format <code>this</code> calendar object using the given format.
     * The implementation does the following.
     *
     * <pre style="background-color: #EEEEEE; margin-left: 2em; margin-right: 2em; border: 1px solid black;">
     *
     * return {@link #format(DateFormat, Calendar, StringBuffer, FieldPosition)
     * format}(format, this, toAppendTo, position);
     * </pre>
     */
    public StringBuffer format(DateFormat format, StringBuffer toAppendTo, FieldPosition position)
    {
        return format(format, this, toAppendTo, position);
    }


    /**
     * Format <code>this</code> calendar object using the given format.
     * The implementation does the following.
     *
     * <pre style="background-color: #EEEEEE; margin-left: 2em; margin-right: 2em; border: 1px solid black;">
     *
     * return {@link #format(String, Calendar, StringBuffer, FieldPosition)
     * format}(format, this, toAppendTo, position);
     * </pre>
     */
    public StringBuffer format(String format, StringBuffer toAppendTo, FieldPosition position)
    {
        return format(format, this, toAppendTo, position);
    }


    /**
     * Parse the given string using the given format.
     * The implementation does the following.
     *
     * <pre style="background-color: #EEEEEE; margin-left: 2em; margin-right: 2em; border: 1px solid black;">
     *
     * return new {@link GCalendar#GCalendar(Date) GCalendar}(format.{@link
     * DateFormat#parse(String) parse}(source));
     * </pre>
     */
    public static GCalendar parse(DateFormat format, String source) throws ParseException
    {
        return new GCalendar(format.parse(source));
    }


    /**
     * Parse the given string using the given format.
     * The implementation does the following.
     *
     * <pre style="background-color: #EEEEEE; margin-left: 2em; margin-right: 2em; border: 1px solid black;">
     *
     * return {@link #parse(DateFormat, String) parse}(new {@link
     * SimpleDateFormat#SimpleDateFormat(String) SimpleDateFormat}(format), source);
     * </pre>
     */
    public static GCalendar parse(String format, String source) throws ParseException
    {
        return parse(new SimpleDateFormat(format), source);
    }


    /**
     * Parse the given string using the given format. First,
     * the implementation creates a {@link Date} object by calling
     * <code>format.{@link DateFormat#parse(String, ParsePosition)
     * parse}(source, position)</code>. If the parse() method
     * returns a non-null value, a new <code>GCalendar</code> object
     * is created by <code>new {@link GCalendar#GCalendar(Date)
     * GCalendar(Date)} </code>and returned. Otherwise, null is returned.
     */
    public static GCalendar parse(DateFormat format, String source, ParsePosition position)
    {
        Date date = format.parse(source, position);

        if (date == null)
        {
            return null;
        }

        return new GCalendar(date);
    }


    /**
     * Parse the given string using the given format.
     * The implementation does the following.
     *
     * <pre style="background-color: #EEEEEE; margin-left: 2em; margin-right: 2em; border: 1px solid black;">
     *
     * return {@link #parse(DateFormat, String, ParsePosition)
     * parse}(new {@link SimpleDateFormat#SimpleDateFormat(String)
     * SimpleDateFormat}(format), source, position);
     * </pre>
     */
    public static GCalendar parse(String format, String source, ParsePosition position)
    {
        return parse(new SimpleDateFormat(format), source, position);
    }


    /**
     * Set timezone, year, month, ..., millisecond at a time.
     *
     * @return
     *         <code>this</code> object.
     */
    public GCalendar set(TimeZone timeZone, int year, int month, int dayOfMonth, int hourOfDay, int minute, int second, int millisecond)
    {
        setTimeZone(timeZone);
        setInternal(year, month, dayOfMonth, hourOfDay, minute, second, millisecond);

        return this;
    }


    /**
     * Set year, month, ..., millisecond at a time.
     *
     * @return
     *         <code>this</code> object.
     */
    public GCalendar set(int year, int month, int dayOfMonth, int hourOfDay, int minute, int second, int millisecond)
    {
        return setInternal(year, month, dayOfMonth, hourOfDay, minute, second, millisecond);
    }


    private GCalendar setInternal(int year, int month, int dayOfMonth, int hourOfDay, int minute, int second, int millisecond)
    {
        setYear(year);
        setMonth(month);
        setDayOfMonth(dayOfMonth);
        setHourOfDay(hourOfDay);
        setMinute(minute);
        setSecond(second);
        setMillisecond(millisecond);

        return this;
    }


    /**
     * Set 0 to hourOfDay field, minute, second and millisecond fields.
     *
     * @return
     *         <code>this</code> object.
     */
    public GCalendar setMidnight()
    {
        setHourOfDay(0);
        setMinute(0);
        setSecond(0);
        setMillisecond(0);

        return this;
    }


    /**
     * Set 12 to hourOfDay field, and set 0 to minute, second and millisecond fields.
     *
     * @return
     *         <code>this</code> object.
     */
    public GCalendar setNoon()
    {
        setHourOfDay(12);
        setMinute(0);
        setSecond(0);
        setMillisecond(0);

        return this;
    }
}
