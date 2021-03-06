/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 13 23:44:37 GMT 2017
 */

package org.apache.commons.math.ode.events;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.events.EventHandler;
import org.apache.commons.math.ode.events.EventState;
import org.apache.commons.math.ode.nonstiff.StepProblem;
import org.apache.commons.math.ode.sampling.StepInterpolator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EventState_ESTest extends EventState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, 0);
      double[] doubleArray0 = new double[22];
      eventState0.stepAccepted(0.0, doubleArray0);
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(0, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, 0);
      double[] doubleArray0 = new double[22];
      eventState0.reinitializeBegin(0, doubleArray0);
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(0, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, 0);
      int int0 = eventState0.getMaxIterationCount();
      assertFalse(eventState0.stop());
      assertEquals(0, int0);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, 839.400698138091, 839.400698138091, (-2286));
      int int0 = eventState0.getMaxIterationCount();
      assertFalse(eventState0.stop());
      assertEquals((-2286), int0);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(839.400698138091, eventState0.getMaxCheckInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-527.0375), 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 2.718281828459045, 0);
      double double0 = eventState0.getMaxCheckInterval();
      assertEquals(0, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(2.718281828459045, eventState0.getConvergence(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-1.7041184746027225), (-1.7041184746027225), (-1.7041184746027225));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-1.7041184746027225), (-1.7041184746027225), 43);
      double double0 = eventState0.getMaxCheckInterval();
      assertEquals(43, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals((-1.7041184746027225), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(3.741657386774, 3.741657386774, 3.741657386774);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 3.741657386774, 3.741657386774, (-2587));
      eventState0.getEventHandler();
      assertEquals(-2587, eventState0.getMaxIterationCount());
      assertEquals(3.741657386774, eventState0.getMaxCheckInterval(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, 0);
      eventState0.getConvergence();
      assertEquals(0, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, 839.400698138091, 839.400698138091, (-866));
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        eventState0.stepAccepted((-2645.0), doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.events.EventState", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, (-410.154985205), (-1.0), 0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        eventState0.reinitializeBegin(0.0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.events.EventState", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, 0);
      // Undeclared exception!
      try { 
        eventState0.evaluateStep((StepInterpolator) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.events.EventState", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, 0);
      double[] doubleArray0 = new double[22];
      boolean boolean0 = eventState0.reset(0.0, doubleArray0);
      assertEquals(0, eventState0.getMaxIterationCount());
      assertFalse(boolean0);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, (-1522.9892094410836), 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-1522.9892094410836), (-1522.9892094410836), 7);
      boolean boolean0 = eventState0.stop();
      assertEquals((-1522.9892094410836), eventState0.getMaxCheckInterval(), 0.01);
      assertFalse(boolean0);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(7, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, (-1522.9892094410836), 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-1522.9892094410836), (-1522.9892094410836), 7);
      double[] doubleArray0 = new double[9];
      eventState0.stepAccepted((-1522.9892094410836), doubleArray0);
      assertFalse(eventState0.stop());
      assertEquals(7, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals((-1522.9892094410836), eventState0.getMaxCheckInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-1454.88), (-1454.88), (-1454.88));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-1454.88), 2882.25422, 6);
      eventState0.stepAccepted(2882.25422, (double[]) null);
      assertFalse(eventState0.stop());
      assertEquals((-1454.88), eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(2882.25422, eventState0.getConvergence(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(6, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-3383.213836785), (-3383.213836785), (-1252.9475522));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-3383.213836785), (-3383.213836785), 3265);
      double[] doubleArray0 = new double[0];
      eventState0.reinitializeBegin(0.0, doubleArray0);
      assertEquals(3265, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals((-3383.213836785), eventState0.getMaxCheckInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(3.741657386774, 3.741657386774, 3.741657386774);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 3.741657386774, 3.741657386774, (-2587));
      eventState0.reinitializeBegin((-2587), (double[]) null);
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(-2587, eventState0.getMaxIterationCount());
      assertEquals(3.741657386774, eventState0.getMaxCheckInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-3383.213836785), (-3383.213836785), (-1252.9475522));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-3383.213836785), (-3383.213836785), 3265);
      double double0 = eventState0.getConvergence();
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(3383.213836785, double0, 0.01);
      assertEquals((-3383.213836785), eventState0.getMaxCheckInterval(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(3265, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, Double.NaN, (-1875.2038746449), (-7559));
      double double0 = eventState0.getMaxCheckInterval();
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(1875.2038746449, eventState0.getConvergence(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(-7559, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(3.741657386774, 3.741657386774, 3.741657386774);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 3.741657386774, 3.741657386774, (-2587));
      double double0 = eventState0.getEventTime();
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(-2587, eventState0.getMaxIterationCount());
      assertEquals(3.741657386774, eventState0.getMaxCheckInterval(), 0.01);
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(Double.NaN, Double.NaN, (-2690.6672));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, Double.NaN, (-2690.6672), 40);
      int int0 = eventState0.getMaxIterationCount();
      assertEquals(2690.6672, eventState0.getConvergence(), 0.01);
      assertEquals(Double.NaN, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(40, int0);
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, (-971.153953), (-1672.5805429), 0);
      eventState0.getEventHandler();
      assertEquals(0, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(1672.5805429, eventState0.getConvergence(), 0.01);
      assertEquals((-971.153953), eventState0.getMaxCheckInterval(), 0.01);
  }
}
