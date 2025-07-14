package baktra.tinyblog;

import baktra.tinyblog.repository.BlogEntryRepository;
import baktra.tinyblog.repository.DatabaseRepository;
import baktra.tinyblog.repository.InMemoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BlogEntryController {

    @Autowired
    private DatabaseRepository repository;

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
