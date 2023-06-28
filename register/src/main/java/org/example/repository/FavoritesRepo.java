package org.example.repository;

import org.example.domain.FavoritesLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FavoritesRepo extends JpaRepository<FavoritesLocation, Integer> {
    List<FavoritesLocation> findAllByUserId(int userId);

}
