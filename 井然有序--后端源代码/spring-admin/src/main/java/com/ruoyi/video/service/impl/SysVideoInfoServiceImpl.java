package com.ruoyi.video.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.video.mapper.SysVideoInfoMapper;
import com.ruoyi.video.domain.SysVideoInfo;
import com.ruoyi.video.service.ISysVideoInfoService;

/**
 * videoUploadService业务层处理
 * 
 * @author JohnHa
 * @date 2023-09-03
 */
@Service
public class SysVideoInfoServiceImpl implements ISysVideoInfoService 
{
    @Autowired
    private SysVideoInfoMapper sysVideoInfoMapper;

    /**
     * 查询videoUpload
     * 
     * @param id videoUpload主键
     * @return videoUpload
     */
    @Override
    public SysVideoInfo selectSysVideoInfoById(Long id)
    {
        return sysVideoInfoMapper.selectSysVideoInfoById(id);
    }

    /**
     * 查询videoUpload列表
     * 
     * @param sysVideoInfo videoUpload
     * @return videoUpload
     */
    @Override
    public List<SysVideoInfo> selectSysVideoInfoList(SysVideoInfo sysVideoInfo)
    {
        return sysVideoInfoMapper.selectSysVideoInfoList(sysVideoInfo);
    }

    /**
     * 新增videoUpload
     * 
     * @param sysVideoInfo videoUpload
     * @return 结果
     */
    @Override
    public int insertSysVideoInfo(SysVideoInfo sysVideoInfo)
    {
        return sysVideoInfoMapper.insertSysVideoInfo(sysVideoInfo);
    }

    /**
     * 修改videoUpload
     * 
     * @param sysVideoInfo videoUpload
     * @return 结果
     */
    @Override
    public int updateSysVideoInfo(SysVideoInfo sysVideoInfo)
    {
        return sysVideoInfoMapper.updateSysVideoInfo(sysVideoInfo);
    }

    /**
     * 批量删除videoUpload
     * 
     * @param ids 需要删除的videoUpload主键
     * @return 结果
     */
    @Override
    public int deleteSysVideoInfoByIds(Long[] ids)
    {
        return sysVideoInfoMapper.deleteSysVideoInfoByIds(ids);
    }

    /**
     * 删除videoUpload信息
     * 
     * @param id videoUpload主键
     * @return 结果
     */
    @Override
    public int deleteSysVideoInfoById(Long id)
    {
        return sysVideoInfoMapper.deleteSysVideoInfoById(id);
    }
}
