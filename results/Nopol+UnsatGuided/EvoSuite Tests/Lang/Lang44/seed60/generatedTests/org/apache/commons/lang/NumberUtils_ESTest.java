/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 10 03:00:36 GMT 2017
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
      boolean boolean0 = NumberUtils.isNumber("-0x0e(v}8x*2; zzxGID");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      long long0 = NumberUtils.maximum(0L, 0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      int int0 = NumberUtils.minimum((-1), 100, 100);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      try { 
        NumberUtils.createNumber("-");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // - is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      try { 
        NumberUtils.createNumber("Q'8");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"Q'8\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      int int0 = NumberUtils.stringToInt("", 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      int int0 = NumberUtils.stringToInt((String) null, 1781);
      assertEquals(1781, int0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      int int0 = NumberUtils.stringToInt("4");
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      int int0 = NumberUtils.stringToInt("-4");
      assertEquals((-4), int0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      long long0 = NumberUtils.minimum(0L, 0L, 121L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      long long0 = NumberUtils.minimum(4562L, 1395L, 1395L);
      assertEquals(1395L, long0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      long long0 = NumberUtils.maximum((-2836L), (-2836L), (-3362L));
      assertEquals((-2836L), long0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      int int0 = NumberUtils.maximum(0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Integer integer0 = (Integer)NumberUtils.createNumber("-4");
      assertEquals((-4), (int)integer0);
      assertNotNull(integer0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Long long0 = NumberUtils.createLong("0");
      assertEquals(0L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Long long0 = NumberUtils.createLong("5");
      assertEquals(5L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Integer integer0 = NumberUtils.createInteger("3");
      assertEquals(3, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      Integer integer0 = NumberUtils.createInteger("-0x0e");
      assertEquals((-14), (int)integer0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      Float float0 = NumberUtils.createFloat("-0");
      assertEquals(-0.0F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      Float float0 = NumberUtils.createFloat("3");
      assertEquals(3.0F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      Double double0 = NumberUtils.createDouble("99f");
      assertEquals(99.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      BigInteger bigInteger0 = NumberUtils.createBigInteger("-0");
      assertEquals(0, bigInteger0.byteValue());
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      BigInteger bigInteger0 = NumberUtils.createBigInteger("5");
      assertEquals(5, bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      BigInteger bigInteger0 = NumberUtils.createBigInteger("-3");
      assertEquals(-3, bigInteger0.byteValue());
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal("-0");
      assertEquals(0, bigDecimal0.shortValue());
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal("5");
      assertEquals(5, bigDecimal0.shortValue());
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createLong("z>nkq'|/DTM{80= ");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"z>nkq'|/DTM{80= \"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createInteger("-0xd8'5wGhM;GAK0E");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-d8'5wGhM;GAK0E\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
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
  public void test029()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createFloat((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createDouble("P1M");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
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
  public void test033()  throws Throwable  {
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
  public void test034()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits("--");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createBigDecimal("");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      int int0 = NumberUtils.stringToInt("", (-1737));
      assertEquals((-1737), int0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      Integer integer0 = NumberUtils.createInteger("-0");
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      Double double0 = NumberUtils.createDouble("0");
      assertEquals(0.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("7f");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("d");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber(".E");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0E0e");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("3");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("++ks/@hy^<x^(*af.");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("enXU");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0e-v8x*d; zzxQlID");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("...");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("6E$");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0xDt*d|kWWv:x)4\\O7");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0x");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0zct*d|kW{:x)4\\O7");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber(".F");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0x99f");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("--");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("D");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits("5");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      int int0 = NumberUtils.compare(200.5728F, 200.5728F);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      int int0 = NumberUtils.compare((-1398.31F), (float) 0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      int int0 = NumberUtils.compare((float) 0, (-446.0F));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      int int0 = NumberUtils.compare(1.0, (double) (-2941L));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      int int0 = NumberUtils.compare((-1769.54005122), (double) 2125);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      int int0 = NumberUtils.compare(1900.0, 1900.0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      int int0 = NumberUtils.maximum((-2550), (-2460), (-1737));
      assertEquals((-1737), int0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      int int0 = NumberUtils.maximum((-1), 2125, 0);
      assertEquals(2125, int0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      int int0 = NumberUtils.maximum(13, 1, 0);
      assertEquals(13, int0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      long long0 = NumberUtils.maximum((-680L), 0L, 594L);
      assertEquals(594L, long0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      long long0 = NumberUtils.maximum((long) 0, (-26L), (-26L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      int int0 = NumberUtils.minimum(0, 0, (-374));
      assertEquals((-374), int0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      int int0 = NumberUtils.minimum(2119, 16, 381);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      int int0 = NumberUtils.minimum(0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      long long0 = NumberUtils.minimum(1L, (-1270L), 574L);
      assertEquals((-1270L), long0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      long long0 = NumberUtils.minimum((-1445L), (-1421L), (long) (-2941));
      assertEquals((-2941L), long0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      try { 
        NumberUtils.createNumber("nm2rHj_B. m\"L!g?kE2");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      try { 
        NumberUtils.createNumber("T6zHxt9//{dWuej5");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      try { 
        NumberUtils.createNumber("':l");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // ':l is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
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
  public void test081()  throws Throwable  {
      Float float0 = (Float)NumberUtils.createNumber("99f");
      assertEquals(99.0F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createNumber("L");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      try { 
        NumberUtils.createNumber("F");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // F is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0e(ve8x*2; zzxGID");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0e(ve8x*2; zzxGID is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      Integer integer0 = (Integer)NumberUtils.createNumber("-0");
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0e");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0e is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      try { 
        NumberUtils.createNumber("\"\" is not a valid number.");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // \"\" is not a valid number. is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      try { 
        NumberUtils.createNumber(".Ea\"Fy0*jzv");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // .Ea\"Fy0*jzv is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      try { 
        NumberUtils.createNumber(".)sD3l");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // .)sD3l is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0x*)5&XnI7");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"*)5&XnI7\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("--");
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
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
  public void test093()  throws Throwable  {
      Number number0 = NumberUtils.createNumber((String) null);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createBigInteger("xjV0x6~uvXxcw!TQj");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"xjV0x6~u\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      Long long0 = NumberUtils.createLong("-3");
      assertEquals((-3L), (long)long0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      try { 
        NumberUtils.createNumber("-0x");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      int int0 = NumberUtils.stringToInt("-0");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      try { 
        NumberUtils.createNumber("}^-Xb/NU%R37nDT&qbd");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // }^-Xb/NU%R37nDT&qbd is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createFloat("--P1M%.R9R``9");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
  }
}