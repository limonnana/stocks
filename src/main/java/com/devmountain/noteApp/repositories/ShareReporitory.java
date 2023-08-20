package com.devmountain.noteApp.repositories;

import com.devmountain.noteApp.entities.Share;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShareReporitory extends JpaRepository<Share, Long> {
}
