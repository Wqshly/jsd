package com.wqs.jsd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableCaching // 开启缓存
@EnableTransactionManagement // 开启事务管理，保证redis和MySQL中数据的一致性
@SpringBootApplication
@MapperScan("com.wqs.jsd.dao")
//@ComponentScan({"com.wqs.jsd.pojo", "com.wqs.jsd.util"})
public class JsdApplication extends SpringBootServletInitializer {

    // 使用Redis缓存采用Jackson进行序列化与反序列化是实体类不需要实现java.io.Serializable接口
    // 不使用springboot默认采用JDK进行序列化的操作，通过以下配置修改为基于Jackson的序列化操作
//    @Bean
//    public RedisCacheConfiguration redisCacheConfiguration() {
//        //加载redis缓存的默认配置
//        RedisCacheConfiguration configuration = RedisCacheConfiguration.defaultCacheConfig();
//        configuration = configuration.serializeValuesWith(RedisSerializationContext.SerializationPair.fromSerializer(new GenericJackson2JsonRedisSerializer()));
//        return configuration;
//    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(this.getClass());
    }

    public static void main(String[] args) {
        SpringApplication.run(JsdApplication.class, args);
    }

}
