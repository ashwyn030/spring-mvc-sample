package com.dev.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.dev.service.AuthenticationService;
import com.dev.service.MessageService;

public class AuthenticationController extends AbstractController {

	private AuthenticationService authenticationService;
	private HomeController homeController;

	/**
	 * @param authenticationService
	 *            the authenticationService to set
	 */
	public void setAuthenticationService(AuthenticationService authenticationService) {
		this.authenticationService = authenticationService;
	}

	/**
	 * @param homeController
	 *            the homeController to set
	 */
	public void setHomeController(HomeController homeController) {
		this.homeController = homeController;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		System.out.println("Hello AuthenticationController");
		if (this.authenticationService.Login(username, password)) {
			return homeController.handleRequestInternal(arg0, arg1);
		}

	}

}
