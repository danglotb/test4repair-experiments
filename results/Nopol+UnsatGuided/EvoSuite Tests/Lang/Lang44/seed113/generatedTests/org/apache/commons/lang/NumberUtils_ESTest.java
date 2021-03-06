/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 10 13:55:58 GMT 2017
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.lang.NumberUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NumberUtils_ESTest extends NumberUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0x5faR~$!ep96+G");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0x9");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      int int0 = NumberUtils.maximum(3467, 0, 0);
      assertEquals(3467, int0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      long long0 = NumberUtils.maximum(502L, (-1593L), (long) 1);
      assertEquals(502L, long0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      int int0 = NumberUtils.minimum((-1195), (-1195), 0);
      assertEquals((-1195), int0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      int int0 = NumberUtils.minimum(68, 100, 68);
      assertEquals(68, int0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      long long0 = NumberUtils.minimum(0L, 0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      try { 
        NumberUtils.createNumber("[$89");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"[$89\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      int int0 = NumberUtils.stringToInt((String) null, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      int int0 = NumberUtils.stringToInt("3.L", (-22));
      assertEquals((-22), int0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      int int0 = NumberUtils.stringToInt("179");
      assertEquals(179, int0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      int int0 = NumberUtils.minimum(0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      long long0 = NumberUtils.maximum(0L, 0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      int int0 = NumberUtils.maximum(0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      int int0 = NumberUtils.maximum((-22), (-22), (-22));
      assertEquals((-22), int0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Integer integer0 = (Integer)NumberUtils.createNumber("-0");
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Long long0 = NumberUtils.createLong("9");
      assertEquals(9L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      Integer integer0 = NumberUtils.createInteger("#E");
      assertEquals(14, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      Integer integer0 = NumberUtils.createInteger("-0x9");
      assertEquals((-9), (int)integer0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      Float float0 = NumberUtils.createFloat("9");
      assertEquals(9.0F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      Double double0 = NumberUtils.createDouble("-5");
      assertEquals((-5.0), (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      Double double0 = NumberUtils.createDouble(".0");
      assertEquals(0.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      Double double0 = NumberUtils.createDouble("9");
      assertEquals(9.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      BigInteger bigInteger0 = NumberUtils.createBigInteger("-0");
      assertEquals(0, bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      BigInteger bigInteger0 = NumberUtils.createBigInteger("9");
      assertEquals(9, bigInteger0.byteValue());
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal("9");
      assertEquals(9, bigDecimal0.shortValue());
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createNumber("L");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createLong("-0x9");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-0x9\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createInteger("");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Zero length string
         //
         verifyException("java.lang.Integer", e);
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createInteger((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Integer", e);
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createFloat((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createDouble((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createBigInteger("ad4FV='+");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Illegal embedded sign character
         //
         verifyException("java.math.BigInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createBigDecimal("n)");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createBigDecimal((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits("9");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits("B!<mS)d3k1* H0&Ik");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      int int0 = NumberUtils.stringToInt((String) null, 829);
      assertEquals(829, int0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      Long long0 = NumberUtils.createLong("-0");
      assertEquals(0L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      Integer integer0 = NumberUtils.createInteger("-0");
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("3.L");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("l");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("F");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("f");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("8D");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0d");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("E");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("e");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("7(");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("+-;+6'-C:");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("E^ a");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("e+23!<zh1");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("...");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("--G1MP:OJ>&?Z3xtFS");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0x0D");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0x.aR8$!ep96+G");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0x5.aR~$!ep96+G");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0x");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0~");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("G.L");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      int int0 = NumberUtils.compare(2242.1F, 1860.049F);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      int int0 = NumberUtils.compare((-1286.5083F), 0.0F);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      int int0 = NumberUtils.compare(0.0F, 0.0F);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      int int0 = NumberUtils.compare((double) 115, (double) (-1286.5083F));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      int int0 = NumberUtils.compare(0.0, 1.0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      int int0 = NumberUtils.compare(5.3655, 5.3655);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      int int0 = NumberUtils.maximum(0, 102, 115);
      assertEquals(115, int0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      long long0 = NumberUtils.maximum(0L, 1L, (long) 68);
      assertEquals(68L, long0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      long long0 = NumberUtils.maximum((long) (-1), (long) (-1), (long) (-1));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      int int0 = NumberUtils.minimum(0, (-1), (-3919));
      assertEquals((-3919), int0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      long long0 = NumberUtils.minimum((long) 9, 1969L, (-2055L));
      assertEquals((-2055L), long0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      long long0 = NumberUtils.minimum((long) 829, 0L, 1284L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      long long0 = NumberUtils.minimum((long) 179, 1294L, 1969L);
      assertEquals(179L, long0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      BigDecimal bigDecimal0 = (BigDecimal)NumberUtils.createNumber(".0");
      assertEquals(0, bigDecimal0.byteValue());
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      try { 
        NumberUtils.createNumber("Mi0imum<abbreviation width with offset i 7");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      Double double0 = (Double)NumberUtils.createNumber("8D");
      assertEquals(8.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0OnhPFL");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0OnhPFL is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      try { 
        NumberUtils.createNumber("Strings must not be null");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Strings must not be null is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      try { 
        NumberUtils.createNumber("f");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // f is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      BigDecimal bigDecimal0 = (BigDecimal)NumberUtils.createNumber("0d");
      assertEquals(0, bigDecimal0.byteValue());
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      try { 
        NumberUtils.createNumber("4#~),F");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 4#~),F is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      try { 
        NumberUtils.createNumber("#E");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // #E is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      try { 
        NumberUtils.createNumber(" is not a valid number.");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         //  is not a valid number. is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      try { 
        NumberUtils.createNumber(".aR8$!ep96+G");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // .aR8$!ep96+G is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      try { 
        NumberUtils.createNumber("G.L");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // G.L is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      Integer integer0 = (Integer)NumberUtils.createNumber("-0x0D");
      assertEquals((-13), (int)integer0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0x0wx9");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"0wx9\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("--G1MP:OJ>&?Z3xtFS");
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      try { 
        NumberUtils.createNumber("");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // \"\" is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      Number number0 = NumberUtils.createNumber((String) null);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createBigInteger((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      Long long0 = (Long)NumberUtils.createNumber("1L");
      assertEquals(1L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      int int0 = NumberUtils.stringToInt("");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal("-0");
      assertEquals(0, bigDecimal0.byteValue());
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createDouble("1L");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      Float float0 = NumberUtils.createFloat("-0");
      assertEquals(-0.0F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
  }
}
