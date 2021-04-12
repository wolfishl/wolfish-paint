package paint;


import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;


public class PaintController {

    @FXML
    private ColorPicker colorPicker;
    @FXML
    private PaintCanvas paintCanvas;


    @FXML
    public void initialize()
    {
        colorPicker.setValue(Color.BLACK);
        paintCanvas.initialize();
    }

    public void changeColor(Event e)
    {
        paintCanvas.setColor(colorPicker.getValue());
    }

    public void erase(Event e)
    {
        paintCanvas.setErase(true);
    }

    public void draw(Event e)
    {
        paintCanvas.setErase(false);
    }





}
