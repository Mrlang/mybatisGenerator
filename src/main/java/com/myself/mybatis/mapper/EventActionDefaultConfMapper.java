package com.myself.mybatis.mapper;

import com.myself.mybatis.entity.EventActionDefaultConf;
import com.myself.mybatis.entity.EventActionDefaultConfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventActionDefaultConfMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_YX_FLOWX_EVENT_ACTION_DEFAULT_CONF
     *
     * @mbg.generated
     */
    long countByExample(EventActionDefaultConfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_YX_FLOWX_EVENT_ACTION_DEFAULT_CONF
     *
     * @mbg.generated
     */
    int deleteByExample(EventActionDefaultConfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_YX_FLOWX_EVENT_ACTION_DEFAULT_CONF
     *
     * @mbg.generated
     */
    int insert(EventActionDefaultConf record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_YX_FLOWX_EVENT_ACTION_DEFAULT_CONF
     *
     * @mbg.generated
     */
    int insertSelective(EventActionDefaultConf record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_YX_FLOWX_EVENT_ACTION_DEFAULT_CONF
     *
     * @mbg.generated
     */
    List<EventActionDefaultConf> selectByExample(EventActionDefaultConfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_YX_FLOWX_EVENT_ACTION_DEFAULT_CONF
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EventActionDefaultConf record, @Param("example") EventActionDefaultConfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_YX_FLOWX_EVENT_ACTION_DEFAULT_CONF
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EventActionDefaultConf record, @Param("example") EventActionDefaultConfExample example);
}