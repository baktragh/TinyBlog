package baktra.tinyblog;

import java.util.List;

public interface BlogEntryRepository {

    BlogEntry getEntryById(int id);
    List<BlogEntry> getAllEntries();
    boolean add(BlogEntry b);
    boolean remove(int id);

}
