package factory;

import container.IContainer;
import javafx.geometry.Dimension2D;
import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import truck.ITruck;

import java.util.List;


public class MiningFactory implements IFactory {
    //attributes

    //float
    private float mineCart1,
            mineCart2;
    //dimension 2D
    private Dimension2D dimension2D;
    //point2D
    private Point2D point2D,
            point2D1,
            point2D2,
            productBox1_position,
            productBox2_position;

    //image
    private Image mine,
            oreContainer,
            mineCart,
            volvo;
    //boolean
    private Boolean cart_max1,
            cart_max2;



    public MiningFactory(Point2D point2D, Dimension2D dimension2D, Point2D point2D1, Point2D point2D2, Image mine, Image oreContainer, Image mineCart, Image volvo) {
        this.point2D = point2D;
        this.dimension2D = dimension2D;
        this.point2D1 = point2D1;
        this.point2D2 = point2D2;
        this.mine = mine;
        this.oreContainer = oreContainer;
        this.mineCart = mineCart;
        this.volvo = volvo;

        //position box
        this.productBox1_position = new Point2D(100, 50);
        this.productBox2_position = new Point2D(150,50);

        //float
        this.mineCart1 = 0f;
        this.mineCart2 = 0f;

        //boolean
        this.cart_max1 = false;
        this.cart_max2 = false;
    }

    @Override
    public ITruck getReadyTruck() {
        return null;
    }

    @Override
    public Point2D getPosition() {
        return null;
    }

    @Override
    public List<IContainer> getProductsToShip() {
        return null;
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.drawImage(mine, 100, 70, 150, 230/2);
        if (mineCart1 > 8f){
            gc.drawImage(mineCart, 200, 80, 50, 50);
        }
        if (mineCart2 > 5f){
            gc.drawImage(mineCart, 250, 80, 50, 50);
        }
    }

    @Override
    public void update(float dt) {
        if (mineCart1 > 10)
            cart_max1 = true;

        if (mineCart2 > 10)
            cart_max2 = true;

        //vullen van box
        if (cart_max1 == false)
            mineCart1 += dt;

        if (cart_max2 == false)
            mineCart2 += dt;

        //vol wordt geleegd

        if (cart_max1 == true)
            mineCart1 = 0;
            cart_max1 = false;

        if (cart_max2 == true)
            mineCart2 = 0;
            cart_max2 = false;
    }
}
