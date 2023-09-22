package InMemoryModel;
import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger{
    public ModelStore(IModelChangedObserver[] changedObservers) {
        // определили в конструкторе внешний элемент (агрегация)
        this.changedObservers = changedObservers;
        // добавляем все внутренние элементы (композиция)
        this.models = new ArrayList<PoligonalModel>();
        this.cameras = new ArrayList<Camera>();
        this.flashes = new ArrayList<Flash>();
        this.scenes = new ArrayList<Scene>();

        //добавляем по одному элементу каждого вида в список
        models.add(new PoligonalModel());
        cameras.add(new Camera());
        flashes.add(new Flash());
        scenes.add(new Scene());
    }
// определяем публичные элементы, в данном случае они все являются списками (1...*)
    public List<PoligonalModel> models;
    public List<Camera> cameras;
    public List<Flash> flashes;
    public List<Scene> scenes;

    // определяем приватный элемент, в данном случае это массив (1...n)
    private IModelChangedObserver[] changedObservers;

    // регистрирует изменения модели
    public void notifyChange(IModelChanger sender) {

    }

    public Scene getScene (Integer id){
        return null;
    }
}
