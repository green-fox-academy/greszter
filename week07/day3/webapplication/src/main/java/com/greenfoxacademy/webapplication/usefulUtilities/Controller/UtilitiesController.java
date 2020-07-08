package com.greenfoxacademy.webapplication.usefulUtilities.Controller;

import com.greenfoxacademy.webapplication.usefulUtilities.Service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UtilitiesController {

  UtilityService utilityService;

  @Autowired
  public UtilitiesController(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  @GetMapping("/useful")
  public String getUseful() {
    return "useful";
  }

  @GetMapping("/useful/colored")
  public String getColored(Model model) {
    model.addAttribute("color", "background-color:" + utilityService.randomColor());
    return "colored";
  }

  @GetMapping("/useful/email")
  public String validateEmail(@RequestParam String email, Model model) {
    model.addAttribute("email", email);
    model.addAttribute("valid", isValid(email));
    model.addAttribute("color", validityColor(email));
    return "email";
  }

  public String isValid(String email) {
    return (email.contains("@") && email.contains(".")) ? (email + " is a valid email address") :
        (email + " is not a valid email address");
  }

  public String validityColor(String email) {
    return (email.contains("@") && email.contains(".")) ? "color:green" : "color:red";
  }

  @GetMapping("/useful/encode")
  public String caesarEncode(@RequestParam String text, @RequestParam Integer number, Model model) {
  //  model.addAttribute("encodeInput", text);
    model.addAttribute("encode", utilityService.caesar(text, number));
    return "encode";
  }

  @GetMapping("/useful/decode")
  public String caesarDecode(@RequestParam String text, @RequestParam Integer number, Model model) {
 //   model.addAttribute("decodeInput", text);
    model.addAttribute("decode", utilityService.caesar(text, (0 - number)));
    return "decode";
  }

}

