package hello.servlet.basic.response;

import com.fasterxml.jackson.databind.ObjectMapper;
import hello.servlet.basic.HelloData;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * http://localhost:8080/response-json
 */

@WebServlet(name = "responseJsonServlet", urlPatterns = "/response-json")
public class ResponseJsonServlet extends HttpServlet {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // ContentType: application/json
        resp.setHeader("content-type", "application/json");
        resp.setCharacterEncoding("utf-8");

        HelloData data = new HelloData();
        data.setUsername("김장필");
        data.setAge(19);

        //{"username":"김장필", "age":19}
        String result = objectMapper.writeValueAsString(data);
        resp.getWriter().write(result);
    }
}
