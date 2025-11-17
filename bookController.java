@Controller
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookDAO dao;

    @GetMapping("/add")
    public String addForm(Model m) {
        m.addAttribute("book", new Book());
        return "addBook";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute Book book) {
        dao.save(book);
        return "redirect:/books/list";
    }

    @GetMapping("/list")
    public String list(Model m) {
        m.addAttribute("books", dao.getAll());
        return "viewBooks";
    }
}
