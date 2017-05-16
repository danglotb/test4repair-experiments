/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 20 03:08:11 GMT 2017
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.MockZone;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.field.UnsupportedDurationField;
import org.joda.time.format.DateTimeParserBucket;
import org.joda.time.tz.CachedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.year();
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new DateTimeParserBucket.SavedField(dateTimeField0, 1);
      long long0 = dateTimeParserBucket_SavedField0.set((-610L), false);
      assertEquals((-79240032000610L), long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_INDIAN;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) null, islamicChronology_LeapYearPatternType0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-5231L), (Chronology) islamicChronology0, (Locale) null, (Integer) islamicChronology0.AH, 1);
      dateTimeParserBucket0.setZone((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = dateTimeParserBucket0.getZone();
      assertNull(dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-78L), (Chronology) ethiopicChronology0, locale0, (Integer) 1, 1);
      Integer integer0 = new Integer(0);
      dateTimeParserBucket0.setPivotYear(integer0);
      Integer integer1 = dateTimeParserBucket0.getPivotYear();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-78L), (Chronology) ethiopicChronology0, locale0, (Integer) 1, 1);
      Integer integer0 = dateTimeParserBucket0.getPivotYear();
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Locale locale0 = new Locale("", "8yI$");
      Integer integer0 = new Integer((-2157));
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1L), (Chronology) null, locale0, integer0, (-2157));
      Integer integer1 = dateTimeParserBucket0.getPivotYear();
      assertEquals((-2157), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      Locale locale0 = Locale.FRENCH;
      Integer integer0 = new Integer((-2739));
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) gJChronology0, locale0, integer0, 2447);
      dateTimeParserBucket0.setOffset(integer0);
      Integer integer1 = dateTimeParserBucket0.getOffsetInteger();
      assertEquals((-2739), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Locale locale0 = Locale.ROOT;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-2228L), (Chronology) ethiopicChronology0, locale0);
      dateTimeParserBucket0.setOffset(0);
      Integer integer0 = dateTimeParserBucket0.getOffsetInteger();
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      Locale locale0 = Locale.ENGLISH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(3436L, (Chronology) copticChronology0, locale0, (Integer) 1);
      dateTimeParserBucket0.setOffset(1);
      dateTimeParserBucket0.getOffsetInteger();
      assertEquals(1, dateTimeParserBucket0.getOffset());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      Locale locale0 = Locale.US;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-137L), (Chronology) gregorianChronology0, locale0, (Integer) null, 3600000);
      dateTimeParserBucket0.setOffset(10980000);
      dateTimeParserBucket0.getOffsetInteger();
      assertEquals(10980000, dateTimeParserBucket0.getOffset());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Locale locale0 = Locale.CANADA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((long) 1, (Chronology) buddhistChronology0, locale0);
      dateTimeParserBucket0.setOffset((Integer) 1);
      int int0 = dateTimeParserBucket0.getOffset();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Locale locale0 = Locale.CANADA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((long) 1, (Chronology) buddhistChronology0, locale0);
      dateTimeParserBucket0.setOffset((Integer) 1);
      long long0 = dateTimeParserBucket0.computeMillis(true, "Weeks");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Locale locale0 = Locale.ENGLISH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) ethiopicChronology0, locale0, (Integer) 1);
      long long0 = dateTimeParserBucket0.computeMillis(false);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      Locale locale0 = new Locale("", "", "-");
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-324L), (Chronology) copticChronology0, locale0, (Integer) 1, 83);
      long long0 = dateTimeParserBucket0.computeMillis(true);
      assertEquals((-324L), long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      Locale locale0 = Locale.ENGLISH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) islamicChronology0, locale0);
      long long0 = dateTimeParserBucket0.computeMillis();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      Locale locale0 = Locale.CHINA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1428L, (Chronology) copticChronology0, locale0, (Integer) 1, 0);
      long long0 = dateTimeParserBucket0.computeMillis();
      assertEquals(1428L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.weeks();
      UnsupportedDurationField unsupportedDurationField0 = (UnsupportedDurationField)buddhistChronology0.eras();
      int int0 = DateTimeParserBucket.compareReverse(unsupportedDurationField0, durationField0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-809L), (Chronology) null, locale0, (Integer) null, (-1744));
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.saveField((DateTimeFieldType) null, "VST", locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockZone mockZone0 = new MockZone(0L, 0, 41);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance((DateTimeZone) mockZone0);
      Locale locale0 = Locale.TAIWAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1L), (Chronology) ethiopicChronology0, locale0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.saveField((DateTimeFieldType) null, 41);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-78L), (Chronology) ethiopicChronology0, locale0, (Integer) 1, 1);
      dateTimeParserBucket0.saveField((DateTimeField) null, 4);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(true, "UQ)_D]}p7v");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      Integer integer0 = new Integer(2965);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) null, locale0, integer0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-1911));
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1911 for secondOfDay must be in the range [0,86399]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      StrictChronology strictChronology0 = StrictChronology.getInstance(copticChronology0);
      Locale locale0 = Locale.CANADA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) strictChronology0, locale0, (Integer) 1);
      dateTimeParserBucket0.saveField((DateTimeField) null, 1);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(copticChronology0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) lenientChronology0, (Locale) null, (Integer) 1);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "tqY(`#FNJRd]kT~duF", (Locale) null);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"tqY(`#FNJRd]kT~duF\" for dayOfWeek is not supported
         //
         verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfYear();
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new DateTimeParserBucket.SavedField(dateTimeField0, 1);
      DateTimeField dateTimeField1 = buddhistChronology0.minuteOfDay();
      Locale locale0 = Locale.CANADA_FRENCH;
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField1 = new DateTimeParserBucket.SavedField(dateTimeField1, "LQ:OCTAFE@orf5O$z", locale0);
      int int0 = dateTimeParserBucket_SavedField0.compareTo(dateTimeParserBucket_SavedField1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.era();
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new DateTimeParserBucket.SavedField(dateTimeField0, "", (Locale) null);
      int int0 = dateTimeParserBucket_SavedField0.compareTo(dateTimeParserBucket_SavedField0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      Locale locale0 = Locale.ENGLISH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) islamicChronology0, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "n}0~i", locale0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(false, "n}0~i");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot parse \"n}0~i\": Value \"n}0~i\" for minuteOfHour is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) copticChronology0, (Locale) null, (Integer) 1, 1);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "lqb+os", (Locale) null);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(true, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"lqb+os\" for year is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1779L), (Chronology) null, locale0, (Integer) null);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = (DateTimeParserBucket.SavedState)dateTimeParserBucket0.saveState();
      boolean boolean0 = dateTimeParserBucket0.restoreState(dateTimeParserBucket_SavedState0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      Locale locale0 = Locale.US;
      Integer integer0 = new Integer(631);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-499L), (Chronology) iSOChronology0, locale0, integer0);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = (DateTimeParserBucket.SavedState)dateTimeParserBucket0.saveState();
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState1 = (DateTimeParserBucket.SavedState)dateTimeParserBucket0.saveState();
      assertSame(dateTimeParserBucket_SavedState1, dateTimeParserBucket_SavedState0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.weeks();
      UnsupportedDurationField unsupportedDurationField0 = (UnsupportedDurationField)buddhistChronology0.eras();
      int int0 = DateTimeParserBucket.compareReverse(durationField0, unsupportedDurationField0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      DurationField durationField0 = buddhistChronology0.weeks();
      Locale locale0 = Locale.ENGLISH;
      UnsupportedDateTimeField unsupportedDateTimeField0 = UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((long) 1, (Chronology) buddhistChronology0, locale0);
      dateTimeParserBucket0.saveField((DateTimeField) unsupportedDateTimeField0, 0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 8);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(true, "Weeks");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // millisOfSecond field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      UnsupportedDurationField unsupportedDurationField0 = (UnsupportedDurationField)buddhistChronology0.eras();
      int int0 = DateTimeParserBucket.compareReverse(unsupportedDurationField0, unsupportedDurationField0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MockZone mockZone0 = new MockZone((-1L), (-4535), 51);
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) mockZone0);
      LenientChronology lenientChronology0 = LenientChronology.getInstance(julianChronology0);
      Locale locale0 = Locale.ENGLISH;
      Integer integer0 = new Integer(51);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) lenientChronology0, locale0, integer0, (-4535));
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(true, "/");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot parse \"/\": Illegal instant due to time zone offset transition (MockZone)
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_INDIAN;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) null, islamicChronology_LeapYearPatternType0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-5231L), (Chronology) islamicChronology0, (Locale) null, (Integer) islamicChronology0.AH, 1);
      dateTimeParserBucket0.setZone((DateTimeZone) null);
      long long0 = dateTimeParserBucket0.computeMillis(false, "Cannot parse \"");
      assertEquals((-5231L), long0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      Locale locale0 = Locale.CANADA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((long) 1, (Chronology) buddhistChronology0, locale0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 8);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
      long long0 = dateTimeParserBucket0.computeMillis(true, "Weeks");
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-78L), (Chronology) ethiopicChronology0, locale0, (Integer) 1, 1);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = (DateTimeParserBucket.SavedState)dateTimeParserBucket0.saveState();
      assertNotNull(dateTimeParserBucket_SavedState0);
      
      dateTimeParserBucket0.saveField((DateTimeField) null, 12825000);
      boolean boolean0 = dateTimeParserBucket_SavedState0.restoreState(dateTimeParserBucket0);
      assertTrue(boolean0);
      
      long long0 = dateTimeParserBucket0.computeMillis(true, "UQ)_D]}p7v");
      assertEquals((-3600078L), long0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      Integer integer0 = new Integer(2751);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) null, locale0, integer0);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
      DateTimeParserBucket dateTimeParserBucket1 = new DateTimeParserBucket((-3438L), (Chronology) null, locale0, (Integer) null, 2751);
      boolean boolean0 = dateTimeParserBucket1.restoreState(dateTimeParserBucket_SavedState0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(copticChronology0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) lenientChronology0, (Locale) null, (Integer) 1);
      boolean boolean0 = dateTimeParserBucket0.restoreState("R2`^>[k");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateMidnight.parse("8ASDMJBV");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"8ASDMJBV\" is malformed at \"ASDMJBV\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MockZone mockZone0 = new MockZone(0L, 2347, 3660000);
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_15_BASED;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) mockZone0, islamicChronology_LeapYearPatternType0);
      Locale locale0 = Locale.FRENCH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1059L, (Chronology) islamicChronology0, locale0);
      dateTimeParserBucket0.setOffset((-2));
      int int0 = dateTimeParserBucket0.getOffset();
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) copticChronology0, (Locale) null, (Integer) 1, 1);
      int int0 = dateTimeParserBucket0.getOffset();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      Locale locale0 = Locale.US;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-137L), (Chronology) gregorianChronology0, locale0, (Integer) null, 3600000);
      Integer integer0 = dateTimeParserBucket0.getOffsetInteger();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      Locale locale0 = Locale.US;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-137L), (Chronology) gregorianChronology0, locale0, (Integer) null, 3600000);
      Locale locale1 = dateTimeParserBucket0.getLocale();
      assertEquals("en_US", locale1.toString());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(copticChronology0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) lenientChronology0, (Locale) null, (Integer) 1);
      long long0 = dateTimeParserBucket0.computeMillis();
      assertEquals((-3600000L), long0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Locale locale0 = Locale.CANADA_FRENCH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((long) 1, (Chronology) buddhistChronology0, locale0);
      Integer integer0 = dateTimeParserBucket0.getPivotYear();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      Locale locale0 = new Locale("", "", "-");
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((long) 54, (Chronology) copticChronology0, locale0, (Integer) copticChronology0.AM);
      long long0 = dateTimeParserBucket0.computeMillis(true);
      assertEquals(54L, long0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      Locale locale0 = Locale.US;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-137L), (Chronology) gregorianChronology0, locale0, (Integer) null, 3600000);
      GregorianChronology gregorianChronology1 = (GregorianChronology)dateTimeParserBucket0.getChronology();
      assertFalse(gregorianChronology1.equals((Object)gregorianChronology0));
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      Locale locale0 = Locale.US;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-137L), (Chronology) gregorianChronology0, locale0, (Integer) null, 3600000);
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)dateTimeParserBucket0.getZone();
      assertEquals("Europe/Paris", cachedDateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      Locale locale0 = Locale.US;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-137L), (Chronology) gregorianChronology0, locale0, (Integer) null, 3600000);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(false, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot parse \"\": Value 0 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }
}