/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 13 21:36:43 GMT 2017
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
import org.apache.commons.math.analysis.solvers.BrentSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BrentSolver_ESTest extends BrentSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      brentSolver0.setAbsoluteAccuracy((-1567.6674329));
      SinFunction sinFunction0 = new SinFunction();
      double double0 = brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-1657.2312483434227), (-95.0));
      assertEquals(15, brentSolver0.getIterationCount());
      assertEquals((-1159.2476891746337), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      double double0 = brentSolver0.solve((UnivariateRealFunction) expm1Function0, (-4173.94595), (-656.2), (-1631.0));
      assertEquals(30, brentSolver0.getIterationCount());
      assertEquals((-981.1333334385688), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      brentSolver0.setFunctionValueAccuracy(0.0021748719343826794);
      double double0 = brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-85.55282775850799), 1.0E-15);
      assertEquals(1.0E-15, double0, 0.01);
      assertEquals(0, brentSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      double double0 = brentSolver0.solve((UnivariateRealFunction) expm1Function0, (-1394.480673371), 0.0, (-1143.559674));
      assertEquals(0.0, double0, 0.01);
      assertEquals(0, brentSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) expm1Function0);
      brentSolver0.setFunctionValueAccuracy(0.0);
      double double0 = brentSolver0.solve(0.0, 1558.3801, 1.0E-15);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      double double0 = brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-1720.9), 801.665748423152, 1.0E-15);
      assertEquals(1.0E-15, double0, 0.01);
      assertEquals(0, brentSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      double double0 = brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-1652.056847), 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) sinFunction0);
      double double0 = brentSolver0.solve(1.0E-6, 5.0, 1.0);
      assertEquals(6, brentSolver0.getIterationCount());
      assertEquals(3.1415926536282894, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) quinticFunction0);
      double double0 = brentSolver0.solve((-2927.8371364702), 1.0);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      try { 
        brentSolver0.solve((UnivariateRealFunction) expm1Function0, 1.0, 0.5548260209500313, (-1394.480673371));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid interval, initial value parameters:  lower=1, initial=-1,394.481, upper=0.555
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) expm1Function0);
      // Undeclared exception!
      try { 
        brentSolver0.solve((UnivariateRealFunction) null, (-1095.6023328), 630.3300276943389, 1.5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      brentSolver0.setMaximalIterationCount(4);
      try { 
        brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-1655.942574), (-95.0));
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (4) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      try { 
        brentSolver0.solve((UnivariateRealFunction) null, (-1060.1076612024183), 0.5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      try { 
        brentSolver0.solve((-231.20115397), 2428.3324195739, 117.095);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      try { 
        brentSolver0.solve(0.0, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) sinFunction0);
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) monitoredFunction0);
      brentSolver0.setMaximalIterationCount((-141172245));
      try { 
        brentSolver0.solve((-251.48861158), 1.0E-6);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (-141,172,245) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      try { 
        brentSolver0.solve(1.0E-14, 13.74193236);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BrentSolver brentSolver0 = null;
      try {
        brentSolver0 = new BrentSolver((UnivariateRealFunction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function to solve cannot be null
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      double double0 = brentSolver0.solve(univariateRealFunction0, (-966.6271729605027), 1.0E-15);
      assertEquals((-966.6271729605027), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      double double0 = brentSolver0.solve((UnivariateRealFunction) expm1Function0, Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      double double0 = brentSolver0.solve((UnivariateRealFunction) sinFunction0, 1.0E-15, 1.0);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      double double0 = brentSolver0.solve((UnivariateRealFunction) expm1Function0, (-113.17826365), 1383.8683951676564, 1046.662);
      assertEquals(20, brentSolver0.getIterationCount());
      assertEquals((-2.2750780587798288E-9), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
      double double0 = brentSolver0.solve(univariateRealFunction0, (-1394.480673371), 13.404407304571654, (-1.0));
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      brentSolver0.setAbsoluteAccuracy(76.0267602075364);
      double double0 = brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-1652.056847), (-95.0));
      assertEquals(5, brentSolver0.getIterationCount());
      assertEquals((-1614.0434668962318), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      double double0 = brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-95.0), 1.0E-15);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) expm1Function0);
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) monitoredFunction0);
      brentSolver0.setMaximalIterationCount((-141172245));
      brentSolver0.setFunctionValueAccuracy((-251.488611582735));
      try { 
        brentSolver0.solve((UnivariateRealFunction) expm1Function0, (-251.488611582735), 0.0, (-1.0));
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (-141,172,245) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) expm1Function0);
      double double0 = brentSolver0.solve(0.0, 1402.769051922022);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) sinFunction0);
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) monitoredFunction0);
      double double0 = brentSolver0.solve((-251.48861158), 1.0E-6);
      assertEquals(3, brentSolver0.getIterationCount());
      assertEquals((-4.0840109466219016E-13), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      try { 
        brentSolver0.solve((UnivariateRealFunction) expm1Function0, 422.535883156644, 1612.583544284359);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs.  Endpoints: [422.536, 1,612.584], Values: [3,198,913,237,150,837,600,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000, \u221E]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      double double0 = brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-85.55282775850799), 1.0E-15);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(univariateRealFunction0);
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) monitoredFunction0);
      double double0 = brentSolver0.solve((-251.488611582735), 0.0);
      assertEquals((-251.488611582735), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
      brentSolver0.setFunctionValueAccuracy((-556.7003));
      double double0 = brentSolver0.solve(univariateRealFunction0, (-1394.480673371), 1.2475950370571809E-6, (-1.0));
      assertEquals(20, brentSolver0.getIterationCount());
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      double double0 = brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-586.13806580941), 1.0E-15, (-113.17826365));
      assertEquals(1.0E-15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      double double0 = brentSolver0.solve((UnivariateRealFunction) expm1Function0, (-1394.480673371), 1.2475950370571809E-6, (-1.0));
      assertEquals(3, brentSolver0.getIterationCount());
      assertEquals((-2.2607104934942868E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver((UnivariateRealFunction) sinFunction0);
      double double0 = brentSolver0.solve((-391.455), 1050.43, 0.25);
      assertEquals(11, brentSolver0.getIterationCount());
      assertEquals((-345.57519181979654), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
      double double0 = brentSolver0.solve(univariateRealFunction0, (-556.7003), 1.0E-15, (-113.17826365));
      assertEquals((-113.17826365), double0, 0.01);
      assertEquals(0, brentSolver0.getIterationCount());
  }
}
