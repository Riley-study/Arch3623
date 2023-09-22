package ModelElements;

import Stuff.Poligon;
import Stuff.Texture;

import java.util.ArrayList;
import java.util.List;

public class PoligonalModel {
    public PoligonalModel(ArrayList<Texture> textures) {
        //добавили в конструктор внешний компонент (агрегация)
        this.textures = textures;
        //добавили в конструктор внутренний компонент (композиция)
        this.poligons = new ArrayList<Poligon>();
        // создали экземпляр
        poligons.add(new Poligon());
    }

    public List<Poligon> poligons;
    public List<Texture> textures;
}
