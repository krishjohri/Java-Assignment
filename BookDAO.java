public interface BookDAO {
    void save(Book book);
    List<Book> getAll();
}
@Repository
@Transactional
public class BookDAOImpl implements BookDAO {

    @Autowired
    private SessionFactory sf;

    public void save(Book book) {
        sf.getCurrentSession().save(book);
    }

    public List<Book> getAll() {
        return sf.getCurrentSession()
                 .createQuery("from Book", Book.class).list();
    }
}
