/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 15 19:42:40 GMT 2017
 */

package org.apache.commons.math;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.integration.RombergIntegrator;
import org.apache.commons.math.analysis.integration.SimpsonIntegrator;
import org.apache.commons.math.analysis.integration.TrapezoidIntegrator;
import org.apache.commons.math.analysis.solvers.LaguerreSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConvergingAlgorithmImpl_ESTest extends ConvergingAlgorithmImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RombergIntegrator rombergIntegrator0 = new RombergIntegrator();
      rombergIntegrator0.setMaximalIterationCount((-47));
      assertEquals(-47, rombergIntegrator0.getMaximalIterationCount());
      
      rombergIntegrator0.resetMaximalIterationCount();
      assertEquals(32, rombergIntegrator0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      laguerreSolver0.setAbsoluteAccuracy(26.66757200649051);
      assertEquals(26.66757200649051, laguerreSolver0.getAbsoluteAccuracy(), 0.01);
      
      laguerreSolver0.resetAbsoluteAccuracy();
      assertEquals(100, laguerreSolver0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      laguerreSolver0.setMaximalIterationCount(0);
      assertEquals(0, laguerreSolver0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RombergIntegrator rombergIntegrator0 = new RombergIntegrator();
      rombergIntegrator0.resetRelativeAccuracy();
      assertEquals(1.0E-14, rombergIntegrator0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      laguerreSolver0.resetMaximalIterationCount();
      assertEquals(100, laguerreSolver0.getMaximalIterationCount());
      assertEquals(0, laguerreSolver0.getIterationCount());
      assertEquals(1.0E-14, laguerreSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TrapezoidIntegrator trapezoidIntegrator0 = new TrapezoidIntegrator();
      trapezoidIntegrator0.setRelativeAccuracy((-3111.07068969102));
      double double0 = trapezoidIntegrator0.getRelativeAccuracy();
      assertEquals((-3111.07068969102), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RombergIntegrator rombergIntegrator0 = new RombergIntegrator();
      assertEquals(32, rombergIntegrator0.getMaximalIterationCount());
      
      rombergIntegrator0.setMaximalIterationCount(0);
      int int0 = rombergIntegrator0.getMaximalIterationCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpsonIntegrator simpsonIntegrator0 = new SimpsonIntegrator();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      simpsonIntegrator0.integrate((UnivariateRealFunction) quinticFunction0, (-1.0), 0.25);
      int int0 = simpsonIntegrator0.getIterationCount();
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      laguerreSolver0.setAbsoluteAccuracy((-1.0));
      double double0 = laguerreSolver0.getAbsoluteAccuracy();
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpsonIntegrator simpsonIntegrator0 = new SimpsonIntegrator();
      simpsonIntegrator0.setRelativeAccuracy(0.0);
      simpsonIntegrator0.getRelativeAccuracy();
      assertEquals(64, simpsonIntegrator0.getMaximalIterationCount());
      assertEquals(0, simpsonIntegrator0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpsonIntegrator simpsonIntegrator0 = new SimpsonIntegrator();
      simpsonIntegrator0.getRelativeAccuracy();
      assertEquals(0, simpsonIntegrator0.getIterationCount());
      assertEquals(64, simpsonIntegrator0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      laguerreSolver0.setAbsoluteAccuracy(0.0);
      laguerreSolver0.getAbsoluteAccuracy();
      assertEquals(100, laguerreSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, laguerreSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(0, laguerreSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RombergIntegrator rombergIntegrator0 = new RombergIntegrator();
      rombergIntegrator0.setMaximalIterationCount((-47));
      int int0 = rombergIntegrator0.getMaximalIterationCount();
      assertEquals((-47), int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpsonIntegrator simpsonIntegrator0 = new SimpsonIntegrator();
      int int0 = simpsonIntegrator0.getIterationCount();
      assertEquals(64, simpsonIntegrator0.getMaximalIterationCount());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      laguerreSolver0.getAbsoluteAccuracy();
      assertEquals(1.0E-14, laguerreSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(0, laguerreSolver0.getIterationCount());
      assertEquals(100, laguerreSolver0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RombergIntegrator rombergIntegrator0 = new RombergIntegrator();
      int int0 = rombergIntegrator0.getMaximalIterationCount();
      assertEquals(0, rombergIntegrator0.getIterationCount());
      assertEquals(32, int0);
  }
}