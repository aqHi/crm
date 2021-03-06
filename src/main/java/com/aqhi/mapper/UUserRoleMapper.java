package com.aqhi.mapper;

import com.aqhi.model.UUserRole;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

public interface UUserRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_user_role
     *
     * @mbg.generated
     */
    @Insert({
        "insert into u_user_role (uid, rid)",
        "values (#{uid,jdbcType=BIGINT}, #{rid,jdbcType=BIGINT})"
    })
    int insert(UUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_user_role
     *
     * @mbg.generated
     */
    int insertSelective(UUserRole record);
    
    
    
//    @Select({
//        "select",
//        "ur.uid, ur.rid, r.name, r.type",
//        "from u_user_role ur , u_role r",
//        "where ur.uid = #{uid,jdbcType=BIGINT} and r.id=ur.rid"
//    })
//    @ResultMap("com.aqhi.mapper.UUserRoleMapper.UserRoleMap")
//    List<UUserRole> selectUserRolesByUid(Long uid);
    
    
    @Select({
        "select",
        "*",
        "from u_user_role",
        "where uid = #{uid,jdbcType=BIGINT}"
    })
    @ResultMap("com.aqhi.mapper.UUserRoleMapper.UserRoleMap")
    List<UUserRole> selectUserRolesByUid(Long uid);
    
    List<UUserRole>  selectByUid();
}