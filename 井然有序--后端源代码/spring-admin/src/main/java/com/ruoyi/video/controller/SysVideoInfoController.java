package com.ruoyi.video.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.video.domain.SysVideoInfo;
import com.ruoyi.video.service.ISysVideoInfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * videoUploadController
 * 
 * @author JohnHa
 * @date 2023-09-03
 */
@RestController
@RequestMapping("/video/视频上传")
public class SysVideoInfoController extends BaseController
{
    @Autowired
    private ISysVideoInfoService sysVideoInfoService;

    /**
     * 查询videoUpload列表
     */
    @PreAuthorize("@ss.hasPermi('video:视频上传:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysVideoInfo sysVideoInfo)
    {
        startPage();
        List<SysVideoInfo> list = sysVideoInfoService.selectSysVideoInfoList(sysVideoInfo);
        return getDataTable(list);
    }

    /**
     * 导出videoUpload列表
     */
    @PreAuthorize("@ss.hasPermi('video:视频上传:export')")
    @Log(title = "videoUpload", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysVideoInfo sysVideoInfo)
    {
        List<SysVideoInfo> list = sysVideoInfoService.selectSysVideoInfoList(sysVideoInfo);
        ExcelUtil<SysVideoInfo> util = new ExcelUtil<SysVideoInfo>(SysVideoInfo.class);
        util.exportExcel(response, list, "videoUpload数据");
    }

    /**
     * 获取videoUpload详细信息
     */
    @PreAuthorize("@ss.hasPermi('video:视频上传:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(sysVideoInfoService.selectSysVideoInfoById(id));
    }

    /**
     * 新增videoUpload
     */
    @PreAuthorize("@ss.hasPermi('video:视频上传:add')")
    @Log(title = "videoUpload", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysVideoInfo sysVideoInfo)
    {
        return toAjax(sysVideoInfoService.insertSysVideoInfo(sysVideoInfo));
    }

    /**
     * 修改videoUpload
     */
    @PreAuthorize("@ss.hasPermi('video:视频上传:edit')")
    @Log(title = "videoUpload", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysVideoInfo sysVideoInfo)
    {
        return toAjax(sysVideoInfoService.updateSysVideoInfo(sysVideoInfo));
    }

    /**
     * 删除videoUpload
     */
    @PreAuthorize("@ss.hasPermi('video:视频上传:remove')")
    @Log(title = "videoUpload", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sysVideoInfoService.deleteSysVideoInfoByIds(ids));
    }
}
