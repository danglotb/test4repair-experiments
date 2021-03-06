/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Jan 09 19:35:17 GMT 2017
 */

package org.apache.commons.math.stat.correlation;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class PearsonsCorrelation_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.math.stat.correlation.PearsonsCorrelation"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  public static void setSystemProperties() {
 
    /*No java.lang.System property to set*/
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(PearsonsCorrelation_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.math.linear.BlockFieldMatrix",
      "org.apache.commons.math.stat.correlation.PearsonsCorrelation",
      "org.apache.commons.math.special.Beta$1",
      "org.apache.commons.math.MathException",
      "org.apache.commons.math.special.Beta",
      "org.apache.commons.math.distribution.ContinuousDistribution",
      "org.apache.commons.math.ConvergenceException",
      "org.apache.commons.math.linear.MatrixUtils",
      "org.apache.commons.math.stat.descriptive.WeightedEvaluation",
      "org.apache.commons.math.linear.FieldMatrixChangingVisitor",
      "org.apache.commons.math.analysis.UnivariateRealFunction",
      "org.apache.commons.math.linear.RealMatrix",
      "org.apache.commons.math.special.Gamma$1",
      "org.apache.commons.math.util.ContinuedFraction",
      "org.apache.commons.math.distribution.Distribution",
      "org.apache.commons.math.stat.descriptive.moment.Variance",
      "org.apache.commons.math.stat.descriptive.moment.FirstMoment",
      "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic",
      "org.apache.commons.math.linear.AbstractFieldMatrix",
      "org.apache.commons.math.MathRuntimeException",
      "org.apache.commons.math.MathRuntimeException$1",
      "org.apache.commons.math.MathRuntimeException$2",
      "org.apache.commons.math.MathRuntimeException$3",
      "org.apache.commons.math.MathRuntimeException$4",
      "org.apache.commons.math.MathRuntimeException$5",
      "org.apache.commons.math.MathRuntimeException$6",
      "org.apache.commons.math.MathRuntimeException$7",
      "org.apache.commons.math.MathRuntimeException$8",
      "org.apache.commons.math.MathRuntimeException$10",
      "org.apache.commons.math.MathRuntimeException$9",
      "org.apache.commons.math.stat.descriptive.moment.SecondMoment",
      "org.apache.commons.math.stat.descriptive.UnivariateStatistic",
      "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic",
      "org.apache.commons.math.linear.AnyMatrix",
      "org.apache.commons.math.linear.RealMatrixPreservingVisitor",
      "org.apache.commons.math.linear.Array2DRowRealMatrix",
      "org.apache.commons.math.MaxIterationsExceededException",
      "org.apache.commons.math.special.Gamma",
      "org.apache.commons.math.stat.correlation.Covariance",
      "org.apache.commons.math.stat.descriptive.moment.Mean",
      "org.apache.commons.math.linear.FieldMatrixPreservingVisitor",
      "org.apache.commons.math.linear.NonSquareMatrixException",
      "org.apache.commons.math.linear.MatrixVisitorException",
      "org.apache.commons.math.distribution.TDistribution",
      "org.apache.commons.math.linear.MatrixIndexException",
      "org.apache.commons.math.stat.descriptive.summary.Sum",
      "org.apache.commons.math.linear.AbstractRealMatrix",
      "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic",
      "org.apache.commons.math.linear.BigMatrix",
      "org.apache.commons.math.linear.FieldVector",
      "org.apache.commons.math.linear.Array2DRowFieldMatrix",
      "org.apache.commons.math.linear.BlockRealMatrix",
      "org.apache.commons.math.distribution.TDistributionImpl",
      "org.apache.commons.math.distribution.AbstractContinuousDistribution",
      "org.apache.commons.math.linear.InvalidMatrixException",
      "org.apache.commons.math.linear.RealVector",
      "org.apache.commons.math.linear.RealMatrixChangingVisitor",
      "org.apache.commons.math.linear.FieldMatrix",
      "org.apache.commons.math.stat.regression.SimpleRegression",
      "org.apache.commons.math.distribution.AbstractDistribution"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(PearsonsCorrelation_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math.linear.BlockRealMatrix",
      "org.apache.commons.math.MathRuntimeException",
      "org.apache.commons.math.MathRuntimeException$4",
      "org.apache.commons.math.linear.SparseRealVectorTest$SparseRealVectorTestImpl",
      "org.apache.commons.math.linear.ArrayRealVectorTest$RealVectorTestImpl",
      "org.apache.commons.math.distribution.AbstractDistribution",
      "org.apache.commons.math.distribution.AbstractContinuousDistribution",
      "org.apache.commons.math.distribution.TDistributionImpl",
      "org.apache.commons.math.stat.regression.SimpleRegression",
      "org.apache.commons.math.stat.descriptive.moment.Mean",
      "org.apache.commons.math.stat.descriptive.moment.FirstMoment",
      "org.apache.commons.math.stat.descriptive.summary.Sum",
      "org.apache.commons.math.stat.descriptive.moment.Variance",
      "org.apache.commons.math.stat.descriptive.moment.SecondMoment",
      "org.apache.commons.math.linear.MatrixIndexException",
      "org.apache.commons.math.special.Beta",
      "org.apache.commons.math.linear.OpenMapRealVector",
      "org.apache.commons.math.util.OpenIntToDoubleHashMap",
      "org.apache.commons.math.linear.InvalidMatrixException",
      "org.apache.commons.math.util.CompositeFormat",
      "org.apache.commons.math.linear.RealVectorFormat",
      "org.apache.commons.math.linear.ArrayRealVector",
      "org.apache.commons.math.util.ContinuedFraction",
      "org.apache.commons.math.special.Gamma"
    );
  }
}
