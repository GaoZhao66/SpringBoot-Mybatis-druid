package com.cnooc.dao;

import com.cnooc.entity.TFile;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/6/11.
 */
@Component
public interface TFileDao {
    int insert(TFile record);
}
