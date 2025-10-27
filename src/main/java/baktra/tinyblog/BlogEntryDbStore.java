package baktra.tinyblog;

import baktra.tinyblog.entity.BlogEntry;
import baktra.tinyblog.repository.BlogEntrySQLRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogEntryDbStore implements BlogEntryStore {

    @Autowired
    private BlogEntrySQLRepo blogEntrySQLRepo;

    @Override
    public BlogEntry getEntryById(int id) {
        return blogEntrySQLRepo.findBlogEntryById(id);
    }

    @Override
    public List<BlogEntry> getAllEntries() {
        return blogEntrySQLRepo.findAll();
    }

    @Override
    public boolean add(BlogEntry b) {
        BlogEntry entryToDelete = blogEntrySQLRepo.findBlogEntryById(b.getId());
        if (entryToDelete!=null) return false;
        blogEntrySQLRepo.save(b);
        return true;
    }

    @Override
    public boolean remove(int id) {
        BlogEntry entryToDelete = blogEntrySQLRepo.findBlogEntryById(id);
        if (entryToDelete==null) return false;
        blogEntrySQLRepo.delete(entryToDelete);
        return true;
    }
}
