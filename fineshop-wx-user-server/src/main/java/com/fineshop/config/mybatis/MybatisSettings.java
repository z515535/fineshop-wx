package com.fineshop.config.mybatis;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * mybatis 和数据源配置
 * 事务拦截使用 spring-tx配置
 * 所以使用混合配置
 */
@Configuration
@MapperScan("com.fineshop.entity")
public class MybatisSettings {

    @Autowired
    private Environment env;

    /**
     * 配置数据源
     * @return
     * @throws Exception
     */
    @Bean(name = "dataSource")
    public DataSource dataSource() throws Exception {
        Properties props = new Properties();
        props.put("driverClassName", env.getProperty("jdbc.driverClassName"));
        props.put("url", env.getProperty("jdbc.url"));
        props.put("username", env.getProperty("jdbc.username"));
        props.put("password", env.getProperty("jdbc.password"));
        return DruidDataSourceFactory.createDataSource(props);
    }

    /**
     * 配置 mybatis
     * @param ds
     * @return
     * @throws Exception
     */
    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean fb = new SqlSessionFactoryBean();
        //配置数据源
        fb.setDataSource(dataSource);
        //指定实体所在的包路径
        fb.setTypeAliasesPackage(env.getProperty("mybatis.typeAliasesPackage"));
        //配置 mapper xml文件路径
        Resource[] resolver = new PathMatchingResourcePatternResolver().getResources(env.getProperty("mybatis.mapperLocations"));
        fb.setMapperLocations(resolver);//指定xml文件位置

        //使用pageHelper分页插件
        Interceptor[] plugins =  new Interceptor[]{new PageHelper()};
        fb.setPlugins(plugins);
        return fb.getObject();
    }

    /**
     * 配置事务管理器
     * @param dataSource
     * @return
     */
   /* @Bean(name = "transactionManager")
    public PlatformTransactionManager transactionManager(DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }*/
}
