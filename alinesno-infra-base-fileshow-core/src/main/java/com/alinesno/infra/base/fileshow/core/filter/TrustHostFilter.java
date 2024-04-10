package com.alinesno.infra.base.fileshow.core.filter;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import com.alinesno.infra.base.fileshow.core.config.ConfigConstants;
import com.alinesno.infra.base.fileshow.core.utils.WebUtils;
import jakarta.servlet.*;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.FileCopyUtils;

/**
 * @author chenjh
 * @since 2020/2/18 19:13
 */
public class TrustHostFilter implements Filter {

    private String notTrustHostHtmlView;

    @Override
    public void init(FilterConfig filterConfig) {
        ClassPathResource classPathResource = new ClassPathResource("pages/notTrustHost.html");
        try {
            classPathResource.getInputStream();
            byte[] bytes = FileCopyUtils.copyToByteArray(classPathResource.getInputStream());
            this.notTrustHostHtmlView = new String(bytes, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String url = WebUtils.getSourceUrl(request);
        String host = WebUtils.getHost(url);
        assert host != null;
        if (isNotTrustHost(host)) {
            String html = this.notTrustHostHtmlView.replace("${current_host}", host);
            response.getWriter().write(html);
            response.getWriter().close();
        } else {
            chain.doFilter(request, response);
        }
    }

    public boolean isNotTrustHost(String host) {
        if (CollectionUtils.isNotEmpty(ConfigConstants.getNotTrustHostSet())) {
            return ConfigConstants.getNotTrustHostSet().contains(host);
        }
        if (CollectionUtils.isNotEmpty(ConfigConstants.getTrustHostSet())) {
            return !ConfigConstants.getTrustHostSet().contains(host);
        }
        return false;
    }

    @Override
    public void destroy() {

    }

}
