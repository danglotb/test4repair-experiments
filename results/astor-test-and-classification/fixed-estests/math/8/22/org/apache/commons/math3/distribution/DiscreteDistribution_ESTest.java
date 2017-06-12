/**
 * This file was automatically generated by EvoSuite
 * Sat Jan 21 18:49:27 GMT 2017
 */


package org.apache.commons.math3.distribution;

import org.apache.commons.math3.random.ISAACRandom;
import org.junit.Assert;
import org.evosuite.runtime.EvoAssertions;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.math3.util.Pair;
import org.apache.commons.math3.random.RandomGenerator;
import org.junit.Test;
import org.apache.commons.math3.random.Well1024a;
import org.apache.commons.math3.random.Well44497b;
import org.apache.commons.math3.random.Well512a;

public class DiscreteDistribution_ESTest extends DiscreteDistribution_ESTest_scaffolding {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
        Byte byte0 = new Byte(((byte) (61)));
        Double double0 = new Double(((double) ((byte) (61))));
        Pair<Byte, Double> pair0 = new Pair<Byte, Double>(byte0, double0);
        Pair<Object, Double> pair1 = new Pair<Object, Double>(pair0);
        linkedList0.add(pair1);
        DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>(((List<Pair<Object, Double>>) (linkedList0)));
        try {
            discreteDistribution0.sample((-104));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // number of samples (-104)
            // 
            EvoAssertions.verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
        }
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
        Double double0 = new Double(1971.889);
        Pair<Integer, Double> pair0 = new Pair<Integer, Double>(((Integer) (null)), double0);
        Pair<Object, Double> pair1 = new Pair<Object, Double>(pair0);
        linkedList0.add(pair1);
        DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>(((List<Pair<Object, Double>>) (linkedList0)));
        Object object0 = discreteDistribution0.sample();
        Assert.assertNull(object0);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        Well1024a well1024a0 = new Well1024a();
        LinkedList<Pair<Double, Double>> linkedList0 = new LinkedList<Pair<Double, Double>>();
        Double double0 = Double.valueOf(((double) (3359)));
        Pair<Double, Double> pair0 = new Pair<Double, Double>(double0, double0);
        linkedList0.add(pair0);
        linkedList0.add(pair0);
        DiscreteDistribution<Double> discreteDistribution0 = new DiscreteDistribution<Double>(((RandomGenerator) (well1024a0)), ((List<Pair<Double, Double>>) (linkedList0)));
        discreteDistribution0.sample(3359);
        // Undeclared exception!
        discreteDistribution0.sample(3359);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        LinkedList<Pair<Float, Double>> linkedList0 = new LinkedList<Pair<Float, Double>>();
        Float float0 = new Float(9.775199F);
        Double double0 = new Double(((double) (9.775199F)));
        Pair<Float, Double> pair0 = new Pair<Float, Double>(float0, double0);
        linkedList0.add(pair0);
        DiscreteDistribution<Float> discreteDistribution0 = new DiscreteDistribution<Float>(((RandomGenerator) (null)), ((List<Pair<Float, Double>>) (linkedList0)));
        // Undeclared exception!
        try {
            discreteDistribution0.sample();
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
        }
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        ISAACRandom iSAACRandom0 = new ISAACRandom(4499201580859392L);
        LinkedList<Pair<Long, Double>> linkedList0 = new LinkedList<Pair<Long, Double>>();
        DiscreteDistribution<Long> discreteDistribution0 = null;
        try {
            discreteDistribution0 = new DiscreteDistribution<Long>(((RandomGenerator) (iSAACRandom0)), ((List<Pair<Long, Double>>) (linkedList0)));
            Assert.fail("Expecting exception: ArithmeticException");
        } catch (ArithmeticException e) {
            // 
            // array sums to zero
            // 
            EvoAssertions.verifyException("org.apache.commons.math3.util.MathArrays", e);
        }
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        Well512a well512a0 = new Well512a(0);
        DiscreteDistribution<Float> discreteDistribution0 = null;
        try {
            discreteDistribution0 = new DiscreteDistribution<Float>(((RandomGenerator) (well512a0)), ((List<Pair<Float, Double>>) (null)));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
            EvoAssertions.verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
        }
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        DiscreteDistribution<Float> discreteDistribution0 = null;
        try {
            discreteDistribution0 = new DiscreteDistribution<Float>(((List<Pair<Float, Double>>) (null)));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            // 
            // no message in exception (getMessage() returned null)
            // 
            EvoAssertions.verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
        }
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
        Integer integer0 = new Integer(((int) ((short) (-2693))));
        Double double0 = new Double(((double) ((short) (-2693))));
        Pair<Integer, Double> pair0 = new Pair<Integer, Double>(integer0, double0);
        Pair<Object, Double> pair1 = new Pair<Object, Double>(pair0);
        linkedList0.add(pair1);
        DiscreteDistribution<Object> discreteDistribution0 = null;
        try {
            discreteDistribution0 = new DiscreteDistribution<Object>(((RandomGenerator) (null)), ((List<Pair<Object, Double>>) (linkedList0)));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // -2,693 is smaller than the minimum (0)
            // 
            EvoAssertions.verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
        }
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
        Byte byte0 = new Byte(((byte) (61)));
        Double double0 = new Double(((double) ((byte) (61))));
        Pair<Byte, Double> pair0 = new Pair<Byte, Double>(byte0, double0);
        Pair<Object, Double> pair1 = new Pair<Object, Double>(pair0);
        linkedList0.add(pair1);
        DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>(((List<Pair<Object, Double>>) (linkedList0)));
        try {
            discreteDistribution0.sample(0);
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // number of samples (0)
            // 
            EvoAssertions.verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
        }
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        LinkedList<Pair<String, Double>> linkedList0 = new LinkedList<Pair<String, Double>>();
        Double double0 = new Double(2.110806941986084);
        Pair<String, Double> pair0 = new Pair<String, Double>("", double0);
        linkedList0.add(pair0);
        linkedList0.add(pair0);
        DiscreteDistribution<String> discreteDistribution0 = new DiscreteDistribution<String>(((List<Pair<String, Double>>) (linkedList0)));
        String string0 = discreteDistribution0.sample();
        Assert.assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        Well1024a well1024a0 = new Well1024a();
        LinkedList<Pair<Double, Double>> linkedList0 = new LinkedList<Pair<Double, Double>>();
        Double double0 = Double.valueOf(((double) (3359)));
        Pair<Double, Double> pair0 = new Pair<Double, Double>(((Double) (null)), double0);
        linkedList0.add(pair0);
        DiscreteDistribution<Double> discreteDistribution0 = new DiscreteDistribution<Double>(((RandomGenerator) (well1024a0)), ((List<Pair<Double, Double>>) (linkedList0)));
        List<Pair<Double, Double>> list0 = discreteDistribution0.getSamples();
        Assert.assertFalse(list0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        Well44497b well44497b0 = new Well44497b();
        LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
        Float float0 = new Float(826.0F);
        Double double0 = new Double(((double) (826.0F)));
        Pair<Float, Double> pair0 = new Pair<Float, Double>(float0, double0);
        Pair<Object, Double> pair1 = new Pair<Object, Double>(pair0);
        linkedList0.add(pair1);
        DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>(((RandomGenerator) (well44497b0)), ((List<Pair<Object, Double>>) (linkedList0)));
        Object object0 = new Object();
        double double1 = discreteDistribution0.probability(object0);
        Assert.assertEquals(0.0, double1, 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        Well44497b well44497b0 = new Well44497b(2586);
        LinkedList<Pair<Integer, Double>> linkedList0 = new LinkedList<Pair<Integer, Double>>();
        Integer integer0 = new Integer(2586);
        Double double0 = new Double(((double) (2586)));
        Pair<Integer, Double> pair0 = new Pair<Integer, Double>(integer0, double0);
        linkedList0.offer(pair0);
        DiscreteDistribution<Integer> discreteDistribution0 = new DiscreteDistribution<Integer>(((RandomGenerator) (well44497b0)), ((List<Pair<Integer, Double>>) (linkedList0)));
        double double1 = discreteDistribution0.probability(((Integer) (null)));
        Assert.assertEquals(0.0, double1, 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        Well44497b well44497b0 = new Well44497b(2586);
        LinkedList<Pair<Integer, Double>> linkedList0 = new LinkedList<Pair<Integer, Double>>();
        Double double0 = new Double(((double) (2586)));
        Pair<Integer, Double> pair0 = new Pair<Integer, Double>(((Integer) (null)), double0);
        linkedList0.add(pair0);
        DiscreteDistribution<Integer> discreteDistribution0 = new DiscreteDistribution<Integer>(((RandomGenerator) (well44497b0)), ((List<Pair<Integer, Double>>) (linkedList0)));
        double double1 = discreteDistribution0.probability(((Integer) (null)));
        Assert.assertEquals(1.0, double1, 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        LinkedList<Pair<String, Double>> linkedList0 = new LinkedList<Pair<String, Double>>();
        Double double0 = new Double(2.110806941986084);
        Pair<String, Double> pair0 = new Pair<String, Double>("", double0);
        linkedList0.add(pair0);
        DiscreteDistribution<String> discreteDistribution0 = new DiscreteDistribution<String>(((List<Pair<String, Double>>) (linkedList0)));
        double double1 = discreteDistribution0.probability("");
        Assert.assertEquals(1.0, double1, 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        LinkedList<Pair<String, Double>> linkedList0 = new LinkedList<Pair<String, Double>>();
        Double double0 = new Double((-31.936068139900364));
        Pair<String, Double> pair0 = new Pair<String, Double>("", double0);
        linkedList0.add(pair0);
        DiscreteDistribution<String> discreteDistribution0 = null;
        try {
            discreteDistribution0 = new DiscreteDistribution<String>(((List<Pair<String, Double>>) (linkedList0)));
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // 
            // -31.936 is smaller than the minimum (0)
            // 
            EvoAssertions.verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
        }
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
        Double double0 = new Double(1971.889);
        Pair<Integer, Double> pair0 = new Pair<Integer, Double>(((Integer) (null)), double0);
        Pair<Object, Double> pair1 = new Pair<Object, Double>(pair0);
        linkedList0.add(pair1);
        DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>(((List<Pair<Object, Double>>) (linkedList0)));
        discreteDistribution0.reseedRandomGenerator((-2454L));
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
        DiscreteDistribution<Object> discreteDistribution0 = null;
        try {
            discreteDistribution0 = new DiscreteDistribution<Object>(((List<Pair<Object, Double>>) (linkedList0)));
            Assert.fail("Expecting exception: ArithmeticException");
        } catch (ArithmeticException e) {
            // 
            // array sums to zero
            // 
            EvoAssertions.verifyException("org.apache.commons.math3.util.MathArrays", e);
        }
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        Well1024a well1024a0 = new Well1024a();
        LinkedList<Pair<Double, Double>> linkedList0 = new LinkedList<Pair<Double, Double>>();
        Double double0 = Double.valueOf(((double) (3359)));
        Pair<Double, Double> pair0 = new Pair<Double, Double>(((Double) (null)), double0);
        linkedList0.add(pair0);
        DiscreteDistribution<Double> discreteDistribution0 = new DiscreteDistribution<Double>(((RandomGenerator) (well1024a0)), ((List<Pair<Double, Double>>) (linkedList0)));
        {
            discreteDistribution0.sample(238);
        }
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        Well44497b well44497b0 = new Well44497b();
        LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
        Float float0 = Float.valueOf(826.0F);
        Double double0 = new Double(((double) (826.0F)));
        Pair<Float, Double> pair0 = new Pair<Float, Double>(float0, double0);
        Long long0 = new Long((-3682L));
        Pair<Object, Double> pair1 = new Pair<Object, Double>(((Object) (long0)), double0);
        linkedList0.add(pair1);
        Pair<Object, Double> pair2 = new Pair<Object, Double>(pair0);
        linkedList0.add(pair2);
        DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>(((RandomGenerator) (well44497b0)), ((List<Pair<Object, Double>>) (linkedList0)));
        {
            discreteDistribution0.sample(59);
        }
    }
}

