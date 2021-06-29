package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SampleController {
	
	@FXML
	private Label label;
	
	public void initialize() {
		label.setText("hello world");
	}
	
}
