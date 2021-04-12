package paint;


import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.paint.Color;


public class PaintController {

    @FXML
    ColorPicker colorPicker;
    @FXML
    PaintCanvas paintCanvas;


    @FXML
    public void initialize()
    {
        colorPicker.setValue(Color.BLACK);
        paintCanvas.initialize();
    }

    public void changeColor()
    {
        paintCanvas.setColor(colorPicker.getValue());
    }

    public void erase()
    {
        paintCanvas.setErase(true);
    }

    public void draw()
    {
        paintCanvas.setErase(false);
    }





}
