package com.rakas.mvc.web.controller;

import com.rakas.mvc.web.form.Message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Locale;

/**
 * @author <a href="mailto:riuvshin@codenvy.com">Roman Iuvshin</a>
 * @version $Id: 9:41 PM 8/31/13 $
 */

@RequestMapping(value = "/security")
@Controller
public class SecurityController {
    final Logger logger = LoggerFactory.getLogger(SecurityController.class);

    @Autowired
    private MessageSource messageSource;

    @RequestMapping("loginfail")
    public String loginFail(Model uiModel, Locale locale,RedirectAttributes redirectAttributes){
        logger.info("Login failed detected");
        uiModel.addAttribute("message", new Message("error", messageSource.getMessage("message_login_fail", new Object[]{}, locale)));

        redirectAttributes.addFlashAttribute("message", new Message("error", messageSource
                .getMessage("message_login_fail", new Object[]{}, locale)));

        return "redirect:../contacts";
    }
}
