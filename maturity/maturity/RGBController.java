package rgb;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class RGBController implements Initializable {

	private int red = 0;
	private int green = 0;
	private int blue = 0;

	@FXML
	private Pane pane;
	@FXML
	private Slider scrRed;
	@FXML
	private Slider scrGreen;
	@FXML
	private Slider scrBlue;
	@FXML
	private Label lblRed;
	@FXML
	private Label lblGreen;
	@FXML
	private Label lblBlue;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		scrRed.valueProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> arg0, Number oldValue, Number newValue) {
				red = newValue.intValue();
				lblRed.setText(Integer.toString(red));
				setPaneBG();
			}
		});

		scrBlue.valueProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> arg0, Number oldValue, Number newValue) {
				blue = newValue.intValue();
				lblBlue.setText(Integer.toString(blue));
				setPaneBG();
			}
		});

		scrGreen.valueProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> arg0, Number oldValue, Number newValue) {
				green = newValue.intValue();
				lblGreen.setText(Integer.toString(green));
				setPaneBG();
			}
		});

		lblRed.setText(Integer.toString(red));
		lblGreen.setText(Integer.toString(green));
		lblBlue.setText(Integer.toString(blue));
		setPaneBG();

	}

	private void setPaneBG() {
		pane.setBackground(new Background(
				new BackgroundFill(Color.rgb(red, green, blue),
						CornerRadii.EMPTY, Insets.EMPTY)));
	}

}