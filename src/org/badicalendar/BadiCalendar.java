package org.badicalendar;

import java.util.Calendar;

public class BadiCalendar extends Calendar
{
	public static final int BAHA = 0;
	public static final int JALAL = 1;
	public static final int JAMAL = 2;
	public static final int AZAMAT = 3;
	public static final int NUR = 4;
	public static final int RAHMAT = 5;
	public static final int KALIMAT = 6;
	public static final int KAMAL = 7;
	public static final int ASMA = 8;
	public static final int IZZAT = 9;
	public static final int MASHIYYAT = 10;
	public static final int ILM = 11;
	public static final int QUDRAT = 12;
	public static final int QAWL = 13;
	public static final int MASAIL = 14;
	public static final int SHARAF = 15;
	public static final int SULTAN = 16;
	public static final int MULK = 17;
	public static final int AYYAMIHA = 19;
	public static final int ALA = 18;
	
	public static final int CYCLE = 24;
	public static final int KULLISHAY = 25;
	
	private static final long EPOCH_MILLIS = -58166208000000L;
	
	private static final long SECOND_MS = 1000;
	private static final long MINUTE_MS = 60 * SECOND_MS;
	private static final long HOUR_MS   = 60 * MINUTE_MS;
	private static final long DAY_MS    = 24 * HOUR_MS;
	
	/**
	 * Limits of the 
	 */
    private static final int LIMITS[][] = {
        // Minimum  Greatest    Least  Maximum
        //           Minimum  Maximum
        {        0,        0,       1,       1 }, // ERA
        {        1,        1, 5000000, 5000000 }, // YEAR
        {        0,        0,      20,      20 }, // MONTH
        {        1,        1,      51,      56 }, // WEEK_OF_YEAR
        {/*                                  */}, // WEEK_OF_MONTH
        {        1,        1,       4,      19 }, // DAY_OF_MONTH
        {        1,        1,     365,     366 }, // DAY_OF_YEAR
        {/*                                  */}, // DAY_OF_WEEK
        {       -1,       -1,       5,       5 }, // DAY_OF_WEEK_IN_MONTH
        {/*                                  */}, // AM_PM
        {/*                                  */}, // HOUR
        {/*                                  */}, // HOUR_OF_DAY
        {/*                                  */}, // MINUTE
        {/*                                  */}, // SECOND
        {/*                                  */}, // MILLISECOND
        {/*                                  */}, // ZONE_OFFSET
        {/*                                  */}, // DST_OFFSET
        { -5000000, -5000000, 5000000, 5000000 }, // YEAR_WOY
        {/*                                  */}, // DOW_LOCAL
        { -5000000, -5000000, 5000000, 5000000 }, // EXTENDED_YEAR
        {/*                                  */}, // JULIAN_DAY
        {/*                                  */}, // MILLISECONDS_IN_DAY
    };
	
	/**
	 * Days since the start of the BE.
	 */
	private long absDay (long time)
	{
		return (time - EPOCH_MILLIS) / DAY_MS;
	}
	
	@Override
	public void add(int arg0, int arg1)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void computeFields()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void computeTime()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getGreatestMinimum(int arg0)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getLeastMaximum(int arg0)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMaximum(int arg0)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMinimum(int arg0)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void roll(int arg0, boolean arg1)
	{
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Days since the start of the BE.
	 */
	private final static boolean isLeapyear(int year)
	{
		// TODO Return true if the given year is a leap year.
		throw new UnsupportedOperationException("Not implemented yet.");
	}

}
