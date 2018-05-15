package com.stylefeng.guns.dao.system;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.stylefeng.guns.entity.system.Relation;
import org.springframework.stereotype.Repository;

/**
 * <p>
  * 角色和菜单关联表 Mapper 接口
 * </p>
 *
 * @author stylefeng
 * @since 2017-07-11
 */
@Repository
public interface RelationMapper extends BaseMapper<Relation> {

}