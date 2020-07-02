package com.greenfoxacademy.thymeleaf_workshop.controller;

import com.greenfoxacademy.thymeleaf_workshop.model.AnimalType;
import com.greenfoxacademy.thymeleaf_workshop.model.BankAccount;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankOfSimbaController {

  List<BankAccount> accounts = Arrays.asList(
      new BankAccount("Timon", 250f, AnimalType.MEERKAT),
      new BankAccount("Pumba", 630f, AnimalType.WARTHOG),
      new BankAccount("Nala", 850f, AnimalType.LION),
      new BankAccount("Mufasa", 1500f, AnimalType.LION),
      new BankAccount("Zazu", 100f, AnimalType.RED_BILLED_HORNBILL),
      new BankAccount("Simba", 2000f, AnimalType.LION_KING));

  @GetMapping("/show")
  public String showAccount(Model model){
    BankAccount account = new BankAccount("Simba", 2000f, AnimalType.LION_KING);
    model.addAttribute("account", account);
    return "index";
  }

  @GetMapping("/html")
  public String getHTMLInfo(Model model){
    model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "htmlInfo";
  }

  @GetMapping("/accounts")
  public String listAccounts(Model model){
    model.addAttribute("accounts", accounts);

    return "accounts";
  }
}
