/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Jan 12 21:38:59 GMT 2017
 */

package org.jfree.chart.block;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class BorderArrangement_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jfree.chart.block.BorderArrangement"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BorderArrangement_ESTest_scaffolding.class.getClassLoader() ,
      "org.jfree.chart.plot.ValueMarker",
      "org.jfree.chart.labels.CategorySeriesLabelGenerator",
      "com.lowagie.text.Jpeg2000",
      "com.lowagie.text.pdf.PdfOCG",
      "com.lowagie.text.Element",
      "org.jfree.data.general.ValueDataset",
      "com.lowagie.text.pdf.interfaces.PdfViewerPreferences",
      "com.lowagie.text.pdf.PdfEncodings$SymbolTTConversion",
      "org.jfree.chart.axis.MarkerAxisBand",
      "com.lowagie.text.pdf.PdfPCellEvent",
      "com.lowagie.text.xml.xmp.XmpWriter",
      "org.jfree.chart.LegendItemCollection",
      "org.jfree.chart.renderer.xy.XYItemRenderer",
      "org.jfree.chart.axis.CategoryAxis",
      "com.lowagie.text.pdf.ExtraEncoding",
      "org.jfree.chart.renderer.RendererState",
      "com.lowagie.text.xml.xmp.PdfA1Schema",
      "org.jfree.chart.text.TextFragment",
      "com.lowagie.text.pdf.PdfBoolean",
      "org.jfree.chart.axis.DateAxis$DefaultTimeline",
      "com.lowagie.text.TextElementArray",
      "org.jfree.chart.labels.ItemLabelPosition",
      "org.jfree.chart.axis.DateAxis",
      "org.jfree.chart.renderer.category.GroupedStackedBarRenderer",
      "org.jfree.chart.plot.CategoryPlot",
      "org.jfree.chart.event.MarkerChangeListener",
      "org.jfree.chart.event.PlotChangeEvent",
      "com.lowagie.text.pdf.interfaces.PdfPageActions",
      "org.jfree.chart.labels.ItemLabelAnchor",
      "org.jfree.chart.util.PaintList",
      "com.lowagie.text.HeaderFooter",
      "org.jfree.chart.axis.Timeline",
      "org.jfree.chart.event.RendererChangeEvent",
      "org.jfree.chart.util.RectangleAnchor",
      "com.lowagie.text.pdf.PdfException",
      "com.lowagie.text.pdf.PdfIndirectReference",
      "org.jfree.data.time.TimePeriodFormatException",
      "org.jfree.chart.axis.Tick",
      "org.jfree.chart.text.TextBlock",
      "org.jfree.chart.axis.Axis",
      "com.lowagie.text.pdf.PdfPattern",
      "com.lowagie.text.pdf.PdfRectangle",
      "com.lowagie.text.pdf.PdfArray",
      "org.jfree.chart.block.BlockBorder",
      "org.jfree.chart.util.ShapeList",
      "org.jfree.chart.util.UnitType",
      "com.lowagie.text.pdf.PdfPageEvent",
      "com.lowagie.text.pdf.collection.PdfCollection",
      "org.jfree.chart.annotations.XYAnnotation",
      "org.jfree.chart.util.ObjectUtilities",
      "com.lowagie.text.pdf.OutputStreamCounter",
      "org.jfree.chart.util.HorizontalAlignment",
      "com.lowagie.text.DocWriter",
      "com.lowagie.text.pdf.PdfOutline",
      "org.jfree.chart.plot.DatasetRenderingOrder",
      "org.jfree.chart.event.RendererChangeListener",
      "org.jfree.data.KeyedValues",
      "org.jfree.chart.labels.CategoryToolTipGenerator",
      "org.jfree.data.general.DefaultKeyedValues2DDataset",
      "org.jfree.chart.event.TitleChangeListener",
      "org.jfree.chart.text.TextMeasurer",
      "org.jfree.chart.LegendItemSource",
      "com.lowagie.text.pdf.PdfAction",
      "org.jfree.chart.renderer.PolarItemRenderer",
      "org.jfree.data.general.DatasetChangeListener",
      "org.jfree.chart.event.TitleChangeEvent",
      "org.jfree.chart.annotations.CategoryAnnotation",
      "org.jfree.chart.axis.AxisSpace",
      "org.jfree.chart.plot.PolarPlot",
      "org.jfree.data.time.DateRange",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.chart.axis.CyclicNumberAxis$CycleBoundTick",
      "org.jfree.chart.event.ChartChangeEventType",
      "com.lowagie.text.pdf.PdfNull",
      "com.lowagie.text.pdf.PdfOCProperties",
      "com.lowagie.text.xml.xmp.PdfSchema",
      "org.jfree.chart.util.GradientPaintTransformType",
      "com.lowagie.text.pdf.PdfDocument",
      "org.jfree.chart.renderer.category.CategoryItemRenderer",
      "com.lowagie.text.pdf.ByteBuffer",
      "com.lowagie.text.pdf.PdfBorderDictionary",
      "org.jfree.chart.util.Size2D",
      "com.lowagie.text.pdf.PdfAnnotation",
      "com.lowagie.text.pdf.PdfSignature",
      "org.jfree.chart.util.ShapeUtilities",
      "com.lowagie.text.pdf.PdfMediaClipData",
      "org.jfree.chart.labels.CategoryItemLabelGenerator",
      "org.jfree.data.RangeType",
      "org.jfree.data.time.Month",
      "org.jfree.chart.axis.TickUnits",
      "com.lowagie.text.pdf.PdfWriter",
      "com.lowagie.text.pdf.PdfLiteral",
      "com.lowagie.text.pdf.collection.PdfCollectionField",
      "com.lowagie.text.pdf.PdfPrinterGraphics2D",
      "com.lowagie.text.pdf.GrayColor",
      "org.jfree.chart.renderer.category.StackedBarRenderer",
      "org.jfree.chart.util.VerticalAlignment",
      "org.jfree.data.general.Dataset",
      "org.jfree.chart.plot.SeriesRenderingOrder",
      "org.jfree.chart.block.LabelBlock",
      "org.jfree.chart.plot.PlotOrientation",
      "com.lowagie.text.pdf.PdfXConformanceException",
      "org.jfree.chart.axis.NumberAxis",
      "com.lowagie.text.DocListener",
      "org.jfree.chart.axis.NumberTick",
      "com.lowagie.text.pdf.collection.PdfCollectionSchema",
      "com.lowagie.text.ImgCCITT",
      "org.jfree.chart.axis.ValueTick",
      "org.jfree.chart.block.BlockContainer",
      "com.lowagie.text.pdf.FontMapper",
      "com.lowagie.text.pdf.PdfFormField",
      "org.jfree.chart.plot.Marker",
      "com.lowagie.text.pdf.PdfDestination",
      "org.jfree.chart.title.LegendTitle",
      "com.lowagie.text.pdf.PdfTable",
      "org.jfree.chart.renderer.category.CategoryItemRendererState",
      "com.lowagie.text.pdf.PdfNumber",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.data.Value",
      "org.jfree.chart.event.MarkerChangeEvent",
      "org.jfree.data.time.MonthConstants",
      "org.jfree.chart.block.BlockFrame",
      "org.jfree.chart.event.AxisChangeListener",
      "org.jfree.data.general.DefaultValueDataset",
      "com.lowagie.text.pdf.BadPdfFormatException",
      "com.lowagie.text.Cell",
      "com.lowagie.text.pdf.ExtendedColor",
      "com.lowagie.text.pdf.PdfDocument$PdfInfo",
      "com.lowagie.text.pdf.PdfAcroForm",
      "org.jfree.chart.plot.CrosshairState",
      "org.jfree.chart.axis.AxisState",
      "org.jfree.chart.renderer.AbstractRenderer",
      "com.lowagie.text.pdf.PdfTransparencyGroup",
      "org.jfree.chart.block.RectangleConstraint",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.chart.plot.Zoomable",
      "org.jfree.chart.title.Title",
      "com.lowagie.text.pdf.PdfBorderArray",
      "com.lowagie.text.pdf.PdfEncodings$SymbolConversion",
      "org.jfree.chart.axis.DateTickMarkPosition",
      "com.lowagie.text.pdf.PdfGraphics2D",
      "com.lowagie.text.pdf.PdfFormXObject",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.chart.util.ObjectList",
      "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer",
      "com.lowagie.text.Image",
      "com.lowagie.text.pdf.PdfContentByte",
      "org.jfree.chart.block.BorderArrangement",
      "org.jfree.chart.plot.CombinedDomainXYPlot",
      "com.lowagie.text.pdf.PdfEncodings$Cp437Conversion",
      "org.jfree.data.general.SeriesDataset",
      "com.lowagie.text.ImgTemplate",
      "org.jfree.data.xy.XYDataset",
      "org.jfree.chart.block.Arrangement",
      "org.jfree.chart.plot.Plot",
      "com.lowagie.text.pdf.IntHashtable$Entry",
      "com.lowagie.text.pdf.PdfDocument$PdfCatalog",
      "com.lowagie.text.pdf.PdfICCBased",
      "org.jfree.chart.plot.ValueAxisPlot",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.data.time.TimePeriod",
      "org.jfree.chart.renderer.category.BarRenderer",
      "org.jfree.chart.event.AxisChangeEvent",
      "org.jfree.chart.LegendItem",
      "org.jfree.chart.urls.CategoryURLGenerator",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.util.LengthAdjustmentType",
      "org.jfree.chart.block.Block",
      "org.jfree.data.time.RegularTimePeriod",
      "com.lowagie.text.pdf.PdfDate",
      "com.lowagie.text.pdf.interfaces.PdfEncryptionSettings",
      "org.jfree.chart.entity.TickLabelEntity",
      "com.lowagie.text.ExceptionConverter",
      "com.lowagie.text.pdf.PdfEncodings$WingdingsConversion",
      "org.jfree.chart.renderer.category.MinMaxCategoryRenderer$2",
      "com.lowagie.text.xml.xmp.XmpBasicSchema",
      "com.lowagie.text.pdf.PdfRendition",
      "com.lowagie.text.pdf.PdfDashPattern",
      "org.jfree.data.general.PieDataset",
      "org.jfree.chart.entity.CategoryItemEntity",
      "com.lowagie.text.xml.xmp.XmpSchema",
      "org.jfree.data.KeyToGroupMap",
      "org.jfree.chart.renderer.category.MinMaxCategoryRenderer$1",
      "com.lowagie.text.Table",
      "org.jfree.chart.entity.AxisLabelEntity",
      "org.jfree.data.general.DatasetUtilities",
      "org.jfree.chart.util.BooleanList",
      "com.lowagie.text.pdf.PdfDictionary",
      "org.jfree.chart.axis.AxisLocation",
      "org.jfree.chart.util.AbstractObjectList",
      "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator",
      "org.jfree.data.xy.IntervalXYDataset",
      "com.lowagie.text.pdf.PdfStream",
      "org.jfree.data.general.KeyedValues2DDataset",
      "org.jfree.chart.entity.CategoryLabelEntity",
      "org.jfree.chart.util.RectangleEdge",
      "com.lowagie.text.pdf.PdfTemplate",
      "org.jfree.chart.block.LengthConstraintType",
      "org.jfree.chart.plot.DefaultDrawingSupplier",
      "com.lowagie.text.pdf.PdfGraphics2D$fakeComponent",
      "com.lowagie.text.pdf.PdfObject",
      "com.lowagie.text.ElementListener",
      "com.lowagie.text.pdf.PdfEncodings",
      "org.jfree.data.category.CategoryDataset",
      "org.jfree.data.Range",
      "org.jfree.chart.util.RectangleInsets",
      "org.jfree.chart.text.TextAnchor",
      "org.jfree.chart.axis.TickUnit",
      "org.jfree.chart.plot.PlotState",
      "org.jfree.data.time.Year",
      "org.jfree.chart.ChartColor",
      "org.jfree.chart.Drawable",
      "org.jfree.chart.util.GradientPaintTransformer",
      "com.lowagie.text.pdf.collection.PdfCollectionSort",
      "com.lowagie.text.pdf.PdfImage",
      "org.jfree.chart.util.StrokeList",
      "com.lowagie.text.pdf.interfaces.PdfVersion",
      "org.jfree.chart.util.StandardGradientPaintTransformer",
      "org.jfree.chart.text.TextLine",
      "com.lowagie.text.pdf.interfaces.PdfAnnotations",
      "org.jfree.chart.text.TextUtilities",
      "com.lowagie.text.pdf.interfaces.PdfRunDirection",
      "org.jfree.chart.axis.DateTickUnit",
      "com.lowagie.text.pdf.PdfPage",
      "org.jfree.chart.axis.TickUnitSource",
      "org.jfree.chart.plot.CategoryMarker",
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.chart.plot.XYPlot",
      "com.lowagie.text.pdf.PdfName",
      "org.jfree.chart.entity.ChartEntity",
      "com.lowagie.text.pdf.PdfGState",
      "org.jfree.chart.entity.EntityCollection",
      "com.lowagie.text.Rectangle",
      "org.jfree.data.Values2D",
      "com.lowagie.text.ImgWMF",
      "com.lowagie.text.pdf.PdfAppearance",
      "org.jfree.data.general.DatasetChangeEvent",
      "com.lowagie.text.pdf.interfaces.PdfDocumentActions",
      "org.jfree.chart.renderer.category.MinMaxCategoryRenderer",
      "org.jfree.data.category.DefaultCategoryDataset",
      "com.lowagie.text.pdf.PdfColor",
      "com.lowagie.text.Jpeg",
      "org.jfree.chart.plot.ThermometerPlot",
      "org.jfree.chart.util.Layer",
      "com.lowagie.text.ImgRaw",
      "org.jfree.chart.event.PlotChangeListener",
      "com.lowagie.text.pdf.IntHashtable",
      "com.lowagie.text.pdf.PdfPTableEvent",
      "com.lowagie.text.pdf.PdfString",
      "com.lowagie.text.BadElementException",
      "com.lowagie.text.pdf.collection.PdfTargetDictionary",
      "org.jfree.chart.axis.NumberTickUnit",
      "com.lowagie.text.pdf.PdfContents",
      "org.jfree.chart.plot.DrawingSupplier",
      "org.jfree.chart.title.TextTitle",
      "com.lowagie.text.pdf.PRIndirectReference",
      "com.lowagie.text.pdf.interfaces.PdfXConformance",
      "org.jfree.chart.util.PublicCloneable",
      "com.lowagie.text.DocumentException",
      "org.jfree.chart.event.ChartChangeEvent",
      "com.lowagie.text.Document",
      "org.jfree.data.KeyedValues2D",
      "org.jfree.data.Values",
      "com.lowagie.text.pdf.PdfPSXObject",
      "org.jfree.chart.axis.CyclicNumberAxis",
      "com.lowagie.text.xml.xmp.DublinCoreSchema",
      "com.lowagie.text.pdf.OutputStreamEncryption"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(BorderArrangement_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jfree.chart.block.BorderArrangement",
      "org.jfree.chart.util.RectangleEdge",
      "org.jfree.chart.block.LengthConstraintType",
      "org.jfree.chart.block.RectangleConstraint",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.category.DefaultCategoryDataset",
      "org.jfree.data.jdbc.JDBCCategoryDataset",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.chart.util.HorizontalAlignment",
      "org.jfree.chart.util.VerticalAlignment",
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.util.RectangleInsets",
      "org.jfree.chart.title.Title",
      "org.jfree.chart.title.CompositeTitle",
      "org.jfree.chart.block.BlockContainer",
      "org.jfree.chart.block.BlockBorder",
      "com.lowagie.text.pdf.PdfObject",
      "com.lowagie.text.pdf.ByteBuffer",
      "com.lowagie.text.pdf.PdfName",
      "com.lowagie.text.pdf.PdfContentByte",
      "com.lowagie.text.pdf.PdfTemplate",
      "com.lowagie.text.Rectangle",
      "com.lowagie.text.pdf.PdfDictionary",
      "org.jfree.chart.plot.Plot",
      "org.jfree.chart.plot.MultiplePiePlot",
      "org.jfree.chart.ChartColor",
      "org.jfree.chart.plot.DefaultDrawingSupplier",
      "org.jfree.chart.plot.PiePlot",
      "org.jfree.chart.plot.PieLabelLinkStyle",
      "org.jfree.chart.util.Rotation",
      "org.jfree.chart.PaintMap",
      "org.jfree.chart.StrokeMap",
      "org.jfree.chart.labels.AbstractPieItemLabelGenerator",
      "org.jfree.chart.labels.StandardPieSectionLabelGenerator",
      "org.jfree.chart.util.AbstractObjectList",
      "org.jfree.chart.util.ObjectList",
      "org.jfree.chart.plot.AbstractPieLabelDistributor",
      "org.jfree.chart.plot.PieLabelDistributor",
      "org.jfree.chart.resources.JFreeChartResources",
      "org.jfree.chart.ui.Licences",
      "org.jfree.chart.JFreeChart",
      "org.jfree.chart.title.LegendTitle",
      "org.jfree.chart.block.FlowArrangement",
      "org.jfree.chart.block.ColumnArrangement",
      "org.jfree.chart.util.RectangleAnchor",
      "org.jfree.chart.block.LineBorder",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.chart.event.TitleChangeEvent",
      "org.jfree.chart.event.ChartChangeEventType",
      "org.jfree.chart.util.TableOrder",
      "org.jfree.chart.title.TextTitle",
      "org.jfree.chart.text.TextAnchor",
      "org.jfree.chart.annotations.TextAnnotation",
      "org.jfree.chart.ChartPanel",
      "org.jfree.chart.plot.PlotOrientation",
      "org.jfree.chart.ChartRenderingInfo",
      "org.jfree.chart.entity.StandardEntityCollection",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.plot.CategoryPlot",
      "org.jfree.chart.plot.CombinedDomainCategoryPlot",
      "org.jfree.chart.axis.Axis",
      "org.jfree.chart.axis.CategoryAxis",
      "org.jfree.chart.event.AxisChangeEvent",
      "org.jfree.chart.axis.CategoryLabelPosition",
      "org.jfree.chart.text.TextBlockAnchor",
      "org.jfree.chart.axis.CategoryLabelWidthType",
      "org.jfree.chart.axis.CategoryLabelPositions",
      "org.jfree.chart.plot.DatasetRenderingOrder",
      "org.jfree.chart.util.SortOrder",
      "org.jfree.chart.axis.AxisLocation",
      "org.jfree.data.general.DatasetChangeEvent",
      "org.jfree.chart.event.PlotChangeEvent",
      "org.jfree.chart.axis.CategoryAnchor",
      "org.jfree.chart.plot.Marker",
      "org.jfree.chart.plot.ValueMarker",
      "org.jfree.chart.util.LengthAdjustmentType",
      "org.jfree.chart.util.Layer",
      "org.jfree.chart.plot.CategoryMarker",
      "org.jfree.chart.event.MarkerChangeEvent",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.time.Millisecond",
      "org.jfree.data.time.Day",
      "org.jfree.data.time.SerialDate",
      "org.jfree.data.time.SpreadsheetDate",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.data.time.DynamicTimeSeriesCollection",
      "org.jfree.data.time.Minute",
      "org.jfree.data.time.Second",
      "org.jfree.data.time.Hour",
      "org.jfree.data.category.DefaultIntervalCategoryDataset",
      "org.jfree.data.resources.DataPackageResources",
      "org.jfree.chart.PolarChartPanel",
      "org.jfree.chart.plot.ThermometerPlot",
      "org.jfree.data.general.DefaultValueDataset",
      "org.jfree.data.Range",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.chart.axis.TickUnit",
      "org.jfree.chart.axis.NumberTickUnit",
      "org.jfree.chart.axis.NumberAxis",
      "org.jfree.chart.axis.TickUnits",
      "org.jfree.data.RangeType",
      "org.jfree.chart.event.ChartProgressEvent",
      "org.jfree.chart.util.ObjectUtilities",
      "org.jfree.chart.text.TextUtilities",
      "org.jfree.chart.text.TextBlock",
      "org.jfree.chart.text.TextLine",
      "org.jfree.chart.text.TextFragment",
      "org.jfree.chart.util.Size2D",
      "org.jfree.chart.entity.ChartEntity",
      "com.lowagie.text.Document",
      "com.lowagie.text.PageSize",
      "com.lowagie.text.DocWriter",
      "com.lowagie.text.pdf.PdfWriter",
      "com.lowagie.text.pdf.PdfDocument",
      "com.lowagie.text.pdf.PdfDate",
      "com.lowagie.text.pdf.internal.PdfViewerPreferencesImp",
      "com.lowagie.text.pdf.internal.PdfVersionImp",
      "com.lowagie.text.pdf.internal.PdfXConformanceImp",
      "org.jfree.chart.renderer.AbstractRenderer",
      "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer",
      "org.jfree.chart.renderer.category.BarRenderer",
      "org.jfree.chart.renderer.category.StatisticalBarRenderer",
      "org.jfree.chart.util.BooleanList",
      "org.jfree.chart.util.PaintList",
      "org.jfree.chart.util.StrokeList",
      "org.jfree.chart.util.ShapeList",
      "org.jfree.chart.labels.ItemLabelPosition",
      "org.jfree.chart.labels.ItemLabelAnchor",
      "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator",
      "org.jfree.chart.util.StandardGradientPaintTransformer",
      "org.jfree.chart.util.GradientPaintTransformType",
      "org.jfree.chart.renderer.category.AreaRenderer",
      "org.jfree.chart.renderer.category.StackedAreaRenderer",
      "org.jfree.chart.renderer.AreaRendererEndType",
      "org.jfree.chart.renderer.WaferMapRenderer",
      "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
      "org.jfree.chart.renderer.xy.XYAreaRenderer",
      "org.jfree.chart.labels.StandardXYSeriesLabelGenerator",
      "org.jfree.chart.event.RendererChangeEvent",
      "org.jfree.chart.renderer.category.StackedBarRenderer",
      "org.jfree.chart.needle.MeterNeedle",
      "org.jfree.chart.needle.ArrowNeedle",
      "org.jfree.chart.needle.WindNeedle",
      "org.jfree.chart.plot.CompassPlot",
      "org.jfree.chart.plot.CombinedRangeCategoryPlot",
      "org.jfree.chart.axis.NumberAxis3D",
      "com.lowagie.text.pdf.AsianFontMapper",
      "com.lowagie.text.pdf.BaseFont",
      "com.lowagie.text.pdf.CJKFont",
      "org.jfree.chart.renderer.xy.XYBarRenderer",
      "org.jfree.chart.renderer.xy.StackedXYBarRenderer",
      "org.jfree.data.xy.DefaultHighLowDataset",
      "org.jfree.data.gantt.TaskSeriesCollection",
      "org.jfree.data.xy.XYIntervalSeriesCollection",
      "org.jfree.data.xy.DefaultWindDataset",
      "org.jfree.data.general.CombinedDataset",
      "com.lowagie.text.Image",
      "com.lowagie.text.Jpeg2000",
      "org.jfree.chart.plot.PiePlot3D",
      "org.jfree.chart.plot.WaferMapPlot",
      "com.lowagie.text.DocumentException",
      "com.lowagie.text.BadElementException",
      "org.jfree.chart.renderer.category.ScatterRenderer",
      "org.jfree.chart.block.LabelBlock",
      "org.jfree.chart.plot.RingPlot",
      "org.jfree.chart.renderer.xy.XYBlockRenderer",
      "org.jfree.chart.renderer.LookupPaintScale",
      "org.jfree.chart.title.PaintScaleLegend",
      "org.jfree.chart.annotations.CategoryLineAnnotation",
      "org.jfree.chart.axis.CyclicNumberAxis",
      "org.jfree.chart.plot.FastScatterPlot",
      "org.jfree.chart.title.DateTitle",
      "com.lowagie.text.Phrase",
      "com.lowagie.text.Paragraph",
      "com.lowagie.text.Font",
      "org.jfree.chart.plot.SpiderWebPlot",
      "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator",
      "org.jfree.chart.labels.StandardCategoryItemLabelGenerator",
      "org.jfree.chart.renderer.category.IntervalBarRenderer",
      "org.jfree.chart.renderer.category.GanttRenderer",
      "org.jfree.data.statistics.DefaultMultiValueCategoryDataset",
      "org.jfree.data.KeyedObjects2D",
      "org.jfree.chart.plot.XYPlot",
      "org.jfree.chart.plot.CombinedDomainXYPlot",
      "org.jfree.chart.plot.SeriesRenderingOrder",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset",
      "org.jfree.chart.axis.ModuloAxis",
      "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer",
      "org.jfree.chart.labels.AbstractXYItemLabelGenerator",
      "org.jfree.chart.labels.StandardXYToolTipGenerator",
      "org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator",
      "org.jfree.data.xy.DefaultTableXYDataset",
      "org.jfree.data.xy.IntervalXYDelegate",
      "org.jfree.data.time.DateRange",
      "org.jfree.chart.axis.DateTickUnit",
      "org.jfree.chart.axis.DateAxis$DefaultTimeline",
      "org.jfree.chart.axis.DateAxis",
      "org.jfree.chart.axis.DateTickMarkPosition",
      "org.jfree.data.general.WaferMapDataset",
      "com.lowagie.text.SimpleCell",
      "org.jfree.chart.axis.CategoryAxis3D",
      "org.jfree.chart.plot.PolarPlot",
      "org.jfree.chart.renderer.xy.StackedXYAreaRenderer",
      "org.jfree.data.general.Series",
      "org.jfree.data.time.TimePeriodValues",
      "org.jfree.chart.block.GridArrangement",
      "com.lowagie.text.pdf.PdfAppearance",
      "org.jfree.chart.renderer.DefaultPolarItemRenderer",
      "org.jfree.chart.renderer.category.BarRenderer3D",
      "org.jfree.chart.renderer.category.StackedBarRenderer3D",
      "org.jfree.chart.axis.SymbolAxis",
      "org.jfree.data.time.Week",
      "org.jfree.data.time.TimePeriodFormatException",
      "com.lowagie.text.pdf.PdfGraphics2D",
      "com.lowagie.text.pdf.Type1Font",
      "com.lowagie.text.ExceptionConverter",
      "com.lowagie.text.pdf.codec.PngImage",
      "com.lowagie.text.pdf.PdfAnnotation",
      "com.lowagie.text.pdf.PdfFormField",
      "org.jfree.chart.block.ColorBlock",
      "org.jfree.chart.renderer.category.LayeredBarRenderer",
      "org.jfree.chart.renderer.category.WaterfallBarRenderer",
      "org.jfree.data.xy.XYSeriesCollection",
      "org.jfree.chart.axis.PeriodAxis",
      "org.jfree.data.time.Year",
      "org.jfree.data.time.Quarter",
      "org.jfree.data.time.Month",
      "org.jfree.chart.axis.PeriodAxisLabelInfo",
      "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer",
      "org.jfree.chart.renderer.xy.XYErrorRenderer",
      "org.jfree.chart.renderer.xy.XYBubbleRenderer",
      "org.jfree.chart.plot.MeterPlot",
      "org.jfree.chart.plot.DialShape",
      "org.jfree.chart.axis.ExtendedCategoryAxis",
      "org.jfree.chart.annotations.XYTextAnnotation",
      "org.jfree.data.xy.DefaultXYDataset",
      "org.jfree.data.time.TimeSeriesDataItem",
      "org.jfree.chart.util.ShapeUtilities",
      "org.jfree.chart.renderer.xy.StandardXYItemRenderer",
      "org.jfree.chart.renderer.xy.CyclicXYItemRenderer",
      "com.lowagie.text.ImgCCITT",
      "org.jfree.chart.renderer.category.LineAndShapeRenderer",
      "org.jfree.chart.renderer.category.LineRenderer3D",
      "org.jfree.data.statistics.HistogramDataset",
      "org.jfree.data.statistics.HistogramType",
      "org.jfree.chart.renderer.category.MinMaxCategoryRenderer",
      "com.lowagie.text.List",
      "com.lowagie.text.Chunk",
      "com.lowagie.text.FontFactoryImp",
      "com.lowagie.text.FontFactory",
      "com.lowagie.text.pdf.PdfEncodings$WingdingsConversion",
      "com.lowagie.text.pdf.PdfEncodings$SymbolConversion",
      "com.lowagie.text.pdf.PdfEncodings$Cp437Conversion",
      "com.lowagie.text.pdf.PdfEncodings",
      "com.lowagie.text.Anchor",
      "org.jfree.chart.axis.SubCategoryAxis",
      "org.jfree.chart.renderer.xy.ClusteredXYBarRenderer",
      "org.jfree.chart.axis.SegmentedTimeline",
      "org.jfree.data.time.TimeSeriesCollection",
      "org.jfree.data.time.TimePeriodAnchor",
      "com.lowagie.text.Jpeg",
      "org.jfree.chart.block.CenterArrangement",
      "org.jfree.data.general.DefaultKeyedValues2DDataset",
      "org.jfree.chart.renderer.xy.VectorRenderer",
      "org.jfree.chart.renderer.category.GroupedStackedBarRenderer",
      "org.jfree.data.KeyToGroupMap",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset",
      "org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer",
      "org.jfree.data.jdbc.JDBCXYDataset",
      "org.jfree.chart.renderer.xy.XYDifferenceRenderer",
      "org.jfree.chart.block.EmptyBlock",
      "org.jfree.chart.renderer.xy.CandlestickRenderer",
      "org.jfree.chart.labels.HighLowItemLabelGenerator",
      "org.jfree.chart.renderer.xy.XYStepAreaRenderer",
      "org.jfree.data.general.SubSeriesDataset",
      "org.jfree.chart.plot.CombinedRangeXYPlot",
      "org.jfree.chart.plot.IntervalMarker",
      "org.jfree.chart.axis.LogAxis",
      "org.jfree.data.statistics.SimpleHistogramDataset",
      "org.jfree.chart.LegendItemCollection",
      "org.jfree.chart.LegendItem",
      "org.jfree.chart.title.LegendGraphic",
      "org.jfree.chart.title.LegendItemBlockContainer",
      "org.jfree.chart.renderer.GrayPaintScale",
      "org.jfree.chart.renderer.xy.XYSplineAndShapeRenderer",
      "org.jfree.data.general.DefaultPieDataset",
      "org.jfree.data.jdbc.JDBCPieDataset",
      "org.jfree.data.DefaultKeyedValues",
      "org.jfree.chart.axis.LogarithmicAxis",
      "org.jfree.data.time.TimeTableXYDataset",
      "org.jfree.data.xy.CategoryTableXYDataset",
      "org.jfree.chart.renderer.xy.XYLine3DRenderer",
      "org.jfree.chart.axis.AxisSpace",
      "org.jfree.data.statistics.DefaultStatisticalCategoryDataset",
      "org.jfree.chart.annotations.CategoryTextAnnotation",
      "org.jfree.chart.annotations.CategoryPointerAnnotation",
      "com.lowagie.text.pdf.PdfReader",
      "org.jfree.data.xy.YIntervalSeriesCollection",
      "org.jfree.chart.text.TextBox",
      "org.jfree.chart.urls.StandardXYURLGenerator",
      "org.jfree.chart.renderer.xy.XYAreaRenderer2",
      "org.jfree.chart.renderer.xy.DefaultXYItemRenderer",
      "org.jfree.data.time.TimePeriodValuesCollection",
      "org.jfree.data.xy.XYBarDataset",
      "org.jfree.chart.renderer.xy.StackedXYAreaRenderer2",
      "org.jfree.chart.renderer.category.LevelRenderer",
      "com.lowagie.text.pdf.PdfGState",
      "org.jfree.chart.labels.BubbleXYItemLabelGenerator",
      "org.jfree.data.xy.XIntervalSeriesCollection",
      "org.jfree.chart.labels.CustomXYToolTipGenerator",
      "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer",
      "com.lowagie.text.factories.RomanNumberFactory",
      "org.jfree.data.general.DefaultKeyedValuesDataset",
      "org.jfree.chart.renderer.xy.DeviationRenderer",
      "org.jfree.data.xy.DefaultIntervalXYDataset",
      "org.jfree.chart.renderer.xy.YIntervalRenderer",
      "org.jfree.chart.renderer.xy.HighLowRenderer",
      "org.jfree.chart.renderer.category.CategoryStepRenderer",
      "org.jfree.chart.renderer.xy.WindItemRenderer",
      "com.lowagie.text.pdf.PdfLayerMembership",
      "com.lowagie.text.ListItem",
      "org.jfree.data.xy.MatrixSeries",
      "org.jfree.chart.urls.TimeSeriesURLGenerator",
      "org.jfree.chart.title.ImageTitle",
      "org.jfree.data.general.SeriesChangeEvent",
      "org.jfree.data.xy.AbstractXYZDataset",
      "org.jfree.data.xy.MatrixSeriesCollection"
    );
  }
}