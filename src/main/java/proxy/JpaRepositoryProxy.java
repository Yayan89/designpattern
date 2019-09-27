package proxy;

public class JpaRepositoryProxy implements JpaRepository {
    private JpaRepositoryCustom jpaRepositoryCustom = new JpaRepositoryCustom();

    @Override
    public void findById() {
        jpaRepositoryCustom.findById();
    }

    @Override
    public void findByAll() {
        jpaRepositoryCustom.findByAll();
    }
}
