package com.bank.bankController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bank.AdminDetails;
import com.bank.entity.AdminEntity;
import com.bank.exception.AdminException;
import com.bank.service.AdminService;

@Controller
public class AdminController {
	@Autowired
	private AdminService service;

	@RequestMapping("/adminreg")
	private String adminRegistration() {
		return "adminreg";

	}

	@RequestMapping("/adminreq")
	private String adminRegistratioinRequest(AdminDetails adminDetails) {
		System.out.println(adminDetails);
		if (service.adminDataValidation(adminDetails)) {
			return "adminlogin";
		} else {
			return null;
		}
	}

	@RequestMapping("/adminlogin")
	public String adminLopinPage() {
		return "adminlogin";
	}
@RequestMapping("/adminupdate")
	public String updateAdminpass(int id,Model m) {
	m.addAttribute("adminid",id);
		return "adminupdate";

	}
@RequestMapping("/adminupdatereq")
public String updateAdmininDb(AdminDetails admin) {
AdminEntity entity=service.updateAdminPass(admin);
return "redirect:/bank/adminloginreq";
}
//	@ResponseBody
//	@RequestMapping("adminloginreq")
//	public String adminLoginRequest(@RequestParam("id") int adminid) {
//		System.out.println(adminid);
//		if (service.selectAdminid(adminid)) {
//			return "Login successful";
//		} else {
//			return null;
//		}
//
//	}

    @RequestMapping("adminloginreq")
    public String adminLoginRequest(@RequestParam("id") Integer adminid, Model model) {
        try {
            AdminEntity admin = service.getAdminById(adminid);
            if (admin != null) {
                // Pass the AdminEntity to the JSP page
                model.addAttribute("admin", admin);
                return "adminprofile";  // Name of the JSP file to display the details
            }
        } catch (AdminException e) {
            model.addAttribute("error", "Admin not found with id: " + adminid);
        }
        return "adminlogin";  // Return to the login page in case of error
    }

	
}
