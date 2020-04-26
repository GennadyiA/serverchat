package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;



public class Controller {
    public TextField userMessageArea;
    public TextArea commonMessageArea;

    public void sendMessage(ActionEvent actionEvent) {
        sendMessage();
    }

    public void keyListener(KeyEvent keyEvent){
        if(keyEvent.getCode().equals(KeyCode.ENTER)){
            sendMessage();
        }
    }


    private void sendMessage(){
        String message = userMessageArea.getText();
        commonMessageArea.appendText(message + System.lineSeparator());
        userMessageArea.clear();
    }
}
