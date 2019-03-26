package com.shenghaozhou.decorate1.repository;

import com.shenghaozhou.decorate1.entity.Designer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DesignerMapper {

    @Select("select * from designer limit 3")
    @Results(
            @Result(column = "profile_img", property = "profileImg")
    )
    List<Designer> findRepresentativeDesigners();

    @Select("select * from designer")
    @Results(
            @Result(column = "profile_img", property = "profileImg")
    )
    List<Designer> findAllDesigners();
}
