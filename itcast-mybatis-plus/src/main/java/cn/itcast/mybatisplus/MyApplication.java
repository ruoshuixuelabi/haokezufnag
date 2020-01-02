package cn.itcast.mybatisplus;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
/**
 * @author dep
 * @MapperScan 设置mapper接口的扫描包
 */
@MapperScan("cn.itcast.mybatisplus.mapper")
@SpringBootApplication
public class MyApplication {

    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }

}