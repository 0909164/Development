package factory;

import container.IContainer;
import javafx.geometry.Dimension2D;
import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import truck.ITruck;
import java.util.List;


public class IkeaFactory implements IFactory {
    //attributes

    //float
    private float productBox1,
        productBox2;
    //dimension 2D
    private Dimension2D dimension2D;
    //point2D
    private Point2D point2D,
        point2D1,
        point2D2,
        productBox1_position,
        productBox2_position;

    //image
    private Image ikea,
        productContainer,
        productBox,
        volvo;
    //boolean
    private Boolean box_max1,
        box_max2;

    //constructor
    public IkeaFactory(Point2D point2D, Dimension2D dimension2D, Point2D point2D1, Point2D point2D2, Image ikea, Image productContainer, Image productBox, Image volvo) {
        this.point2D = point2D;
        this.dimension2D = dimension2D;
        this.point2D1 = point2D1;
        this.point2D2 = point2D2;
        this.ikea = ikea;
        this.productContainer = productContainer;
        this.productBox = productBox;
        this.volvo = volvo;

        //position box
        this.productBox1_position = new Point2D(100, 50);
        this.productBox2_position = new Point2D(150,50);

        //float
        this.productBox1 = 0f;
        this.productBox2 = 0f;

        //boolean
        this.box_max1 = false;
        this.box_max2 = false;
    }

    //methods
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
        gc.drawImage(ikea, 600, 340, 150, 175/2);
        if (productBox1 > 8f){
            gc.drawImage(productBox, 750, 360, 50, 50);
        }
        if (productBox2 > 5f){
            gc.drawImage(productBox, 750, 300, 50, 50);
        }
    }

    @Override
    public void update(float dt) {
        //het het box leeg is wordt het gevuld
        if (productBox1 > 10)
            box_max1 = true;

        if (productBox2 > 10)
            box_max2 = true;
        //vullen van box
        if (box_max1 == false)
            productBox1 += dt;

        if (box_max2 == false)
            productBox2 += dt;
        //als het box vol is wordt de box geleegd
        if (box_max1 == true)
            productBox1 = 0;
            box_max1 = false;

        if (box_max2 == true)
            productBox2 = 0;
            box_max2 = false;
    }
}
