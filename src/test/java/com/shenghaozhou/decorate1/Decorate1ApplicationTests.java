package com.shenghaozhou.decorate1;

import com.shenghaozhou.decorate1.repository.WorkMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Decorate1ApplicationTests {

    @Autowired
    private WorkMapper workMapper;

    @Test
    public void contextLoads() {
        System.out.println(
                workMapper.findSampleWorks()
        );
    }

}
