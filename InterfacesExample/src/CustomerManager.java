public class CustomerManager {
    private ICustomerDal customerDal;
    public CustomerManager(ICustomerDal customerDal){
        this.customerDal = customerDal;
    }

    public void add(){
        customerDal.add();
    }
    public void delete(){
        customerDal.delete();
    }
    public void update(){
        customerDal.update();
    }
}
