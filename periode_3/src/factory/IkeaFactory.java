package factory;

import container.IContainer;
import javafx.geometry.Dimension2D;
import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import truck.ITruck;
import javafx.scene.image.Image;
import java.util.List;

public class IkeaFactory implements IFactory {
    Image ikea;
    Image productBox;
    Point2D position;
    Dimension2D imageDimension2D;

    public IkeaFactory(Point2D position, Dimension2D imageDimension2D, Point2D point2D1, Point2D point2D2, Image ikea, Image productContainer, Image productBox, Image volvo) {
        this.ikea = ikea;
        this.position = position;
        this.imageDimension2D = imageDimension2D;
        this.productBox = productBox;

    }

    public void update(float dt) {

    }

    public void draw(GraphicsContext gc) {
        gc.drawImage(ikea, 575, 340, 160, 70);
        gc.drawImage(productBox, 750, 340, 50, 20);
        gc.drawImage(productBox, 750, 365, 50, 20);
        gc.drawImage(productBox, 750, 390, 50, 20);
    }

    public ITruck getReadyTruck() {
        return null;
    }

    public Point2D getPosition() {
        return null;
    }

    public List<IContainer> getProductsToShip() {
        return null;
    }
}