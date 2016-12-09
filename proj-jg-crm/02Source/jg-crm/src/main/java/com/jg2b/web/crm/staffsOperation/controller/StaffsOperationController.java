package com.jg2b.web.crm.staffsOperation.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jg2b.api.crm.common.CrmBaseController;
import com.jg2b.api.crm.login.pojo.UserPojo;
import com.jg2b.api.crm.staffsOperation.pojo.StaffsPojo;
import com.jg2b.api.crm.staffsOperation.service.IStaffsOperationService;

@Controller
@RequestMapping(value = "/stafopt/")
public class StaffsOperationController extends CrmBaseController{
	@Autowired
	IStaffsOperationService staffsOperationService;

	@RequestMapping("findUnderlingInfo")
	@ResponseBody
	public List<StaffsPojo> findUnderlingInfo(HttpServletRequest request,
			@RequestParam("name") String name,
			ModelMap model) throws Exception {
		UserPojo user = getSessionUser(request);
		return staffsOperationService.findUnderlingInfo(user.getGID(),name);
	}
}