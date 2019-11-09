package self.mybatis.testnoxml;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import self.mybatis.noxml.CommonExample;
import self.mybatis.testnoxml.dao.BaseRegionDao;
import self.mybatis.testnoxml.entity.BaseRegion;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NoXmlTest {

    Logger logger = LoggerFactory.getLogger(NoXmlTest.class);

    @Autowired
    BaseRegionDao baseRegionDao;

    @Test
    public void noXmlTest(){

        CommonExample example = new CommonExample(BaseRegion.class);
        List baseRegionList = baseRegionDao.selectByExample(example);
        Assert.assertTrue(baseRegionList != null);
        logger.error(baseRegionList.get(0).toString());

    }
}
