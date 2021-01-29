package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

	@FXML
	private Button button;
	
	public void goBack(ActionEvent event) throws IOException{
		Main m = new Main();
		m.changeScene("view/fxmlfiles/Inslience.fxml");
	}
	
}
