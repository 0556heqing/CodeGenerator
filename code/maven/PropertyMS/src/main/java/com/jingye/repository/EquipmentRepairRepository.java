package com.jingye.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.math.BigDecimal;

import com.jingye.entity.EquipmentRepair;

/**
 * 数据持久层接口
 *
 * @author huangjingye
 * @email  754300150@qq.com
 * @date   2018-04-11 12:14:49
 */
@Mapper
public interface EquipmentRepairRepository {

    /**
     * 增加实例
     *
     * @param equipmentRepair 实例
     * @return int 成功数量
     */
    int saveEquipmentRepair(EquipmentRepair equipmentRepair);

    /**
     * 增加多条
     *
     * @param equipmentRepairList 多条列
     * @return int 成功数量
     */
    int saveBatchEquipmentRepair(List<EquipmentRepair> equipmentRepairList);

    /**
     * 获取所有
     *
     * @return List<EquipmentRepair> 主键集合
     */
    List<EquipmentRepair> listEquipmentRepair();

    /**
     * 根据条件获取多条
     *
     * @param equipmentRepair 列:做条件查询使用
     * @return List<EquipmentRepair> 列集合
     */
    List<EquipmentRepair> listEquipmentRepairByParam(EquipmentRepair equipmentRepair);

    /**
     * 根据条件删除多条实例
     *
     * @param equipmentRepair 实例:做条件删除使用
     * @return int 成功数量
     */
    int deleteEquipmentRepairByParam(EquipmentRepair equipmentRepair);


    /**
     * 根据主键修改
     *
     * @param equipmentRepair 列信息
     * @return int 成功数量
     */
    int updateEquipmentRepairByKey(EquipmentRepair equipmentRepair);

    /**
     * 根据主键获取
     *
     * @param id 
     * @return EquipmentRepair 信息
     */
    EquipmentRepair getEquipmentRepairByKey(@Param("id")Integer id);

    /**
     * 根据主键删除
     *
    * @param id 
     * @return int 成功数量
     */
    int deleteEquipmentRepairByKey(@Param("id")Integer id);

    /**
     * 根据多个主键删除多条
     *
     * @param idList  列集合
     * @return int 成功数量
     */
    int deleteBatchEquipmentRepairByKey(List<Integer> idList);

    /**
     * 根据多个主键获取
     *
     * @param idList 列集合
     * @return List<T> 列实体信息
     */
    List<EquipmentRepair> listEquipmentRepairByKey(List<Integer> idList);

}
