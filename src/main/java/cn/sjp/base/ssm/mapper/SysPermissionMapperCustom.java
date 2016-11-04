package cn.sjp.base.ssm.mapper;


import cn.sjp.base.ssm.entity.SysPermission;

import java.util.List;

/**
 * 
 * <p>Title: SysPermissionMapperCustom</p>
 * <p>Description: 权限mapper</p>
 * <p>Company: www.itcast.com</p> 
 * @author	传智.燕青
 * @date	2015-3-23下午2:55:28
 * @version 1.0
 */
public interface SysPermissionMapperCustom {
	
	//根据用户id查询菜单
	 List<SysPermission> findMenuListByUserId(String userid)throws Exception;
	//根据用户id查询权限url
	 List<SysPermission> findPermissionListByUserId(String userid)throws Exception;

}
