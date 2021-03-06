/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 15 12:18:36 GMT 2017
 */

package org.joda.time.tz;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.joda.time.DateTimeZone;
import org.joda.time.tz.CachedDateTimeZone;
import org.joda.time.tz.DateTimeZoneBuilder;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateTimeZoneBuilder_ESTest extends DateTimeZoneBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((-1111372957));
      dateTimeZoneBuilder1.addRecurringSavings("-308:42:52.957", 1207, 34, 1207, 's', 658, 2143, 1207, true, (-437));
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.toDateTimeZone("-308:42:52.957", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 658 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setStandardOffset(1166);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addCutover((-1028), 'y', 1625, (-516), 1625, false, (-1729));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: y
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setFixedSavings("0S\"<zKJ;gQu<!$v9", 2);
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover(2, 's', 2, 2, 2, true, 2);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover(15, 's', 'y', 2, 's', false, 'y');
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder2);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      FilterOutputStream filterOutputStream0 = new FilterOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("", (OutputStream) filterOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.FilterOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo((String) null, (OutputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      try { 
        dateTimeZoneBuilder0.writeTo("y", (OutputStream) pipedOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("", (DataOutput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      FilterOutputStream filterOutputStream0 = new FilterOutputStream((OutputStream) pipedOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) filterOutputStream0);
      try { 
        dateTimeZoneBuilder0.writeTo("7<vDn<J9<Iu", (DataOutput) dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.writeMillis((DataOutput) null, 1905L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockFile mockFile0 = new MockFile("-");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream((File) mockFile0);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) mockFileOutputStream0);
      mockFile0.delete();
      try { 
        DateTimeZoneBuilder.writeMillis(dataOutputStream0, (-897L));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readMillis((DataInput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-2416), 2551);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) byteArrayInputStream0);
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readMillis(dataInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2416
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream((InputStream) bufferedInputStream0, (InputStream) null);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) sequenceInputStream0);
      try { 
        DateTimeZoneBuilder.readMillis(dataInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 2449, (int) (byte)37);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream((InputStream) byteArrayInputStream0, (InputStream) byteArrayInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) sequenceInputStream0);
      try { 
        DateTimeZoneBuilder.readMillis(dataInputStream0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-302), 2291);
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) byteArrayInputStream0, "     - ");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -302
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) byteArrayInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) pushbackInputStream0, " - ");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Invalid encoding
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) null, "Australia/Sydney");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addRecurringSavings("Fixing duplicate recurrent name key - ", 25734375, (-2147445167), 8, 'U', 25734375, (-2120), (-2147445167), true, 583);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: U
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.toDateTimeZone((String) null, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) null, "^xv6qC;xD]x");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)67;
      byteArray0[1] = (byte)46;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) byteArrayInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, "3");
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("0S\"<zKJ;gQu<!$v9", 2);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover(15, 's', 2, (-2544), 2, true, 2);
      dateTimeZoneBuilder2.addRecurringSavings("America/St_Johns", 2147465749, 569, 569, 's', 569, 2147465749, 2, false, 128);
      dateTimeZoneBuilder2.setFixedSavings("oBx(:/D,o %eh!aH\"", 2);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder2.toDateTimeZone(" - ", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 569 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setFixedSavings(")x]*@9A (Q_\"n(j", 3);
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover(3, 's', 3, 3, 3, true, 3);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)dateTimeZoneBuilder1.toDateTimeZone(" - ", true);
      assertTrue(fixedDateTimeZone0.isFixed());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setFixedSavings("0S\"<zKJ;gQu<!$v9", 2);
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover(2, 's', 2, 2, 2, false, 2);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)dateTimeZoneBuilder1.toDateTimeZone(" - ", true);
      assertEquals(" - ", fixedDateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("0S\"<zKJ;gQu<!$v9", 2);
      dateTimeZoneBuilder0.addCutover(2, 's', 2, (-2544), 2, true, 2);
      MockFile mockFile0 = new MockFile("SST");
      MockPrintStream mockPrintStream0 = new MockPrintStream((File) mockFile0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) mockPrintStream0);
      dateTimeZoneBuilder1.writeTo("Zone", (DataOutput) objectOutputStream0);
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setFixedSavings("QAl", 194);
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover(123, 'w', 256, (-512), 67, false, 119);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.toDateTimeZone("QAl", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 256 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.addRecurringSavings("-308:42:52.957", 1207, 34, 1207, 'u', 658, 2143, 1207, true, (-437));
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.toDateTimeZone("-308:42:52.957", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 658 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("0S\"<zKJ;gQu<!$v9", 2);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.addCutover(2, 's', 2, 2, 2, true, 2);
      dateTimeZoneBuilder0.setFixedSavings("oBx(:/D,o %eh!aH\"", 's');
      MockFile mockFile0 = new MockFile("SST");
      MockPrintStream mockPrintStream0 = new MockPrintStream((File) mockFile0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) mockPrintStream0);
      dateTimeZoneBuilder1.writeTo("Zone", (DataOutput) objectOutputStream0);
      assertSame(dateTimeZoneBuilder1, dateTimeZoneBuilder2);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("(WV|Fk<'v");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) mockFileOutputStream0);
      dateTimeZoneBuilder0.writeTo("(WV|Fk<'v", (OutputStream) objectOutputStream0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover(2, 's', 2, 2, 2, true, 2);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)dateTimeZoneBuilder1.toDateTimeZone(" - ", true);
      assertEquals(" - ", fixedDateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("AS,T`YW<L", true);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) mockFileOutputStream0);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo((String) null, (DataOutput) objectOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("0S\"<zKJ;gQu<!$v9", (-2544), 1242, (-2544), 'y', 0, 2002, 2, false, (-1077));
      assertSame(dateTimeZoneBuilder1, dateTimeZoneBuilder0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setFixedSavings("UTC", 47);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)dateTimeZoneBuilder0.toDateTimeZone("UTC", true);
      assertTrue(fixedDateTimeZone0.isFixed());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setFixedSavings("weekyear", (-1610612734));
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)dateTimeZoneBuilder0.toDateTimeZone("UTC", true);
      assertTrue(fixedDateTimeZone0.isFixed());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)dateTimeZoneBuilder0.toDateTimeZone("UTC", true);
      assertEquals("UTC", fixedDateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(57);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) pipedOutputStream0);
      DateTimeZoneBuilder.writeMillis(dataOutputStream0, 40000L);
      assertEquals(5, pipedInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) byteArrayOutputStream0);
      DateTimeZoneBuilder.writeMillis(dataOutputStream0, 63158400000L);
      assertEquals("@\u0010\u000F\uFFFD", byteArrayOutputStream0.toString());
      assertEquals(4, byteArrayOutputStream0.size());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) byteArrayInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, "%_*Nf, a");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Invalid encoding
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)67;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) byteArrayInputStream0);
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, "3");
      assertEquals("3", cachedDateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (int) (byte)30, (-2544));
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) byteArrayInputStream0, 775);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream((InputStream) bufferedInputStream0, (InputStream) byteArrayInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) sequenceInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) dataInputStream0, "-Summer");
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.getDefault();
      assertEquals("Etc/UTC", fixedDateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("0S\"<zKJ;gQu<!$v9", (-1));
      dateTimeZoneBuilder0.addCutover((-1), 's', (-1), (-2544), (-1), true, (-1));
      MockFile mockFile0 = new MockFile("SST");
      MockPrintStream mockPrintStream0 = new MockPrintStream((File) mockFile0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) mockPrintStream0);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.writeTo("Zone", (DataOutput) objectOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }
}
