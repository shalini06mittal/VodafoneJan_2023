
package com.vodafone.dto;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class CustomerDTO {

	private String email;
	private String phone;
	private String city;
	private boolean isMember;
}
