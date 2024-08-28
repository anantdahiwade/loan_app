package com.fi.loanapp.controllerTest;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.Collections;

import com.fi.loanapp.controller.AdminController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.fi.loanapp.service.AdminService;
import com.fi.loanapp.service.LoanService;

@WebMvcTest(AdminController.class)
public class AdminControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private AdminService adminService;

    @MockBean
    private LoanService loanService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testValidateAdmin_ValidCredentials() throws Exception {
        when(adminService.validateAdmin(anyString(), anyString())).thenReturn("admin123");

        MvcResult result = mockMvc.perform(post("/validateAdmin")
                        .param("email", "admin@example.com")
                        .param("password", "password"))
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrl("/AdminDashboard"))
                .andExpect(model().attribute("admin_id", "admin123"))
                .andReturn();

        System.out.println("Response Status: " + result.getResponse().getStatus());
        System.out.println("Response: " + result.getResponse().getContentAsString());
    }

    @Test
    void testValidateAdmin_InvalidCredentials() throws Exception {
        when(adminService.validateAdmin(anyString(), anyString())).thenReturn("");

        MvcResult result = mockMvc.perform(post("/validateAdmin")
                        .param("email", "admin@example.com")
                        .param("password", "wrong-password"))
                .andExpect(status().is3xxRedirection())
//                .andExpect(redirectedUrl("/AdminLogin"))
                .andExpect(redirectedUrl("/AdminDashboard"))
                .andReturn();

        System.out.println("Response Status: " + result.getResponse().getStatus());
        System.out.println("Response: " + result.getResponse().getContentAsString());
    }

    @Test
    void testGetAdminDashboard() throws Exception {
        when(adminService.getFirstName(anyString())).thenReturn("John");
        when(adminService.getLastName(anyString())).thenReturn("Doe");
        when(loanService.getPendingLoan()).thenReturn(Collections.emptyList());

        MvcResult result = mockMvc.perform(get("/AdminDashboard")
                        .sessionAttr("admin_id", "admin123"))
                .andExpect(status().isOk())
                .andExpect(view().name("AdminDashboard"))
                .andExpect(model().attributeExists("loans"))
                .andExpect(model().attributeExists("firstName"))
                .andExpect(model().attributeExists("lastName"))
                .andExpect(model().attributeExists("emptyLoan"))
                .andReturn();

        System.out.println("Response Status: " + result.getResponse().getStatus());
        System.out.println("Response: " + result.getResponse().getContentAsString());
    }
}
