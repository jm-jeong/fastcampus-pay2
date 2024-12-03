package com.fastcampuspay.banking;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class RegisterBankAccountControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper mapper;


	@Test
	public void testRegisterBankAccount() throws Exception {
		//        RegisterMembershipRequest request = new RegisterMembershipRequest("name", "email", "address", false);
		//        Membership expect = Membership.generateMember(
		//                new Membership.MembershipId("1"),
		//                new Membership.MembershipName("name"),
		//                new Membership.MembershipEmail("email"),
		//                new Membership.MembershipAddress("address"),
		//                new Membership.MembershipIsValid(true),
		//                new Membership.MembershipIsCorp(false)
		//        );
		//
		//        mockMvc.perform(
		//                        MockMvcRequestBuilders.post("/membership/register/")
		//                                .contentType(MediaType.APPLICATION_JSON)
		//                                .content(mapper.writeValueAsString(request))
		//                )
		//                .andExpect(MockMvcResultMatchers.status().isOk())
		//                .andExpect(MockMvcResultMatchers.content().string(mapper.writeValueAsString(expect)));
		//    }


	}
}