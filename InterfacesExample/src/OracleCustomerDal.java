public class OracleCustomerDal implements ICustomerDal{
    @Override
    public void add() {
        System.out.println("Oracle eklendi.");
    }

    @Override
    public void delete() {
        System.out.println("Oracle silindi.");

    }

    @Override
    public void update() {
        System.out.println("Oracle güncellendi.");

    }
}
