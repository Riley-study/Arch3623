package ModelElements;

import Stuff.Texture;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Scene {



    public Scene(int id, ArrayList<PoligonalModel> models, ArrayList<Flash> flashes, ArrayList<Camera> cameras) throws Exception {
        this.id = id;
        if (models.size()>0){
            this.models = models;
        } else {
            throw new Exception("Must be one model at least");
        }
        this.flashes = flashes;
        if (cameras.size()>0){
            this.cameras = cameras;
        } else {
            throw new Exception("Must be one camera at least");
        }

        models.add(new PoligonalModel(new ArrayList<Texture>()));
        cameras.add(new Camera());
    }


    public int id;
    public ArrayList<PoligonalModel> models;
    public ArrayList<Flash> flashes;
    public ArrayList<Camera> cameras;

    public Type method1(Type a) {
        Type result = a;
        return result;
    }

    public Type method2(Type a, Type b) {
        Type result = a;
        return result;
    }


}
