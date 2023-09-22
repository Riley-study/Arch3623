package ModelElements;

import Stuff.Texture;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Scene {



    public Scene(ArrayList<PoligonalModel> models, ArrayList<Flash> flashes, ArrayList<Camera> cameras) {
        this.models = models;
        this.flashes = flashes;
        this.cameras = cameras;

        models.add(new PoligonalModel(new ArrayList<Texture>()));
        cameras.add(new Camera());
    }


    public ArrayList<Integer> id;
    public ArrayList<PoligonalModel> models;
    public ArrayList<Flash> flashes;
    public ArrayList<Camera> cameras;

    public Type method1(Type a) {
        Type result = null;
        return result;
    }

    public Type method2(Type a, Type b) {
        Type result = null;
        return result;
    }


}
