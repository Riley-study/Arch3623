package InMemoryModel;
import ModelElements.PoligonalModel;
import java.util.List;

public class ModelStore implements IModelChanger{

    public List<PoligonalModel> model;

    // регистрирует изменения модели
    public void notifyChange(IModelChanger sender) {

    }
}
