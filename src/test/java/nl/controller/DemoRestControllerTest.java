package nl.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.hamcrest.Matchers.*;
import org.junit.Before;
import org.junit.Test;

public class DemoRestControllerTest extends BaseTestCase{

	@Before
	public void setUp() throws Exception {
		super.setup();
	}


    @Test
    public void getJSONDataTest() throws Exception {
        this.mockMvc.perform(get("/rest/working"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].value", is("It works")));
    }

}
