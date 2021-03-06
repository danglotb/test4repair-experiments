/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 12 19:37:40 GMT 2017
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.BisectionSolver;
import org.apache.commons.math.analysis.solvers.BrentSolver;
import org.apache.commons.math.analysis.solvers.LaguerreSolver;
import org.apache.commons.math.analysis.solvers.MullerSolver;
import org.apache.commons.math.analysis.solvers.NewtonSolver;
import org.apache.commons.math.analysis.solvers.RiddersSolver;
import org.apache.commons.math.analysis.solvers.SecantSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UnivariateRealSolverImpl_ESTest extends UnivariateRealSolverImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      try { 
        brentSolver0.solve((UnivariateRealFunction) expm1Function0, (-628.1209881679913), (-628.1209881679913), 1.0E-15);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid interval, initial value parameters:  lower=-628.121, initial=0, upper=-628.121
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      try { 
        newtonSolver0.solve((UnivariateRealFunction) expm1Function0, 6.28319, 6.28319);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid interval, initial value parameters:  lower=6.283, initial=6.283, upper=6.283
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      try { 
        mullerSolver0.solve((UnivariateRealFunction) expm1Function0, 0.4622028622255778, 989.5748482682895, 989.5748482682895);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs.  Endpoints: [0.462, 989.575], Values: [0.588, \u221E]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      bisectionSolver0.defaultFunctionValueAccuracy = 3488.023396366591;
      bisectionSolver0.resetFunctionValueAccuracy();
      assertEquals(3488.023396366591, bisectionSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      bisectionSolver0.verifyInterval((-4112.818134), 2925.157443039641);
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      riddersSolver0.setResult(1459.912484845, 1459.912484845, (-1));
      riddersSolver0.checkResultComputed();
      assertEquals(-1, riddersSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      bisectionSolver0.clearResult();
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(0, bisectionSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver();
      boolean boolean0 = secantSolver0.isSequence(0.0, 1.5, 127.0);
      assertEquals(1.0E-15, secantSolver0.getFunctionValueAccuracy(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      boolean boolean0 = laguerreSolver0.isBracketing(989.3483768, (-16.012366829252972), expm1Function0);
      assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      bisectionSolver0.resultComputed = true;
      bisectionSolver0.getResult();
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      riddersSolver0.setResult(1187.0471, (-410.5638990755), 100);
      double double0 = riddersSolver0.getResult();
      assertEquals(100, riddersSolver0.getIterationCount());
      assertEquals(1187.0471, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      
      mullerSolver0.setFunctionValueAccuracy((-1.0));
      double double0 = mullerSolver0.getFunctionValueAccuracy();
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      mullerSolver0.setResult(0.0, 0);
      mullerSolver0.getFunctionValue();
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(0, mullerSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      riddersSolver0.setResult(5.0, 1.0E-15, 2319);
      double double0 = riddersSolver0.getFunctionValue();
      assertEquals(2319, riddersSolver0.getIterationCount());
      assertEquals(1.0E-15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      // Undeclared exception!
      try { 
        laguerreSolver0.verifyInterval((-3996.42029023675), (-3996.42029023675));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-3,996.42, -3,996.42]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      try { 
        bisectionSolver0.verifyBracketing(0, (-375.62856857931), quinticFunction0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, -375.629]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      // Undeclared exception!
      try { 
        laguerreSolver0.verifyBracketing(6.283185307179586, 1214.58, (UnivariateRealFunction) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
      // Undeclared exception!
      try { 
        newtonSolver0.isBracketing((-536.693), 0.0, (UnivariateRealFunction) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      try { 
        mullerSolver0.checkResultComputed();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no result available
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      riddersSolver0.verifySequence((-1678.722109642804), 4.0, 1344.048139);
      assertEquals(1.0E-15, riddersSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      boolean boolean0 = mullerSolver0.isSequence((-3019.654248089523), 0.0, 0);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      // Undeclared exception!
      try { 
        riddersSolver0.verifySequence(0.0, (-1407.19), (-2011.7860674486817));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid interval, initial value parameters:  lower=0, initial=-1,407.19, upper=-2,011.786
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      try { 
        riddersSolver0.solve((UnivariateRealFunction) expm1Function0, (-1.0), 735.5);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.RiddersSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      try { 
        laguerreSolver0.solve((UnivariateRealFunction) quinticFunction0, (-1182.0702165136), (-935.720366205995), (-1182.0702165136));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs.  Endpoints: [-1,182.07, -935.72], Values: [-2,307,894,681,512,438, -717,347,832,767,411.9]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      boolean boolean0 = newtonSolver0.isBracketing(4511.686426, 0.0, quinticFunction0);
      assertEquals(1.0E-15, newtonSolver0.getFunctionValueAccuracy(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      brentSolver0.verifyBracketing((-628.1209881679913), 1256.423, sinFunction0);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      boolean boolean0 = laguerreSolver0.isBracketing(1.0, 0.0, quinticFunction0);
      assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      laguerreSolver0.setResult((-862.165), 1);
      double double0 = laguerreSolver0.getResult();
      assertEquals(1, laguerreSolver0.getIterationCount());
      assertEquals((-862.165), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      // Undeclared exception!
      try { 
        riddersSolver0.getFunctionValue();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no result available
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      riddersSolver0.setResult((-1678.722109642804), (-1678.722109642804), (-266));
      double double0 = riddersSolver0.getFunctionValue();
      assertEquals(-266, riddersSolver0.getIterationCount());
      assertEquals((-1678.722109642804), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      mullerSolver0.setFunctionValueAccuracy(0.0);
      double double0 = mullerSolver0.getFunctionValueAccuracy();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      try { 
        bisectionSolver0.getResult();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no result available
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      double double0 = mullerSolver0.getFunctionValueAccuracy();
      assertEquals(1.0E-15, double0, 0.01);
  }
}
