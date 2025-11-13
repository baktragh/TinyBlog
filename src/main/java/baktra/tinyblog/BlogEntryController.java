package baktra.tinyblog;

import baktra.tinyblog.entity.BlogEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BlogEntryController {

    @Autowired
    private BlogEntryDbStore repository;


    @GetMapping(value="/blogentry/")
    public ResponseEntity<List<BlogEntry>> getBlogEntries() {
        List<BlogEntry> entries = repository.getAllEntries();
        if (entries!=null) {
            return ResponseEntity.status(HttpStatus.OK).body(entries);
        }
        else {
            System.out.println("Entry not found");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @GetMapping(value="/blogentry/{id}")
    public ResponseEntity<BlogEntry> getBlogEntry(@PathVariable int id) {
        BlogEntry entry = repository.getEntryById(id);
        if (entry!=null) {
            return ResponseEntity.status(HttpStatus.OK).body(entry);
        }
        else {
            System.out.println("Entry not found");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @GetMapping(value="/blogentry/makesample")
    public ResponseEntity<BlogEntry> makeSample() {
        repository.createSampleData();
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @PostMapping(value = "/blogentry/{id}")
    public ResponseEntity<Void> newBlogEntry(@PathVariable int id, @RequestParam String title, @RequestParam String subtitle, @RequestParam String mainText, @RequestParam String footer) {

        BlogEntry entry = new BlogEntry(id, title, subtitle, mainText, footer);
        boolean b = repository.add(entry);

        if (b) {
            return ResponseEntity.status(HttpStatus.OK).build();
        } else {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
    }

    @DeleteMapping(value="/blogentry/{id}")
    public ResponseEntity<Void> deleteBlogEntry(@PathVariable int id) {
        boolean b = repository.remove(id);
        if (b) {
            return ResponseEntity.status(HttpStatus.OK).build();
        }
        else {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
    }


}
