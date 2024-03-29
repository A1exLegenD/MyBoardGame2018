package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class Controller {

    @FXML
    private Canvas backg, foreg;


    @FXML
    private void init(){
        Square s = new Square(50,Color.BLACK,100,100);
        drawSquare(s);

    }
    @FXML
    private void init2(){
        Square s = new Square(50,Color.WHITE,200,100);
        drawSquare(s);

        System.out.println("bvb");

    }
    /**
     * Draws a single square on the background
     * @param s the square to be drawn
     */
    private void drawSquare(Square s)
    {
        GraphicsContext gc = backg.getGraphicsContext2D();
        gc.setFill(s.getColor());
        gc.fillRect(s.getPosX(), s.getPosY(), s.getSize(), s.getSize());
    }


}
