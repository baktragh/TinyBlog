package baktra.tinyblog.repository;

import baktra.tinyblog.BlogEntry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlogEntrySQLRepo extends JpaRepository<BlogEntry,Integer> {
    public BlogEntry findBlogEntryById(Integer id);
    public List<BlogEntry> findBlogEntry();
}
