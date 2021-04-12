package paint;

import javafx.event.EventHandler;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class PaintCanvas extends Canvas {

    private GraphicsContext gc = getGraphicsContext2D();
    private Color color;
    private boolean erase;
    final Color background = Color.WHITE;
    final int eraserWidth = 15;
    final int drawingWidth = 3;

    public PaintCanvas()
    {
        addEventHandler(MouseEvent.MOUSE_PRESSED, this::draw);
        addEventHandler(MouseEvent.MOUSE_DRAGGED, this::draw);
        addEventHandler(MouseEvent.MOUSE_RELEASED, this::draw);
        color = Color.BLACK;
        erase = false;
    }

    public void initialize()
    {
        gc.setFill(background);
        gc.fillRect(0, 0, this.getWidth(), this.getHeight());
    }

    public void draw(MouseEvent e)
    {
        if (e.getEventType().equals(MouseEvent.MOUSE_PRESSED))
        {
            gc.beginPath();
        }
        else if (e.getEventType().equals(MouseEvent.MOUSE_DRAGGED))
        {
            gc.lineTo(e.getX(), e.getY());
            gc.setStroke(color);
            gc.setLineWidth(drawingWidth);
            if (erase)
            {
                gc.setStroke(background);
                gc.setLineWidth(eraserWidth);
            }
            gc.stroke();
        }
        else
        {
            gc.closePath();
        }
    }

    public void setColor(Color newColor)
    {
        color = newColor;
    }

    public void setErase(Boolean value)
    {
        erase = value;
    }




}
