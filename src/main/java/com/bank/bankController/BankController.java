package com.bank.bankController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bank.BankDetails;
import com.bank.entity.BankDetailsEntity;
import com.bank.service.BankService;
//import com.bankBank.BankDetails;

@Controller
public class BankController {
	@Autowired
	private BankService bs;

	@RequestMapping("/regpage")
	public String userResgetrationPage() {
		return "registration";
	}

	@RequestMapping("/reg")
	public String userRegistration(BankDetails bd) {
		if (bs.userRegistrationData(bd)) {
			System.out.println("details stored successfull..");
			return "login";
		} else {
			return null;
		}

	}

	@RequestMapping("/loginpage")
	public String userLoginpage() {
		bs.
		return "login";
	}

	@ResponseBody
	@RequestMapping("/logins")
	public String userLogin(@RequestParam("id") int id) {
		System.out.println("controller : " + id);
		if (bs.userLoginData(id)) {
			return "Login Successfull ";
		} else {
			return null;
		}
	}

//    @RequestMapping("/getAllBankDetails")
//    public String getAllbankuserDetailsRequest(Model m) {
//    	List<BankDetailsEntity> entity=bs.selectAllBankUser();
//    	for(BankDetailsEntity e:entity) {
//    		System.out.println(e.getName());
//    		System.out.println(e.getAccountnumber());
//    		System.out.println(e.getAmount());
//    		System.out.println(e.getBranch());
//    		System.out.println("----------------------------------------------");
//    	}
//    	m.addAttribute("allBankUserDetails",entity);
//    	return "AllBankUserDetails";
//
//	}

	@RequestMapping("/getAllBankDetails")
	public String getAllbankuserDetailsRequests(Model m) {
		List<BankDetailsEntity> entity = bs.selectAllBankUser();
	
		m.addAttribute("entity", entity);
		return "getbankuserdata";

	}

	@RequestMapping("/deleteUser")

	public String deleteUser(@RequestParam("userid") int userid) {
		System.out.println(userid);
		if (bs.deleteUserByid(userid)) {
			System.out.println("User deteail deleted successfully");
			return "redirect:/bank/getAllBankDetails";
		}
		return "getbankuserdata";
	}
	@RequestMapping("/updateUser")
	public String updateUserDetails0(int userid,Model m) {
		BankDetailsEntity entity=bs.updateuserusingid(userid);
		m.addAttribute("entity",entity);
		return "updateuserdetails";
	}
	@RequestMapping("/updateuserDB")
	public String updateUserDetailsinDB(BankDetails dto) {
//		System.out.println("user"+userid);
		bs.updateUserDb(dto);
		return "redirect:/bank/getAllBankDetails";
	}

	@RequestMapping("/getPendingDetails")
	public void getPendingDetailsrequest() {
		// TODO Auto-generated method stub

	}

	@RequestMapping("/getAllClosingRequestDetails")
	public void getAllClosingRequestDetailsrequest() {
		// TODO Auto-generated method stub

	}
	@RequestMapping("/filterUsignUsername")
	public String filterUserWithName(String name,Model m) {
		List<BankDetailsEntity> entity=bs.filterByUSerName(name);
		System.out.println(entity);
		m.addAttribute("bankentity",entity);
		return "filterdata";
	}
}
