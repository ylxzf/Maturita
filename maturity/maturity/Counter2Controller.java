package counter2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Counter2Controller implements Initializable {
	
	int count;
	
	@FXML
	private Label lblCount;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		count = 0;
	}
	
	@FXML
	private void control(ActionEvent e) {
		
		switch (((Button) (e.getSource())).getId()) {
		case "btnPlus": 
			count++;
			break;
			
		case "btnMinus": 
			count--;
			break;
			
		case "btnReset": 
			count = 0;
			break;
		}
		lblCount.setText(Integer.toString(count));
	} 
}