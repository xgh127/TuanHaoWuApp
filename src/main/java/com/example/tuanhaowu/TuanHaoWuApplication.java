package com.example.tuanhaowu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TuanHaoWuApplication {

    public static void main(String[] args) {
        SpringApplication.run(TuanHaoWuApplication.class, args);
    }

}

/*Overview 参数说明(例如java)
    Count ： java文件的数量
    Size SUM ： java所有文件总占用硬盘大小
    Size MIN ： java文件的最小文件占用硬盘大小
    Size MAX ： java文件的最大文件占用硬盘大小
    Size AVG ： java文件的平均占用硬盘大小
    Lines ： java文件的总行数
    Lines MIN ： java文件的最小行数
    Lines MAX ： java文件的最大行数
    Lines AVG ： java文件的平均行数

指定文件类型(如java)统计参数说明
    Total Lines ：代码总行数(包括注释，空行)
    Source Code Lines ：源代码行数(不包括注释，空行)
    Source Code Lines(%) ：源代码行数百分比(Source Code Lines/Total Lines)
    Comment Lines ：注释行数
    Comment Lines(%) ： 注释行数百分比(Comment Lines/Total Lines)
    Blank Lines : 空行数
    Blank Lines(%) : 空行百分比(Blank Lines/Total Lines)*/
