package com.alinesno.infra.base.fileshow.api.config;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import jakarta.servlet.*;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.FileCopyUtils;

/**
 * @author chenjh
 * @since 2020/2/18 19:13
 */
public class TrustHostFilter implements Filter {

    private String notTrustHost;

    @Override
    public void init(FilterConfig filterConfig) {
        ClassPathResource classPathResource = new ClassPathResource("web/notTrustHost.html");
        try {
            classPathResource.getInputStream();
            byte[] bytes = FileCopyUtils.copyToByteArray(classPathResource.getInputStream());
            this.notTrustHost = new String(bytes, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//        String url = WebUtils.getSourceUrl(request);
//        String host = WebUtils.getHost(url);
//        if (host != null &&!ConfigConstants.getTrustHostSet().isEmpty() && !ConfigConstants.getTrustHostSet().contains(host)) {
//            String html = this.notTrustHost.replace("${current_host}", host);
//            response.getWriter().write(html);
//            response.getWriter().close();
//        }
//        else {
//            chain.doFilter(request, response);
//        }
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }

}
