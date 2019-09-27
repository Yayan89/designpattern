package proxy;

public class JpaRepositoryCustom implements JpaRepository {


    @Override
    public void findById() {
        System.out.println("custom method");
    }

    @Override
    public void findByAll() {
        System.out.println("custom method");
    }
}
