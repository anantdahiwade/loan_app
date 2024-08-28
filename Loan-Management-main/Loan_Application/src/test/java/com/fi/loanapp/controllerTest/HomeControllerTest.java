package com.fi.loanapp.controllerTest;

//public class HomeControllerTest {
//
//}
//package com.fi.loanapp.controller;

        import static org.mockito.Mockito.when;
        import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
        import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
        import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
        import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

        import com.fi.loanapp.controller.HomeController;
        import org.junit.jupiter.api.BeforeEach;
        import org.junit.jupiter.api.Test;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
        import org.springframework.boot.test.mock.mockito.MockBean;
        import org.springframework.test.web.servlet.MockMvc;
        import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@WebMvcTest(HomeController.class)
public class HomeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(new HomeController()).build();
    }

    @Test
    void testGetHome() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name(""));
    }

    @Test
    void testGetAboutUs() throws Exception {
        mockMvc.perform(get("/AboutUs"))
                .andExpect(status().isOk())
                .andExpect(view().name(""));
    }

    @Test
    void testGetContactUs() throws Exception {
        mockMvc.perform(get("/ContactUs"))
                .andExpect(status().isOk())
                .andExpect(view().name("ContactUs"));
    }

    @Test
    void testGetLogin() throws Exception {
        mockMvc.perform(get("/Login"))
                .andExpect(status().isOk())
                .andExpect(view().name("Login"))
                .andExpect(model().attributeExists("loginData"));
    }

    @Test
    void testGetRegister() throws Exception {
        mockMvc.perform(get("/Register"))
                .andExpect(status().isOk())
                .andExpect(view().name("Register"))
                .andExpect(model().attributeExists("customer"));
    }

    @Test
    void testGetAdminLogin() throws Exception {
        mockMvc.perform(get("/AdminLogin"))
                .andExpect(status().isOk())
                .andExpect(view().name("AdminLogin"))
                .andExpect(model().attributeExists("loginData"));
    }
}
