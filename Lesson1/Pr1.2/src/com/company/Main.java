package com.company;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


///////Если чего-то не помним, то ГУГЛ ИСПОЛЬЗУЕМ!!!!!Читаем, узнаем что-то НОВОЕ... ))))
////task 4
public class Main extends Application{

    TextField TFNum1;
    TextField TFNum2;
    Button btnDivide;
    Button btnMultiply;
    Button btnAddition;
    Button btnSubtraction;
    Button btnClear;
    Label lblAnswer;
    @Override
    public void start(Stage primaryStage) {

        TFNum1 = new TextField();
        TFNum2 = new TextField();
        btnDivide = new Button("/");
        btnMultiply = new Button("*");
        btnAddition = new Button("+");
        btnSubtraction = new Button("-");
        btnClear = new Button("Clean");
        lblAnswer = new Label("=");

        lblAnswer.setAlignment(Pos.CENTER);
        lblAnswer.setStyle("-fx-border-color: #000; -fx-padding: 5px;");

        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);

        root.setHgap(10);
        root.setVgap(10);

        root.add(btnDivide, 0, 0);
        root.add(btnMultiply, 1, 0);
        root.add(btnAddition, 0, 1);
        root.add(btnSubtraction, 1, 1);
        root.add(btnClear, 0, 4, 2, 1);

        root.add(TFNum1, 0, 2);
        root.add(TFNum2, 1, 2);
        root.add(lblAnswer, 0, 3, 2, 1);

        setWidths();
        attachCode();

        Scene scene = new Scene(root, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void setWidths() {
        TFNum1.setPrefWidth(70);
        TFNum2.setPrefWidth(70);
        btnDivide.setPrefWidth(70);
        btnMultiply.setPrefWidth(70);
        btnAddition.setPrefWidth(70);
        btnSubtraction.setPrefWidth(70);
        btnClear.setPrefWidth(150);
        lblAnswer.setPrefWidth(150);
    }

    private void attachCode() {
        btnAddition.setOnAction(e -> btncode(e));
        btnSubtraction.setOnAction(e -> btncode(e));
        btnMultiply.setOnAction(e -> btncode(e));
        btnDivide.setOnAction(e -> btncode(e));
        btnClear.setOnAction(e -> btncode(e));
    }

    private void btncode(ActionEvent e) {
        int num1, num2, answer;
        char symbol;
        if (e.getSource() == btnClear) {
            TFNum1.setText("");
            TFNum2.setText("");
            lblAnswer.setText("=");
            TFNum1.requestFocus();
            return;
        }
        num1 = Integer.parseInt(TFNum1.getText());
        num2 = Integer.parseInt(TFNum2.getText());
        if (e.getSource() == btnAddition) {
            symbol = '+';
            answer = num1 + num2;
        } else if (e.getSource() == btnSubtraction) {
            symbol = '-';
            answer = num1 - num2;
        } else if (e.getSource() == btnMultiply) {
            symbol = 'x';
            answer = num1 * num2;
        } else {
            symbol = '/';
            answer = num1 / num2;
        }
        lblAnswer.setText("" + num1 + symbol + num2 + "=" + answer);
    }

    public static void main(String[] args) {
        launch(args);
    }



}