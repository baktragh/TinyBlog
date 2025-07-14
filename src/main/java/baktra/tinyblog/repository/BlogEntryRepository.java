package baktra.tinyblog.repository;

import baktra.tinyblog.BlogEntry;

import java.util.List;

public interface BlogEntryRepository {

    BlogEntry getEntryById(int id);
    List<BlogEntry> getAllEntries();
    boolean add(BlogEntry b);
    boolean remove(int id);

}
