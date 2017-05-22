package org.jfree.data.time;


public class TimeSeries_ESTest_scaffolding {
    public static void setSystemProperties() {
    }

    private static void initializeClasses() {
        org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(org.jfree.data.time.TimeSeries_ESTest_scaffolding.class.getClassLoader(), "org.jfree.data.time.Quarter", "org.jfree.data.category.IntervalCategoryDataset", "org.jfree.data.time.Year", "org.jfree.data.time.SerialDate", "org.jfree.data.resources.DataPackageResources", "org.jfree.data.time.Minute", "org.jfree.data.general.DatasetChangeListener", "org.jfree.data.general.AbstractDataset", "org.jfree.data.general.AbstractSeriesDataset", "org.jfree.data.RangeInfo", "org.jfree.data.xy.XYDataItem", "org.jfree.data.general.DatasetGroup", "org.jfree.data.time.SpreadsheetDate", "org.jfree.data.time.Millisecond", "org.jfree.chart.util.TableOrder", "org.jfree.data.time.Day", "org.jfree.data.general.SeriesDataset", "org.jfree.data.Values2D", "org.jfree.data.general.SeriesChangeEvent", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.time.TimeSeriesDataItem", "org.jfree.data.UnknownKeyException", "org.jfree.data.general.DatasetChangeEvent", "org.jfree.data.time.Month", "org.jfree.data.time.TimePeriod", "org.jfree.data.general.SeriesChangeListener", "org.jfree.data.general.Dataset", "org.jfree.data.time.Week", "org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.TimePeriodFormatException", "org.jfree.data.time.Hour", "org.jfree.data.statistics.BoxAndWhiskerItem", "org.jfree.data.time.TimeSeries", "org.jfree.data.category.CategoryToPieDataset", "org.jfree.data.general.Series", "org.jfree.data.general.PieDataset", "org.jfree.data.statistics.BoxAndWhiskerCategoryDataset", "org.jfree.data.time.FixedMillisecond", "org.jfree.chart.util.ObjectUtilities", "org.jfree.chart.util.PublicCloneable", "org.jfree.data.time.Second", "org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.time.MonthConstants", "org.jfree.data.KeyedValues2D", "org.jfree.data.Values", "org.jfree.data.KeyedObjects2D", "org.jfree.data.category.CategoryDataset", "org.jfree.data.Range", "org.jfree.data.KeyedValues", "org.jfree.data.general.SeriesException");
    }

    private static void resetClasses() {
        org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(org.jfree.data.time.TimeSeries_ESTest_scaffolding.class.getClassLoader());
        org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses("org.jfree.data.general.Series", "org.jfree.data.time.TimeSeries", "org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.Hour", "org.jfree.data.time.Day", "org.jfree.data.time.SerialDate", "org.jfree.data.time.SpreadsheetDate", "org.jfree.data.time.Second", "org.jfree.data.time.Year", "org.jfree.data.time.Quarter", "org.jfree.data.time.Month", "org.jfree.data.time.Minute", "org.jfree.data.time.Millisecond", "org.jfree.data.general.AbstractDataset", "org.jfree.data.general.AbstractSeriesDataset", "org.jfree.data.xy.AbstractXYDataset", "org.jfree.data.xy.AbstractIntervalXYDataset", "org.jfree.data.time.DynamicTimeSeriesCollection", "org.jfree.data.general.DatasetGroup", "org.jfree.data.statistics.HistogramDataset", "org.jfree.data.statistics.HistogramType", "org.jfree.data.time.TimePeriodFormatException", "org.jfree.data.xy.DefaultHighLowDataset", "org.jfree.data.time.FixedMillisecond", "org.jfree.data.time.Week", "org.jfree.data.xy.OHLCDataItem", "org.jfree.data.xy.DefaultOHLCDataset", "org.jfree.data.statistics.DefaultStatisticalCategoryDataset", "org.jfree.data.KeyedObjects2D", "org.jfree.data.time.TimePeriodValues", "org.jfree.data.xy.AbstractXYZDataset", "org.jfree.data.xy.MatrixSeriesCollection", "org.jfree.data.category.DefaultCategoryDataset", "org.jfree.data.general.DefaultKeyedValues2DDataset", "org.jfree.data.DefaultKeyedValues2D", "org.jfree.chart.util.TableOrder", "org.jfree.data.category.CategoryToPieDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.gantt.TaskSeriesCollection", "org.jfree.data.xy.XYSeries", "org.jfree.data.ComparableObjectSeries", "org.jfree.data.xy.XYIntervalSeries", "org.jfree.chart.util.ObjectUtilities", "org.jfree.data.xy.VectorSeriesCollection", "org.jfree.data.xy.XYDataItem", "org.jfree.data.xy.XIntervalSeries", "org.jfree.data.time.TimeSeriesCollection", "org.jfree.data.time.TimePeriodAnchor", "org.jfree.data.xy.XYBarDataset", "org.jfree.data.time.TimeSeriesDataItem", "org.jfree.data.general.SeriesException", "org.jfree.data.general.DefaultPieDataset", "org.jfree.data.general.DefaultKeyedValuesDataset", "org.jfree.data.DefaultKeyedValues", "org.jfree.data.general.junit.DefaultPieDatasetTests", "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset", "org.jfree.data.time.TimeTableXYDataset", "org.jfree.data.jdbc.JDBCPieDataset", "org.jfree.data.time.SimpleTimePeriod", "org.jfree.data.general.CombinedDataset", "org.jfree.data.statistics.DefaultMultiValueCategoryDataset", "org.jfree.data.Range", "org.jfree.data.time.TimePeriodValuesCollection", "org.jfree.data.xy.XYSeriesCollection", "org.jfree.data.xy.IntervalXYDelegate", "org.jfree.data.xy.XIntervalSeriesCollection", "org.jfree.data.xy.DefaultWindDataset", "org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.resources.DataPackageResources", "org.jfree.data.statistics.SimpleHistogramBin", "org.jfree.data.xy.VectorSeries", "org.jfree.data.jdbc.JDBCCategoryDataset", "org.jfree.data.xy.CategoryTableXYDataset", "org.jfree.data.general.SeriesChangeEvent", "org.jfree.data.xy.DefaultTableXYDataset", "org.jfree.data.general.SubSeriesDataset", "org.jfree.data.statistics.SimpleHistogramDataset", "org.jfree.data.xy.DefaultIntervalXYDataset", "org.jfree.data.xy.YIntervalSeriesCollection", "org.jfree.data.general.DatasetChangeEvent", "org.jfree.data.xy.XYIntervalSeriesCollection", "org.jfree.data.jdbc.JDBCXYDataset", "org.jfree.data.UnknownKeyException", "org.jfree.data.xy.DefaultXYDataset");
    }
}

