package self.mybatis.testnoxml.dao;

import self.mybatis.noxml.annotation.MyBatisDao;
import self.mybatis.noxml.dao.CommonDao;
import self.mybatis.testnoxml.entity.BaseRegion;

@MyBatisDao
public interface BaseRegionDao extends CommonDao<Integer, BaseRegion> {
}
