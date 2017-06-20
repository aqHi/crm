package com.aqhi.mapper;

import com.aqhi.model.UUser;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_user
     *
     * @mbg.generated
     */
    @Delete({
        "delete from u_user",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_user
     *
     * @mbg.generated
     */
    @Insert({
        "insert into u_user (id, nickname, ",
        "email, pswd, create_time, ",
        "last_login_time, status)",
        "values (#{id,jdbcType=BIGINT}, #{nickname,jdbcType=VARCHAR}, ",
        "#{email,jdbcType=VARCHAR}, #{pswd,jdbcType=VARCHAR}, #{create_time,jdbcType=TIMESTAMP}, ",
        "#{last_login_time,jdbcType=TIMESTAMP}, #{status,jdbcType=BIGINT})"
    })
    int insert(UUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_user
     *
     * @mbg.generated
     */
    int insertSelective(UUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_user
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, nickname, email, pswd, create_time, last_login_time, status",
        "from u_user",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ResultMap("com.aqhi.mapper.UUserMapper.BaseResultMap")
    UUser selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(UUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_user
     *
     * @mbg.generated
     */
    @Update({
        "update u_user",
        "set nickname = #{nickname,jdbcType=VARCHAR},",
          "email = #{email,jdbcType=VARCHAR},",
          "pswd = #{pswd,jdbcType=VARCHAR},",
          "create_time = #{create_time,jdbcType=TIMESTAMP},",
          "last_login_time = #{last_login_time,jdbcType=TIMESTAMP},",
          "status = #{status,jdbcType=BIGINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(UUser record);
}