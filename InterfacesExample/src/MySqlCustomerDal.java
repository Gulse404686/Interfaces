public class MySqlCustomerDal implements ICustomerDal {
    @Override
    public void add() {
        System.out.println("My sql eklendi");
    }

    @Override
    public void delete() {
        System.out.println("My sql silindi.");
    }

    @Override
    public void update() {
        System.out.println("My saql güncellendi.");

    }
}
