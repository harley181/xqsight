package com.xqsight.upload.service;

import com.xqsight.upload.model.SysFile;
import com.xqsight.upload.model.vo.SysFileVo;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by user on 2016/6/8.
 */
public interface UploadService {

    void saveSysFile(SysFileVo sysFile);

    void deleteSysFile(long fileId);


    SysFile querySysFile(long fileId);

    List<SysFile> queryFileByFileId(String fileIds);
}
