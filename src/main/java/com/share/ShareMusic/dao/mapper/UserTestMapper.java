package com.share.ShareMusic.dao.mapper;

import com.share.ShareMusic.dao.model.UserTest;
import com.share.ShareMusic.dao.model.UserTestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTestMapper {
    int countByExample(UserTestExample example);

    int deleteByExample(UserTestExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserTest record);

    int insertSelective(UserTest record);

    List<UserTest> selectByExample(UserTestExample example);

    UserTest selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserTest record, @Param("example") UserTestExample example);

    int updateByExample(@Param("record") UserTest record, @Param("example") UserTestExample example);

    int updateByPrimaryKeySelective(UserTest record);

    int updateByPrimaryKey(UserTest record);
}