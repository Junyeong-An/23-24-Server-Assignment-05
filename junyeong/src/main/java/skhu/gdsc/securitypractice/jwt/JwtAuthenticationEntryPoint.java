package skhu.gdsc.securitypractice.jwt;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

@Component
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint { // JwtAuthenticationEntryPoint 클래스는 유효한 자격증명을 제공하지 않고 접근하려 할 때 401 Unauthorized 에러를 리턴

  @Override
  public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) // commence 메소드는 유효한 자격증명을 제공하지 않고 접근하려 할 때 401 Unauthorized 에러를 리턴
          throws IOException { // commence 메소드는 유효한 자격증명을 제공하지 않고 접근하려 할 때 401 Unauthorized 에러를 리턴
    response.sendError(HttpServletResponse.SC_UNAUTHORIZED); // 유효한 자격증명을 제공하지 않고 접근하려 할 때 401 Unauthorized 에러를 리턴
  }
}
