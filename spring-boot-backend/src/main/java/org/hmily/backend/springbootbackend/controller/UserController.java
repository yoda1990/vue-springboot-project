package org.hmily.backend.springbootbackend.controller;

@RestController
@RequestMapping("/api")
public class UserController {

    //@Autowired
    //private UserService userService;

    @RequestMapping(value ="/user", method = RequestMethod.GET)
    public List<User> UserQry() {
        //return userService.getUser();
        return null;
    }

    @RequestMapping(value ="/user", method = RequestMethod.POST)
    public void UserAdd(User user){
        //userService.AddUser(user);
        return null;
    }

    @RequestMapping(value ="/user", method = RequestMethod.PUT)
    public void UserUpdate(User user){
        //userService.updateUserByNo(user);
    }

    @RequestMapping(value ="/user", method = RequestMethod.DELETE)
    public void UserDel(@RequestParam(value="no") int no){
        //userService.delUserById(no);
    }
}