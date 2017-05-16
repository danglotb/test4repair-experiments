/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 24 11:23:49 GMT 2017
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.SystemColor;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.text.AttributedCharacterIterator;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.axis.SymbolAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.EntityCollection;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.PolarPlot;
import org.jfree.chart.renderer.AbstractRenderer;
import org.jfree.chart.renderer.category.BoxAndWhiskerRenderer;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.CategoryStepRenderer;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.chart.util.GradientPaintTransformer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.junit.runner.RunWith;
import sun.java2d.SunGraphics2D;
import sun.util.calendar.ZoneInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StatisticalBarRenderer_ESTest extends StatisticalBarRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(200000.0, 200000.0, 200000.0, 2.0);
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(false);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo((EntityCollection) null);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryStepRenderer.State categoryStepRenderer_State0 = (CategoryStepRenderer.State)categoryStepRenderer0.createState(plotRenderingInfo0);
      DateAxis dateAxis0 = new DateAxis();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot((ValueAxis) dateAxis0);
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("Point2D.Double[200000.0, 200000.0]");
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      categoryStepRenderer_State0.setBarWidth(2.0);
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawVerticalItem((Graphics2D) null, categoryStepRenderer_State0, rectangle2D_Double0, combinedRangeCategoryPlot0, subCategoryAxis0, dateAxis0, defaultStatisticalCategoryDataset0, 1900, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1900, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(false);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo((EntityCollection) null);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryStepRenderer.State categoryStepRenderer_State0 = (CategoryStepRenderer.State)categoryStepRenderer0.createState(plotRenderingInfo0);
      DateAxis dateAxis0 = new DateAxis();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot((ValueAxis) dateAxis0);
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("Point2D.Double[200000.0, 200000.0]");
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawVerticalItem((Graphics2D) null, categoryStepRenderer_State0, rectangle2D_Double0, combinedRangeCategoryPlot0, subCategoryAxis0, dateAxis0, defaultStatisticalCategoryDataset0, 1900, 500);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1900, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(false);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo((EntityCollection) null);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryStepRenderer.State categoryStepRenderer_State0 = (CategoryStepRenderer.State)categoryStepRenderer0.createState(plotRenderingInfo0);
      DateAxis dateAxis0 = new DateAxis();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot((ValueAxis) dateAxis0);
      categoryStepRenderer_State0.setBarWidth((-2027.3));
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("Point2D.Double[200000.0, 200000.0]");
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawHorizontalItem((Graphics2D) null, categoryStepRenderer_State0, rectangle2D_Double0, combinedRangeCategoryPlot0, subCategoryAxis0, dateAxis0, defaultStatisticalCategoryDataset0, 10, 10);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 10, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(2660.2697059, 2569.95984887, 3.0, 2569.95984887);
      PolarPlot polarPlot0 = new PolarPlot();
      JFreeChart jFreeChart0 = new JFreeChart("AG7", statisticalBarRenderer0.DEFAULT_VALUE_LABEL_FONT, (Plot) polarPlot0, true);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, 0.0, (double) 1.0F, chartRenderingInfo0);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryItemRendererState categoryItemRendererState0 = boxAndWhiskerRenderer0.initialise(sunGraphics2D0, rectangle2D_Double0, combinedDomainCategoryPlot0, (-1), plotRenderingInfo0);
      String[] stringArray0 = new String[5];
      SymbolAxis symbolAxis0 = new SymbolAxis("", stringArray0);
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawVerticalItem(sunGraphics2D0, categoryItemRendererState0, rectangle2D_Double0, combinedDomainCategoryPlot0, (CategoryAxis) null, symbolAxis0, defaultStatisticalCategoryDataset0, 15, (-940));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.StatisticalBarRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(false);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo((EntityCollection) null);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryStepRenderer.State categoryStepRenderer_State0 = (CategoryStepRenderer.State)categoryStepRenderer0.createState(plotRenderingInfo0);
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("");
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("!M(8{~66");
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawHorizontalItem((Graphics2D) null, categoryStepRenderer_State0, rectangle2D_Double0, (CategoryPlot) null, categoryAxis3D0, numberAxis3D0, defaultStatisticalCategoryDataset0, 10, 5);
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
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      StatisticalBarRenderer statisticalBarRenderer1 = new StatisticalBarRenderer();
      boolean boolean0 = statisticalBarRenderer0.equals(statisticalBarRenderer1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      AttributedCharacterIterator.Attribute attributedCharacterIterator_Attribute0 = AttributedCharacterIterator.Attribute.INPUT_METHOD_SEGMENT;
      boolean boolean0 = statisticalBarRenderer0.equals(attributedCharacterIterator_Attribute0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      boolean boolean0 = statisticalBarRenderer0.equals(statisticalBarRenderer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      StatisticalBarRenderer statisticalBarRenderer1 = new StatisticalBarRenderer();
      assertTrue(statisticalBarRenderer1.equals((Object)statisticalBarRenderer0));
      
      statisticalBarRenderer0.setGradientPaintTransformer((GradientPaintTransformer) null);
      boolean boolean0 = statisticalBarRenderer0.equals(statisticalBarRenderer1);
      assertFalse(statisticalBarRenderer1.equals((Object)statisticalBarRenderer0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(false);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo((EntityCollection) null);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryStepRenderer.State categoryStepRenderer_State0 = (CategoryStepRenderer.State)categoryStepRenderer0.createState(plotRenderingInfo0);
      DateAxis dateAxis0 = new DateAxis();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot((ValueAxis) dateAxis0);
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("Point2D.Double[200000.0, 200000.0]");
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawVerticalItem((Graphics2D) null, categoryStepRenderer_State0, rectangle2D_Double0, combinedRangeCategoryPlot0, subCategoryAxis0, dateAxis0, defaultStatisticalCategoryDataset0, (-1524), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(200000.0, 200000.0, 200000.0, 2.0);
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      CategoryStepRenderer categoryStepRenderer0 = new CategoryStepRenderer(false);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo((EntityCollection) null);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryStepRenderer.State categoryStepRenderer_State0 = (CategoryStepRenderer.State)categoryStepRenderer0.createState(plotRenderingInfo0);
      DateAxis dateAxis0 = new DateAxis();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot((ValueAxis) dateAxis0);
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("Point2D.Double[200000.0, 200000.0]");
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawHorizontalItem((Graphics2D) null, categoryStepRenderer_State0, rectangle2D_Double0, combinedRangeCategoryPlot0, subCategoryAxis0, dateAxis0, defaultStatisticalCategoryDataset0, 10, (-1086));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 10, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      CategoryItemRendererState categoryItemRendererState0 = new CategoryItemRendererState(plotRenderingInfo0);
      Rectangle2D.Double rectangle2D_Double0 = (Rectangle2D.Double)AbstractRenderer.DEFAULT_SHAPE;
      CategoryAxis categoryAxis0 = new CategoryAxis();
      ZoneInfo zoneInfo0 = (ZoneInfo)TimeZone.getDefault();
      DateAxis dateAxis0 = new DateAxis("org.jfree.chart.labels.MultipleXYSeriesLabelGenerator", (TimeZone) zoneInfo0);
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawItem((Graphics2D) null, categoryItemRendererState0, rectangle2D_Double0, (CategoryPlot) null, categoryAxis0, dateAxis0, defaultCategoryDataset0, 1, 1, (-2277));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires StatisticalCategoryDataset.
         //
         verifyException("org.jfree.chart.renderer.category.StatisticalBarRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      statisticalBarRenderer0.setErrorIndicatorStroke((Stroke) null);
      BasicStroke basicStroke0 = (BasicStroke)statisticalBarRenderer0.getErrorIndicatorStroke();
      assertNull(basicStroke0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      SystemColor systemColor0 = SystemColor.textText;
      statisticalBarRenderer0.setErrorIndicatorPaint(systemColor0);
      assertEquals(0.2, statisticalBarRenderer0.getItemMargin(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      BasicStroke basicStroke0 = (BasicStroke)statisticalBarRenderer0.getErrorIndicatorStroke();
      assertEquals(0.5F, basicStroke0.getLineWidth(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      Color color0 = (Color)statisticalBarRenderer0.getErrorIndicatorPaint();
      assertEquals(128, color0.getGreen());
  }
}