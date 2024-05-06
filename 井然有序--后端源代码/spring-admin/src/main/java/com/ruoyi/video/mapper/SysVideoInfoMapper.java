package com.ruoyi.video.mapper;

import java.util.List;
import com.ruoyi.video.domain.SysVideoInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * videoUploadMapper接口
 * 
 * @author JohnHa
 * @date 2023-09-03
 */
@Mapper
public interface SysVideoInfoMapper 
{
    /**
     * 查询videoUpload
     * 
     * @param id videoUpload主键
     * @return videoUpload
     */
    public SysVideoInfo selectSysVideoInfoById(Long id);

    /**
     * 查询videoUpload列表
     * 
     * @param sysVideoInfo videoUpload
     * @return videoUpload集合
     */
    public List<SysVideoInfo> selectSysVideoInfoList(SysVideoInfo sysVideoInfo);

    /**
     * 新增videoUpload
     * 
     * @param sysVideoInfo videoUpload
     * @return 结果
     */
    public int insertSysVideoInfo(SysVideoInfo sysVideoInfo);

    /**
     * 修改videoUpload
     * 
     * @param sysVideoInfo videoUpload
     * @return 结果
     */
    public int updateSysVideoInfo(SysVideoInfo sysVideoInfo);

    /**
     * 删除videoUpload
     * 
     * @param id videoUpload主键
     * @return 结果
     */
    public int deleteSysVideoInfoById(Long id);

    /**
     * 批量删除videoUpload
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysVideoInfoByIds(Long[] ids);
}
