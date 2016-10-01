package note;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NoteController {

  @RequestMapping(value = "/", method = GET)
  public String home() {
    return "home";
  }

  @RequestMapping(value = "/", method = POST)
  public String post(@RequestBody Note note) {
    System.out.println(note);
    return "home";
  }
}
