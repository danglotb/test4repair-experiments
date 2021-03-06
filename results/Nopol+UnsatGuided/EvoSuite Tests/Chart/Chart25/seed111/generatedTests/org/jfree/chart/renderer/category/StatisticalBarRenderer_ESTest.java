/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 24 18:40:53 GMT 2017
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.ExtendedCategoryAxis;
import org.jfree.chart.axis.LogAxis;
import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.EntityCollection;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedRangeXYPlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.renderer.AbstractRenderer;
import org.jfree.chart.renderer.PaintScale;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.CategoryStepRenderer;
import org.jfree.chart.renderer.category.LevelRenderer;
import org.jfree.chart.renderer.category.StackedAreaRenderer;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.chart.title.PaintScaleLegend;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.jfree.data.statistics.StatisticalCategoryDataset;
import org.junit.runner.RunWith;
import sun.java2d.SunGraphics2D;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StatisticalBarRenderer_ESTest extends StatisticalBarRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      ThermometerPlot thermometerPlot0 = new ThermometerPlot();
      JFreeChart jFreeChart0 = new JFreeChart((Plot) thermometerPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(2, 1322, (ChartRenderingInfo) null);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      LevelRenderer levelRenderer0 = new LevelRenderer();
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("+|k:J7Qp3K");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot((CategoryAxis) categoryAxis3D0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryItemRendererState categoryItemRendererState0 = levelRenderer0.initialise(sunGraphics2D0, rectangle2D_Double0, combinedDomainCategoryPlot0, 0, plotRenderingInfo0);
      categoryItemRendererState0.setBarWidth(140);
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.05, "");
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawVerticalItem(sunGraphics2D0, categoryItemRendererState0, rectangle2D_Double0, combinedDomainCategoryPlot0, categoryAxis3D0, cyclicNumberAxis0, defaultStatisticalCategoryDataset0, 1238, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1238, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryItemRendererState categoryItemRendererState0 = new CategoryItemRendererState(plotRenderingInfo0);
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot((CategoryAxis) subCategoryAxis0);
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(2093.0, "");
      categoryItemRendererState0.setBarWidth(1.0E-8);
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawHorizontalItem((Graphics2D) null, categoryItemRendererState0, rectangle2D_Float0, combinedDomainCategoryPlot0, subCategoryAxis0, cyclicNumberAxis0, (StatisticalCategoryDataset) null, 500, 10);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.StatisticalBarRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double((-470.37433394), 0.0, 0.0, 874.05);
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("");
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot((ValueAxis) numberAxis3D0);
      JFreeChart jFreeChart0 = new JFreeChart("kLb2", (Plot) combinedRangeXYPlot0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, 0.0, (-4638.7624437032955), chartRenderingInfo0);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryStepRenderer.State categoryStepRenderer_State0 = new CategoryStepRenderer.State(plotRenderingInfo0);
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("");
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawVerticalItem(sunGraphics2D0, categoryStepRenderer_State0, rectangle2D_Double0, (CategoryPlot) null, extendedCategoryAxis0, (ValueAxis) null, defaultStatisticalCategoryDataset0, (-1528), 500);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.StatisticalBarRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      ThermometerPlot thermometerPlot0 = new ThermometerPlot();
      JFreeChart jFreeChart0 = new JFreeChart((Plot) thermometerPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(2, 1322, (ChartRenderingInfo) null);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("+|k:J7Qp3K");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot((CategoryAxis) categoryAxis3D0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.05, "");
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(true);
      CategoryItemRendererState categoryItemRendererState0 = stackedAreaRenderer0.initialise(sunGraphics2D0, rectangle2D_Double0, combinedDomainCategoryPlot0, 0, plotRenderingInfo0);
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawHorizontalItem(sunGraphics2D0, categoryItemRendererState0, rectangle2D_Double0, combinedDomainCategoryPlot0, categoryAxis3D0, cyclicNumberAxis0, defaultStatisticalCategoryDataset0, 0, 10);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      boolean boolean0 = statisticalBarRenderer0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      ThermometerPlot thermometerPlot0 = new ThermometerPlot();
      JFreeChart jFreeChart0 = new JFreeChart((Plot) thermometerPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(2, 1322, (ChartRenderingInfo) null);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      LevelRenderer levelRenderer0 = new LevelRenderer();
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("Requires StatisticalCategoryDataset.");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryItemRendererState categoryItemRendererState0 = levelRenderer0.initialise(sunGraphics2D0, rectangle2D_Double0, combinedDomainCategoryPlot0, 0, plotRenderingInfo0);
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.05, "Requires StatisticalCategoryDataset.");
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawItem(sunGraphics2D0, categoryItemRendererState0, rectangle2D_Double0, combinedDomainCategoryPlot0, categoryAxis3D0, cyclicNumberAxis0, defaultStatisticalCategoryDataset0, 0, (-1), 1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      Rectangle2D.Double rectangle2D_Double0 = (Rectangle2D.Double)AbstractRenderer.DEFAULT_SHAPE;
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("n/E-a");
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot((ValueAxis) logarithmicAxis0);
      JFreeChart jFreeChart0 = new JFreeChart((Plot) combinedRangeXYPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(500, 912);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo((EntityCollection) standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryStepRenderer.State categoryStepRenderer_State0 = (CategoryStepRenderer.State)categoryStepRenderer0.createState(plotRenderingInfo0);
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      CategoryPlot categoryPlot0 = new CategoryPlot((CategoryDataset) taskSeriesCollection0, (CategoryAxis) null, (ValueAxis) logarithmicAxis0, (CategoryItemRenderer) statisticalBarRenderer0);
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawItem(sunGraphics2D0, categoryStepRenderer_State0, rectangle2D_Double0, categoryPlot0, (CategoryAxis) null, logarithmicAxis0, taskSeriesCollection0, 2577, 500, 27);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires StatisticalCategoryDataset.
         //
         verifyException("org.jfree.chart.renderer.category.StatisticalBarRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      ThermometerPlot thermometerPlot0 = new ThermometerPlot();
      JFreeChart jFreeChart0 = new JFreeChart((Plot) thermometerPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(2, 1322, (ChartRenderingInfo) null);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      LevelRenderer levelRenderer0 = new LevelRenderer();
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("Requires StatisticalCategoryDataset.");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryItemRendererState categoryItemRendererState0 = levelRenderer0.initialise(sunGraphics2D0, rectangle2D_Double0, combinedDomainCategoryPlot0, 0, plotRenderingInfo0);
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.05, "");
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawItem(sunGraphics2D0, categoryItemRendererState0, rectangle2D_Double0, (CategoryPlot) null, categoryAxis3D0, cyclicNumberAxis0, defaultStatisticalCategoryDataset0, 0, (-1), 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.StatisticalBarRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      LogAxis logAxis0 = new LogAxis((String) null);
      PaintScaleLegend paintScaleLegend0 = new PaintScaleLegend((PaintScale) null, (ValueAxis) logAxis0);
      BasicStroke basicStroke0 = (BasicStroke)paintScaleLegend0.getStripOutlineStroke();
      statisticalBarRenderer0.setErrorIndicatorStroke(basicStroke0);
      assertFalse(statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      statisticalBarRenderer0.setErrorIndicatorPaint((Paint) null);
      Color color0 = (Color)statisticalBarRenderer0.getErrorIndicatorPaint();
      assertNull(color0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      BasicStroke basicStroke0 = (BasicStroke)statisticalBarRenderer0.getErrorIndicatorStroke();
      assertEquals(0.5F, basicStroke0.getLineWidth(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      Color color0 = (Color)statisticalBarRenderer0.getErrorIndicatorPaint();
      assertEquals(128, color0.getBlue());
  }
}
