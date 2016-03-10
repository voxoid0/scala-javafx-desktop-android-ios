// Based on a sample from the book "Learn JavaFX 8: Building User Experience and Interfaces with Java 8", by Kishori Sharan
// http://www.apress.com/9781484211434

package net.joelbecker.myapp;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import net.joelbecker.myapp.module1.PieChartUtil2;

public class PieChartTest extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) {
		PieChart chart = new PieChart();
		chart.setTitle("Letter Frequency in the U.S. Constitution");

		// Place the legend on the left side
		chart.setLegendSide(Side.LEFT);

		// Set the data for the chart
		ObservableList<PieChart.Data> chartData = PieChartUtil2.getChartData();
		chart.setData(chartData);

		StackPane root = new StackPane(chart);
		Scene scene = new Scene(root);

		stage.setScene(scene);
		stage.setTitle("JavaFX + Scala");
		stage.show();
	}
}
