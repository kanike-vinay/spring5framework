package vinay.springframework.spring5framework.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author kanike
 */
@Entity
public class BookSample {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String isbn;
    private String publisher;

    @ManyToMany
    @JoinTable(name="author_book_sample", joinColumns = @JoinColumn(name = "book_id"),
    inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<AuthorSample> authorSampleSet = new HashSet<AuthorSample>();

    public BookSample() {
    }

    public BookSample(String title, String isbn, String publisher) {
        this.title = title;
        this.isbn = isbn;
        this.publisher = publisher;
    }

    public BookSample(String title, String isbn, String publisher, Set<AuthorSample> authorSampleSet) {
        this.title = title;
        this.isbn = isbn;
        this.publisher = publisher;
        this.authorSampleSet = authorSampleSet;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Set<AuthorSample> getAuthorSampleSet() {
        return authorSampleSet;
    }

    public void setAuthorSampleSet(Set<AuthorSample> authorSampleSet) {
        this.authorSampleSet = authorSampleSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookSample that = (BookSample) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "BookSample{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", publisher='" + publisher + '\'' +
                ", authorSampleSet=" + authorSampleSet +
                '}';
    }
}
