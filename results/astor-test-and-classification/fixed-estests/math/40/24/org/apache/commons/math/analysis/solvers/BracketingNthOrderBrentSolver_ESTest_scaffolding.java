/**
 * Scaffolding file used to store all the setups needed to run
 * tests automatically generated by EvoSuite
 * Wed Jan 25 05:22:12 GMT 2017
 */


package org.apache.commons.math.analysis.solvers;

import org.evosuite.runtime.vnet.NonFunctionalRequirementRule;
import org.junit.BeforeClass;
import org.evosuite.runtime.classhandling.ClassResetter;
import org.evosuite.runtime.classhandling.ClassStateSupport;
import org.evosuite.runtime.thread.ThreadStopper;
import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.evosuite.runtime.GuiSupport;
import org.evosuite.runtime.classhandling.JDKClassResetter;
import static org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED;
import org.evosuite.runtime.thread.KillSwitchHandler;
import org.junit.Rule;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.Runtime;
import org.evosuite.runtime.RuntimeSettings;

@EvoSuiteClassExclude
public class BracketingNthOrderBrentSolver_ESTest_scaffolding {
    @Rule
    public NonFunctionalRequirementRule nfr = new NonFunctionalRequirementRule();

    private ThreadStopper threadStopper = new ThreadStopper(KillSwitchHandler.getInstance(), 3000);

    @BeforeClass
    public static void initEvoSuiteFramework() {
        RuntimeSettings.className = "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver";
        GuiSupport.initialize();
        RuntimeSettings.maxNumberOfThreads = 100;
        RuntimeSettings.maxNumberOfIterationsPerLoop = 10000;
        RuntimeSettings.mockSystemIn = true;
        RuntimeSettings.sandboxMode = RECOMMENDED;
        Sandbox.initializeSecurityManagerForSUT();
        JDKClassResetter.init();
        BracketingNthOrderBrentSolver_ESTest_scaffolding.setSystemProperties();
        BracketingNthOrderBrentSolver_ESTest_scaffolding.initializeClasses();
        Runtime.getInstance().resetRuntime();
    }

    public static void setSystemProperties() {
        /* No java.lang.System property to set */
    }

    private static void initializeClasses() {
        ClassStateSupport.initializeClasses(BracketingNthOrderBrentSolver_ESTest_scaffolding.class.getClassLoader(), "org.apache.commons.math.exception.MathIllegalStateException", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.exception.NumberIsTooSmallException", "org.apache.commons.math.util.Incrementor", "org.apache.commons.math.exception.NullArgumentException", "org.apache.commons.math.exception.util.ExceptionContext", "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", "org.apache.commons.math.util.Incrementor$MaxCountExceededCallback", "org.apache.commons.math.util.FastMath", "org.apache.commons.math.util.MathUtils", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver$1", "org.apache.commons.math.util.FastMathLiteralArrays", "org.apache.commons.math.analysis.UnivariateFunction", "org.apache.commons.math.analysis.SinFunction$1", "org.apache.commons.math.analysis.solvers.AllowedSolution", "org.apache.commons.math.analysis.solvers.UnivariateRealSolver", "org.apache.commons.math.exception.NotStrictlyPositiveException", "org.apache.commons.math.exception.NumberIsTooLargeException", "org.apache.commons.math.exception.NotFiniteNumberException", "org.apache.commons.math.exception.MathInternalError", "org.apache.commons.math.analysis.solvers.BaseUnivariateRealSolver", "org.apache.commons.math.exception.TooManyEvaluationsException", "org.apache.commons.math.analysis.SinFunction", "org.apache.commons.math.analysis.SincFunction", "org.apache.commons.math.util.Precision", "org.apache.commons.math.analysis.DifferentiableUnivariateFunction", "org.apache.commons.math.exception.util.Localizable", "org.apache.commons.math.exception.MathIllegalArgumentException", "org.apache.commons.math.analysis.Expm1Function", "org.apache.commons.math.util.Incrementor$1", "org.apache.commons.math.analysis.solvers.AbstractUnivariateRealSolver", "org.apache.commons.math.exception.MaxCountExceededException", "org.apache.commons.math.analysis.MonitoredFunction", "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "org.apache.commons.math.exception.MathArithmeticException", "org.apache.commons.math.util.FastMath$ExpIntTable", "org.apache.commons.math.analysis.Expm1Function$1", "org.apache.commons.math.analysis.QuinticFunction", "org.apache.commons.math.exception.util.LocalizedFormats", "org.apache.commons.math.analysis.SincFunction$1", "org.apache.commons.math.exception.MathIllegalNumberException", "org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver", "org.apache.commons.math.exception.util.ExceptionContextProvider", "org.apache.commons.math.analysis.XMinus5Function", "org.apache.commons.math.util.FastMath$ExpFracTable", "org.apache.commons.math.exception.NoBracketingException", "org.apache.commons.math.exception.util.ArgUtils");
    }

    private static void resetClasses() {
        ClassResetter.getInstance().setClassLoader(BracketingNthOrderBrentSolver_ESTest_scaffolding.class.getClassLoader());
        ClassStateSupport.resetClasses("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver", "org.apache.commons.math.analysis.solvers.AllowedSolution", "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver$1", "org.apache.commons.math.analysis.SincFunction", "org.apache.commons.math.util.MathUtils", "org.apache.commons.math.exception.MathIllegalArgumentException", "org.apache.commons.math.exception.MathIllegalNumberException", "org.apache.commons.math.exception.NumberIsTooLargeException", "org.apache.commons.math.exception.util.LocalizedFormats", "org.apache.commons.math.exception.util.ExceptionContext", "org.apache.commons.math.exception.MathIllegalStateException", "org.apache.commons.math.exception.MaxCountExceededException", "org.apache.commons.math.exception.TooManyEvaluationsException", "org.apache.commons.math.exception.NumberIsTooSmallException", "org.apache.commons.math.exception.NullArgumentException", "org.apache.commons.math.util.Precision", "org.apache.commons.math.util.FastMath", "org.apache.commons.math.exception.NoBracketingException", "org.apache.commons.math.util.FastMathLiteralArrays", "org.apache.commons.math.util.FastMath$ExpIntTable", "org.apache.commons.math.util.FastMath$ExpFracTable");
    }
}

