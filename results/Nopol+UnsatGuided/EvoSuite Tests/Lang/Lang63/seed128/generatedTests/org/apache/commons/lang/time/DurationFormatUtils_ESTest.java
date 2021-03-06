/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 25 04:00:51 GMT 2017
 */

package org.apache.commons.lang.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Calendar;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.apache.commons.lang.time.DurationFormatUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DurationFormatUtils_ESTest extends DurationFormatUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("0java.lang.StringBuffer@00000000100java.lang.StringBuffer@00000000110java.lang.StringBuffer@0000000012-1java.lang.StringBuffer@0000000013");
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token("d");
      durationFormatUtils_Token1.increment();
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationISO(1L);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new DurationFormatUtils.Token[6];
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(mockJapaneseDate0);
      durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token("M", 28);
      durationFormatUtils_TokenArray0[1] = durationFormatUtils_Token1;
      // Undeclared exception!
      try { 
        DurationFormatUtils.format(durationFormatUtils_TokenArray0, (-502), 10, 28, (-1), 28, (-903), (-409), true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.time.DurationFormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod(3601128L, 2233L, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod((long) 0, 2419200000L, "java.lang.StringBuffer@000000000800java.lang.StringBuffer@0000000009java.lang.StringBuffer@00000000100java.lang.StringBuffer@0000000011");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(2122L, false, true);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationISO(60000L);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriodISO((-1144L), 3600000L);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationISO(2419200000L);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DurationFormatUtils durationFormatUtils0 = new DurationFormatUtils();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(durationFormatUtils0, 0);
      durationFormatUtils_Token0.increment();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("java.lang.StringBuffer@0000000002");
      String string0 = (String)durationFormatUtils_Token0.getValue();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new DurationFormatUtils.Token[0];
      boolean boolean0 = DurationFormatUtils.Token.containsTokenWithValue(durationFormatUtils_TokenArray0, "y");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      int int0 = DurationFormatUtils.reduceAndCorrect(mockGregorianCalendar0, mockGregorianCalendar0, 0, 100);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-125688944318680,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = DurationFormatUtils.lexx("'Ck*S<%Ts,z se");
      assertNotNull(durationFormatUtils_TokenArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = DurationFormatUtils.lexx("");
      assertNotNull(durationFormatUtils_TokenArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod((-1L), (-2924L), "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration((-1L), "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2, 883, 883, (-199), 883, 2091);
      // Undeclared exception!
      try { 
        DurationFormatUtils.reduceAndCorrect((Calendar) null, mockGregorianCalendar0, 0, 2902);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.time.DurationFormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1190, 1190, 1190, 1190, 3216);
      // Undeclared exception!
      try { 
        DurationFormatUtils.reduceAndCorrect(mockGregorianCalendar0, mockGregorianCalendar0, 64, 1190);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Locale locale0 = new Locale("", "", "");
      MockGregorianCalendar mockGregorianCalendar0 = (MockGregorianCalendar)MockCalendar.getInstance(locale0);
      // Undeclared exception!
      try { 
        DurationFormatUtils.reduceAndCorrect(mockGregorianCalendar0, mockGregorianCalendar0, (-823), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -823
         //
         verifyException("java.util.Calendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        DurationFormatUtils.lexx((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.time.DurationFormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, "The offset cannot be negative");
      // Undeclared exception!
      try { 
        DurationFormatUtils.formatPeriod((-1771L), (-1771L), (String) null, true, (TimeZone) simpleTimeZone0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.time.DurationFormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        DurationFormatUtils.formatPeriod(1000L, 1000L, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.time.DurationFormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        DurationFormatUtils.formatDuration(1000L, (String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.time.DurationFormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        DurationFormatUtils.formatDuration(605L, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.time.DurationFormatUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration((-593L), "", false);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(0L, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", false);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("0java.lang.StringBuffer@00000000100java.lang.StringBuffer@00000000110java.lang.StringBuffer@0000000012-1java.lang.StringBuffer@0000000013");
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token("d");
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(mockHijrahDate0, 3564);
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token(mockHijrahDate0);
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
      assertFalse(boolean0);
      assertFalse(durationFormatUtils_Token1.equals((Object)durationFormatUtils_Token0));
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token(durationFormatUtils_Token0);
      boolean boolean0 = durationFormatUtils_Token1.equals(durationFormatUtils_Token0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(mockHijrahDate0, 3564);
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("java.lang.StringBuffer@0000000016004java.lang.StringBuffer@0000000017java.lang.StringBuffer@0000000018java.lang.StringBuffer@0000000019", (-2425));
      boolean boolean0 = durationFormatUtils_Token0.equals("0java.lang.StringBuffer@000000000800java.lang.StringBuffer@000000000900java.lang.StringBuffer@0000000010000");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(86400000L, "0java.lang.StringBuffer@00000000090java.lang.StringBuffer@00000000100java.lang.StringBuffer@00000000110java.lang.StringBuffer@0000000012", false);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new DurationFormatUtils.Token[1];
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token((Object) null, (-1630));
      durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
      String string0 = DurationFormatUtils.format(durationFormatUtils_TokenArray0, 3, (-2154), 3, 3, (-570), 3991, 32, false);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(32, "java.lang.StringBuffer@00000000160java.lang.StringBuffer@00000000170java.lang.StringBuffer@00000000180java.lang.StringBuffer@00000000190java.lang.StringBuffer@00000000200java.lang.StringBuffer@00000000212java.lang.StringBuffer@0000000022115java.lang.StringBuffer@0000000023");
      String string0 = DurationFormatUtils.formatPeriod((-121L), 2419202079L, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", true, (TimeZone) simpleTimeZone0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(32, "java.lang.StringBuffer@00000000160java.lang.StringBuffer@00000000170java.lang.StringBuffer@00000000180java.lang.StringBuffer@00000000190java.lang.StringBuffer@00000000200java.lang.StringBuffer@00000000212java.lang.StringBuffer@0000000022075java.lang.StringBuffer@0000000023");
      String string0 = DurationFormatUtils.formatPeriod((-121L), 2419202067L, "0java.lang.StringBuffer@00000000510java.lang.StringBuffer@00000000520java.lang.StringBuffer@00000000532java.lang.StringBuffer@0000000054", true, (TimeZone) simpleTimeZone0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(32, "java.lang.StringBuffer@00000000160java.lang.StringBuffer@00000000170java.lang.StringBuffer@00000000180java.lang.StringBuffer@00000000190java.lang.StringBuffer@00000000200java.lang.StringBuffer@00000000212java.lang.StringBuffer@0000000022075java.lang.StringBuffer@0000000023");
      String string0 = DurationFormatUtils.formatPeriod(2075L, (-2419202346L), "", true, (TimeZone) simpleTimeZone0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(1089L, false, false);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(2075L, true, true);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(2115L, "java.lang.StringBuffer@00000000160java.lang.StringBuffer@00000000170java.lang.StringBuffer@00000000180java.lang.StringBuffer@00000000190java.lang.StringBuffer@00000000200java.lang.StringBuffer@00000000212java.lang.StringBuffer@0000000022115java.lang.StringBuffer@0000000023");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod((-158L), 2419202188L, "p&gM3R?ev=6");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationHMS(398L);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DurationFormatUtils durationFormatUtils0 = new DurationFormatUtils();
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(durationFormatUtils0, 0);
      int int0 = durationFormatUtils_Token0.getCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("'Ck*S<%Ts,z se", 186);
      String string0 = durationFormatUtils_Token0.toString();
      assertNotNull(string0);
  }
}
