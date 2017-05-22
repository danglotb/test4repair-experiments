package org.jfree.data.time;


public class TimeSeries_ESTest_scaffolding {
    public static void setSystemProperties() {
    }

    private static void initializeClasses() {
        org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(org.jfree.data.time.TimeSeries_ESTest_scaffolding.class.getClassLoader(), "org.jfree.data.general.SeriesChangeListener", "org.jfree.data.time.Quarter", "org.jfree.data.time.Year", "org.jfree.data.time.SerialDate", "org.jfree.data.general.Dataset", "org.jfree.data.time.Week", "org.jfree.data.DomainOrder", "org.jfree.data.time.Minute", "org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.TimePeriodFormatException", "org.jfree.data.time.Hour", "org.jfree.data.time.TimeSeries", "org.jfree.data.general.Series", "org.jfree.data.general.DatasetChangeListener", "org.jfree.data.general.AbstractDataset", "org.jfree.data.xy.DefaultWindDataset", "org.jfree.data.general.AbstractSeriesDataset", "org.jfree.data.xy.AbstractIntervalXYDataset", "org.jfree.data.time.FixedMillisecond", "org.jfree.data.xy.IntervalXYDataset", "org.jfree.data.general.DatasetGroup", "org.jfree.data.time.SpreadsheetDate", "org.jfree.data.statistics.SimpleHistogramBin", "org.jfree.chart.util.ObjectUtilities", "org.jfree.data.xy.WindDataset", "org.jfree.chart.util.PublicCloneable", "org.jfree.data.time.Millisecond", "org.jfree.data.statistics.SimpleHistogramDataset", "org.jfree.data.time.Second", "org.jfree.data.xy.AbstractXYDataset", "org.jfree.data.time.Day", "org.jfree.data.time.MonthConstants", "org.jfree.data.general.SeriesDataset", "org.jfree.data.xy.XYDataset", "org.jfree.data.general.SeriesChangeEvent", "org.jfree.data.general.SeriesException", "org.jfree.data.time.TimeSeriesDataItem", "org.jfree.data.time.Month", "org.jfree.data.general.DatasetChangeEvent", "org.jfree.data.time.TimePeriod");
    }

    private static void resetClasses() {
        org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(org.jfree.data.time.TimeSeries_ESTest_scaffolding.class.getClassLoader());
        org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses("org.jfree.data.general.Series", "org.jfree.data.time.TimeSeries", "org.jfree.data.time.RegularTimePeriod", "org.jfree.data.time.Hour", "org.jfree.data.time.Day", "org.jfree.data.time.SerialDate", "org.jfree.data.time.SpreadsheetDate", "org.jfree.data.time.Second", "org.jfree.data.time.Year", "org.jfree.data.time.Quarter", "org.jfree.data.time.Month", "org.jfree.data.time.Minute", "org.jfree.data.time.Millisecond", "org.jfree.data.general.AbstractDataset", "org.jfree.data.general.AbstractSeriesDataset", "org.jfree.data.xy.AbstractXYDataset", "org.jfree.data.xy.AbstractIntervalXYDataset", "org.jfree.data.time.DynamicTimeSeriesCollection", "org.jfree.data.general.DatasetGroup", "org.jfree.data.statistics.HistogramDataset", "org.jfree.data.statistics.HistogramType", "org.jfree.data.time.TimePeriodFormatException", "org.jfree.data.xy.DefaultHighLowDataset", "org.jfree.data.time.FixedMillisecond", "org.jfree.data.xy.DefaultXYDataset", "org.jfree.data.time.Week", "org.jfree.data.xy.XYSeries", "org.jfree.data.category.DefaultIntervalCategoryDataset", "org.jfree.data.resources.DataPackageResources", "org.jfree.data.DefaultKeyedValue", "org.jfree.data.time.TimeSeriesCollection", "org.jfree.data.time.TimePeriodAnchor", "org.jfree.data.time.TimeSeriesDataItem", "org.jfree.data.general.SeriesException", "org.jfree.data.xy.VectorSeriesCollection", "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset", "org.jfree.data.time.SimpleTimePeriod", "org.jfree.data.xy.XYDataItem", "org.jfree.data.general.SeriesChangeEvent", "org.jfree.data.ComparableObjectSeries", "org.jfree.data.xy.XIntervalSeries", "org.jfree.data.xy.DefaultTableXYDataset", "org.jfree.data.xy.IntervalXYDelegate", "org.jfree.data.general.DefaultPieDataset", "org.jfree.data.general.DefaultKeyedValuesDataset", "org.jfree.data.DefaultKeyedValues", "org.jfree.data.xy.XYIntervalSeriesCollection", "org.jfree.data.statistics.SimpleHistogramBin", "org.jfree.data.gantt.TaskSeriesCollection", "org.jfree.data.general.DefaultKeyedValueDataset", "org.jfree.data.general.CombinedDataset", "org.jfree.data.general.WaferMapDataset", "org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.general.DatasetChangeEvent", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.KeyedObjects2D", "org.jfree.data.statistics.DefaultMultiValueCategoryDataset", "org.jfree.data.Range", "org.jfree.data.xy.OHLCDataItem", "org.jfree.data.xy.DefaultOHLCDataset", "org.jfree.data.time.TimeTableXYDataset", "org.jfree.data.category.DefaultCategoryDataset", "org.jfree.data.general.DefaultKeyedValues2DDataset", "org.jfree.data.xy.XIntervalSeriesCollection", "org.jfree.data.general.SubSeriesDataset", "org.jfree.data.xy.DefaultIntervalXYDataset", "org.jfree.data.xy.XYSeriesCollection", "org.jfree.chart.util.TableOrder", "org.jfree.data.category.CategoryToPieDataset", "org.jfree.data.xy.VectorSeries", "org.jfree.data.xy.CategoryTableXYDataset", "org.jfree.data.xy.XYIntervalSeries", "org.jfree.data.jdbc.JDBCXYDataset", "org.jfree.data.xy.AbstractXYZDataset", "org.jfree.data.xy.DefaultXYZDataset", "org.jfree.data.xy.XYBarDataset", "org.jfree.data.statistics.SimpleHistogramDataset", "org.jfree.data.statistics.DefaultStatisticalCategoryDataset", "org.jfree.data.xy.YIntervalSeries", "org.jfree.data.time.TimePeriodValues", "org.jfree.data.xy.DefaultWindDataset", "org.jfree.data.time.TimePeriodValuesCollection", "org.jfree.data.jdbc.JDBCCategoryDataset", "org.jfree.data.jdbc.JDBCPieDataset", "org.jfree.data.xy.YIntervalSeriesCollection", "org.jfree.data.xy.MatrixSeriesCollection", "org.jfree.chart.util.ObjectUtilities", "org.jfree.data.xy.MatrixSeries");
    }
}

