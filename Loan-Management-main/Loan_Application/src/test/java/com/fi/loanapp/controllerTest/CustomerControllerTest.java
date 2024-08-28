package com.fi.loanapp.controllerTest;
//
//public class CustomercontrollerTest {
//
//}
//package com.fi.loanapp.controller;

        import com.fi.loanapp.controller.CustomerController;
        import com.fi.loanapp.entity.Customer;
        import com.fi.loanapp.service.CustomerService;
        import com.fi.loanapp.service.LoanService;
        import com.fi.loanapp.service.PaymentService;
        import org.junit.jupiter.api.BeforeEach;
        import org.junit.jupiter.api.Test;
        import org.mockito.InjectMocks;
        import org.mockito.Mock;
        import org.mockito.MockitoAnnotations;
        import org.springframework.test.web.servlet.MockMvc;
        import org.springframework.test.web.servlet.setup.MockMvcBuilders;
        import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
        import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

        import java.util.ArrayList;
        import java.util.List;

        import static org.mockito.ArgumentMatchers.any;
        import static org.mockito.Mockito.mock;
        import static org.mockito.Mockito.when;

public class CustomerControllerTest {

    private MockMvc mockMvc;

    @Mock
    private CustomerService customerService;

    @Mock
    private LoanService loanService;

    @Mock
    private PaymentService paymentService;

    @InjectMocks
    private CustomerController customerController;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(customerController).build();
    }

    @Test
    public void testRegisterCustomer() throws Exception {
        Customer customer = new Customer();
        when(customerService.registerCustomer(any(Customer.class))).thenReturn(customer);

        mockMvc.perform(MockMvcRequestBuilders.post("/addcustomer")
                        .flashAttr("customer", customer))
                .andExpect(MockMvcResultMatchers.status().is3xxRedirection())
                .andExpect(MockMvcResultMatchers.redirectedUrl("/RegisterSuccess"));
    }

//    @Test
//    public void testRegisterSuccess() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders.get("/RegisterSuccess"))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.view().name("RegisterSuccess"));
//    }

    @Test
    public void testVerifyCustomer() throws Exception {
        String customerId = "1234";
        when(customerService.getCustomerDetails("test@example.com", "password")).thenReturn(customerId);

        mockMvc.perform(MockMvcRequestBuilders.post("/verifycustomer")
                        .param("email", "test@example.com")
                        .param("password", "password"))
                .andExpect(MockMvcResultMatchers.status().is3xxRedirection())
                .andExpect(MockMvcResultMatchers.redirectedUrl("/CustomerDashBoard?customer_id=1234"));//changes made CustomerDashBoard to /CustomerDashBoard?customer_id=1234
    }

//    @Test
//    public void testGetDashBoard() throws Exception {
//        String customerId = "12345";
//        when(customerService.getCustomerProfile(customerId)).thenReturn(new Customer());
//        when(loanService.getByFkCustomerId(customerId)).thenReturn(new ArrayList<>());
//        when(paymentService.getPayment(any())).thenReturn(new ArrayList<>());
//
//        mockMvc.perform(MockMvcRequestBuilders.get("/CustomerDashBoard")
//                        .sessionAttr("customer_id", customerId))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.view().name("CustomerDashBoard"));
//    }


//    @Test
//    public void testGetDashBoard() throws Exception {
//        String customerId = "12345";
//        Customer customer = mock(Customer.class); // Mock Customer instead of creating an instance
//        when(customerService.getCustomerProfile(customerId)).thenReturn(customerService.getCustomerProfile(customerId));
//        when(loanService.getByFkCustomerId(customerId)).thenReturn(new ArrayList<>());
//        when(paymentService.getPayment(any())).thenReturn(new ArrayList<>());
//
//        mockMvc.perform(MockMvcRequestBuilders.get("/CustomerDashBoard")
//                        .sessionAttr("customer_id", customerId))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.view().name("CustomerDashBoard"));
//    }


//    @Test
//    public void testGetProfile() throws Exception {
//        String customerId = "12345";
//        when(customerService.getCustomerProfile(customerId)).thenReturn(new Customer());
//
//        mockMvc.perform(MockMvcRequestBuilders.get("/CustomerProfile")
//                        .sessionAttr("customer_id", customerId))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.view().name("CustomerProfile"));
//    }
//    import static org.mockito.Mockito.mock;

//    @Test
//    public void testGetProfile() throws Exception {
//        String customerId = "12345";
//        Customer customer = mock(Customer.class); // Create a mock instance
//
//        when(customerService.getCustomerProfile(customerId))
//                .thenReturn(customer.);
//    //changes made customer to customerService.getCustomerProfile()
//        mockMvc.perform(MockMvcRequestBuilders.get("/CustomerProfile")
//                        .sessionAttr("customer_id", customerId))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.view().name("CustomerProfile"));
//    }

}


