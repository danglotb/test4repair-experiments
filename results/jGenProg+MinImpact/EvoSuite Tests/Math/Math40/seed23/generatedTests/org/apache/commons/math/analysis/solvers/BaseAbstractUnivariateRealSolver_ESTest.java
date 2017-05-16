/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 25 06:01:19 GMT 2017
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.XMinus5Function;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.BisectionSolver;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math.analysis.solvers.BrentSolver;
import org.apache.commons.math.analysis.solvers.LaguerreSolver;
import org.apache.commons.math.analysis.solvers.MullerSolver;
import org.apache.commons.math.analysis.solvers.MullerSolver2;
import org.apache.commons.math.analysis.solvers.NewtonSolver;
import org.apache.commons.math.analysis.solvers.RiddersSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(0.0, 0.0);
      laguerreSolver0.verifySequence((-1.0), 0.0, 1.014800418749161E33);
      assertEquals(0.0, laguerreSolver0.getStartValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver(0.0);
      newtonSolver0.verifyInterval(0.0, 2447.139);
      assertEquals(1.0E-15, newtonSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver(0.0);
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      newtonSolver0.setup(1280, xMinus5Function0, (-3256.45255), 0.0, (-3878.252687801));
      newtonSolver0.incrementEvaluationCount();
      assertEquals((-3878.252687801), newtonSolver0.getStartValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver(604.150899);
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateFunction) xMinus5Function0);
      riddersSolver0.setup(4432, monitoredFunction0, 0.0, 604.150899, 0.0);
      double double0 = riddersSolver0.doSolve();
      assertEquals(1.0E-15, riddersSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-14, riddersSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(604.150899, riddersSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(5.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      boolean boolean0 = riddersSolver0.isSequence(1.0E-12, 1.0E-12, 0.5);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      newtonSolver0.setup(871, quinticFunction0, 0.0, 0.0, 871);
      boolean boolean0 = newtonSolver0.isBracketing(646.0, 0.0);
      assertEquals(871.0, newtonSolver0.getStartValue(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver((-2136.4));
      QuinticFunction quinticFunction0 = new QuinticFunction();
      bisectionSolver0.setup((-2795), quinticFunction0, (-403.0746), (-2136.4), (-2136.4));
      bisectionSolver0.isBracketing((-1826.060522513), Double.NaN);
      assertEquals((-2136.4), bisectionSolver0.getStartValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      newtonSolver0.setup(871, quinticFunction0, 0.0, 0.0, 871);
      newtonSolver0.computeObjectiveValue(0.0);
      assertEquals(871.0, newtonSolver0.getStartValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(3589.3, 2590);
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      bracketingNthOrderBrentSolver0.solve(2590, (UnivariateFunction) xMinus5Function0, (-1000.1761), (double) 2590, allowedSolution0);
      double double0 = bracketingNthOrderBrentSolver0.computeObjectiveValue(2590);
      assertEquals(794.91195, bracketingNthOrderBrentSolver0.getStartValue(), 0.01);
      assertEquals(2585.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      // Undeclared exception!
      try { 
        riddersSolver0.verifySequence(0.5, (-1437.66106122581), 2.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0.5, -1,437.661]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver(0.0);
      // Undeclared exception!
      try { 
        newtonSolver0.verifyInterval(0.5, 0.5);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0.5, 0.5]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(3589.3, 2590);
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      bracketingNthOrderBrentSolver0.solve(2590, (UnivariateFunction) xMinus5Function0, (-1000.1761), (double) 2590, allowedSolution0);
      // Undeclared exception!
      try { 
        bracketingNthOrderBrentSolver0.verifyBracketing(2585.0, 2585.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,585, 2,585]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(0.0, 0.0);
      // Undeclared exception!
      try { 
        laguerreSolver0.verifyBracketing(0.0, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver(0.0);
      // Undeclared exception!
      try { 
        brentSolver0.setup(590, (UnivariateFunction) null, 1.504112720489502, 0.0, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      try { 
        bisectionSolver0.incrementEvaluationCount();
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
      RiddersSolver riddersSolver0 = new RiddersSolver(0.0);
      try { 
        riddersSolver0.computeObjectiveValue(0.0);
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
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      MullerSolver2 mullerSolver2_0 = new MullerSolver2();
      // Undeclared exception!
      try { 
        mullerSolver2_0.solve((-6), (UnivariateFunction) xMinus5Function0, (double) (-6), 2720.01851151);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-6) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver((-2136.4));
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      try { 
        bisectionSolver0.solve(65, (UnivariateFunction) quinticFunction0, (-3378.910949749146), 1.0E-14, (double) 65);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (65) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
      // Undeclared exception!
      try { 
        newtonSolver0.isBracketing(646.0, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver(0.0);
      boolean boolean0 = mullerSolver0.isSequence((-1560.054166631487), 0.0, 2407.33485);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver(686.7353471245168, 686.7353471245168);
      Expm1Function expm1Function0 = new Expm1Function();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateFunction) expm1Function0);
      // Undeclared exception!
      try { 
        mullerSolver0.solve(266, (UnivariateFunction) monitoredFunction0, 686.7353471245168);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [\uFFFD, \uFFFD], values: [\uFFFD, \uFFFD]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver((-2136.4));
      bisectionSolver0.getMaxEvaluations();
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-14, bisectionSolver0.getRelativeAccuracy(), 0.01);
      assertEquals((-2136.4), bisectionSolver0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
      int int0 = newtonSolver0.getEvaluations();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(3590.153446135359, 462);
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      bracketingNthOrderBrentSolver0.solve(462, (UnivariateFunction) xMinus5Function0, (-1366.3484), (double) 462, allowedSolution0);
      double double0 = bracketingNthOrderBrentSolver0.computeObjectiveValue((-1366.3484));
      assertEquals((-452.17420000000004), bracketingNthOrderBrentSolver0.getStartValue(), 0.01);
      assertEquals((-1371.3484), double0, 0.01);
  }
}