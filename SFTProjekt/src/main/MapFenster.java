package main;

import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.providers.*;
import java.awt.event.MouseWheelEvent;
import processing.core.PApplet;


/**
 *
 * @author miket
 */
public class MapFenster extends PApplet {

    UnfoldingMap map;
    float initialMouseX, initialMouseY;
    long lastDragTime;
    int dragThrottle = 200;
    private Object GeocodingApi;

    @Override
    public void settings() {
        size(800, 600);
    }

    @Override
    public void setup() {
        map = new UnfoldingMap(this, new Microsoft.RoadProvider());
        Location hamm = new Location(51.67, 7.81);
        map.zoomAndPanTo(hamm, 10);
    }

    @Override
    public void draw() {
        map.draw();
    }

    public void mousePressed() {
        initialMouseX = mouseX;
        initialMouseY = mouseY;
    }

    public void mouseDragged() {
        float dx = mouseX - initialMouseX;
        float dy = mouseY - initialMouseY;
        map.panBy(dx, dy);
        initialMouseX = mouseX;
        initialMouseY = mouseY;
    }

    public void mouseReleased() {
        println("Mouse released at: (" + mouseX + ", " + mouseY + ")");
    }

    public void mouseWheel() {
        float scrollAction = mouseEvent.getCount();
        float zoom = 1.0f + -scrollAction * 0.1f;
        map.zoom(zoom);
    }
    
    @Override
    public void exit() {
        super.dispose();
    }

    
}
