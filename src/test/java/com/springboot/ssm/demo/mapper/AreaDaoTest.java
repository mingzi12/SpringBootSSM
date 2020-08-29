package com.springboot.ssm.demo.mapper;

import com.springboot.ssm.demo.entity.Area;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaDaoTest {


    @Autowired
    private AreaMapper areaDao;

    @Test
    @Ignore
    public void queryArea() {
        List<Area> areas = areaDao.queryArea();
        assertEquals(4,areas.size());
    }

    @Test
    public void queryAreaById() {
        Area area = areaDao.queryAreaById(1);
        assertEquals("西苑",area.getAreaName());
    }

    @Test
    @Ignore
    public void insertArea() {
        Area area = new Area();
        area.setAreaName("中英街");
        area.setPriority(5);
        int i = areaDao.insertArea(area);
        System.out.println(i);
    }

    @Test
    @Ignore
    public void updateArea() {
        Area area = areaDao.queryAreaById(5);
        area.setUpdateTime(LocalDateTime.now());
        int i = areaDao.updateArea(area);
        System.out.println(i);
    }

    @Test
    public void deleteArea() {
        int i = areaDao.deleteArea(5);
        System.out.println(i);
    }
}