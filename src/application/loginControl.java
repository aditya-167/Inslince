package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class loginControl {
	@FXML
	private Button register;
	
	public void goFront(ActionEvent event) throws IOException{
		Main m = new Main();
		m.changeScene("view/fxmlfiles/second.fxml");
	}

}
