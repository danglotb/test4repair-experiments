/**
 * Scaffolding file used to store all the setups needed to run
 * tests automatically generated by EvoSuite
 * Fri Jan 13 22:02:02 GMT 2017
 */


package org.apache.commons.math.analysis.solvers;

import org.evosuite.runtime.classhandling.ClassResetter;
import org.junit.BeforeClass;
import org.evosuite.runtime.classhandling.ClassStateSupport;
import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.evosuite.runtime.GuiSupport;
import org.evosuite.runtime.classhandling.JDKClassResetter;
import org.evosuite.runtime.thread.KillSwitchHandler;
import org.evosuite.runtime.vnet.NonFunctionalRequirementRule;
import static org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED;
import org.junit.Rule;
import org.evosuite.runtime.thread.ThreadStopper;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.Runtime;
import org.evosuite.runtime.RuntimeSettings;

@EvoSuiteClassExclude
public class BisectionSolver_ESTest_scaffolding {
    @Rule
    public NonFunctionalRequirementRule nfr = new NonFunctionalRequirementRule();

    private ThreadStopper threadStopper = new ThreadStopper(KillSwitchHandler.getInstance(), 3000);

    @BeforeClass
    public static void initEvoSuiteFramework() {
        RuntimeSettings.className = "org.apache.commons.math.analysis.solvers.BisectionSolver";
        GuiSupport.initialize();
        RuntimeSettings.maxNumberOfThreads = 100;
        RuntimeSettings.maxNumberOfIterationsPerLoop = 10000;
        RuntimeSettings.mockSystemIn = true;
        RuntimeSettings.sandboxMode = RECOMMENDED;
        Sandbox.initializeSecurityManagerForSUT();
        JDKClassResetter.init();
        BisectionSolver_ESTest_scaffolding.setSystemProperties();
        BisectionSolver_ESTest_scaffolding.initializeClasses();
        Runtime.getInstance().resetRuntime();
    }

    public static void setSystemProperties() {
        /* No java.lang.System property to set */
    }

    private static void initializeClasses() {
        ClassStateSupport.initializeClasses(BisectionSolver_ESTest_scaffolding.class.getClassLoader(), "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.MathException", "org.apache.commons.math.ConvergenceException", "org.apache.commons.math.analysis.solvers.UnivariateRealSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl", "org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction", "org.apache.commons.math.analysis.UnivariateRealFunction", "org.apache.commons.math.MaxIterationsExceededException", "org.apache.commons.math.analysis.SinFunction", "org.apache.commons.math.FunctionEvaluationException", "org.apache.commons.math.analysis.Expm1Function", "org.apache.commons.math.ConvergingAlgorithm", "org.apache.commons.math.analysis.QuinticFunction", "org.apache.commons.math.ConvergingAlgorithmImpl", "org.apache.commons.math.MathRuntimeException", "org.apache.commons.math.MathRuntimeException$1", "org.apache.commons.math.MathRuntimeException$2", "org.apache.commons.math.MathRuntimeException$3", "org.apache.commons.math.MathRuntimeException$4", "org.apache.commons.math.MathRuntimeException$5", "org.apache.commons.math.MathRuntimeException$6", "org.apache.commons.math.MathRuntimeException$7", "org.apache.commons.math.MathRuntimeException$8", "org.apache.commons.math.MathRuntimeException$10", "org.apache.commons.math.MathRuntimeException$9");
    }

    private static void resetClasses() {
        ClassResetter.getInstance().setClassLoader(BisectionSolver_ESTest_scaffolding.class.getClassLoader());
        ClassStateSupport.resetClasses("org.apache.commons.math.MathRuntimeException", "org.apache.commons.math.MathRuntimeException$4", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.MathRuntimeException$5", "org.apache.commons.math.MathException", "org.apache.commons.math.ConvergenceException", "org.apache.commons.math.MaxIterationsExceededException");
    }
}

