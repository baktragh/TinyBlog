package baktra.tinyblog.repository;

import baktra.tinyblog.BlogEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.util.List;


public class DatabaseRepository implements BlogEntryRepository {

    @Autowired
    private BlogEntrySQLRepo sqlRepo;

    @Override
    public BlogEntry getEntryById(int id) {
        return sqlRepo.findBlogEntryById(id);
    }

    @Override
    public List<BlogEntry> getAllEntries() {
        return sqlRepo.findBlogEntry();
    }

    @Override
    public boolean add(BlogEntry b) {
        BlogEntry entryToDelete = sqlRepo.findBlogEntryById(b.getId());
        if (entryToDelete!=null) return false;
        sqlRepo.save(b);
        return true;
    }

    @Override
    public boolean remove(int id) {
        BlogEntry entryToDelete = sqlRepo.findBlogEntryById(id);
        if (entryToDelete==null) return false;
        sqlRepo.delete(entryToDelete);
        return true;
    }
}
