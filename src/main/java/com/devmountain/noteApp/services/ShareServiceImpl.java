package com.devmountain.noteApp.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.devmountain.noteApp.repositories.ShareReporitory;
import com.devmountain.noteApp.dtos.ShareDto;
import com.devmountain.noteApp.entities.Share;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class ShareServiceImpl implements ShareService{
    @Autowired
    private ShareReporitory shareReporitory;


    @Transactional
    public Share addShare(ShareDto shareDto) {
        Share share = new Share(shareDto);
         share  = shareReporitory.saveAndFlush(share);
         return share;
    }

}