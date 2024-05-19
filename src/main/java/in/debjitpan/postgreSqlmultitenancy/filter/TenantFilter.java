package in.debjitpan.postgreSqlmultitenancy.filter;

import in.debjitpan.postgreSqlmultitenancy.config.TenantContext;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

public class TenantFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        String tenantName = httpServletRequest.getHeader("X-TenantID");
        TenantContext.setCurrentTenant(tenantName);
        try {
            chain.doFilter(request, response);
        } finally {
            TenantContext.close();
        }
    }
}
