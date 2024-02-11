/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.providers.*;
import java.awt.event.MouseEvent;
import processing.core.PApplet;

/**
 *
 * @author gstei
 */
public class MapFenster extends PApplet {

    UnfoldingMap map;
    float initialMouseX, initialMouseY;
    long lastDragTime;
    int dragThrottle = 200;

    @Override
    public void settings() {
        size(800, 600);
    }

    @Override
    public void setup() {
        map = new UnfoldingMap(this, new Microsoft.RoadProvider());
        Location berlin = new Location(52.5, 13.4);
        map.zoomAndPanTo(berlin, 10);
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

    public void mouseWheel(MouseEvent event) {
        int e = event.getClickCount();
        int zoomLevel = map.getZoomLevel();
        int newZoomLevel = zoomLevel + e;
        map.zoomToLevel(newZoomLevel);
    }
}
