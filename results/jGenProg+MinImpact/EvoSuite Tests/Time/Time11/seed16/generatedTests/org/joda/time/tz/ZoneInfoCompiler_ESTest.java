/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 16 00:05:58 GMT 2017
 */

package org.joda.time.tz;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.OutputStream;
import java.io.PipedReader;
import java.io.Reader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.joda.time.DateTimeZone;
import org.joda.time.MockZone;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.tz.DateTimeZoneBuilder;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.ZoneInfoCompiler;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ZoneInfoCompiler_ESTest extends ZoneInfoCompiler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = ZoneInfoCompiler.getStartOfYear();
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      zoneInfoCompiler_DateTimeOfYear0.addRecurring(dateTimeZoneBuilder0, "", 1, 1, (-552));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp/time_11_Genprog_local_s1/outputMutation/AstorMain-Time/src/evosuite/default/org.joda.time.MockPartial");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "{XX_30B");
      String[] stringArray0 = new String[1];
      stringArray0[0] = "org.joda.time.MockPartial";
      ZoneInfoCompiler.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = ZoneInfoCompiler.parseTime("4A,cLhbC_");
      assertEquals(14400000, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = ZoneInfoCompiler.parseOptional("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      MockFile mockFile0 = new MockFile("v(jP5E6n(&Ycd");
      File[] fileArray0 = new File[0];
      Map<String, DateTimeZone> map0 = zoneInfoCompiler0.compile(mockFile0, fileArray0);
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>(map0);
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.writeZoneInfoMap(dataOutputStream0, hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.test("mD[1+R[|9czoNJtu6K", (DateTimeZone) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.parseYear((String) null, 87);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.parseTime((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.parseOptional((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.parseMonth("A+kg@czMSP?/ri");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"A+kg@czMSP?/ri\" for monthOfYear is not supported
         //
         verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.parseMonth((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.parseDayOfWeek((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      // Undeclared exception!
      try { 
        zoneInfoCompiler0.parseDataFile((BufferedReader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      PipedReader pipedReader0 = new PipedReader();
      BufferedReader bufferedReader0 = new BufferedReader((Reader) pipedReader0, 115);
      try { 
        zoneInfoCompiler0.parseDataFile(bufferedReader0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      MockFile mockFile0 = new MockFile((File) null, ":BO'l+/,VA(B.&");
      File[] fileArray0 = new File[1];
      fileArray0[0] = (File) mockFile0;
      try { 
        zoneInfoCompiler0.compile(mockFile0, fileArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      StringReader stringReader0 = new StringReader("rL.^~7");
      LineNumberReader lineNumberReader0 = new LineNumberReader((Reader) stringReader0, 1082);
      zoneInfoCompiler0.parseDataFile(lineNumberReader0);
      assertEquals(1, lineNumberReader0.getLineNumber());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringTokenizer stringTokenizer0 = new StringTokenizer("7x)yc", "7x)yc", true);
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = null;
      try {
        zoneInfoCompiler_DateTimeOfYear0 = new ZoneInfoCompiler.DateTimeOfYear(stringTokenizer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // x
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler$DateTimeOfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringTokenizer stringTokenizer0 = new StringTokenizer("", "");
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = new ZoneInfoCompiler.DateTimeOfYear(stringTokenizer0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      StringReader stringReader0 = new StringReader("link");
      LineNumberReader lineNumberReader0 = new LineNumberReader((Reader) stringReader0, 1082);
      // Undeclared exception!
      try { 
        zoneInfoCompiler0.parseDataFile(lineNumberReader0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.StringTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockFile mockFile0 = new MockFile("kl", "kl");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream((File) mockFile0, true);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-3);
      byteArray0[3] = (byte)35;
      mockFileOutputStream0.write(byteArray0);
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      File[] fileArray0 = new File[4];
      fileArray0[0] = (File) mockFile0;
      // Undeclared exception!
      try { 
        zoneInfoCompiler0.compile(mockFile0, fileArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockFile mockFile0 = new MockFile("#");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("#", true);
      MockPrintStream mockPrintStream0 = new MockPrintStream((OutputStream) mockFileOutputStream0);
      Object[] objectArray0 = new Object[4];
      mockPrintStream0.format("#", objectArray0);
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      File[] fileArray0 = new File[4];
      fileArray0[0] = (File) mockFile0;
      // Undeclared exception!
      try { 
        zoneInfoCompiler0.compile(mockFile0, fileArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockFile mockFile0 = new MockFile("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream((File) mockFile0, true);
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      mockFileOutputStream0.write((-491));
      File[] fileArray0 = new File[5];
      fileArray0[0] = (File) mockFile0;
      // Undeclared exception!
      try { 
        zoneInfoCompiler0.compile(mockFile0, fileArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      FileSystemHandling.shouldAllThrowIOExceptions();
      MockFile mockFile0 = new MockFile("  -dst <directory>    Specify where to write generated files", "  -dst <directory>    Specify where to write generated files");
      File[] fileArray0 = new File[0];
      try { 
        zoneInfoCompiler0.compile(mockFile0, fileArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Destination directory doesn't exist and cannot be created: /tmp/time_11_Genprog_local_s1/outputMutation/AstorMain-Time/src/evosuite/default/  -dst <directory>    Specify where to write generated files/  -dst <directory>    Specify where to write generated files
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp/time_11_Genprog_local_s1/outputMutation/AstorMain-Time/src/evosuite/default/kl/kl");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "FromYear: ");
      MockFile mockFile0 = new MockFile("kl", "kl");
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      File[] fileArray0 = new File[4];
      fileArray0[0] = (File) mockFile0;
      fileArray0[1] = (File) mockFile0;
      fileArray0[2] = (File) mockFile0;
      fileArray0[3] = (File) mockFile0;
      try { 
        zoneInfoCompiler0.compile(mockFile0, fileArray0);
       //  fail("Expecting exception: IOException");
       // Unstable assertion
      } catch(IOException e) {
         //
         // Destination is not a directory: /tmp/time_11_Genprog_local_s1/outputMutation/AstorMain-Time/src/evosuite/default/kl/kl
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.getDefault();
      boolean boolean0 = ZoneInfoCompiler.test("j-", fixedDateTimeZone0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)dateTimeZoneBuilder0.toDateTimeZone("", true);
      boolean boolean0 = ZoneInfoCompiler.test("", fixedDateTimeZone0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('z');
      assertEquals('u', char0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('w');
      assertEquals('w', char0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('u');
      assertEquals('u', char0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('s');
      assertEquals('s', char0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('g');
      assertEquals('u', char0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('Z');
      assertEquals('u', char0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('W');
      assertEquals('w', char0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('U');
      assertEquals('u', char0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('S');
      assertEquals('s', char0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('t');
      assertEquals('w', char0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      char char0 = ZoneInfoCompiler.parseZoneChar('G');
      assertEquals('u', char0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.parseTime("--MM-dd");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // --MM-dd
         //
         verifyException("org.joda.time.tz.ZoneInfoCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String string0 = ZoneInfoCompiler.parseOptional(")1g8#/");
      assertEquals(")1g8#/", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.parseYear("-dhr", 908);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-dhr\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      int int0 = ZoneInfoCompiler.parseYear("only", 908);
      assertEquals(908, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      int int0 = ZoneInfoCompiler.parseYear("maximum", 565);
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      int int0 = ZoneInfoCompiler.parseYear("minimum", 1996);
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("$@LR");
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) mockPrintStream0);
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      MockZone mockZone0 = new MockZone((-2071L), (-1879689459), (-1879689459));
      hashMap0.put("$@LR", mockZone0);
      hashMap0.put("qH]", mockZone0);
      ZoneInfoCompiler.writeZoneInfoMap(dataOutputStream0, hashMap0);
      assertFalse(hashMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ZoneInfoCompiler.parseTime("0");
      LenientChronology lenientChronology0 = (LenientChronology)ZoneInfoCompiler.getLenientISOChronology();
      assertNotNull(lenientChronology0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = ZoneInfoCompiler.getStartOfYear();
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear1 = ZoneInfoCompiler.getStartOfYear();
      assertSame(zoneInfoCompiler_DateTimeOfYear1, zoneInfoCompiler_DateTimeOfYear0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "org.joda.time.MockPartial";
      try { 
        ZoneInfoCompiler.main(stringArray0);
       //  fail("Expecting exception: FileNotFoundException");
       // Unstable assertion
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-?";
      ZoneInfoCompiler.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-verbose";
      try { 
        ZoneInfoCompiler.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-dst";
      try { 
        ZoneInfoCompiler.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZoneInfoCompiler.parseDayOfWeek("The fields must not be null or empty");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"The fields must not be null or empty\" for dayOfWeek is not supported
         //
         verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      int int0 = ZoneInfoCompiler.parseMonth("4");
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ZoneInfoCompiler zoneInfoCompiler0 = new ZoneInfoCompiler();
      Map<String, DateTimeZone> map0 = zoneInfoCompiler0.compile((File) null, (File[]) null);
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ZoneInfoCompiler.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = new ZoneInfoCompiler.DateTimeOfYear();
      String string0 = zoneInfoCompiler_DateTimeOfYear0.toString();
      assertEquals("MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n", string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = ZoneInfoCompiler.getStartOfYear();
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      zoneInfoCompiler_DateTimeOfYear0.addRecurring(dateTimeZoneBuilder0, (String) null, (-354), 2223, 0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ZoneInfoCompiler.DateTimeOfYear zoneInfoCompiler_DateTimeOfYear0 = new ZoneInfoCompiler.DateTimeOfYear();
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      zoneInfoCompiler_DateTimeOfYear0.addCutover(dateTimeZoneBuilder0, 5);
  }
}
