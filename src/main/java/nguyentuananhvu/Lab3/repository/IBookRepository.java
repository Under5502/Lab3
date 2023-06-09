package nguyentuananhvu.Lab3.repository;

import nguyentuananhvu.Lab3.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepository  extends JpaRepository<Book, Long> {
}
