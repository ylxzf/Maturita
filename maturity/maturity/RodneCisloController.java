package rodnecislo;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RodneCisloController implements Initializable {

	@FXML
	private TextField txtCislo1;
	@FXML
	private TextField txtCislo2;
	@FXML
	private Label lblOut;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}

	public void check(ActionEvent e) {
		lblOut.setText("");
		String cislo1 = txtCislo1.getText();
		String cislo2 = txtCislo2.getText();

		if (cislo1.length() == 6 && cislo2.length() > 2 && cislo2.length() < 5) {
			String rcS = cislo1 + cislo2;

			try {
				int rc = Integer.parseInt(rcS);
			} catch (Exception ex) {
				throw new NumberFormatException();
			}

			String mesic = rcS.substring(2, 4);
			String den = rcS.substring(4, 6);

			int mesicInt = Integer.parseInt(mesic);
			int denInt = Integer.parseInt(den);

			if (((mesicInt % 50) > 0 && (mesicInt % 50) < 13) && (denInt > 0 && denInt < 32)) {
				int rc = Integer.parseInt(rcS);
				if (rc % 11 == 0) {
					lblOut.setText("Spravne");
				} else {
					lblOut.setText("Spatne");
				}
			} else {
				lblOut.setText("Spatny input");
			}
		} else {
			lblOut.setText("Spatny input");
		}
	}
}