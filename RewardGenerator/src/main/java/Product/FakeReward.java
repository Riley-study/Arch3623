package Product;

public class FakeReward extends ItemReward{
    @Override
    public void open() {
        System.out.println("Sorry, there is no rewards...");
    }
}
