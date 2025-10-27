package baktra.tinyblog.repository;

import baktra.tinyblog.entity.BlogEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogEntrySQLRepo extends JpaRepository<BlogEntry,Integer> {
    public BlogEntry findBlogEntryById(Integer id);
    public List<BlogEntry> findAll();
}
