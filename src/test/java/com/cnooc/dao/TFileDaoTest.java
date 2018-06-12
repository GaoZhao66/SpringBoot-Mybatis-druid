package com.cnooc.dao;

import com.cnooc.entity.TFile;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2018/6/11.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TFileDaoTest {

    @Autowired
    private TFileDao tFileDao;


    @Test
    public void insert() throws Exception {
        TFile tFile = new TFile();
        tFile.setId(3);
        tFile.setName("ceshi");
        tFile.setType("ppt");
        tFile.setHaxi("1111");
        tFile.setAddress("cccc");
        tFile.setCreateTime("11111");
        int a = tFileDao.insert(tFile);
        Assert.assertEquals(1,a);
    }

}