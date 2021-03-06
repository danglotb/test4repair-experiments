/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 11 17:13:18 GMT 2017
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang.BooleanUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BooleanUtils_ESTest extends BooleanUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[7];
      booleanArray0[3] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("off");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("0x");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("{}");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(false);
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer(0);
      Integer integer2 = BooleanUtils.toIntegerObject(boolean0, integer0, integer1, integer0);
      assertTrue(integer2.equals((Object)integer0));
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1902));
      Integer integer0 = new Integer((-1902));
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, (Integer) null, (Integer) null, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-459), (-459), (-459), (-459));
      Integer integer0 = new Integer((-1217));
      Integer integer1 = new Integer((-1217));
      Integer integer2 = BooleanUtils.toIntegerObject(boolean0, integer0, integer1, integer0);
      assertTrue(integer2.equals((Object)integer1));
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      Integer integer0 = new Integer(954);
      Integer integer1 = BooleanUtils.toIntegerObject(false);
      Integer integer2 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer1);
      assertEquals(0, (int)integer2);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      Integer integer0 = new Integer((-2620));
      Integer integer1 = Integer.getInteger("zK5&3c8EBJ8t");
      Integer integer2 = BooleanUtils.toIntegerObject(true, integer0, integer1);
      assertEquals((-2620), (int)integer2);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(114, 1, (-621), (-1995463440));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(0, 69, (-1049));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      Integer integer0 = new Integer((-2945));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(1565);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Boolean boolean0 = new Boolean("");
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertNotNull(string0);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, (String) null, "/X{KZj]kNk6Fb");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(721);
      String string0 = BooleanUtils.toString(boolean0, (String) null, (String) null, "{-Em-:}`]7,Z4");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("J<]ukt");
      String string0 = BooleanUtils.toString(boolean0, "", "", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      Integer integer0 = new Integer((-1716));
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, (Integer) null);
      assertEquals((-1716), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 0, 97);
      assertEquals(97, int0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(69);
      int int0 = BooleanUtils.toInteger(boolean0, 0, (-2289), 790);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "{}", "{}");
      assertEquals("{}", string0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, ")K6r_<bKt?n(BVKk+v", "?B69&d@PI[TNld");
      assertEquals("?B69&d@PI[TNld", string0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(69);
      assertTrue(boolean0);
      
      String string0 = BooleanUtils.toString(boolean0, "YF($`", "YF($`", "Index: ");
      assertEquals("YF($`", string0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "UiMt'vlq-32ll12", "vYFM}V!i4;U@", "UiMt'vlq-32ll12");
      assertEquals("UiMt'vlq-32ll12", string0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      boolean boolean1 = BooleanUtils.isFalse(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      boolean boolean0 = BooleanUtils.isFalse((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("/zJ");
      boolean boolean1 = BooleanUtils.isTrue(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      boolean boolean0 = BooleanUtils.isTrue((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, (String) null, (String) null);
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("J<]ukt");
      Boolean[] booleanArray0 = new Boolean[4];
      booleanArray0[0] = boolean0;
      booleanArray0[1] = boolean0;
      booleanArray0[2] = boolean0;
      booleanArray0[3] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[4];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The array must not contain any null elements
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.xor((Boolean[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[0];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array is empty
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[7];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[0];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array is empty
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.xor((boolean[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("j^bIS}$~^!E0/", "AK", "M2:ks");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("", ",^=-c6", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "f+JM.9SZPAb_i^d\"Q", "`Kl{j");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, ",}37");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "The Integer did not match either specified value", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("off", "off", "eV7T:{K");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(", '");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("org.apache.commons.lang.ArrayUtils");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("eTToK?:sDHy8b~2Gv0", "true", "no", "eTToK?:sDHy8b~2Gv0");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("", "true", "`", "`");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("The Array must not be null", "e=5>L(", "The Array must not be null", "os+ldo=&y.x>/*ppj-f");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "', has a length less than 2", (String) null, (String) null);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "0x", "no", "off");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("org.apache.commons.lang.ArrayUtils");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      Integer integer0 = new Integer(954);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
      assertEquals(954, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      Integer integer0 = new Integer((-1902));
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, (Integer) null);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      int int0 = BooleanUtils.toInteger(boolean0, 1984, (-1650), Integer.MAX_VALUE);
      assertEquals((-1650), int0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, (-1707), 1984, 2001);
      assertEquals(2001, int0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on", "on", "on", "on");
      int int0 = BooleanUtils.toInteger(boolean0, 1984, (-1650), Integer.MAX_VALUE);
      assertEquals(1984, int0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, (-3194), 0);
      assertEquals((-3194), int0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-459), (-459), (-459), (-459));
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(0, (int)integer0);
      assertNotNull(integer0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer(97);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer1, integer0, integer0, integer1);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      Integer integer0 = new Integer((-3405));
      Integer integer1 = new Integer(115);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer0, integer0);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer(97);
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(integer1, integer0, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      Integer integer0 = new Integer(1988);
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      Integer integer0 = new Integer((-1218));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(0, 664, 664, 121);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-689), 70, 78, (-689));
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(115, 68, 115, (-2757));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      Integer integer0 = new Integer((-128));
      Integer integer1 = new Integer((-756));
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer1, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Integer integer1 = new Integer(97);
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(integer1, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      Integer integer0 = new Integer(435);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((Integer) null, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      Integer integer0 = new Integer(0);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-459), (-1217), (-459));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0, 0, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(0, 108, 3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-2289));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      Boolean boolean0 = new Boolean((String) null);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-459), (-459), (-459), (-459));
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      boolean boolean0 = BooleanUtils.isNotFalse((Boolean) false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("?qkDQ]", "?qkDQ]", "?qkDQ]", "?qkDQ]");
      boolean boolean1 = BooleanUtils.isNotFalse(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      boolean boolean1 = BooleanUtils.isFalse(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      boolean boolean2 = BooleanUtils.isNotTrue(boolean1);
      assertFalse(boolean2);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      boolean boolean1 = BooleanUtils.isTrue(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      boolean boolean0 = BooleanUtils.isNotTrue((Boolean) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      assertEquals(1, (int)integer0);
      
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      Boolean boolean0 = new Boolean("eV7T:{K");
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      boolean boolean2 = BooleanUtils.toBoolean(boolean1);
      assertTrue(boolean2);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      Boolean boolean0 = new Boolean("eV7T:{K");
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      String string0 = BooleanUtils.toStringOnOff((Boolean) boolean1);
      assertNotNull(string0);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(false);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(true);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(false);
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertEquals("yes", string0);
      assertNotNull(string0);
  }
}
