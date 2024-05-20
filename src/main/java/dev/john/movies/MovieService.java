package dev.john.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired //The framework instantiate the class for us
    private MovieRepository movieRepository;
    public List<Movie> AllMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> singleMovie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
