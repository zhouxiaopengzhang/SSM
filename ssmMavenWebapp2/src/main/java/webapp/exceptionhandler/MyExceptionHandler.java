package webapp.exceptionhandler;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
/*该类是一个异常处理类:处理该web的所有异常*/
@ControllerAdvice
public class MyExceptionHandler {
	@ExceptionHandler(value={Exception.class})
	public String handlerException(Exception e,Model model){
		System.out.println(e.getMessage());
		model.addAttribute("exception", e.getMessage());
		return "error";
	}
}
