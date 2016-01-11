package com.dev.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.dev.service.MessageService;

public class HomeController extends AbstractController {
	private MessageService messageService;
	
	/**
	 * @param messageService the messageService to set
	 */
	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		System.out.println("Hello World - "+messageService.getAllMessages().size());
		ModelAndView mav = new ModelAndView("Home");
		mav.addObject("allMessages", messageService.getAllMessages());
		return mav;
	}
	
	

}
