package com.coderbd.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.coderbd.entity.Employee;
import com.coderbd.repository.EmployeeRepository;

@Controller
public class RegistrationController {
	@Autowired
	private EmployeeRepository employeeRepository;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		return modelAndView;
	}

	@RequestMapping(value = "/regi", method = RequestMethod.GET)
	public ModelAndView registration() {
		ModelAndView modelAndView = new ModelAndView();
		Employee employee = new Employee();
		modelAndView.addObject("employee", employee);
		modelAndView.setViewName("regi");
		return modelAndView;
	}

	@RequestMapping(value = "/regi", method = RequestMethod.POST)
	public ModelAndView createNewEmployee(@Valid Employee employee,
			BindingResult bindingResult) {
		ModelAndView modelAndView = new ModelAndView();
		Employee employeeExists = employeeRepository.findByEmail(employee.getEmail());
		if (employeeExists != null) {
			bindingResult.rejectValue("email", "error.employee", "You are already a "
					+ "registered with this email");
		}
		if (bindingResult.hasErrors()) {
			modelAndView.setViewName("regi");
		} else {

			employeeRepository.save(employee);
			modelAndView.addObject("successMessage", "Employee registration success!!!");
			modelAndView.addObject("employee", new Employee());
			modelAndView.setViewName("regi");

		}
		return modelAndView;
	}

	/**
	 * @note public class ModelAndView extends java.lang.Object
	 * 
	 *       Holder for both Model and View in the web MVC framework. Note that
	 *       these are entirely distinct. This class merely holds both to make it
	 *       possible for a controller to return both model and view in a single
	 *       return value.
	 * 
	 *       Represents a model and view returned by a handler, to be resolved by a
	 *       DispatcherServlet. The view can take the form of a String view name
	 *       which will need to be resolved by a ViewResolver object; alternatively
	 *       a View object can be specified directly. The model is a Map, allowing
	 *       the use of multiple objects keyed by name.
	 */
	/**
	 * @note public interface BindingResult extends Errors
	 * 
	 *       General interface that represents binding results. Extends the
	 *       interface for error registration capabilities, allowing for a Validator
	 *       to be applied, and adds binding-specific analysis and model building.
	 */
}
