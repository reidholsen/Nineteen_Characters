/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package src.model;
import java.util.LinkedHashMap;
import java.io.Serializable;
import src.view.Display;
import src.controller.Entity;
import src.controller.Item;
import src.controller.AreaEffectGenerator;
/**
 *
 * @author JohnReedLOL
 */
public class MapModel implements Serializable
{
    // Converts the class name into a base 35 number
    private static final long serialVersionUID = Long.parseLong("MapModel", 35);

    private static final Display display_reference_ = Display.getaReferenceToTheDisplay();
    
    //2d array of tiles.
    private static MapTile map_grid_[][];
    
    // String is the entity's name. The entity name must be unqiue or else bugs will occur.
    private static LinkedHashMap<String, EntityHandle> entities_list_;

    // Item is the address of an item in memory. Location is its xy coordinates on the grid.
    private static LinkedHashMap<Item, Location> items_list_;
    
    private static LinkedHashMap<AreaEffectGenerator, Location> area_effect_generators_list_;
    
    // MapModel.map_model_ is static because there is only one map_model_  
    private static MapModel map_model_;
    
    public static MapModel getaReferenceToTheMapModel() {
        return MapModel.map_model_;
    }
}
