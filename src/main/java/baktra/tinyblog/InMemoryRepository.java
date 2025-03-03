package baktra.tinyblog;

import java.util.List;
import java.util.HashMap;

public class InMemoryRepository implements BlogEntryRepository {

    private HashMap<Integer,BlogEntry> records;

    @Override
    public BlogEntry getEntryById(int id) {
        return records.get(id);
    }

    @Override
    public List<BlogEntry> getAllEntries() {
        return List.of(records.entrySet().toArray(new BlogEntry[0]));
    }

    public InMemoryRepository() {
        records = new HashMap<>();
        createSampleData();
    }

    public boolean add(BlogEntry b) {
        if (records.containsKey(b.getId())) return false;
        records.put(b.getId(),b);
        return true;
    }

    public boolean remove(int id) {
        if (records.containsKey(id)) {
            records.remove(id);
            return true;
        }
        else {
            return false;
        }
    }

    public void createSampleData() {
        records.put(100,new BlogEntry(100,"Test Entry 100","My subtitle 100","Sample main text 100","Testing footer 100"));
        records.put(101,new BlogEntry(101,"Test Entry 101","My subtitle 101","Sample main text 101","Testing footer 101"));
    }
}
