import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.util.List;

public class RandomStatistics extends Application {

    @Override
    public void start(Stage stage) {
        int range = 200;
            //range = application.arguments().getInt;
        RandomNumber randomSeries = new RandomNumber(range);
        List<KV> numberList = randomSeries.randomCount();
        stage.setTitle("Random Chart Statistics");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String,Number> bc
                = new BarChart<>(xAxis,yAxis);
        bc.setTitle("Random range "+ range + " has total " + randomSeries.repeatCount + " repeat numbers");
        xAxis.setLabel("repeat number");
        //xAxis.setTickLabelRotation(90);
        yAxis.setLabel("Value");

        XYChart.Series series1 = new XYChart.Series();
        for(int i=0;i< numberList.size();i++) {
            String cat = Integer.toString(numberList.get(i).key);
            series1.getData().add(new XYChart.Data(cat,numberList.get(i).value));
        }
        Scene scene = new Scene(bc, 800, 600);
        bc.getData().add(series1);//addAll(series1, series2, series3);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
