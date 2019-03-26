package com.shenghaozhou.decorate1.repository;

import com.shenghaozhou.decorate1.entity.Work;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface WorkMapper {

    @Select("SELECT * FROM (SELECT * FROM `work` ORDER BY RAND()) as t GROUP BY t.style limit 3")
    List<Work> getBanner();

    @Select("SELECT * FROM (SELECT * FROM `work` ORDER BY RAND()) as t GROUP BY t.style limit 6")
    List<Work> findSampleWorks();

    @Select("SELECT * FROM (SELECT * FROM `work` ORDER BY RAND()) as t GROUP BY t.style")
    List<Work> findMoreSampleWorks();

    @Select("select * from `work` w where w.style = #{style}")
    List<Work> findWorksByStyle(@Param("style") String style);

    @Select("select * from `work` w where w.author_id = #{authorId}")
    List<Work> findWorksByAuthor(@Param("authorId") Long authorId);
}
