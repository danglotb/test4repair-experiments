/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 15 11:46:19 GMT 2017
 */

package org.jfree.data.statistics;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jfree.data.Range;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.jfree.data.time.Day;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Minute;
import org.jfree.data.time.Month;
import org.jfree.data.time.Quarter;
import org.jfree.data.time.Second;
import org.jfree.data.time.SimpleTimePeriod;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultStatisticalCategoryDataset_ESTest extends DefaultStatisticalCategoryDataset_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Minute minute0 = new Minute();
      Day day0 = minute0.getDay();
      Number number0 = defaultStatisticalCategoryDataset0.getStdDevValue((Comparable) day0, (Comparable) minute0);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getStdDevValue(23, 1623);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 23, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      Byte byte0 = (Byte)defaultStatisticalCategoryDataset0.getValue((Comparable) integer0, (Comparable) integer0);
      Byte byte1 = (Byte)defaultStatisticalCategoryDataset0.getValue((Comparable) integer0, (Comparable) byte0);
      assertNull(byte1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      defaultStatisticalCategoryDataset0.add((Number) (byte)0, (Number) integer0, (Comparable) integer0, (Comparable) integer0);
      Byte byte0 = (Byte)defaultStatisticalCategoryDataset0.getValue((Comparable) integer0, (Comparable) integer0);
      assertEquals((byte)0, (byte)byte0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      defaultStatisticalCategoryDataset0.add((Number) (byte)1, (Number) integer0, (Comparable) integer0, (Comparable) integer0);
      Byte byte0 = (Byte)defaultStatisticalCategoryDataset0.getValue((Comparable) integer0, (Comparable) integer0);
      defaultStatisticalCategoryDataset0.add((Number) byte0, (Number) integer0, (Comparable) integer0, (Comparable) byte0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      defaultStatisticalCategoryDataset0.add((Number) (byte) (-1), (Number) integer0, (Comparable) integer0, (Comparable) integer0);
      Byte byte0 = (Byte)defaultStatisticalCategoryDataset0.getValue((Comparable) integer0, (Comparable) integer0);
      assertEquals((byte) (-1), (byte)byte0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Hour hour0 = new Hour();
      defaultStatisticalCategoryDataset0.add(Double.NaN, Double.NaN, (Comparable) hour0, (Comparable) hour0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getValue(0, 0);
      assertEquals(Double.NaN, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockDate mockDate0 = new MockDate((long) 11);
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getTimeZone("`t\")wb5T GS");
      Quarter quarter0 = new Quarter((Date) mockDate0, (TimeZone) zoneInfo0);
      defaultStatisticalCategoryDataset0.add((Number) 11, (Number) null, (Comparable) quarter0, (Comparable) quarter0);
      Integer integer0 = (Integer)defaultStatisticalCategoryDataset0.getValue(0, 0);
      assertEquals(11, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Month month0 = new Month();
      defaultStatisticalCategoryDataset0.add(0.0, 0.0, (Comparable) month0, (Comparable) month0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getStdDevValue((Comparable) month0, (Comparable) month0);
      assertEquals(0.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Hour hour0 = new Hour();
      defaultStatisticalCategoryDataset0.add(Double.NaN, 276.47582578, (Comparable) hour0, (Comparable) hour0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getStdDevValue((Comparable) hour0, (Comparable) hour0);
      assertNotNull(double0);
      assertEquals(276.47582578, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod((long) 0, (long) 0);
      defaultStatisticalCategoryDataset0.add((double) 0, (double) 0, (Comparable) simpleTimePeriod0, (Comparable) simpleTimePeriod0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getStdDevValue(0, 0);
      assertEquals(0.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Hour hour0 = new Hour();
      defaultStatisticalCategoryDataset0.add(Double.NaN, 276.47582578, (Comparable) hour0, (Comparable) hour0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getStdDevValue(0, 0);
      assertEquals(276.47582578, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod((-743L), (-743L));
      defaultStatisticalCategoryDataset0.add((double) (-743L), (double) (-1), (Comparable) simpleTimePeriod0, (Comparable) simpleTimePeriod0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getStdDevValue(0, 0);
      assertEquals((-1.0), (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((Number) (byte)10, (Number) (byte)10, (Comparable) null, (Comparable) null);
      Comparable comparable0 = defaultStatisticalCategoryDataset0.getRowKey(0);
      assertNull(comparable0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Second second0 = new Second();
      defaultStatisticalCategoryDataset0.add((-2759.989102), (-2759.989102), (Comparable) second0, (Comparable) second0);
      Comparable comparable0 = defaultStatisticalCategoryDataset0.getRowKey(0);
      assertNotNull(comparable0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod((-743L), (-743L));
      defaultStatisticalCategoryDataset0.add((double) (-743L), (double) (-1), (Comparable) simpleTimePeriod0, (Comparable) simpleTimePeriod0);
      int int0 = defaultStatisticalCategoryDataset0.getRowIndex(simpleTimePeriod0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod((-743L), (-743L));
      defaultStatisticalCategoryDataset0.add((double) (-743L), (double) (-1), (Comparable) simpleTimePeriod0, (Comparable) simpleTimePeriod0);
      Integer integer0 = new Integer(0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getStdDevValue((Comparable) simpleTimePeriod0, (Comparable) simpleTimePeriod0);
      assertNotNull(double0);
      assertEquals((-1.0), (double)double0, 0.01);
      
      defaultStatisticalCategoryDataset0.add((Number) integer0, (Number) double0, (Comparable) double0, (Comparable) simpleTimePeriod0);
      int int0 = defaultStatisticalCategoryDataset0.getRowIndex(double0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Hour hour0 = new Hour();
      defaultStatisticalCategoryDataset0.add(Double.NaN, 276.47582578, (Comparable) hour0, (Comparable) hour0);
      int int0 = defaultStatisticalCategoryDataset0.getRowCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Month month0 = new Month();
      defaultStatisticalCategoryDataset0.add(0.0, 0.0, (Comparable) month0, (Comparable) month0);
      double double0 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod((-743L), (-743L));
      defaultStatisticalCategoryDataset0.add((double) (-743L), (double) (-1), (Comparable) simpleTimePeriod0, (Comparable) simpleTimePeriod0);
      double double0 = defaultStatisticalCategoryDataset0.getRangeUpperBound(true);
      assertEquals((-743.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Month month0 = new Month();
      defaultStatisticalCategoryDataset0.add(0.0, 0.0, (Comparable) month0, (Comparable) month0);
      double double0 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((-1120.358559), (-1674.0), (Comparable) null, (Comparable) null);
      double double0 = defaultStatisticalCategoryDataset0.getRangeLowerBound(false);
      assertEquals((-1120.358559), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((-1120.358559), (-1674.0), (Comparable) null, (Comparable) null);
      Range range0 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
      assertNotNull(range0);
      assertEquals((-1120.358559), range0.getCentralValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockDate mockDate0 = new MockDate((long) 11);
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getTimeZone("`t\")wb5T GS");
      Quarter quarter0 = new Quarter((Date) mockDate0, (TimeZone) zoneInfo0);
      defaultStatisticalCategoryDataset0.add((Number) 4, (Number) null, (Comparable) null, (Comparable) quarter0);
      Integer integer0 = (Integer)defaultStatisticalCategoryDataset0.getMeanValue((Comparable) null, (Comparable) quarter0);
      assertEquals(4, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod((-743L), (-743L));
      defaultStatisticalCategoryDataset0.add((double) (-743L), (double) (-1), (Comparable) simpleTimePeriod0, (Comparable) simpleTimePeriod0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getMeanValue((Comparable) simpleTimePeriod0, (Comparable) simpleTimePeriod0);
      assertEquals((-743.0), (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod((-743L), (-743L));
      defaultStatisticalCategoryDataset0.add((double) (-743L), (double) (-1), (Comparable) simpleTimePeriod0, (Comparable) simpleTimePeriod0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getStdDevValue((Comparable) simpleTimePeriod0, (Comparable) simpleTimePeriod0);
      defaultStatisticalCategoryDataset0.add((Number) double0, (Number) double0, (Comparable) simpleTimePeriod0, (Comparable) simpleTimePeriod0);
      Double double1 = (Double)defaultStatisticalCategoryDataset0.getMeanValue((Comparable) simpleTimePeriod0, (Comparable) simpleTimePeriod0);
      assertEquals((-1.0), (double)double1, 0.01);
      assertNotNull(double1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockDate mockDate0 = new MockDate((long) 11);
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getTimeZone("`t\")wb5T GS");
      Quarter quarter0 = new Quarter((Date) mockDate0, (TimeZone) zoneInfo0);
      defaultStatisticalCategoryDataset0.add(0.0, 0.0, (Comparable) quarter0, (Comparable) 3);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getMeanValue(0, 0);
      assertEquals(0.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((Number) null, (Number) null, (Comparable) null, (Comparable) null);
      Comparable comparable0 = defaultStatisticalCategoryDataset0.getColumnKey(0);
      assertNull(comparable0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Minute minute0 = new Minute();
      defaultStatisticalCategoryDataset0.add((-1.0), 345.9, (Comparable) minute0, (Comparable) minute0);
      Comparable comparable0 = defaultStatisticalCategoryDataset0.getColumnKey(0);
      assertNotNull(comparable0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Second second0 = new Second();
      defaultStatisticalCategoryDataset0.add((-2759.989102), (-2759.989102), (Comparable) second0, (Comparable) second0);
      int int0 = defaultStatisticalCategoryDataset0.getColumnIndex(second0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockDate mockDate0 = new MockDate((long) 11);
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getTimeZone("`t\")wb5T GS");
      Quarter quarter0 = new Quarter((Date) mockDate0, (TimeZone) zoneInfo0);
      defaultStatisticalCategoryDataset0.add((Number) 11, (Number) null, (Comparable) quarter0, (Comparable) quarter0);
      defaultStatisticalCategoryDataset0.add((Number) 1, (Number) null, (Comparable) mockDate0, (Comparable) null);
      int int0 = defaultStatisticalCategoryDataset0.getColumnIndex((Comparable) null);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((Number) null, (Number) null, (Comparable) "org.jfree.da[.statistics.DefaultStatisticalCategoryDataset", (Comparable) "org.jfree.da[.statistics.DefaultStatisticalCategoryDataset");
      int int0 = defaultStatisticalCategoryDataset0.getColumnCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((-309.0), (-309.0), (Comparable) null, (Comparable) null);
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getValue((Comparable) null, (Comparable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getValue((-145), 2503);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((-743.0), (-743.0), (Comparable) null, (Comparable) null);
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getStdDevValue((Comparable) null, (Comparable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Hour hour0 = new Hour();
      defaultStatisticalCategoryDataset0.add(Double.NaN, Double.NaN, (Comparable) hour0, (Comparable) hour0);
      defaultStatisticalCategoryDataset0.add((double) 0, (double) 0, (Comparable) hour0, (Comparable) null);
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getStdDevValue(0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getStdDevValue((-1), (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getRowKey(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod((-743L), (-743L));
      defaultStatisticalCategoryDataset0.add((double) (-743L), (double) (-1), (Comparable) simpleTimePeriod0, (Comparable) simpleTimePeriod0);
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getRangeBounds(true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Range(double, double): require lower (-742.0) <= upper (-744.0).
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((Number) 16, (Number) (byte)11, (Comparable) null, (Comparable) null);
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getMeanValue((Comparable) null, (Comparable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getMeanValue(0, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getMeanValue((-1), (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getColumnKey((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((Number) 8, (Number) (byte)20, (Comparable) null, (Comparable) null);
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.add((Number) 0, (Number) 17, (Comparable) null, (Comparable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockDate mockDate0 = new MockDate((long) 11);
      Number number0 = defaultStatisticalCategoryDataset0.getMeanValue((Comparable) mockDate0, (Comparable) mockDate0);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset1 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset1.add((Number) (byte)10, (Number) (byte)10, (Comparable) null, (Comparable) null);
      boolean boolean0 = defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset1);
      assertFalse(defaultStatisticalCategoryDataset1.equals((Object)defaultStatisticalCategoryDataset0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset1 = new DefaultStatisticalCategoryDataset();
      boolean boolean0 = defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      boolean boolean0 = defaultStatisticalCategoryDataset0.equals(defaultStatisticalCategoryDataset0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      boolean boolean0 = defaultStatisticalCategoryDataset0.equals(mockMinguoDate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockDate mockDate0 = new MockDate((long) 11);
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getTimeZone("`t\")wb5T GS");
      Quarter quarter0 = new Quarter((Date) mockDate0, (TimeZone) zoneInfo0);
      defaultStatisticalCategoryDataset0.add((Number) 11, (Number) null, (Comparable) quarter0, (Comparable) quarter0);
      Range range0 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
      assertNotNull(range0);
      assertEquals(11.0, range0.getCentralValue(), 0.01);
      assertEquals(11.0, range0.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Range range0 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
      assertNull(range0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Range range0 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
      assertNull(range0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockDate mockDate0 = new MockDate((long) 11);
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getTimeZone("`t\")wb5T GS");
      Quarter quarter0 = new Quarter((Date) mockDate0, (TimeZone) zoneInfo0);
      defaultStatisticalCategoryDataset0.add((Number) 11, (Number) null, (Comparable) quarter0, (Comparable) quarter0);
      defaultStatisticalCategoryDataset0.add((Number) 4, (Number) null, (Comparable) "`t\")wb5T GS", (Comparable) quarter0);
      Range range0 = defaultStatisticalCategoryDataset0.getRangeBounds(true);
      assertEquals(7.0, range0.getLength(), 0.01);
      assertNotNull(range0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod((-743L), (-743L));
      defaultStatisticalCategoryDataset0.add((Number) null, (Number) null, (Comparable) simpleTimePeriod0, (Comparable) simpleTimePeriod0);
      Number number0 = defaultStatisticalCategoryDataset0.getMeanValue(0, 0);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod((-743L), (-743L));
      defaultStatisticalCategoryDataset0.add((double) (-743L), (double) (-1), (Comparable) simpleTimePeriod0, (Comparable) simpleTimePeriod0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getStdDevValue((Comparable) simpleTimePeriod0, (Comparable) simpleTimePeriod0);
      defaultStatisticalCategoryDataset0.add((Number) double0, (Number) double0, (Comparable) simpleTimePeriod0, (Comparable) simpleTimePeriod0);
      Double double1 = (Double)defaultStatisticalCategoryDataset0.getMeanValue(0, 0);
      assertNotNull(double1);
      assertEquals((-1.0), (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((Number) 25, (Number) (byte)124, (Comparable) null, (Comparable) null);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getStdDevValue(0, 0);
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      Hour hour0 = new Hour();
      defaultStatisticalCategoryDataset0.add(Double.NaN, 276.47582578, (Comparable) hour0, (Comparable) hour0);
      Double double0 = (Double)defaultStatisticalCategoryDataset0.getMeanValue((Comparable) hour0, (Comparable) hour0);
      assertNotNull(double0);
      assertEquals(Double.NaN, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockDate mockDate0 = new MockDate((long) 11);
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getTimeZone("`t\")wb5T GS");
      Quarter quarter0 = new Quarter((Date) mockDate0, (TimeZone) zoneInfo0);
      defaultStatisticalCategoryDataset0.add((Number) 11, (Number) null, (Comparable) quarter0, (Comparable) quarter0);
      Integer integer0 = (Integer)defaultStatisticalCategoryDataset0.getMeanValue(0, 0);
      assertEquals(11, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MockDate mockDate0 = new MockDate((long) 11);
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getTimeZone("`t\")wb5T GS");
      Quarter quarter0 = new Quarter((Date) mockDate0, (TimeZone) zoneInfo0);
      defaultStatisticalCategoryDataset0.add(0.0, 0.0, (Comparable) quarter0, (Comparable) 3);
      Quarter quarter1 = (Quarter)quarter0.previous();
      defaultStatisticalCategoryDataset0.add((Number) 11, (Number) null, (Comparable) quarter1, (Comparable) quarter1);
      Integer integer0 = (Integer)defaultStatisticalCategoryDataset0.getValue(0, 1);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      double double0 = defaultStatisticalCategoryDataset0.getRangeLowerBound(true);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod((long) 0, (long) 0);
      defaultStatisticalCategoryDataset0.add((double) 0, (double) 0, (Comparable) simpleTimePeriod0, (Comparable) simpleTimePeriod0);
      Range range0 = defaultStatisticalCategoryDataset0.getRangeBounds(false);
      assertEquals(0.0, range0.getUpperBound(), 0.01);
      assertNotNull(range0);
      assertEquals(0.0, range0.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getRowKey((-2062));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      double double0 = defaultStatisticalCategoryDataset0.getRangeUpperBound(false);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      List list0 = defaultStatisticalCategoryDataset0.getColumnKeys();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getColumnKey(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        defaultStatisticalCategoryDataset0.getValue(0, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      List list0 = defaultStatisticalCategoryDataset0.getRowKeys();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      int int0 = defaultStatisticalCategoryDataset0.getColumnCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      int int0 = defaultStatisticalCategoryDataset0.getRowCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      int int0 = defaultStatisticalCategoryDataset0.getColumnIndex((Comparable) null);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod((-743L), (-743L));
      int int0 = defaultStatisticalCategoryDataset0.getRowIndex(simpleTimePeriod0);
      assertEquals((-1), int0);
  }
}
