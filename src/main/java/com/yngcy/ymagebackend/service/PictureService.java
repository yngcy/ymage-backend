package com.yngcy.ymagebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yngcy.ymagebackend.model.dto.picture.PictureQueryRequest;
import com.yngcy.ymagebackend.model.dto.picture.PictureUploadRequest;
import com.yngcy.ymagebackend.model.entity.Picture;
import com.yngcy.ymagebackend.model.entity.User;
import com.yngcy.ymagebackend.model.vo.PictureVO;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;


/**
 * @author yngcy
 * @description 针对表【picture(图片)】的数据库操作Service
 * @createDate 2026-03-20 12:32:57
 */
public interface PictureService extends IService<Picture> {

    /**
     * 上传图片
     *
     * @param multipartFile
     * @param pictureUploadRequest
     * @param loginUser
     * @return
     */
    PictureVO uploadPicture(MultipartFile multipartFile,
                            PictureUploadRequest pictureUploadRequest,
                            User loginUser);

    /**
     * 获取查询包装器
     * @param pictureQueryRequest
     * @return
     */
    QueryWrapper<Picture> getQueryWrapper(PictureQueryRequest  pictureQueryRequest);

    /**
     * 获取脱敏后图片
     * @param picture
     * @param request
     * @return
     */
    PictureVO getPictureVO(Picture picture, HttpServletRequest request);

    /**
     * 分页获取脱敏后图片
     * @param picturePage
     * @param request
     * @return
     */
    Page<PictureVO> getPictureVOPage(Page<Picture> picturePage, HttpServletRequest request);

    /**
     * 校验图片参数
     * @param picture
     */
    void validPicture(Picture picture);
}
