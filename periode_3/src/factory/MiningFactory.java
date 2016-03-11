package factory;

import container.IContainer;
import javafx.geometry.Dimension2D;
import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import truck.ITruck;
import java.util.List;

public class MiningFactory implements IFactory {
    Image mine;
    Point2D point2D;
    Dimension2D dimension2D;
    Image mineCart;

    public MiningFactory(Point2D point2D, Dimension2D dimension2D, Point2D point2D1, Point2D point2D2, Image mine, Image oreContainer, Image mineCart, Image volvo) {
        this.mine = mine;
        this.point2D = point2D;
        this.dimension2D = dimension2D;
        this.mineCart = mineCart;
    }

    public void update(float dt) {

    }

    public void draw(GraphicsContext gc) {
        gc.drawImage(mine, 70, 70, 110, 70);
        gc.drawImage(mineCart, 40, 50, 50, 40);
        gc.drawImage(mineCart, 40, 75, 50, 40);
        gc.drawImage(mineCart, 40, 100, 50, 40);
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