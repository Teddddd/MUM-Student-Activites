package EAProject.MUM_Student_Activities.controllers;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import EAProject.MUM_Student_Activities.domain.Event;
import EAProject.MUM_Student_Activities.service.AnnouncmentService;
import EAProject.MUM_Student_Activities.service.CommentService;
import EAProject.MUM_Student_Activities.service.EventService;
import EAProject.MUM_Student_Activities.service.UserAccountService;

@Controller
public class EventController {
	
	private long userId;
	
	
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	@Resource
	private EventService eventService;
	
	@Resource
	private CommentService commentService;
	
	@Resource
	private UserAccountService userAccountService;
	
	@Resource
	private AnnouncmentService announcmentService;

	
	public UserAccountService getUserAccountService() {
		return userAccountService;
	}

	public void setUserAccountService(UserAccountService userAccountService) {
		this.userAccountService = userAccountService;
	}

	public CommentService getCommentService() {
		return commentService;
	}

	public void setCommentService(CommentService commentService) {
		this.commentService = commentService;
	}

	public EventService getService() {
		return eventService;
	}

	public void setService(EventService service) {
		this.eventService = service;
	}
	
	@RequestMapping(value="/")
	public String redirect(){
		return "index";
	}
	
	
	@RequestMapping(value="/index" ,method = RequestMethod.GET)
	public String index(){
		return "index";
	}
	
	@RequestMapping(value="/index", method=RequestMethod.POST)
	public String login(long userId, String password){
		this.userId=userId;
		if(userAccountService.checkUser(userId, password))
		    return "redirect:/event";
		
		return "index";
	}
	
	/*@RequestMapping(value="/event", method=RequestMethod.GET)
	public String hommer(){
		return "redirect:/event";
	}
	*/
	
	@RequestMapping(value="/signup")
	public String signup(){
		return "signup";
	}
	
	@RequestMapping(value="/signup", method=RequestMethod.POST)
	public String signup(long id,String firstName, String lastName,String email,String password, String image ,String departmentName){
		
		userAccountService.createUserAccount(id, firstName, lastName, email, password, image ,departmentName);
		userId=id;
		return "redirect:/event";
	}
	
	
	
	
	
	@RequestMapping(value="/addevent")
	public String addEvent(){
		return "addevent";
	}
	
	@RequestMapping(value="/addanouncment")
	public String addAnnoucment(){
		return "addannouncment";
	}
	@RequestMapping(value="/contact")
	public String contact(){
		return "contact";
	}
	@RequestMapping(value="/about")
	public String about(){
		return "about";
	}
	
	@RequestMapping(value="/addAnouncment",method = RequestMethod.POST)
	public String addAnnoucment(String title,String discription,String image, String date){
		
		announcmentService.createAnnouncment(title, discription, image, new Date());
		return "redirect:/announcment";
	}
	
	@RequestMapping(value="/announcment",method = RequestMethod.GET)
	public String getAnnouncments(Model model){
		
		model.addAttribute("announcments", announcmentService.getAllAnnouncment());
		return "announcment";
	}
	 
	
	@RequestMapping(value="/event" , method= RequestMethod.POST)
	public String addEvent(String title,String description, String image, String type,
			String place,String date){
		
		eventService.createEvent(title, description, image, 0, place, type, new Date());
		
		/*eventService.createEvent(event.getTitle(), event.getTitle(), event.getPicture(),
				0,event.getEventType().getPlace(),"Trip",new Date());*/
		return "redirect:/event";
	}
	
	
	@RequestMapping(value="/event", method=RequestMethod.GET)
	public String events(Model model){
		
		
		List<Event> events=(List<Event>) eventService.getAllEvent();
		
		//model.addAttribute("events", eventService.getAllEvent());
		model.addAttribute("events", events);
		System.out.println("returned ");
		return "event";
	}
	
	@RequestMapping(value="/like",method=RequestMethod.POST)
	public String likeEvent(int eventId,int like){
		
		eventService.likeEvent(eventId,like+1);
		return "redirect:/event";
	}
	
		
	@RequestMapping(value="/profile",method=RequestMethod.GET)
	public String profile(Model model){
		
		model.addAttribute("profile" , userAccountService.getUserAccount(userId));
		
		return "profile";		
	}
	
	@RequestMapping(value="/editprofile",method=RequestMethod.GET)
	public String editprofile(Model model){
		
		model.addAttribute("profile" , userAccountService.getUserAccount(userId));
		
		return "editprofile";		
	}
	
	@RequestMapping(value="/editprofile",method=RequestMethod.POST)
	public String profile(String firstName, String lastName,String email,String password, String image ,String departmentName){
		
		
		userAccountService.updateUserAccount(userId, firstName, lastName, email, password,image ,departmentName);
		return "redirect:/profile";		
	}
	
	@RequestMapping(value="/logout",method=RequestMethod.GET)
	public String logout(){
		userId=0;
		return "redirect:/index";
	}
	@RequestMapping(value="/comment", method=RequestMethod.POST)
	public String comment(int eventId,String comment){
		
		commentService.createComment(comment, eventId, userId);
		System.out.println("with event id "+eventId+comment);
		return "redirect:/event";
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public String deleteEvent(int eventId){
		System.out.println("---------------------------"+eventId);
		eventService.deleteEvent(eventId);
		return "redirect:/event";
	}
	
	
	
	
	
	
	
}
