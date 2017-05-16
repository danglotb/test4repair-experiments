/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 18 22:59:05 GMT 2017
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.DifferentiableUnivariateFunction;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.XMinus5Function;
import org.apache.commons.math.analysis.solvers.BisectionSolver;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math.analysis.solvers.MullerSolver;
import org.apache.commons.math.analysis.solvers.MullerSolver2;
import org.apache.commons.math.analysis.solvers.NewtonSolver;
import org.apache.commons.math.analysis.solvers.SecantSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      mullerSolver0.verifySequence(0.0, 1.0E-14, 4.940883275207154E117);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
      SincFunction sincFunction0 = new SincFunction();
      newtonSolver0.solve(490, (DifferentiableUnivariateFunction) sincFunction0, 6220.06101284228, 6220.06101284228);
      newtonSolver0.incrementEvaluationCount();
      assertEquals(6220.06101284228, newtonSolver0.getStartValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver(117.8040209368, 0.0);
      boolean boolean0 = mullerSolver0.isSequence((-1.0), 0.0, 9.760860120877624E-4);
      assertTrue(boolean0);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(0.0, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(117.8040209368, mullerSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(1.0, 1.0, 111);
      bracketingNthOrderBrentSolver0.isSequence(111, 111, 1.0);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      bisectionSolver0.setup(1341, quinticFunction0, (-1223.527097362), 0.0, 1121.635849587);
      boolean boolean0 = bisectionSolver0.isBracketing(1744.47835, (-1560.4317178477197));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver((-529.9534921));
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      newtonSolver0.setup((-90), xMinus5Function0, 0.0, (-90), 1524);
      boolean boolean0 = newtonSolver0.isBracketing(1524, 1524);
      assertEquals((-90.0), newtonSolver0.getMax(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver(0.0);
      SinFunction sinFunction0 = new SinFunction();
      newtonSolver0.solve(409, (DifferentiableUnivariateFunction) sinFunction0, 0.0);
      newtonSolver0.computeObjectiveValue(0.0);
      assertEquals(Double.NaN, newtonSolver0.getMin(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver(0.0, 0.0);
      SincFunction sincFunction0 = new SincFunction();
      mullerSolver0.solve(1219, (UnivariateFunction) sincFunction0, (-3039.928), (-1315.531729964));
      mullerSolver0.computeObjectiveValue(0.5);
      assertEquals((-1315.531729964), mullerSolver0.getMax(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
      // Undeclared exception!
      try { 
        newtonSolver0.verifySequence(2183.7146042, 2183.7146042, (-1827.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,183.715, 2,183.715]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MullerSolver2 mullerSolver2_0 = new MullerSolver2();
      // Undeclared exception!
      try { 
        mullerSolver2_0.verifyInterval(2118.97, 1052.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,118.97, 1,052]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      bracketingNthOrderBrentSolver0.setup((-4177), sinFunction0, (-4177), (-1425.2701867788), (-1425.2701867788));
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.verifyBracketing(0.0, (-1425.2701867788));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, -1,425.27]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver();
      // Undeclared exception!
      try { 
        secantSolver0.verifyBracketing((-1155.88), (-1155.88));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MullerSolver2 mullerSolver2_0 = new MullerSolver2((-3902.104742973));
      // Undeclared exception!
      try { 
        mullerSolver2_0.setup(0, (UnivariateFunction) null, 1208.496346873892, 1.0E-14, 1.0E-14);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver((-1.0));
      // Undeclared exception!
      try { 
        newtonSolver0.isBracketing(0.0, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.incrementEvaluationCount();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver(1.0E-15, 0.0);
      try { 
        bisectionSolver0.computeObjectiveValue(0.0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MullerSolver2 mullerSolver2_0 = new MullerSolver2((-1213.89));
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      try { 
        mullerSolver2_0.solve(301, (UnivariateFunction) sinFunction0, (double) 301, (-434.14831), (-434.14831));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [301, -434.148]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver(0.0, 0.0);
      int int0 = mullerSolver0.getMaxEvaluations();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
      newtonSolver0.verifyInterval((-458.12613673835), 6220.06101284228);
      assertEquals(1.0E-6, newtonSolver0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MullerSolver2 mullerSolver2_0 = new MullerSolver2(0.0, 0.0);
      int int0 = mullerSolver2_0.getEvaluations();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver(0.0, 0.0);
      SincFunction sincFunction0 = new SincFunction();
      mullerSolver0.solve(1219, (UnivariateFunction) sincFunction0, (-3039.928), (-1315.531729964));
      mullerSolver0.computeObjectiveValue(1.8995553996578656E216);
      assertEquals((-2177.729864982), mullerSolver0.getStartValue(), 0.01);
  }
}