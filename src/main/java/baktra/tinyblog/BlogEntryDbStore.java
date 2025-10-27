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
        try {
            BlogEntry entryToDelete = blogEntrySQLRepo.findBlogEntryById(b.getId());
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        finally {

            blogEntrySQLRepo.save(b);
            return true;
        }
    }

    @Override
    public boolean remove(int id) {
        BlogEntry entryToDelete = blogEntrySQLRepo.findBlogEntryById(id);
        if (entryToDelete==null) return false;
        blogEntrySQLRepo.delete(entryToDelete);
        return true;
    }

    public void createSampleData() {
        add(new BlogEntry(105,"Test Entry 105","My subtitle 100","Sample main text 100","Testing footer 100"));
        add(new BlogEntry(106,"Test Entry 106","My subtitle 101","Sample main text 101","Testing footer 101"));
    }
}
