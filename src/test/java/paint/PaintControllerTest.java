package paint;


import javafx.scene.control.ColorPicker;
import javafx.scene.paint.Color;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class PaintControllerTest {

    private PaintController controller;
    private ColorPicker colorPicker;
    private PaintCanvas canvas;

    @BeforeClass
    public static void beforeClass() {
        com.sun.javafx.application.PlatformImpl.startup(()->{});
    }

    private void givenPaintController()
    {
        controller = new PaintController();
        controller.colorPicker = mock(ColorPicker.class);
        controller.paintCanvas = mock(PaintCanvas.class);
    }

    @Test
    public void initialize()
    {
        //given
        givenPaintController();

        //when
        controller.initialize();

        //then
        verify(controller.colorPicker).setValue(Color.BLACK);
    }


    @Test
    public void changeColor()
    {
        //given
        givenPaintController();
        doReturn(Color.BISQUE).when(controller.colorPicker).getValue();

        //when
        controller.changeColor();

        //then
        verify(controller.paintCanvas).setColor(Color.BISQUE);
        verify(controller.colorPicker, times(1)).getValue();
    }

    @Test
    public void erase()
    {
        //given
        givenPaintController();

        //when
        controller.erase();

        //then
        verify(controller.paintCanvas).setErase(true);
        verify(controller.paintCanvas, times(1)).setErase(true);
    }

    @Test
    public void draw()
    {
        //given
        givenPaintController();

        //when
        controller.draw();

        //then
        verify(controller.paintCanvas).setErase(false);
        verify(controller.paintCanvas, times(1)).setErase(false);
    }


}