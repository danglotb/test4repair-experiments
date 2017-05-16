/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 22 05:45:10 GMT 2017
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.XMinus5Function;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.BaseSecantSolver;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(2498, (UnivariateRealFunction) quinticFunction0, 1.0, 1317.37548499, (double) 2498, allowedSolution0);
      assertEquals(2498.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BaseSecantSolver.Method[] baseSecantSolver_MethodArray0 = BaseSecantSolver.Method.values();
      assertNotNull(baseSecantSolver_MethodArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BaseSecantSolver.Method.valueOf("PEGASUS");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1478.0, 0.0);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(1905, (UnivariateRealFunction) sinFunction0, 0.0, 0.0, 0.0, allowedSolution0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-83.377946689), 0.0);
      Expm1Function expm1Function0 = new Expm1Function();
      double double0 = regulaFalsiSolver0.solve(3626, (UnivariateRealFunction) expm1Function0, 0.0, (-83.377946689), (-233.68499269119));
      assertEquals((-83.377946689), regulaFalsiSolver0.getMax(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1477.71097215, 1477.71097215);
      SincFunction sincFunction0 = new SincFunction();
      UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
      regulaFalsiSolver0.setup(855, univariateRealFunction0, 855, 0.0, 0.0);
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1.0), (-1.0), (-1.0));
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      pegasusSolver0.solve(226, (UnivariateRealFunction) xMinus5Function0, (-1.0), (double) 226, (double) 226, allowedSolution0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals(226.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(5.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, 0.0);
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(0, (UnivariateRealFunction) xMinus5Function0, 2216.48472679819, 0.0, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) quinticFunction0);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(3084, (UnivariateRealFunction) monitoredFunction0, (double) 3084, 0.2, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [3,084, 0.2]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(31, (UnivariateRealFunction) sinFunction0, (-1198.0), 1.3287406718783419, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-1,198, 1.329], values: [0.869, 0.971]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 1.0);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(0, (UnivariateRealFunction) quinticFunction0, 1.0, 0.0, 3110.9309, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1.0);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(588, (UnivariateRealFunction) quinticFunction0, (double) 588, (double) 588, 1.0, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [588, 588]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(591, (UnivariateRealFunction) expm1Function0, (double) 591, 857.24, 1010.6828174279705, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [591, 857.24], values: [46,562,769,615,282,860,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000, \u221E]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-3178.584794), (-3178.584794), 410.5);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(128, (UnivariateRealFunction) quinticFunction0, (-3178.584794), 410.5, 410.5);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (128) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      SincFunction sincFunction0 = new SincFunction();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(127, (UnivariateRealFunction) sincFunction0, (double) 127, (double) 127, (double) 127);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [127, 127]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-217.874566670585), 0.0);
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(1776, (UnivariateRealFunction) expm1Function0, 1493.8642, (double) 1776, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [1,493.864, 1,776], values: [\u221E, \u221E]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.5, 0.0);
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.08371849358081818, 3.899981396827485E-6);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) quinticFunction0);
      regulaFalsiSolver0.setup(10, monitoredFunction0, 2135.3367585409196, 10, 2135.3367585409196);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,135.337, 10]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1742.89572294768));
      QuinticFunction quinticFunction0 = new QuinticFunction();
      regulaFalsiSolver0.setup(3, quinticFunction0, 677.746566121, 9.42680393774625E25, (-1107.222779));
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [677.747, 94,268,039,377,462,500,000,000,000], values: [142,999,805,722,172.72, 7,444,274,394,571,208,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(1.329, 1.329);
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(4, univariateRealFunction0, (-1198.0), 1.329, allowedSolution0);
      assertEquals((-598.3355), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-1124.2383727521617), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(2762, (UnivariateRealFunction) sinFunction0, 1.3287406718783419, (double) 31, 1.3287406718783419, allowedSolution0);
      assertEquals(1.3287406718783419, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(21.991148575128555, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(2768.9567595, 1.0);
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(4, (UnivariateRealFunction) sinFunction0, 1.0, 2768.9567595, allowedSolution0);
      assertEquals(1384.97837975, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(1310.7188093891793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(2768.9567595, 1.0);
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      double double0 = pegasusSolver0.solve(24, univariateRealFunction0, (-1198.0), 1.0, allowedSolution0);
      assertEquals(1.0, pegasusSolver0.getMax(), 0.01);
      assertEquals((-624.8574099906533), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(2768.9567595, 1.0);
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      double double0 = pegasusSolver0.solve(4, univariateRealFunction0, 1.0, 1070.942819496, 1070.942819496);
      assertEquals(1070.942819496, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(390.82210187248893, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(1.0, 2768.9567595, 1.0);
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(2762, (UnivariateRealFunction) sinFunction0, 1.0, (double) 4, 397.2119369351686, allowedSolution0);
      assertEquals(397.2119369351686, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(2.579462454848934, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(1.3287406718783419, 1.3287406718783419, 1.3287406718783419);
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      double double0 = pegasusSolver0.solve(4, univariateRealFunction0, (-1198.0), 1.3287406718783419, allowedSolution0);
      assertEquals(1.3287406718783419, pegasusSolver0.getMax(), 0.01);
      assertEquals((-1110.0333797171834), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(1.0, 2768.9567595, 1.0);
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(4, (UnivariateRealFunction) sinFunction0, 1.0, 2768.9567595, allowedSolution0);
      assertEquals(1.0, pegasusSolver0.getMin(), 0.01);
      assertEquals(1310.7188093891793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(1.0, 2768.9567595, 1.0);
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(4, (UnivariateRealFunction) sinFunction0, 1.0, 2768.9567595, allowedSolution0);
      assertEquals(1.0, pegasusSolver0.getMin(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(1.3287406718783419, 1.3287406718783419, 1.3287406718783419);
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(2762, (UnivariateRealFunction) sinFunction0, 1.3287406718783419, (double) 4, 1.3287406718783419, allowedSolution0);
      assertEquals(1.3287406718783419, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(4.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(1.0, 2768.9567595, 1.0);
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      double double0 = pegasusSolver0.solve(4, univariateRealFunction0, (-1198.0), 1.0, allowedSolution0);
      assertEquals((-1198.0), pegasusSolver0.getMin(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(1.0, 2768.9567595, 1.0);
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      double double0 = pegasusSolver0.solve(4, univariateRealFunction0, (-1198.0), 1.0, allowedSolution0);
      assertEquals(1.0, pegasusSolver0.getMax(), 0.01);
      assertEquals((-624.8574099906533), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      SincFunction sincFunction0 = new SincFunction();
      double double0 = regulaFalsiSolver0.solve(127, (UnivariateRealFunction) sincFunction0, (-275.7219), (double) 127, (-275.7219));
      assertEquals(127.0, regulaFalsiSolver0.getMax(), 0.01);
      assertEquals((-235.61944901923448), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(89, univariateRealFunction0, (-1100.265943532), 1.5874010519681994, allowedSolution0);
      assertEquals((-1100.265943532), regulaFalsiSolver0.getMin(), 0.01);
      assertEquals((-331.4380259537232), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-16.92370936017687), (-16.92370936017687), (-16.92370936017687));
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(2762, (UnivariateRealFunction) sinFunction0, (-16.92370936017687), (double) 4, 374.5867532087565, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (2,762) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      regulaFalsiSolver0.solve(3846, univariateRealFunction0, 1.0, (-781.0), 1.0E-6, allowedSolution0);
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals(1.0E-6, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-781.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1477.71097215, 1477.71097215);
      SincFunction sincFunction0 = new SincFunction();
      UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      regulaFalsiSolver0.solve(855, univariateRealFunction0, 0.0, 0.0, allowedSolution0);
      assertEquals(0.0, regulaFalsiSolver0.getStartValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      regulaFalsiSolver0.solve(3846, (UnivariateRealFunction) expm1Function0, (-4.4094866234946765E-14), 0.3956831015156119, allowedSolution0);
  }
}