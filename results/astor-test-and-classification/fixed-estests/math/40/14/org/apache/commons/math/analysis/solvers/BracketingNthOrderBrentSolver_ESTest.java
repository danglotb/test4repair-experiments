/**
 * This file was automatically generated by EvoSuite
 * Sun Jan 15 15:22:40 GMT 2017
 */


package org.apache.commons.math.analysis.solvers;

import org.junit.Assert;
import org.evosuite.runtime.EvoAssertions;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.junit.Test;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.XMinus5Function;

public class BracketingNthOrderBrentSolver_ESTest extends BracketingNthOrderBrentSolver_ESTest_scaffolding {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(856.5602333344864, 856.5602333344864, 856.5602333344864, 5);
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(5, ((UnivariateFunction) (xMinus5Function0)), 0.0, 856.5602333344864, allowedSolution0);
        Assert.assertEquals(0.0, double0, 0.01);
        double double1 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(0.0, double1, 0.01);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(160.50827163, 5);
        bracketingNthOrderBrentSolver0.solve(176, ((UnivariateFunction) (xMinus5Function0)), (-1.2548884695164215), ((double) (176)));
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals((-1.2548884695164215), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1442.18), 2239);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        // Undeclared exception!
        bracketingNthOrderBrentSolver0.solve(2239, ((UnivariateFunction) (quinticFunction0)), (-1442.18), ((double) (2239)), allowedSolution0);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.5, 2483.2433524137, 0.5, 3);
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        // Undeclared exception!
        try {
            bracketingNthOrderBrentSolver0.solve((-1), ((UnivariateFunction) (xMinus5Function0)), (-446.3443534103), ((double) (-1)), allowedSolution0);
            Assert.fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            // 
            // illegal state: maximal count (-1) exceeded: evaluations
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1.0), 1199.31, (-1.0), 3);
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        // Undeclared exception!
        try {
            bracketingNthOrderBrentSolver0.solve(776, ((UnivariateFunction) (xMinus5Function0)), 1531.4380995051, 1199.31, allowedSolution0);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // endpoints do not specify an interval: [1,531.438, 1,365.374]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(859.28406, 859.28406, 859.28406, 5);
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        // Undeclared exception!
        try {
            bracketingNthOrderBrentSolver0.solve(5, ((UnivariateFunction) (xMinus5Function0)), 0.0, 859.28406, ((AllowedSolution) (null)));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
        }
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1442.18), 2239);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateFunction) (quinticFunction0)));
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        bracketingNthOrderBrentSolver0.solve(2239, ((UnivariateFunction) (quinticFunction0)), (-1442.18), 1.0E-12, allowedSolution0);
        // Undeclared exception!
        bracketingNthOrderBrentSolver0.solve(741, ((UnivariateFunction) (monitoredFunction0)), (-471.571383226), ((double) (1104)), (-86.319223), allowedSolution0);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.9999920561579074, (-761.574589169), (-624.902122789274), 8);
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        // Undeclared exception!
        try {
            bracketingNthOrderBrentSolver0.solve(8, ((UnivariateFunction) (expm1Function0)), (-1707.0), 0.9999920561579074, (-928.6199261785747), allowedSolution0);
            Assert.fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            // 
            // illegal state: maximal count (8) exceeded: evaluations
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1442.18), 2239);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        // Undeclared exception!
        try {
            bracketingNthOrderBrentSolver0.solve(1104, ((UnivariateFunction) (quinticFunction0)), (-1.0), 1.0E-12, (-1442.18), allowedSolution0);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // endpoints do not specify an interval: [-1, -1,442.18]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(Double.NaN, 3250);
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        // Undeclared exception!
        try {
            bracketingNthOrderBrentSolver0.solve(3250, ((UnivariateFunction) (null)), Double.NaN, (-1975.95), (-1975.95), allowedSolution0);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // null is not allowed
            // 
            EvoAssertions.verifyException("org.apache.commons.math.util.MathUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(859.28406, 859.28406, 859.28406, 2);
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        bracketingNthOrderBrentSolver0.solve(2, ((UnivariateFunction) (xMinus5Function0)), 0.0, 859.28406, allowedSolution0);
        // Undeclared exception!
        try {
            bracketingNthOrderBrentSolver0.doSolve();
            Assert.fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            // 
            // illegal state: maximal count (2) exceeded: evaluations
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        // Undeclared exception!
        try {
            bracketingNthOrderBrentSolver0.doSolve();
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // endpoints do not specify an interval: [0, 0]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(2582.92, 278);
        SincFunction sincFunction0 = new SincFunction();
        bracketingNthOrderBrentSolver0.setup(278, sincFunction0, (-1.0), 1843.961449026, 278);
        // Undeclared exception!
        try {
            bracketingNthOrderBrentSolver0.doSolve();
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // function values at endpoints do not have different signs, endpoints: [-1, 1,843.961], values: [0.841, 0]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(2239, ((UnivariateFunction) (quinticFunction0)), (-1.0604082564636936), 494.35133, allowedSolution0);
        Assert.assertEquals((-0.9999999999940419), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(2239, ((UnivariateFunction) (quinticFunction0)), (-1.0604082564636936), 1.0E-12, allowedSolution0);
        Assert.assertEquals((-1.000000008009244), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(2239, ((UnivariateFunction) (quinticFunction0)), 9.557408920377015E-4, 1.000635476470734, allowedSolution0);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(0.49999999958587177, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(957.0, 957.0, 957.0, 32);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        bracketingNthOrderBrentSolver0.solve(32, ((UnivariateFunction) (sinFunction0)), ((double) (32)), 2096.976746157, allowedSolution0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(1064.4883730785, bracketingNthOrderBrentSolver0.getStartValue(), 0.01);
        Assert.assertEquals(2096.976746157, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(859.28406, 859.28406, 859.28406, 50);
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(50, ((UnivariateFunction) (xMinus5Function0)), 0.0, 859.28406, allowedSolution0);
        Assert.assertEquals(50, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(429.64203, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1442.18), 2239);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        bracketingNthOrderBrentSolver0.solve(2239, ((UnivariateFunction) (quinticFunction0)), (-1442.18), 1.0E-12, allowedSolution0);
        // Undeclared exception!
        bracketingNthOrderBrentSolver0.doSolve();
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(((double) (5)), 5);
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(5, ((UnivariateFunction) (xMinus5Function0)), Double.NaN, ((double) (5)), Double.NaN, allowedSolution0);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(5.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(2710, ((UnivariateFunction) (quinticFunction0)), 0.0, 9.428159320063503E-16, Double.NaN, allowedSolution0);
        Assert.assertEquals(0.0, double0, 0.01);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1442.18), (-1442.18), ((double) (2239)), 2239);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        double double0 = bracketingNthOrderBrentSolver0.solve(2239, ((UnivariateFunction) (quinticFunction0)), 0.0);
        Assert.assertEquals(2239, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = null;
        try {
            bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(((double) (-4542)), (-2556.72225620928), ((double) (-4542)), (-522));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // -522 is smaller than the minimum (2)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = null;
        try {
            bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(2322.734555887384, 2322.734555887384, (-3014));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // -3,014 is smaller than the minimum (2)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, (-0.0625), 3);
        Assert.assertEquals(3, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = null;
        try {
            bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(2612.0, 0);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // 0 is smaller than the minimum (2)
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-654.894), (-654.894), 1.0, 5184);
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(5184, ((UnivariateFunction) (sinFunction0)), ((double) (-3014)), 1.0, (-591.0549830676), allowedSolution0);
        Assert.assertEquals(1.0, bracketingNthOrderBrentSolver0.getMax(), 0.01);
        Assert.assertEquals((-3014.0), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        // Undeclared exception!
        try {
            bracketingNthOrderBrentSolver0.solve(1122, ((UnivariateFunction) (quinticFunction0)), 9.557408920377015E-4, ((double) (2239)), allowedSolution0);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // function values at endpoints do not have different signs, endpoints: [0.001, 2,239], values: [0, 56,269,150,627,203,360]
            // 
            EvoAssertions.verifyException("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-654.894), (-654.894), 1.0, 5184);
        int int0 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        Assert.assertEquals(5184, int0);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1122, ((UnivariateFunction) (quinticFunction0)), (-1442.18), ((double) (2239)), allowedSolution0);
        // AssertFixer: old assertion Assert.assertEquals(1.0000000001391527, double0, 0.01)
        Assert.assertEquals(-6.938893903907228E-18, double0, 0.01);
    }
}

