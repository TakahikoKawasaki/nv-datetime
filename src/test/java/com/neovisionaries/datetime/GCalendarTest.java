/*
 * Copyright (C) 2012 Neo Visionaries Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.neovisionaries.datetime;


import java.util.TimeZone;
import org.junit.Test;
import static org.junit.Assert.*;


public class GCalendarTest
{
    private TimeZone getTimeZone(String timeZone)
    {
        return TimeZone.getTimeZone(timeZone);
    }


    private TimeZone GMT()
    {
        return getTimeZone("GMT");
    }


    private TimeZone JST()
    {
        return getTimeZone("JST");
    }


    private String toYYYYMMDD_HHMMSS(GCalendar cal)
    {
        return String.format("%04d/%02d/%02d %02d:%02d:%02d",
                cal.getYear(), cal.getMonth() + 1, cal.getDayOfMonth(),
                cal.getHourOfDay(), cal.getMinute(), cal.getSecond());
    }


    @Test
    public void test1()
    {
        GCalendar cal = new GCalendar(JST());

        // Before changing the time zone.
        String beforeStr = toYYYYMMDD_HHMMSS(cal);
        int beforeOffset = cal.getZoneOffset();

        // Change the time zone only.
        cal.changeTimeZoneOnly(GMT());

        // After changing the time zone.
        String afterStr = toYYYYMMDD_HHMMSS(cal);
        int afterOffset = cal.getZoneOffset();

        // "YYYY/MM/DD HH:MM:SS" should not be changed.
        assertEquals(beforeStr, afterStr);

        // Zone offsets should be different.
        assertTrue(beforeOffset != afterOffset);
    }
}
