package baktra.tinyblog;

import baktra.tinyblog.entity.BlogEntry;

import java.util.List;

public interface BlogEntryStore {

    BlogEntry getEntryById(int id);
    List<BlogEntry> getAllEntries();
    boolean add(BlogEntry b);
    boolean remove(int id);

}
