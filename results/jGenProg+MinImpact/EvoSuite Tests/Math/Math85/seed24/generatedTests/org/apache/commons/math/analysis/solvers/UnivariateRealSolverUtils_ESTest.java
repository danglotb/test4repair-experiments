/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 25 01:19:07 GMT 2017
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UnivariateRealSolverUtils_ESTest extends UnivariateRealSolverUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, 0.0, 0.0, 0.0, 3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=0,  initial=0, upper bound=0
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, (-2161.09472), 27.508624316873, 27.508624316873, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad value for maximum iterations number: 0
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) expm1Function0, (-3030.988), 0.0, (-1.0));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) quinticFunction0, 0.5, 2110.81904, 0.5);
      assertEquals(0.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) expm1Function0, (-3422.306), 2503.101719756186, 2503.101719756186);
      assertEquals((-919.2042802438141), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) quinticFunction0, 0.0, 1059.921614299);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(univariateRealFunction0);
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) monitoredFunction0, (-571.0), 0.5);
      assertEquals((-571.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double double0 = UnivariateRealSolverUtils.midpoint(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double double0 = UnivariateRealSolverUtils.midpoint(0.5, 1.0);
      assertEquals(0.75, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      double[] doubleArray0 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, (-999.720075905362), (-1996.338), 37.91964);
      assertArrayEquals(new double[] {(-1996.338), 0.27992409463797685}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.solve((UnivariateRealFunction) expm1Function0, (-999.720075905362), (-1996.338));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-999.72, -1,996.338]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.solve((UnivariateRealFunction) monitoredFunction0, 0.0, 1769.016503586);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.MonitoredFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) monitoredFunction0, (-7.430000000000064), (-7.430000000000064), 0.25, 642);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.MonitoredFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, 0.0, 0.0, 1.0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // number of iterations=1, maximum iterations=2,147,483,647, initial=0, lower bound=0, upper bound=1, final a value=0, final b value=1, f(a)=0, f(b)=0.841
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, (-2129.8105001541576), (-2129.8105001541576), (double) 16, 16);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // number of iterations=16, maximum iterations=16, initial=-2,129.811, lower bound=-2,129.811, upper bound=16, final a value=-2,129.811, final b value=-2,113.811, f(a)=-43,823,261,808,925,512, f(b)=-42,201,718,176,677,536
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, (-4412.6914), 1.0, 1.0, 885);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=1,  initial=-4,412.691, upper bound=1
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.solve((UnivariateRealFunction) null, (-336.4), (-336.4), (-336.4));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function is null
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
      try { 
        UnivariateRealSolverUtils.bracket(univariateRealFunction0, 5.842052280678094E-8, 0.0, 0.75, 3099);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // number of iterations=1, maximum iterations=3,099, initial=0, lower bound=0, upper bound=0.75, final a value=0, final b value=0.75, f(a)=1, f(b)=2.117
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) expm1Function0);
      double[] doubleArray0 = UnivariateRealSolverUtils.bracket((UnivariateRealFunction) monitoredFunction0, Double.NaN, Double.NaN, 0.5, 1855);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, Double.NaN, (double) 22, (-2129.8105001541576), 4908);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=22,  initial=\uFFFD, upper bound=-2,129.811
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, 0.0, 0.0, (-377.2271032447), 1280);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=0,  initial=0, upper bound=-377.227
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, 1.0, 1.0585615801482648E19, 1.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid bracketing parameters:  lower bound=10,585,615,801,482,648,000,  initial=1, upper bound=1
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) expm1Function0);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) monitoredFunction0, 1.0, (double) 1855, 1.0, (-4393));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad value for maximum iterations number: -4,393
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) null, 0.0, 0.0, 0.0, (-1792));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function is null
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double double0 = UnivariateRealSolverUtils.midpoint((-2129.8105001541576), (-2129.8105001541576));
      assertEquals((-2129.8105001541576), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) expm1Function0);
      double double0 = UnivariateRealSolverUtils.solve((UnivariateRealFunction) monitoredFunction0, (-571.0), 0.5);
      assertEquals(2.4184415767875624E-12, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      try { 
        UnivariateRealSolverUtils.bracket((UnivariateRealFunction) monitoredFunction0, 1661.26654183469, 1661.26654183469, Double.NaN);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.MonitoredFunction", e);
      }
  }
}
