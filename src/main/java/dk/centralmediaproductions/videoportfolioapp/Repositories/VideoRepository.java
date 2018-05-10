package dk.centralmediaproductions.videoportfolioapp.Repositories;

import dk.centralmediaproductions.videoportfolioapp.Entities.Video;
import org.springframework.data.repository.CrudRepository;

public interface VideoRepository extends CrudRepository<Video, Long> {

}
