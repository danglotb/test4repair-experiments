/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 24 18:01:21 GMT 2017
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.border.BevelBorder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.axis.ExtendedCategoryAxis;
import org.jfree.chart.axis.LogAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.axis.SymbolAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.EntityCollection;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.MeterPlot;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.renderer.AbstractRenderer;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.CategoryStepRenderer;
import org.jfree.chart.renderer.category.LevelRenderer;
import org.jfree.chart.renderer.category.StackedBarRenderer3D;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.chart.urls.CategoryURLGenerator;
import org.jfree.chart.urls.StandardCategoryURLGenerator;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.general.ValueDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.junit.runner.RunWith;
import sun.java2d.SunGraphics2D;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StatisticalBarRenderer_ESTest extends StatisticalBarRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("mo");
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("q6@;qaC\"\"m`9F");
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryItemRendererState categoryItemRendererState0 = statisticalBarRenderer0.createState(plotRenderingInfo0);
      categoryItemRendererState0.setBarWidth(1898.392625775925);
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawItem((Graphics2D) null, categoryItemRendererState0, rectangle2D_Float0, combinedRangeCategoryPlot0, categoryAxis3D0, numberAxis3D0, defaultStatisticalCategoryDataset0, (-505), 10, 500);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Line2D.Double line2D_Double0 = new Line2D.Double();
      Rectangle2D.Double rectangle2D_Double0 = (Rectangle2D.Double)line2D_Double0.getBounds2D();
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "?*3x";
      stringArray0[1] = "?*3x";
      stringArray0[2] = "?*3x";
      stringArray0[3] = "?*3x";
      stringArray0[4] = "?*3x";
      stringArray0[5] = "?*3x";
      stringArray0[6] = "?*3x";
      stringArray0[7] = "?*3x";
      SymbolAxis symbolAxis0 = new SymbolAxis("?*3x", stringArray0);
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot((ValueAxis) symbolAxis0);
      JFreeChart jFreeChart0 = new JFreeChart("?*3x", (Plot) combinedRangeCategoryPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(1, 10);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      StackedBarRenderer3D stackedBarRenderer3D0 = new StackedBarRenderer3D();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo((EntityCollection) standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryItemRendererState categoryItemRendererState0 = stackedBarRenderer3D0.initialise(sunGraphics2D0, rectangle2D_Double0, combinedRangeCategoryPlot0, 1, plotRenderingInfo0);
      CategoryAxis categoryAxis0 = new CategoryAxis();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      categoryItemRendererState0.setBarWidth(273.7757032);
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawHorizontalItem(sunGraphics2D0, categoryItemRendererState0, rectangle2D_Double0, combinedRangeCategoryPlot0, categoryAxis0, symbolAxis0, defaultStatisticalCategoryDataset0, 71, 2823);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 71, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      BasicStroke basicStroke0 = (BasicStroke)statisticalBarRenderer0.getBaseStroke();
      statisticalBarRenderer0.setErrorIndicatorStroke(basicStroke0);
      assertEquals(1, statisticalBarRenderer0.getPassCount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      Color color0 = Color.ORANGE;
      statisticalBarRenderer0.setErrorIndicatorPaint(color0);
      assertEquals(0, color0.getBlue());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo((EntityCollection) standardEntityCollection0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, (-1472.917105158), (-1419.735103), chartRenderingInfo0);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("");
      NumberAxis numberAxis0 = new NumberAxis("");
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawVerticalItem(sunGraphics2D0, (CategoryItemRendererState) null, (Rectangle2D) null, (CategoryPlot) null, extendedCategoryAxis0, numberAxis0, defaultStatisticalCategoryDataset0, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.StatisticalBarRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      LevelRenderer levelRenderer0 = new LevelRenderer();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo((EntityCollection) standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryItemRendererState categoryItemRendererState0 = levelRenderer0.initialise((Graphics2D) null, rectangle2D_Double0, combinedRangeCategoryPlot0, (-497), plotRenderingInfo0);
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("mo");
      LogAxis logAxis0 = new LogAxis("");
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawVerticalItem((Graphics2D) null, categoryItemRendererState0, rectangle2D_Float0, combinedRangeCategoryPlot0, categoryAxis3D0, logAxis0, defaultStatisticalCategoryDataset0, 183, 2093);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 183, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      TableOrder tableOrder0 = TableOrder.BY_COLUMN;
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot((CategoryDataset) defaultStatisticalCategoryDataset0, tableOrder0);
      JFreeChart jFreeChart0 = new JFreeChart((Plot) spiderWebPlot0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, chartRenderingInfo0);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryStepRenderer.State categoryStepRenderer_State0 = new CategoryStepRenderer.State(plotRenderingInfo0);
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("");
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("5BI33h%5k K%O6-");
      Line2D.Float line2D_Float0 = new Line2D.Float(0.0F, 0.5F, 1240.3F, 0.0F);
      Rectangle2D.Float rectangle2D_Float0 = (Rectangle2D.Float)line2D_Float0.getBounds2D();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawItem(sunGraphics2D0, categoryStepRenderer_State0, rectangle2D_Float0, (CategoryPlot) null, subCategoryAxis0, numberAxis3D0, defaultStatisticalCategoryDataset0, (-1403), (-97), 543);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.StatisticalBarRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("mo");
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("q6@;qaC\"\"m`9F");
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryItemRendererState categoryItemRendererState0 = statisticalBarRenderer0.createState(plotRenderingInfo0);
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawItem((Graphics2D) null, categoryItemRendererState0, rectangle2D_Float0, combinedRangeCategoryPlot0, categoryAxis3D0, numberAxis3D0, defaultStatisticalCategoryDataset0, 1, 10, 500);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset(0.0);
      MeterPlot meterPlot0 = new MeterPlot((ValueDataset) defaultValueDataset0);
      JFreeChart jFreeChart0 = new JFreeChart("Requires StatisticalCategoryDataset.", (Plot) meterPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(1378, 31);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      BevelBorder bevelBorder0 = new BevelBorder(31);
      Rectangle rectangle0 = bevelBorder0.getInteriorRectangle((Component) null, 31, 10, 270, 1378);
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("java.awt.geom.Arc2D");
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawHorizontalItem(sunGraphics2D0, (CategoryItemRendererState) null, rectangle0, (CategoryPlot) null, extendedCategoryAxis0, (ValueAxis) null, defaultStatisticalCategoryDataset0, (-1), 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.StatisticalBarRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      StatisticalBarRenderer statisticalBarRenderer1 = new StatisticalBarRenderer();
      StandardCategoryURLGenerator standardCategoryURLGenerator0 = new StandardCategoryURLGenerator("");
      statisticalBarRenderer0.setSeriesURLGenerator(0, (CategoryURLGenerator) standardCategoryURLGenerator0, false);
      boolean boolean0 = statisticalBarRenderer0.equals(statisticalBarRenderer1);
      assertFalse(boolean0);
      assertTrue(statisticalBarRenderer1.equals((Object)statisticalBarRenderer0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      StatisticalBarRenderer statisticalBarRenderer1 = new StatisticalBarRenderer();
      boolean boolean0 = statisticalBarRenderer0.equals(statisticalBarRenderer1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      boolean boolean0 = statisticalBarRenderer0.equals(statisticalBarRenderer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      boolean boolean0 = statisticalBarRenderer0.equals(defaultStatisticalCategoryDataset0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      statisticalBarRenderer0.setErrorIndicatorStroke(statisticalBarRenderer0.DEFAULT_OUTLINE_STROKE);
      assertTrue(statisticalBarRenderer0.getBaseSeriesVisible());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      Color color0 = (Color)AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
      statisticalBarRenderer0.setErrorIndicatorPaint(color0);
      Color color1 = (Color)statisticalBarRenderer0.getErrorIndicatorPaint();
      assertEquals(-16777216, color1.getRGB());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      BasicStroke basicStroke0 = (BasicStroke)statisticalBarRenderer0.getErrorIndicatorStroke();
      assertEquals(0.5F, basicStroke0.getLineWidth(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      Color color0 = (Color)statisticalBarRenderer0.getErrorIndicatorPaint();
      assertEquals(128, color0.getRed());
  }
}