package javafxp;

import javafx.application.*;
import javafx.stage.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
public class MyApplication extends Application
{
    public static void main(String args[])
    {
        launch(args);
    }

    public void start(Stage stage)
    {
        initUI(stage);
    }

    public void initUI(Stage mine)
    {
        Button b = new Button("Click me");
        b.setOnAction(
            new EventHandler<ActionEvent>()
            {
                public void handle(ActionEvent evt)
                {
                    System.out.println("Made it");
                }
            }
        );
        StackPane root = new StackPane();
        root.getChildren().add(b);
        Scene s = new Scene(root);
        mine.setScene(s);
        mine.show();
    }
}