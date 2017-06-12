/**
 * This file was automatically generated by EvoSuite
 * Sun Jan 29 15:34:29 GMT 2017
 */


package org.apache.commons.math.analysis.solvers;

import org.junit.Assert;
import org.evosuite.runtime.EvoAssertions;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.junit.Test;
import org.apache.commons.math.analysis.UnivariateRealFunction;

public class BisectionSolver_ESTest extends BisectionSolver_ESTest_scaffolding {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        BisectionSolver bisectionSolver0 = new BisectionSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        bisectionSolver0.setAbsoluteAccuracy(0.0016384410848786501);
        double double0 = bisectionSolver0.solve(((UnivariateRealFunction) (expm1Function0)), 1.0E-6, 1718.03);
        Assert.assertEquals(19, bisectionSolver0.getIterationCount());
        Assert.assertEquals(1718.0291807794574, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        BisectionSolver bisectionSolver0 = new BisectionSolver();
        bisectionSolver0.setMaximalIterationCount((-1));
        try {
            bisectionSolver0.solve(((UnivariateRealFunction) (sinFunction0)), (-988.22), 0.0);
            Assert.fail("Expecting exception: Exception");
        } catch (Exception e) {
            // 
            // Maximal number of iterations (-1) exceeded
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (quinticFunction0)));
        bisectionSolver0.solve(((UnivariateRealFunction) (quinticFunction0)), 0.0, 2.5E-16, 2.5E-16);
        Assert.assertEquals(0, bisectionSolver0.getIterationCount());
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (sinFunction0)));
        double double0 = bisectionSolver0.solve(((UnivariateRealFunction) (sinFunction0)), (-1675.525294084), 1.0);
        Assert.assertEquals(30, bisectionSolver0.getIterationCount());
        Assert.assertEquals((-870.2211654007663), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (quinticFunction0)));
        double double0 = bisectionSolver0.solve((-1187.9), 417.4410073218452, 2.5E-16);
        Assert.assertEquals(30, bisectionSolver0.getIterationCount());
        Assert.assertEquals(4.8473204673875046E-8, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateRealFunction) (sinFunction0)));
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (monitoredFunction0)));
        double double0 = bisectionSolver0.solve((-3101.5972), 1.0);
        Assert.assertEquals(31, bisectionSolver0.getIterationCount());
        Assert.assertEquals((-1335.1768778737724), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        BisectionSolver bisectionSolver0 = new BisectionSolver();
        // Undeclared exception!
        try {
            bisectionSolver0.solve(((UnivariateRealFunction) (null)), (-1307.3246939969788), (-1307.3246939969788), (-1307.3246939969788));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // endpoints do not specify an interval: [-1,307.325, -1,307.325]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (expm1Function0)));
        bisectionSolver0.setMaximalIterationCount(0);
        try {
            bisectionSolver0.solve(((UnivariateRealFunction) (expm1Function0)), 0.0, 1.0E-15, 3040.3998018);
            Assert.fail("Expecting exception: Exception");
        } catch (Exception e) {
            // 
            // Maximal number of iterations (0) exceeded
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (sinFunction0)));
        // Undeclared exception!
        try {
            bisectionSolver0.solve(((UnivariateRealFunction) (sinFunction0)), 8.125E-15, 0.0);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // endpoints do not specify an interval: [0, 0]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        BisectionSolver bisectionSolver0 = new BisectionSolver();
        // Undeclared exception!
        try {
            bisectionSolver0.solve(((UnivariateRealFunction) (null)), (-1.0), 1.0);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        BisectionSolver bisectionSolver0 = new BisectionSolver();
        // Undeclared exception!
        try {
            bisectionSolver0.solve(3.75, 3.75, 3.75);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // endpoints do not specify an interval: [3.75, 3.75]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        BisectionSolver bisectionSolver0 = new BisectionSolver();
        bisectionSolver0.setMaximalIterationCount(0);
        try {
            bisectionSolver0.solve((-992.4022676099761), ((double) (0)), (-992.4022676099761));
            Assert.fail("Expecting exception: Exception");
        } catch (Exception e) {
            // 
            // Maximal number of iterations (0) exceeded
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        BisectionSolver bisectionSolver0 = new BisectionSolver();
        // Undeclared exception!
        try {
            bisectionSolver0.solve(0.0, 1.0, (-3034.663037133995));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (quinticFunction0)));
        // Undeclared exception!
        try {
            bisectionSolver0.solve(2.5E-16, (-651.594));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // endpoints do not specify an interval: [0, -651.594]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (sinFunction0)));
        bisectionSolver0.setMaximalIterationCount(2);
        try {
            bisectionSolver0.solve(2172.2155755, 2446.0);
            Assert.fail("Expecting exception: Exception");
        } catch (Exception e) {
            // 
            // Maximal number of iterations (2) exceeded
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        BisectionSolver bisectionSolver0 = new BisectionSolver();
        // Undeclared exception!
        try {
            bisectionSolver0.solve((-1171.0), (-857.7352348083875));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BisectionSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        BisectionSolver bisectionSolver0 = null;
        try {
            bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (null)));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // function to solve cannot be null
            // 
            EvoAssertions.verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (sinFunction0)));
        double double0 = bisectionSolver0.solve(((UnivariateRealFunction) (sinFunction0)), (-1776.39), 0.0, (-1776.39));
        Assert.assertEquals(30, bisectionSolver0.getIterationCount());
        Assert.assertEquals((-1699.6016256295488), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (expm1Function0)));
        double double0 = bisectionSolver0.solve((-1.0), 0.0, 0.0);
        Assert.assertEquals(19, bisectionSolver0.getIterationCount());
        Assert.assertEquals((-4.76837158203125E-7), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        BisectionSolver bisectionSolver0 = new BisectionSolver(((UnivariateRealFunction) (sinFunction0)));
        double double0 = bisectionSolver0.solve(2172.2155755, 2446.0);
        Assert.assertEquals(28, bisectionSolver0.getIterationCount());
        Assert.assertEquals(2362.477675727343, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        BisectionSolver bisectionSolver0 = new BisectionSolver();
        QuinticFunction quinticFunction0 = new QuinticFunction();
        {
            bisectionSolver0.solve(((UnivariateRealFunction) (quinticFunction0)), 0.0, 1444.189132417, 1444.189132417);
        }
    }
}

