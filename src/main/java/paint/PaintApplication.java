package paint;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PaintApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/paint_application.fxml"));

        Scene scene = new Scene(root, 450, 475);

        stage.setTitle("Paint");
        stage.setScene(scene);
        stage.show();
    }


//    //erasing?
//
//    private void reset(Canvas canvas, Color color) {
//        GraphicsContext gc = canvas.getGraphicsContext2D();
//        gc.setFill(color);
//        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
//    }
//
//    @Override
//    public void start(Stage primaryStage) {
//
//        primaryStage.setTitle("Paint");
//        Group root = new Group();
//        Canvas canvas = new Canvas();
//        final GraphicsContext gc = canvas.getGraphicsContext2D();
//        root.getChildren().add(canvas);
//        primaryStage.setScene(new Scene(root));
//        primaryStage.show();
//
//        // Clear away portions as the user drags the mouse
//        canvas.addEventHandler(MouseEvent.MOUSE_DRAGGED,
//                new EventHandler<MouseEvent>() {
//                    @Override
//                    public void handle(MouseEvent e) {
//                        gc.clearRect(e.getX() - 2, e.getY() - 2, 5, 5);
//                    }
//                });
//
//        // Fill the Canvas with a Blue rectnagle when the user double-clicks
//        canvas.addEventHandler(MouseEvent.MOUSE_CLICKED,
//                new EventHandler<MouseEvent>() {
//                    @Override
//                    public void handle(MouseEvent t) {
//                        if (t.getClickCount() > 1) {
//                            reset(canvas, Color.BLUE);
//                        }
//                    }
//                });
//
//    }

// random stuff
//    public void start(Stage primaryStage) {
//        primaryStage.setTitle("Paint");
//        Group root = new Group();
//        Canvas canvas = new Canvas();
//        GraphicsContext gc = canvas.getGraphicsContext2D();
//        drawShapes(gc);
//        root.getChildren().add(canvas);
//        primaryStage.setScene(new Scene(root));
//        primaryStage.show();
//    }
//
//        private void drawShapes(GraphicsContext gc) {
//            gc.setFill(Color.GREEN);
//            gc.setStroke(Color.BLUE);
//            gc.setLineWidth(5);
//            gc.strokeLine(40, 10, 10, 40);
//            gc.fillOval(10, 60, 30, 30);
//            gc.strokeOval(60, 60, 30, 30);
//            gc.fillRoundRect(110, 60, 30, 30, 10, 10);
//            gc.strokeRoundRect(160, 60, 30, 30, 10, 10);
//            gc.fillArc(10, 110, 30, 30, 45, 240, ArcType.OPEN);
//            gc.fillArc(60, 110, 30, 30, 45, 240, ArcType.CHORD);
//            gc.fillArc(110, 110, 30, 30, 45, 240, ArcType.ROUND);
//            gc.strokeArc(10, 160, 30, 30, 45, 240, ArcType.OPEN);
//            gc.strokeArc(60, 160, 30, 30, 45, 240, ArcType.CHORD);
//            gc.strokeArc(110, 160, 30, 30, 45, 240, ArcType.ROUND);
//            gc.fillPolygon(new double[]{10, 40, 10, 40},
//                    new double[]{210, 210, 240, 240}, 4);
//            gc.strokePolygon(new double[]{60, 90, 60, 90},
//                    new double[]{210, 210, 240, 240}, 4);
//            gc.strokePolyline(new double[]{110, 140, 110, 140},
//                    new double[]{210, 210, 240, 240}, 4);
//        }


        // Color picker
//    public void start(Stage stage) {
//        stage.setTitle("ColorPicker");
//        Scene scene = new Scene(new HBox(20), 400, 100);
//        HBox box = (HBox) scene.getRoot();
//        box.setPadding(new Insets(5, 5, 5, 5));
//
//        final ColorPicker colorPicker = new ColorPicker();
//        colorPicker.setValue(Color.CORAL);
//
//        final Text text = new Text("Try the color picker!");
//        text.setFont(Font.font ("Verdana", 20));
//        text.setFill(colorPicker.getValue());
//
//        colorPicker.setOnAction(new EventHandler() {
//            public void handle(Event t) {
//                text.setFill(colorPicker.getValue());
//            }
//        });
//
//        box.getChildren().addAll(colorPicker, text);
//
//        stage.setScene(scene);
//        stage.show();
//    }


        public static void main (String[]args){
            launch(args);
        }

}

