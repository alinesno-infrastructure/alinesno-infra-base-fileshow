package com.alinesno.infra.base.fileshow.service.impl;

import com.alinesno.infra.base.fileshow.api.dto.FileAttribute;
import com.alinesno.infra.base.fileshow.service.FilePreview;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

/**
 * svg 图片文件处理
 * @author kl (http://kailing.pub)
 * @since 2021/2/8
 */
@Service
public class XmindFilePreviewImpl implements FilePreview {

    private final CommonPreviewImpl commonPreview;

    public XmindFilePreviewImpl(CommonPreviewImpl commonPreview) {
        this.commonPreview = commonPreview;
    }

    @Override
    public String filePreviewHandle(String url, Model model, FileAttribute fileAttribute) {
        commonPreview.filePreviewHandle(url,model,fileAttribute);
        return XMIND_FILE_PREVIEW_PAGE;
    }
}
