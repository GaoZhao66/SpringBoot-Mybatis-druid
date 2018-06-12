package com.cnooc.service.impl;

import com.cnooc.dao.TFileDao;
import com.cnooc.entity.TFile;
import com.cnooc.service.TFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/6/11.
 */
@Service
public class TFileServiceImpl implements TFileService{

    @Autowired
    private TFileDao tFileDao;

    @Override
    public int insert(TFile record) {
        return tFileDao.insert(record);
    }
}
