/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 28 12:46:38 GMT 2017
 */

package org.apache.commons.math;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.integration.RombergIntegrator;
import org.apache.commons.math.analysis.integration.TrapezoidIntegrator;
import org.apache.commons.math.analysis.solvers.BrentSolver;
import org.apache.commons.math.analysis.solvers.LaguerreSolver;
import org.apache.commons.math.analysis.solvers.MullerSolver;
import org.apache.commons.math.analysis.solvers.SecantSolver;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.univariate.BrentOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConvergingAlgorithmImpl_ESTest extends ConvergingAlgorithmImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RombergIntegrator rombergIntegrator0 = new RombergIntegrator();
      rombergIntegrator0.resetRelativeAccuracy();
      assertEquals(1.0E-14, rombergIntegrator0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RombergIntegrator rombergIntegrator0 = new RombergIntegrator();
      rombergIntegrator0.setMaximalIterationCount(0);
      assertEquals(0, rombergIntegrator0.getMaximalIterationCount());
      
      rombergIntegrator0.resetMaximalIterationCount();
      assertEquals(32, rombergIntegrator0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TrapezoidIntegrator trapezoidIntegrator0 = new TrapezoidIntegrator();
      trapezoidIntegrator0.setAbsoluteAccuracy((-1977.68));
      assertEquals((-1977.68), trapezoidIntegrator0.getAbsoluteAccuracy(), 0.01);
      
      trapezoidIntegrator0.resetAbsoluteAccuracy();
      assertEquals(1.0E-15, trapezoidIntegrator0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      mullerSolver0.setRelativeAccuracy((-1.0));
      assertEquals((-1.0), mullerSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      brentSolver0.setMaximalIterationCount(0);
      assertEquals(0, brentSolver0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      brentOptimizer0.setAbsoluteAccuracy(0.0);
      assertEquals(0, brentOptimizer0.getIterationCount());
      assertEquals(1.0E-14, brentOptimizer0.getRelativeAccuracy(), 0.01);
      assertEquals(100, brentOptimizer0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      brentOptimizer0.resetRelativeAccuracy();
      assertEquals(0, brentOptimizer0.getIterationCount());
      assertEquals(1.0E-14, brentOptimizer0.getRelativeAccuracy(), 0.01);
      assertEquals(100, brentOptimizer0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      mullerSolver0.resetMaximalIterationCount();
      assertEquals(0, mullerSolver0.getIterationCount());
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      laguerreSolver0.resetAbsoluteAccuracy();
      assertEquals(1.0E-14, laguerreSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(100, laguerreSolver0.getMaximalIterationCount());
      assertEquals(0, laguerreSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      brentSolver0.setRelativeAccuracy((-1185.0));
      double double0 = brentSolver0.getRelativeAccuracy();
      assertEquals((-1185.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RombergIntegrator rombergIntegrator0 = new RombergIntegrator();
      assertEquals(32, rombergIntegrator0.getMaximalIterationCount());
      
      rombergIntegrator0.setMaximalIterationCount(0);
      int int0 = rombergIntegrator0.getMaximalIterationCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      GoalType goalType0 = GoalType.MAXIMIZE;
      brentOptimizer0.optimize((UnivariateRealFunction) quinticFunction0, goalType0, (-1986.266343), 2.0, 0.0);
      int int0 = brentOptimizer0.getIterationCount();
      assertEquals(62, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver();
      secantSolver0.setAbsoluteAccuracy((-61.07204788));
      double double0 = secantSolver0.getAbsoluteAccuracy();
      assertEquals((-61.07204788), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01);
      
      brentSolver0.setRelativeAccuracy(0.0);
      brentSolver0.getRelativeAccuracy();
      assertEquals(100, brentSolver0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      double double0 = brentSolver0.getRelativeAccuracy();
      assertEquals(1.0E-14, double0, 0.01);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(0, brentSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      brentOptimizer0.setAbsoluteAccuracy(0.0);
      brentOptimizer0.getAbsoluteAccuracy();
      assertEquals(1.0E-14, brentOptimizer0.getRelativeAccuracy(), 0.01);
      assertEquals(100, brentOptimizer0.getMaximalIterationCount());
      assertEquals(0, brentOptimizer0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      brentSolver0.setMaximalIterationCount((-432));
      int int0 = brentSolver0.getMaximalIterationCount();
      assertEquals((-432), int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      int int0 = brentOptimizer0.getIterationCount();
      assertEquals(0, int0);
      assertEquals(1.0E-14, brentOptimizer0.getRelativeAccuracy(), 0.01);
      assertEquals(100, brentOptimizer0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      brentOptimizer0.getAbsoluteAccuracy();
      assertEquals(1.0E-14, brentOptimizer0.getRelativeAccuracy(), 0.01);
      assertEquals(100, brentOptimizer0.getMaximalIterationCount());
      assertEquals(0, brentOptimizer0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      int int0 = brentSolver0.getMaximalIterationCount();
      assertEquals(100, int0);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(0, brentSolver0.getIterationCount());
  }
}
