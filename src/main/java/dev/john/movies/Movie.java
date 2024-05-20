package dev.john.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.*;

@Document(collection = "movies") //Specifies the collection name in the database
@Data //Creates getters, setters, equals, hash, and toString
@AllArgsConstructor //Creates a constructor with all the arguments
@NoArgsConstructor //Creates a constructor with no arguments
public class Movie {
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private List<String> genres;
    private String poster;
    private List<String> backdrop;
    @DocumentReference //will store only the ids of the reviews and the reviews will be stored in a separate collection
    private List<Review> reviewIds; //embedded relationship (one-to-many)
}
