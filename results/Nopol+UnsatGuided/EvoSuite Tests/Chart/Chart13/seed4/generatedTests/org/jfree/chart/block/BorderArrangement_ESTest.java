/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 16 03:06:23 GMT 2017
 */

package org.jfree.chart.block;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Canvas;
import java.awt.Graphics2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.block.Arrangement;
import org.jfree.chart.block.BlockContainer;
import org.jfree.chart.block.BorderArrangement;
import org.jfree.chart.block.CenterArrangement;
import org.jfree.chart.block.EmptyBlock;
import org.jfree.chart.block.RectangleConstraint;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.Size2D;
import org.jfree.data.Range;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BorderArrangement_ESTest extends BorderArrangement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      borderArrangement0.add(blockContainer0, (Object) null);
      Range range0 = new Range(161.7, 161.7);
      blockContainer0.setPadding(0.0, 0.0, (-393.4952480636), 623.681194);
      Size2D size2D0 = borderArrangement0.arrangeRR(blockContainer0, range0, range0, (Graphics2D) null);
      assertEquals(623.681194, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      EmptyBlock emptyBlock0 = new EmptyBlock(234.2, 234.2);
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      borderArrangement0.add(emptyBlock0, rectangleEdge0);
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) borderArrangement0);
      Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, (Graphics2D) null);
      assertEquals(234.2, size2D0.width, 0.01);
      assertEquals(234.2, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      blockContainer0.setPadding(0.0, (-1.0), 1879.3793165901, (-3545.837410962069));
      Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 1165.7942518235193);
      assertEquals((-2381.0431591385495), size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      blockContainer0.setPadding((-703.0), (-703.0), (-703.0), 0.0);
      Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 789.4253436059097);
      assertEquals((-1406.0), size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) borderArrangement0);
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeRR(blockContainer0, (Range) null, (Range) null, (Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFR((BlockContainer) null, (Graphics2D) null, (RectangleConstraint) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFN((BlockContainer) null, (Graphics2D) null, 2135.28029689);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      CenterArrangement centerArrangement0 = new CenterArrangement();
      blockContainer0.setArrangement(centerArrangement0);
      borderArrangement0.add(blockContainer0, (Object) null);
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 1165.7942518235193);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) borderArrangement0);
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, (-472.92351));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Range(double, double): require lower (0.0) <= upper (-472.92351).
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) borderArrangement0);
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFF(blockContainer0, (Graphics2D) null, (RectangleConstraint) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      // Undeclared exception!
      try { 
        borderArrangement0.arrange((BlockContainer) null, (Graphics2D) null, (RectangleConstraint) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      // Undeclared exception!
      try { 
        borderArrangement0.arrange(blockContainer0, (Graphics2D) null, (RectangleConstraint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'c' argument.
         //
         verifyException("org.jfree.chart.block.AbstractBlock", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 1165.7942518235193);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, (Graphics2D) null);
      assertEquals(0.0, size2D0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BorderArrangement borderArrangement1 = new BorderArrangement();
      boolean boolean0 = borderArrangement0.equals(borderArrangement1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      boolean boolean0 = borderArrangement0.equals(borderArrangement0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      Canvas canvas0 = new Canvas();
      boolean boolean0 = borderArrangement0.equals(canvas0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      EmptyBlock emptyBlock0 = new EmptyBlock(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      borderArrangement0.add(emptyBlock0, rectangleEdge0);
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) borderArrangement0);
      Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 145.44301921454309);
      assertEquals(145.44301921454309, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      EmptyBlock emptyBlock0 = new EmptyBlock(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      borderArrangement0.add(emptyBlock0, rectangleEdge0);
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) borderArrangement0);
      Range range0 = Range.expandToInclude((Range) null, (-574.464));
      Size2D size2D0 = borderArrangement0.arrangeRR(blockContainer0, range0, range0, (Graphics2D) null);
      assertEquals(0.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      EmptyBlock emptyBlock0 = new EmptyBlock(Double.NEGATIVE_INFINITY, 234.2);
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      borderArrangement0.add(emptyBlock0, rectangleEdge0);
      BlockContainer blockContainer0 = new BlockContainer();
      Range range0 = new Range(0.0, 161.7);
      Size2D size2D0 = borderArrangement0.arrangeRR(blockContainer0, range0, range0, (Graphics2D) null);
      assertEquals(234.2, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      EmptyBlock emptyBlock0 = new EmptyBlock(Double.NEGATIVE_INFINITY, 234.2);
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      borderArrangement0.add(emptyBlock0, rectangleEdge0);
      BlockContainer blockContainer0 = new BlockContainer();
      Range range0 = new Range(161.7, 161.7);
      Size2D size2D0 = borderArrangement0.arrangeRR(blockContainer0, range0, range0, (Graphics2D) null);
      assertEquals(234.2, size2D0.height, 0.01);
      assertEquals(0.0, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      EmptyBlock emptyBlock0 = new EmptyBlock(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      borderArrangement0.add(emptyBlock0, rectangleEdge0);
      BlockContainer blockContainer0 = new BlockContainer();
      Range range0 = new Range(0.0, 161.7);
      Size2D size2D0 = borderArrangement0.arrangeRR(blockContainer0, range0, range0, (Graphics2D) null);
      assertEquals(0.0, size2D0.width, 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      EmptyBlock emptyBlock0 = new EmptyBlock(234.2, 234.2);
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      borderArrangement0.add(emptyBlock0, rectangleEdge0);
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) borderArrangement0);
      Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 0.0);
      assertEquals(234.2, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      EmptyBlock emptyBlock0 = new EmptyBlock(Double.NEGATIVE_INFINITY, 234.2);
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      borderArrangement0.add(emptyBlock0, rectangleEdge0);
      BlockContainer blockContainer0 = new BlockContainer();
      Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 161.7);
      assertEquals(234.2, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      EmptyBlock emptyBlock0 = new EmptyBlock(Double.NEGATIVE_INFINITY, 234.2);
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      RectangleEdge rectangleEdge1 = RectangleEdge.opposite(rectangleEdge0);
      borderArrangement0.add(emptyBlock0, rectangleEdge1);
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) borderArrangement0);
      Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 161.7);
      assertEquals(234.2, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) borderArrangement0);
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 161.7);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not implemented.
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      borderArrangement0.add(blockContainer0, (Object) null);
      Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 1165.7942518235193);
      assertEquals(1165.7942518235193, size2D0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      EmptyBlock emptyBlock0 = new EmptyBlock(Double.NEGATIVE_INFINITY, 234.2);
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      borderArrangement0.add(emptyBlock0, rectangleEdge0);
      BlockContainer blockContainer0 = new BlockContainer();
      Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, (Graphics2D) null);
      assertEquals(234.2, size2D0.height, 0.01);
      assertEquals(0.0, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      EmptyBlock emptyBlock0 = new EmptyBlock(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      borderArrangement0.add(emptyBlock0, rectangleEdge0);
      BlockContainer blockContainer0 = new BlockContainer();
      Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, (Graphics2D) null);
      assertEquals(Double.NEGATIVE_INFINITY, size2D0.height, 0.01);
      assertEquals(0.0, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      borderArrangement0.add(blockContainer0, (Object) null);
      Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, (Graphics2D) null);
      assertEquals(0.0, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      EmptyBlock emptyBlock0 = new EmptyBlock(Double.NEGATIVE_INFINITY, 234.2);
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      borderArrangement0.add(emptyBlock0, rectangleEdge0);
      BlockContainer blockContainer0 = new BlockContainer();
      Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, (Graphics2D) null);
      assertEquals(0.0, size2D0.width, 0.01);
      assertEquals(234.2, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      borderArrangement0.clear();
  }
}
