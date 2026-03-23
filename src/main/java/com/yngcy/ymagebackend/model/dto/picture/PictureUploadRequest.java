package com.yngcy.ymagebackend.model.dto.picture;

import lombok.Data;

import java.io.Serializable;

/**
 * 图片上传请求
 */
@Data
public class PictureUploadRequest implements Serializable {


    private static final long serialVersionUID = 1L;

    /**
     * 图片ID
     */
    private Long id;
}
