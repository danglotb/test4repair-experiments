/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 27 20:16:10 GMT 2017
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import junit.framework.AssertionFailedError;
import junit.framework.ComparisonFailure;
import junit.framework.TestCase;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import org.joda.time.MockNullZoneChronology;
import org.joda.time.TestBasePartial;
import org.joda.time.TestDateTime_Basics;
import org.joda.time.TestMutableDateTime_Basics;
import org.joda.time.TestYearMonthDay_Basics;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.UnsupportedDateTimeField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateTimeFieldType_ESTest extends DateTimeFieldType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getRangeDurationType();
      assertNull(durationFieldType0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TestYearMonthDay_Basics testYearMonthDay_Basics0 = new TestYearMonthDay_Basics((String) null);
      // Undeclared exception!
      try { 
        testYearMonthDay_Basics0.testToDateTime_TOD_nullZone();
        fail("Expecting exception: AssertionFailedError");
      
      } catch(AssertionFailedError e) {
         //
         // expected:<2005-06-09T12:13:14.015Z> but was:<2005-06-09T12:13:14.015Z>
         //
         verifyException("junit.framework.Assert", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TestMutableDateTime_Basics testMutableDateTime_Basics0 = new TestMutableDateTime_Basics("");
      // Undeclared exception!
      try { 
        testMutableDateTime_Basics0.testRounding5();
        fail("Expecting exception: ComparisonFailure");
      
      } catch(ComparisonFailure e) {
         //
         // expected:<...2-06-09T05:00:00.000[+01:00]> but was:<...2-06-09T05:00:00.000[Z]>
         //
         verifyException("junit.framework.Assert", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      TestBasePartial.MockPartial testBasePartial_MockPartial0 = new TestBasePartial.MockPartial();
      ISOChronology iSOChronology0 = (ISOChronology)testBasePartial_MockPartial0.getChronology();
      boolean boolean0 = dateTimeFieldType0.isSupported(iSOChronology0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfDay();
      TestBasePartial.MockPartial testBasePartial_MockPartial0 = new TestBasePartial.MockPartial();
      ISOChronology iSOChronology0 = (ISOChronology)testBasePartial_MockPartial0.getChronology();
      boolean boolean0 = dateTimeFieldType0.isSupported(iSOChronology0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      assertEquals("year", dateTimeFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      TestBasePartial.MockPartial testBasePartial_MockPartial0 = new TestBasePartial.MockPartial();
      ISOChronology iSOChronology0 = (ISOChronology)testBasePartial_MockPartial0.getChronology();
      boolean boolean0 = dateTimeFieldType0.isSupported(iSOChronology0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      assertEquals("monthOfYear", dateTimeFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      TestBasePartial.MockPartial testBasePartial_MockPartial0 = new TestBasePartial.MockPartial();
      ISOChronology iSOChronology0 = (ISOChronology)testBasePartial_MockPartial0.getChronology();
      boolean boolean0 = dateTimeFieldType0.isSupported(iSOChronology0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      assertEquals("minuteOfHour", dateTimeFieldType0.getName());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      TestBasePartial.MockPartial testBasePartial_MockPartial0 = new TestBasePartial.MockPartial();
      ISOChronology iSOChronology0 = (ISOChronology)testBasePartial_MockPartial0.getChronology();
      boolean boolean0 = dateTimeFieldType0.isSupported(iSOChronology0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      TestMutableDateTime_Basics testMutableDateTime_Basics0 = new TestMutableDateTime_Basics(".V^$ 10");
      TestMutableDateTime_Basics.MockEqualsChronology testMutableDateTime_Basics_MockEqualsChronology0 = testMutableDateTime_Basics0.new MockEqualsChronology();
      boolean boolean0 = dateTimeFieldType0.isSupported(testMutableDateTime_Basics_MockEqualsChronology0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField((Chronology) null);
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      TestBasePartial.MockPartial testBasePartial_MockPartial0 = new TestBasePartial.MockPartial();
      ISOChronology iSOChronology0 = (ISOChronology)testBasePartial_MockPartial0.getChronology();
      boolean boolean0 = dateTimeFieldType0.isSupported(iSOChronology0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      assertEquals("secondOfDay", dateTimeFieldType0.getName());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      assertEquals("secondOfMinute", dateTimeFieldType0.getName());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      TestBasePartial.MockPartial testBasePartial_MockPartial0 = new TestBasePartial.MockPartial();
      ISOChronology iSOChronology0 = (ISOChronology)testBasePartial_MockPartial0.getChronology();
      boolean boolean0 = dateTimeFieldType0.isSupported(iSOChronology0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      TestBasePartial.MockPartial testBasePartial_MockPartial0 = new TestBasePartial.MockPartial();
      ISOChronology iSOChronology0 = (ISOChronology)testBasePartial_MockPartial0.getChronology();
      boolean boolean0 = dateTimeFieldType0.isSupported(iSOChronology0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.centuryOfEra();
      String string0 = dateTimeFieldType0.getName();
      assertEquals("centuryOfEra", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      String string0 = dateTimeFieldType0.toString();
      assertEquals("dayOfMonth", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
      TestBasePartial.MockPartial testBasePartial_MockPartial0 = new TestBasePartial.MockPartial();
      ISOChronology iSOChronology0 = (ISOChronology)testBasePartial_MockPartial0.getChronology();
      boolean boolean0 = dateTimeFieldType0.isSupported(iSOChronology0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      TestBasePartial.MockPartial testBasePartial_MockPartial0 = new TestBasePartial.MockPartial();
      ISOChronology iSOChronology0 = (ISOChronology)testBasePartial_MockPartial0.getChronology();
      boolean boolean0 = dateTimeFieldType0.isSupported(iSOChronology0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      // Undeclared exception!
      try { 
        TestCase.assertEquals("", (Object) dateTimeFieldType0, (Object) "");
        fail("Expecting exception: AssertionFailedError");
      
      } catch(AssertionFailedError e) {
         //
         // expected:<halfdayOfDay> but was:<>
         //
         verifyException("junit.framework.Assert", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.centuryOfEra();
      MockNullZoneChronology mockNullZoneChronology0 = new MockNullZoneChronology();
      UnsupportedDateTimeField unsupportedDateTimeField0 = (UnsupportedDateTimeField)dateTimeFieldType0.getField(mockNullZoneChronology0);
      assertEquals("centuryOfEra", unsupportedDateTimeField0.getName());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      assertEquals("millis", durationFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      TestBasePartial.MockPartial testBasePartial_MockPartial0 = new TestBasePartial.MockPartial();
      ISOChronology iSOChronology0 = (ISOChronology)testBasePartial_MockPartial0.getChronology();
      boolean boolean0 = dateTimeFieldType0.isSupported(iSOChronology0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String[] stringArray0 = new String[0];
      TestDateTime_Basics.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      TestBasePartial.MockPartial testBasePartial_MockPartial0 = new TestBasePartial.MockPartial();
      ISOChronology iSOChronology0 = (ISOChronology)testBasePartial_MockPartial0.getChronology();
      boolean boolean0 = dateTimeFieldType0.isSupported(iSOChronology0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getRangeDurationType();
      assertEquals("days", durationFieldType0.toString());
  }
}
