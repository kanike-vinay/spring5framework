package vinay.springframework.spring5framework.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author kanike
 */
@Entity
public class AuthorSample {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;

    @ManyToMany(mappedBy = "authorSampleSet")
    private Set<BookSample> bookSampleSet = new HashSet<BookSample>();

    public AuthorSample() {
    }

    public AuthorSample(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public AuthorSample(String firstName, String lastName, Set<BookSample> bookSampleSet) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bookSampleSet = bookSampleSet;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<BookSample> getBookSampleSet() {
        return bookSampleSet;
    }

    public void setBookSampleSet(Set<BookSample> bookSampleSet) {
        this.bookSampleSet = bookSampleSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthorSample that = (AuthorSample) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "AuthorSample{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bookSampleSet=" + bookSampleSet +
                '}';
    }
}
