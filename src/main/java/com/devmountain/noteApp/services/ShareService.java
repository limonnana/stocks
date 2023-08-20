package com.devmountain.noteApp.services;

import com.devmountain.noteApp.dtos.NoteDto;
import com.devmountain.noteApp.dtos.ShareDto;
import com.devmountain.noteApp.entities.Share;
import org.springframework.transaction.annotation.Transactional;

public interface ShareService {

    @Transactional
    Share addShare(ShareDto shareDto);
}
