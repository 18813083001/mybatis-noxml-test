package self.mybatis.testnoxml.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import self.mybatis.noxml.config.DynamicMapperSqlSessionBean;
import self.mybatis.noxml.config.MybatisProperties;
import self.mybatis.noxml.entity.Entity;

import javax.sql.DataSource;

@Configuration
@ConditionalOnProperty(prefix = "mybatis", value = "basePackage")
@EnableConfigurationProperties(MybatisProperties.class)
public class MybatisSqlSessionFactoryConfigure {

    @Autowired
    DataSource dataSource;


    private final MybatisProperties mybatisProperties;

    public MybatisSqlSessionFactoryConfigure(MybatisProperties mybatisProperties){
        this.mybatisProperties = mybatisProperties;
    }


    @Bean(name="sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(){
        SqlSessionFactoryBean factoryBean = new DynamicMapperSqlSessionBean(mybatisProperties.getBasePackage(),
                mybatisProperties.getCommonMapperXmlPath());
        factoryBean.setDataSource(dataSource);
        factoryBean.setTypeAliasesPackage(mybatisProperties.getBasePackage());
        factoryBean.setTypeAliasesSuperType(Entity.class);
        //添加XML目录
        ResourcePatternResolver configResolver = new PathMatchingResourcePatternResolver();
        ResourcePatternResolver mapperResolver = new PathMatchingResourcePatternResolver();
        try {
            factoryBean.setConfigLocation(configResolver.getResource(mybatisProperties.getConfigFilePath()));
            factoryBean.setMapperLocations(mapperResolver.getResources(mybatisProperties.getCustomMapperXmlPath()));
            return factoryBean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }



}
