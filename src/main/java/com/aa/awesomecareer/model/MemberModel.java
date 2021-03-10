package com.aa.awesomecareer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MemberModel {
	
	private Integer id;
	private Integer companyId;
	private Integer userId;
	
	private UserModel userModel;
	private CompanyModel companyModel;


}
